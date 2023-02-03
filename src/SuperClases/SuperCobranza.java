package SuperClases;
import Entidades.cobranza;
import java.util.ArrayList;
import java.io.*;
public class SuperCobranza {
    
    private ArrayList<cobranza> cob;   
    private String archivo;   
     
    public SuperCobranza(String archivo){ 
        cob = new ArrayList<cobranza>();    
        this.archivo = archivo; 
        cargar();
    }

    public void adicionar(cobranza obj){ 
        cob.add(obj); 
    } 
    
    public cobranza obtener(int i){
        return cob.get(i);           
    }    
        
    public void eliminar(cobranza obj){
        cob.remove(obj);
    }
    
    public int tamaño(){ 
        return cob.size();
    }            
    
    public cobranza buscarid(int id){ //Buscar por id 
        for(int i=0;i<tamaño();i++){
            if(obtener(i).getIdventa()== id)
                return obtener(i);
        }
        return null;
    }                 
    
    public int buscarid2(int id){ //Verificar si el id ya existe 
        for(int i=0;i<tamaño();i++){
            if(obtener(i).getIdventa()== id)
                return obtener(i).getIdventa();
        }
        return 0;
    }         
            
    public int getCorrelativoIdcobranza(){
        if (tamaño() == 0)
            return 1;        
        else
            return obtener(tamaño() - 1).getIdventa()+ 1;
    }
    
    
       
    public void grabar(){
        try{
            PrintWriter pw;
            String linea; 
            pw = new PrintWriter(new FileWriter(archivo)); 
            for(int i=0;i<tamaño();i++){
                linea = (obtener(i).getNombrecli()+ ";" +
                         obtener(i).getIdventa()+ ";" +
                         obtener(i).getNombreproducto()+ ";" +
                         obtener(i).getPrecioproducto()+ ";" +
                         obtener(i).getCantidadproduc()+ ";" +
                         obtener(i).getTotalpro()+ ";" +
                         obtener(i).getHabitacion()+ ";" +
                         obtener(i).getNumerohabitacion()+ ";" + 
                         obtener(i).getPreciohabi()+ ";" +
                         obtener(i).getCantidaddias()+ ";" +
                         obtener(i).getTotalhabita()+ ";" +
                         obtener(i).getSubtotal()+ ";" +
                         obtener(i).getIgv()+ ";" +
                         obtener(i).getTotalfinal()+ ";"
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
                cobranza obj = new cobranza(array[0].trim(),
                                        Integer.parseInt(array[1].trim()),
                                        array[2].trim(),
                                        Double.parseDouble(array[3].trim()),
                                        Double.parseDouble(array[4].trim()),
                                        Double.parseDouble(array[5].trim()),
                                        array[6].trim(),
                                        array[7].trim(),
                                        Double.parseDouble(array[8].trim()),
                                        Double.parseDouble(array[9].trim()),
                                        Double.parseDouble(array[10].trim()),
                                        Double.parseDouble(array[11].trim()),
                                        Double.parseDouble(array[12].trim()),
                                        Double.parseDouble(array[13].trim())
                                        );
                adicionar(obj);
            }
            br.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    
}
