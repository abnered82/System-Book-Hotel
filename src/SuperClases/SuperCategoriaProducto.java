package SuperClases;
import Entidades.CategoriaProducto;
import java.io.*;//LIBRERIA PARA ARCHIVOS
import java.util.ArrayList;


public class SuperCategoriaProducto {
    private ArrayList<CategoriaProducto> catpro;
    private String Archivo;//nombre del archivo
    public SuperCategoriaProducto(String Archivo){
        catpro = new ArrayList<CategoriaProducto>();
        this.Archivo = Archivo;
        cargar();
    }
    //AGREGA ELEMENTOS A LA LISTA
    public void adicionar(CategoriaProducto cp){
        catpro.add(cp);
    }
    //OBTIENE ELEMENTOS DE LA LISTA
    public CategoriaProducto obtener(int i){
        return catpro.get(i);
    }
    //ELIMINAR ELEMENTOS DE LA LISTA
    public void eliminar(CategoriaProducto cp){
        catpro.remove(cp);
    }
    //TAMAÑO TOTAL DE LOS ELEMENTOS DE LA LISTA
    public int tamaño(){
        return catpro.size();
    }
    //METODO PARA BUSCAR OBJETOS POR ID
    public CategoriaProducto buscaridCatPro(int id){ 
        for(int i=0;i<tamaño();i++){
            if(obtener(i).getIdcatpro()== id)
                return obtener(i);
        }
        return null;
    }  
    //METODO PARA BUSCAR OBJETOS POR CATEGORIA
    public CategoriaProducto buscarCat(String cat){
        for(int i=0;i<tamaño();i++){
            if(cat.equalsIgnoreCase(obtener(i).getCategoriapro()))
                return obtener(i);
        }
        return null;
    }
    public int buscaridCatPro2(int id){ 
        for(int i=0;i<tamaño();i++){
            if(obtener(i).getIdcatpro()== id)
                return obtener(i).getIdcatpro();
        }
        return 0;
    }
    public String buscarCat2(String cat){
        for(int i=0;i<tamaño();i++){
            if(cat.equalsIgnoreCase(obtener(i).getCategoriapro()))
                return obtener(i).getCategoriapro();
        }
        return null;
    }
    public String buscarcatmod(String des, int id){ //Modificar: La descripcion no debe existir, la descripcion puede ser la misma, el id puede ser el mismo
        for(int i=0;i<tamaño();i++){                             
            if(des.equalsIgnoreCase(obtener(i).getCategoriapro()) && obtener(i).getIdcatpro()!= id )
                return obtener(i).getCategoriapro();
        }
        return "";
    }
    //CORRELATIVO
    public int getCorrelativo(){
        if (tamaño() == 0)
            return 1;        
        else
            return obtener(tamaño() - 1).getIdcatpro()+ 1;
    }
    //IMPLEMENTACION DE ARCHIVO
    public void grabar(){
        try{
            PrintWriter pw;
            String linea;
            pw = new PrintWriter(new FileWriter(Archivo));
            for(int i=0;i<tamaño();i++){
                linea = (obtener(i).getIdcatpro()+ ";" + obtener(i).getCategoriapro());
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
               CategoriaProducto cp = new CategoriaProducto(Integer.parseInt(array[0].trim()),array[1].trim());
                adicionar(cp);
            }
            br.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());  
        }
    }
}
