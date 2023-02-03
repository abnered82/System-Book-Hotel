package SuperClases;
import Entidades.habitacion;
import java.util.List;
import java.util.ArrayList;
import java.io.*;
public class SuperHabitacion {    
    private ArrayList<habitacion> hab;   
    private String archivo;   
    public SuperHabitacion(String archivo){ 
        hab = new ArrayList<habitacion>();    
        this.archivo = archivo; 
        cargar();
    }
    public void adicionar(habitacion obj){ 
        hab.add(obj); 
    }
    public habitacion obtener(int i){
        return hab.get(i);           
    }   
    public void eliminar(habitacion obj){
        hab.remove(obj);
    }
    public int tamaño(){ 
        return hab.size();
    }
    public habitacion buscarcat(String cat){   
        for(int i=0;i<tamaño();i++){
            if(cat.equalsIgnoreCase(obtener(i).getCategoria()))
                return obtener(i);
        }
        return null;
    }
    public habitacion buscarpiso(String pis){   
        for(int i=0;i<tamaño();i++){
            if(pis.equalsIgnoreCase(obtener(i).getPiso()))
                return obtener(i);
        }
        return null;
    }  
    
    public habitacion buscarnum(String num){
        for(int i=0;i<tamaño();i++)
                if(num.equalsIgnoreCase(obtener(i).getNumero())){
                    return hab.get(i);
                }
            return null;
    }
    
    public String buscacat2(String cat){ 
        for(int i=0;i<tamaño();i++){
            if(cat.equalsIgnoreCase(obtener(i).getCategoria()))
                return obtener(i).getCategoria();
        }
        return "";
    } 
    
    public String buscarpiso2(String pis){ 
        for(int i=0;i<tamaño();i++){
            if(pis.equalsIgnoreCase(obtener(i).getPiso()))
                return obtener(i).getPiso();
        }
        return "";
    }
    
    public String buscarnum2(String num){ 
        for(int i=0;i<tamaño();i++){
            if(num.equalsIgnoreCase(obtener(i).getNumero()))
                return obtener(i).getNumero();
        }
        return "";
    }
    
    
    public String buscatnummod(String cat, String num){ 
        for(int i=0;i<tamaño();i++){                             
            if(cat.equalsIgnoreCase(obtener(i).getCategoria()) && num.equalsIgnoreCase(obtener(i).getNumero()) )
                return obtener(i).getNumero();
        }
        return "";
    }
       
       
    public void grabar(){
        try{
            PrintWriter pw;
            String linea; 
            pw = new PrintWriter(new FileWriter(archivo)); 
            for(int i=0;i<tamaño();i++){
                linea = (obtener(i).getCategoria()+ ";" +
                         obtener(i).getPiso()+ ";" +
                         obtener(i).getNumero()+ ";" +
                         obtener(i).getPrecio()+ ";"
                         );
                pw.println(linea);
            }
            pw.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }    
       
    public void cargar(){
        try{
            BufferedReader br;
            String linea; 
            String[] array;
            br = new BufferedReader(new FileReader(archivo));
            while((linea = br.readLine()) != null){
                array = linea.split(";"); 
                habitacion hab = new habitacion(array[0].trim(),
                                            array[1].trim(),
                                            array[2].trim(),
                                            Double.parseDouble(array[3].trim())
                                            );
                adicionar(hab);
            }
            br.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}