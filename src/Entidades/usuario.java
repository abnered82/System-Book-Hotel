package Entidades;
public class usuario {
    //ATRIBUTOS
    private String nombre;
    private String apellido;      
    private String usuario;
    private String contraseña;
    private String numero;
    //CONSTRUCTORES
    public usuario(){
    }
    public usuario(String nombre, String apellido, String usuario, String contraseña, String numero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.numero = numero;
    }
    //METODOS SET AND GET
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getContraseña() {
        return contraseña;
    }
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    } 
}
