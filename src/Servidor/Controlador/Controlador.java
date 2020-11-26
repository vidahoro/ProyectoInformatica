/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servidor.Controlador;

import Modelo.Administrador;
import Modelo.Comida;
import com.google.gson.Gson;
import java.util.ArrayList;
import Modelo.Persona;
import Modelo.DTO.PeticionDTO;
import Modelo.DTO.ResultadoDTO;
import Servidor.Servicios.AdministradorService;
import Servidor.Servicios.ComidaService;
import Servidor.Servicios.PersonaService;

public class Controlador {
    private final Gson objConvertidor;   
    private final AdministradorService objAdministradorService;
    private final PersonaService objPersonaService;
    private final ComidaService objComidaService;
    
    public Controlador(AdministradorService objAdministradorService,PersonaService objPersonaService,ComidaService objComidaService)
    {
        this.objConvertidor= new Gson();        
        this.objAdministradorService= objAdministradorService;
        this.objPersonaService= objPersonaService;
        this.objComidaService= objComidaService;
    }
    
     public String decodificarPeticion(String JSONPeticion) {    
        String accion, argumentosPeticion, resultado;        
        PeticionDTO objPeticion= objConvertidor.fromJson(JSONPeticion, PeticionDTO.class); 
        accion=objPeticion.getAccion();
        argumentosPeticion=objPeticion.getArgumentos();
        resultado=procesarAccion(accion, argumentosPeticion);
        return resultado;
    }

    /**
     * Ejecuta la petición generada en el cliente
     *
     * @param accion operación remota que el cliente desea invocar
     * @param argumentosPeticion corresponde a los argumentos de la operación remota
     * @return  objeto  de la clase Resultado que almacena el resultado de la operación ejecutada
     */
    private String procesarAccion(String accion, String argumentosPeticion) {
        String resultadoJSON="";
        ResultadoDTO objResultado=new ResultadoDTO();
        switch (accion) {
            case "consultarPersona":
                String tipoIdentificacion, numeroIdentificacion;                
                String vector[]=argumentosPeticion.split(",");
                tipoIdentificacion=vector[0];
                numeroIdentificacion=vector[1];
              //  objResultado=consultarPersona(tipoIdentificacion, numeroIdentificacion);                
            break;
            case "registrarPersona":                
                Persona objPersona= objConvertidor.fromJson(argumentosPeticion, Persona.class);
                //objResultado=registrarPersona(objPersona);                
            break;            
            case "iniciarSesion":
                String login, contrasenia;                
                String vectorL[]=argumentosPeticion.split(",");  // para que sirve el split?
                login=vectorL[0];
                contrasenia=vectorL[1];
                objResultado=iniciarSesion(login, contrasenia);
            break;
            case "iniciarSesionPersona":
                
                String loginP, TipoIdentificacionP, contraseniaP;                
                String vectorP[]=argumentosPeticion.split(",");
                loginP=vectorP[0];
                TipoIdentificacionP=vectorP[1];
                contraseniaP=vectorP[2];
                System.out.println("login: "+loginP+"TipoId: "+TipoIdentificacionP+"Contraseña:"+contraseniaP);
                objResultado=iniciarSesionPersona(loginP,TipoIdentificacionP, contraseniaP);
                
            break;    
            case "AgregarComida":
                Comida objComida= objConvertidor.fromJson(argumentosPeticion, Comida.class); 
                objResultado=AgregarComida(objComida);
                 
            break;
            case "listarComidas":
                objResultado=listarComidas();   
            break;
            case "identificarPersona":
                String usuario,password;
                String VectorR[]=argumentosPeticion.split(",");
                usuario=VectorR[0];
                password=VectorR[1];
                objResultado=consultarAdmin(usuario, password);
            break;
            case "editarAdmin":
                String user, newname, newlastname, newpassword;
                String VectorE[]=argumentosPeticion.split(",");
                user=VectorE[0];
                newname=VectorE[1];
                newlastname=VectorE[2];
                newpassword=VectorE[3];
                objResultado=editarAdmin(user, newname, newlastname, newpassword);
            break;

            case "listarComidasEspeciales":
                objResultado=listarComidasEspeciales();

            case "eliminarComida":
                Comida objComidaEliminar= objConvertidor.fromJson(argumentosPeticion, Comida.class);
                objResultado=eliminarComida(objComidaEliminar);
            break;
            case "editarComida":
                String CodigoOld, NombreOld, TipoOld, CodigoNew, NombreNew, TipoNew, ValorNew, FotoNew;
                String VectorFood[] = argumentosPeticion.split(",");
                CodigoOld = VectorFood[0];
                CodigoNew = VectorFood[1];
                NombreNew = VectorFood[2];
                TipoNew = VectorFood[3];
                ValorNew = VectorFood[4];
                FotoNew = VectorFood[5];
                objResultado=editarComida(CodigoOld, CodigoNew, NombreNew, TipoNew, ValorNew, FotoNew);

            break;
        }
        resultadoJSON=objConvertidor.toJson(objResultado);
        return resultadoJSON;
    }
    
    private ResultadoDTO iniciarSesion(String login, String contrasenia)
    {
        ResultadoDTO objResultado=new ResultadoDTO();  
        if(this.objAdministradorService.existeAdministrador(login, contrasenia))
        {
            objResultado.setCodigoResultado(1);
        }                
        else
        {
            objResultado.setCodigoResultado(-1);
        }
        return objResultado;
    }
    /*
    private ResultadoDTO registrarPersona(Persona objPersona)
    {
        ResultadoDTO objResultado=new ResultadoDTO(); 
        if(this.objPersonaService.existePersona(objPersona.getTipoIdentificacion(), objPersona.getNumeroIdentificacion())==false)
        {
            this.objPersonaService.registrarPersona(objPersona);
            objResultado.setCodigoResultado(1);
        }
        else
        {
            objResultado.setCodigoResultado(-1);
        }
         
         return objResultado;
    }
    */
    /*
    private ResultadoDTO consultarPersona(String tipoIdentificacion, String numeroIdentificacion)
    {
        Persona objPersonaEncontrada;
        ResultadoDTO objResultado=new ResultadoDTO(); 
        if(this.objPersonaService.existePersona(tipoIdentificacion, numeroIdentificacion)==true)
        {
            objPersonaEncontrada=this.objPersonaService.consultarPersona(tipoIdentificacion, numeroIdentificacion);
            String objPersonaComoJSON=objConvertidor.toJson(objPersonaEncontrada);                    
            objResultado.setCodigoResultado(1);
            objResultado.setJSONResultado(objPersonaComoJSON);                    
        }
        else
        {
            objResultado.setCodigoResultado(-1);
        }
        return objResultado;
    }
    */
    private ResultadoDTO consultarAdmin(String usuario, String password){
        Administrador objAdminEncontrado;
        ResultadoDTO objResultado = new ResultadoDTO();
        if (this.objAdministradorService.existeAdministrador(usuario, password)) {
            objAdminEncontrado=this.objAdministradorService.consultarPersona(usuario, password);
            String objAdminComoJSON=objConvertidor.toJson(objAdminEncontrado);
            objResultado.setCodigoResultado(1);
            objResultado.setJSONResultado(objAdminComoJSON);
        }else{
            objResultado.setCodigoResultado(-1);
        }
        return objResultado;
    }
    private ResultadoDTO listarComidas()
    {       
        ResultadoDTO objResultado=new ResultadoDTO(); 
        ArrayList<Comida> listado= this.objComidaService.listarComidas();
        String listadoComidasComoJSON=objConvertidor.toJson(listado);                    
        objResultado.setCodigoResultado(1);
        objResultado.setJSONResultado(listadoComidasComoJSON);                    
               
        return objResultado;
    }
    private ResultadoDTO iniciarSesionPersona(String numeroIdentificacion,String TipoIdentificacion, String contrasenia){
       
        ResultadoDTO objResultado = new ResultadoDTO();
        boolean bandera=this.objPersonaService.existePersona(numeroIdentificacion, TipoIdentificacion, contrasenia);
        if (bandera==true){
            objResultado.setCodigoResultado(1);
        }
        else
        {
        objResultado.setCodigoResultado(-1);
        }
        
        
        return objResultado;
        
    
    }
    private ResultadoDTO AgregarComida(Comida objComida){
        ResultadoDTO objResultadoDTO = new ResultadoDTO();
        String Codigo = objComida.getCodigo();
        String Nombre = objComida.getNombre();
        String Tipo = objComida.getTipo();
        
        if(this.objComidaService.existeComida(Codigo, Nombre, Tipo)==false){
            this.objComidaService.AgregarComida(objComida);
            objResultadoDTO.setCodigoResultado(1);
        }else{
            objResultadoDTO.setCodigoResultado(-1);
        }
    return objResultadoDTO;
    
    }

    private ResultadoDTO editarAdmin(String user, String newname, String newlastname, String newpassword) {
        ResultadoDTO objResultadoDTO = new ResultadoDTO();
        objAdministradorService.editarAdmin(user, newname, newlastname, newpassword);
        return objResultadoDTO;
    }


    private ResultadoDTO listarComidasEspeciales() {
        ResultadoDTO objResultado=new ResultadoDTO(); 
        ArrayList<Comida> listado= this.objComidaService.listarComidasEspeciales();
        String listadoComidasComoJSON=objConvertidor.toJson(listado);                    
        objResultado.setCodigoResultado(1);
        objResultado.setJSONResultado(listadoComidasComoJSON);                    
               
        return objResultado;
    }

    private ResultadoDTO eliminarComida(Comida objComidaEliminar){
        ResultadoDTO objResultadoDTO = new ResultadoDTO();
        if (this.objComidaService.eliminarComida(objComidaEliminar)==true) {
            objResultadoDTO.setCodigoResultado(1);
        }else{
            objResultadoDTO.setCodigoResultado(-1);
        }
        return objResultadoDTO;
    }

    private ResultadoDTO editarComida(String CodigoOld, String CodigoNew, String NombreNew, String TipoNew, String ValorNew, String FotoNew) {
        ResultadoDTO objResultadoDTO = new ResultadoDTO();/*
        if(this.objComidaService.existeComida(CodigoNew, NombreNew, TipoNew)==false || CodigoOld.equals(CodigoNew)){
            if (this.objComidaService.editarComida(CodigoOld, CodigoNew, NombreNew, TipoNew, ValorNew, FotoNew)==true) {
                objResultadoDTO.setCodigoResultado(1);
            }else{
                objResultadoDTO.setCodigoResultado(-1);
            }
        }else{
            objResultadoDTO.setCodigoResultado(-1);
        }*/
        if (CodigoNew.equals(CodigoOld) && objComidaService.existeComida("", NombreNew, TipoNew)==false) {
            objComidaService.editarComida(CodigoOld, CodigoNew, NombreNew, TipoNew, ValorNew, FotoNew);
            objResultadoDTO.setCodigoResultado(1);
        }else if(objComidaService.existeComida(CodigoNew, NombreNew, TipoNew)==false){
            objComidaService.editarComida(CodigoOld, CodigoNew, NombreNew, TipoNew, ValorNew, FotoNew);
            objResultadoDTO.setCodigoResultado(1);
        }else{
            objResultadoDTO.setCodigoResultado(-1);
        }
        return objResultadoDTO;

    }
}
