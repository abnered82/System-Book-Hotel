package SuperClases;
import Entidades.Cliente;
import java.io.*;//LIBRERIA PARA ARCHIVOS
import java.util.ArrayList;
public class SuperCliente {
    private ArrayList<Cliente> cli;
    private String Archivo;   
    public SuperCliente(String Archivo){
        cli= new ArrayList<Cliente>();
        this.Archivo = Archivo;
        cargar();
    }
    //AGREGA ELEMENTOS A LA LISTA
    public void adicionar(Cliente c){
        cli.add(c);
    }
    //OBTIENE ELEMENTOS DE LA LISTA
    public Cliente obtener(int i){
        return cli.get(i);
    }
    //ELIMINAR ELEMENTOS DE LA LISTA
    public void eliminar(Cliente c){
        cli.remove(c);
    }
    //TAMAÑO TOTAL DE LOS ELEMENTOS DE LA LISTA
    public int tamaño(){
        return cli.size();
    }
    //METODO PARA BUSCAR OBJETOS POR NOMBRE
    public Cliente buscarCliente(int codigo){
        for(int i=0;i<tamaño();i++)
                if(cli.get(i).getCodigo()== codigo){
                return cli.get(i);
                }
            return null;
    }
    //CORRELATIVO
    public int getCorrelativo(){
        if (tamaño() == 0)
            return 1;        
        else
            return obtener(tamaño() - 1).getCodigo() + 1;
    }
    //IMPLEMENTACION DE ARCHIVO
    public void grabar(){
        try{
            PrintWriter pw;
            String linea;
            pw = new PrintWriter(new FileWriter(Archivo));
            for(int i=0;i<tamaño();i++){
                linea = (obtener(i).getCodigo() + ";" +
                        obtener(i).getNombre()+ ";" +
                        obtener(i).getApellido()+ ";" +
                        obtener(i).getDni()+ ";" +
                        obtener(i).getEdad()+ ";" +
                        obtener(i).getSexo());
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
                Cliente c = new Cliente(Integer.parseInt(array[0].trim()),
                                        array[1].trim(),
                                        array[2].trim(),
                                        array[3].trim(),
                                        Integer.parseInt(array[4].trim()),
                                        array[5].trim());
                adicionar(c);
            }
            br.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());  
        }
    } 
}
