package Entidades;
public class habitacion {
    //ATRIBUTOS
    private String categoria;
    private String piso;
    private String numero;
    private double precio;
    //CONSTRUCTORES
    public habitacion(){
    }
    public habitacion(String categoria, String piso, String numero, double precio) {
        this.categoria = categoria;
        this.piso = piso;
        this.numero = numero;
        this.precio = precio;
    }
    //METODOS SET AND GET
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public String getPiso() {
        return piso;
    }
    public void setPiso(String piso) {
        this.piso = piso;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
}
