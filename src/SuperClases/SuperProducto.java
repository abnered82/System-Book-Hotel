package SuperClases;
import Entidades.Producto;
import java.util.List;
import java.util.ArrayList;
import java.io.*;
public class SuperProducto {
    
    private ArrayList<Producto> pro;   
    private String archivo;   
     
    public SuperProducto(String archivo){ 
        pro = new ArrayList<Producto>();    
        this.archivo = archivo; 
        cargar();
    }
    public void adicionar(Producto obj){ 
        pro.add(obj); 
    } 
    public Producto obtener(int i){
        return pro.get(i);           
    }    
    public void eliminar(Producto obj){
        pro.remove(obj);
    }
    public int tamaño(){ 
        return pro.size();
    }    
    public Producto buscarid(String id){  
        for(int i=0;i<tamaño();i++){
            if(id.equalsIgnoreCase(obtener(i).getId_pro()))
                return obtener(i);
        }
        return null;
    }         
    public Producto buscarnom(String nom){  
        for(int i=0;i<tamaño();i++){
            if(nom.equalsIgnoreCase(obtener(i).getNombre()))
                return obtener(i);
        }
        return null;
    }  
    public Producto buscarporcat(String cat){  
        for(int i=0;i<tamaño();i++){
            if(cat.equalsIgnoreCase(obtener(i).getCatpro()))
                return obtener(i);
        }
        return null;
    }  
    public String buscarid2(String id){ 
        for(int i=0;i<tamaño();i++){
            if(id.equalsIgnoreCase(obtener(i).getId_pro()))
                return obtener(i).getId_pro();
        }
        return "";
    } 
    public String buscarnom2(String nom){ 
        for(int i=0;i<tamaño();i++){
            if(nom.equalsIgnoreCase(obtener(i).getNombre()))
                return obtener(i).getNombre();
        }
        return "";
    }
    public String buscarporcat2(String cat){ 
        for(int i=0;i<tamaño();i++){
            if(cat.equalsIgnoreCase(obtener(i).getNombre()))
                return obtener(i).getNombre();
        }
        return "";
    }
    public String buscarnommod(String nom, String id){ 
        for(int i=0;i<tamaño();i++){                             
            if(nom.equalsIgnoreCase(obtener(i).getNombre()) && obtener(i).getId_pro()!= id )
                return obtener(i).getNombre();
        }
        return "";
    }
    public String buscarcatmod(String cat, String id){ 
        for(int i=0;i<tamaño();i++){                             
            if(cat.equalsIgnoreCase(obtener(i).getCatpro()) && obtener(i).getId_pro()!= id )
                return obtener(i).getCatpro();
        }
        return "";
    }  
    public void grabar(){
        try{
            PrintWriter pw;
            String linea; 
            pw = new PrintWriter(new FileWriter(archivo)); 
            for(int i=0;i<tamaño();i++){
                linea = (obtener(i).getId_pro()+ ";" +
                         obtener(i).getNombre()+ ";" +
                         obtener(i).getCatpro()+ ";" +
                         obtener(i).getPrepro()+ ";"
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
                Producto obj = new Producto(array[0].trim(),
                                            array[1].trim(),
                                            array[2].trim(),
                                            Double.parseDouble(array[3].trim())
                                            );
                adicionar(obj);
            }
            br.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
