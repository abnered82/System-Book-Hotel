package SuperClases;
import Entidades.usuario;
import java.util.ArrayList;
import java.io.*;
public class SuperUsuario {
    private ArrayList<usuario> usu;
    private String Archivo;//nombre del archivo
    public SuperUsuario(String Archivo){ 
        usu = new ArrayList<usuario>();    
        this.Archivo = Archivo; 
    }
    public void adicionar(usuario obj){ 
        usu.add(obj); 
    } 
    public usuario obtener(int i){
        return usu.get(i);           
    }    
    public void eliminar(usuario obj){
        usu.remove(obj);
    }
    public int tamaño(){ 
        return usu.size();
    }    
    public usuario buscarusu(String usu){ 
        for(int i=0;i<tamaño();i++){
            if(usu.equals(obtener(i).getUsuario()))
                return obtener(i);
        }
        return null;
    }  
    public usuario buscarcon(String con){ 
        for(int i=0;i<tamaño();i++){
            if(con.equals(obtener(i).getContraseña()))
                return obtener(i);
        }
        return null;
    }  
}
