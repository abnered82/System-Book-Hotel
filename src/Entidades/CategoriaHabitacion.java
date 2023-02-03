package Entidades;
public class CategoriaHabitacion {
    //ATRIBUTOS
    private int idcathab;
    private String categoria;
    //CONSTRUCTORES
    public CategoriaHabitacion(){
    }
    public CategoriaHabitacion(int idcathab, String categoria) {
        this.idcathab = idcathab;
        this.categoria = categoria;
    }
    //METODOS SET AND GET
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public int getIdcathab() {
        return idcathab;
    }
    public void setIdcathab(int idcathab) {
        this.idcathab = idcathab;
    }
}
