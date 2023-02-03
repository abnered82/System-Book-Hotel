package Entidades;
public class CategoriaProducto {
    //VARIABLES
    private int idcatpro;
    private String categoriapro;    
    //CONSTRUCTORES
    public CategoriaProducto(){
        
    }
    public CategoriaProducto(int idcatpro, String categoriapro) {
        this.idcatpro = idcatpro;
        this.categoriapro = categoriapro;
    }
    //METODOS GET AND SET
    public int getIdcatpro() {
        return idcatpro;
    }
    public void setIdcatpro(int idcatpro) {
        this.idcatpro = idcatpro;
    }
    public String getCategoriapro() {
        return categoriapro;
    }
    public void setCategoriapro(String categoriapro) {
        this.categoriapro = categoriapro;
    }
}
