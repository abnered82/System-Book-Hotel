package SuperClases;
import Entidades.CategoriaHabitacion;
import java.io.*;//LIBRERIA PARA ARCHIVOS
import java.util.ArrayList;


public class SuperCategoriaHabitacion {    
    private ArrayList<CategoriaHabitacion> cathab;
    private String Archivo;
    public SuperCategoriaHabitacion(String Archivo){
        cathab = new ArrayList<CategoriaHabitacion>();
        this.Archivo = Archivo;
        cargar();
    }
    //AGREGA ELEMENTOS A LA LISTA
    public void adicionar(CategoriaHabitacion ch){
        cathab.add(ch);
    }
    //OBTIENE ELEMENTOS DE LA LISTA
    public CategoriaHabitacion obtener(int i){
        return cathab.get(i);
    }
    //ELIMINAR ELEMENTOS DE LA LISTA
    public void eliminar(CategoriaHabitacion ch){
        cathab.remove(ch);
    }
    //TAMAÑO TOTAL DE LOS ELEMENTOS DE LA LISTA
    public int tamaño(){
        return cathab.size();
    }
    //METODO PARA BUSCAR OBJETOS POR ID
    public CategoriaHabitacion buscaridCatHab(int id){ 
        for(int i=0;i<tamaño();i++){
            if(obtener(i).getIdcathab()== id)
                return obtener(i);
        }
        return null;
    }  
    //METODO PARA BUSCAR OBJETOS POR CATEGORIA
    public CategoriaHabitacion buscarCat(String cat){
        for(int i=0;i<tamaño();i++){
            if(cat.equalsIgnoreCase(obtener(i).getCategoria()))
                return obtener(i);
        }
        return null;
    }
    public int buscaridCatHab2(int id){ 
        for(int i=0;i<tamaño();i++){
            if(obtener(i).getIdcathab()== id)
                return obtener(i).getIdcathab();
        }
        return 0;
    }
    public String buscarCat2(String cat){
        for(int i=0;i<tamaño();i++){
            if(cat.equalsIgnoreCase(obtener(i).getCategoria()))
            return obtener(i).getCategoria();
        }
        return null;
    }
    public String buscarcatmod(String des, int id){ 
        for(int i=0;i<tamaño();i++){                             
            if(des.equalsIgnoreCase(obtener(i).getCategoria()) && obtener(i).getIdcathab()!= id )
            return obtener(i).getCategoria();
        }
        return "";
    }
    //CORRELATIVO
    public int getCorrelativo(){
        if (tamaño() == 0)
            return 1;        
        else
            return obtener(tamaño() - 1).getIdcathab() + 1;
    }
    //IMPLEMENTACION DE ARCHIVO
    public void grabar(){
        try{
            PrintWriter pw;
            String linea;
            pw = new PrintWriter(new FileWriter(Archivo));
            for(int i=0;i<tamaño();i++){
                linea = (obtener(i).getIdcathab()+ ";" +obtener(i).getCategoria());
                pw.println(linea);
            }
            pw.close();
        }
        catch(Exception e){
        System.out.println(e.getMessage());
        }
    }
    public void cargar(){
        try{
            BufferedReader br;
            String linea;
            String[] array = null;
            br = new BufferedReader(new FileReader(Archivo));
            while((linea = br.readLine())!=null){
                array = linea.split(";");
                CategoriaHabitacion ch = new CategoriaHabitacion(Integer.parseInt(array[0].trim()),array[1].trim());
                adicionar(ch);
            }
            br.close();
        }
        catch(Exception e){
        System.out.println(e.getMessage());  
        }
    }   
}
