package Entidades;
public class Producto {
    //ATRIBUTOS
    private String id_pro;
    private String nombre;
    private String catpro;
    private double prepro;
    //CONSTRUCTORES
    public Producto(){
    }
    public Producto(String id_pro, String nombre, String catpro, double precat) {
        this.id_pro = id_pro;
        this.nombre = nombre;
        this.catpro = catpro;
        this.prepro = precat;
    }
    //METODOS SET AND GET
    public double getPrepro() {
        return prepro;
    }
    public void setPrepro(double precat) {
        this.prepro = precat;
    }
    public String getId_pro() {
        return id_pro;
    }
    public void setId_pro(String id_pro) {
        this.id_pro = id_pro;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCatpro() {
        return catpro;
    }
    public void setCatpro(String catpro) {
        this.catpro = catpro;
    }
}
