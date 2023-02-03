package Entidades;
public class cobranza {
    //ATRIBUTOS    
    private String nombrecli;
    private int idventa;
    private String nombreproducto;
    private double precioproducto;
    private double cantidadproduc;
    private double totalpro;
    private String habitacion;
    private String numerohabitacion;
    private double preciohabi;
    private double cantidaddias;
    private double totalhabita;
    private double subtotal;
    private double igv;
    private double totalfinal;
    //CONSTRUCTORES
    public cobranza(){
    }
    public cobranza(String nombrecli, int idventa, String nombreproducto, double precioproducto, double cantidadproduc, double totalpro, String habitacion,String numerohabitacion, double preciohabi, double cantidaddias, double totalhabita, double subtotal, double igv, double totalfinal) {
        this.nombrecli = nombrecli;
        this.idventa = idventa;
        this.nombreproducto = nombreproducto;
        this.precioproducto = precioproducto;
        this.cantidadproduc = cantidadproduc;
        this.totalpro = totalpro;
        this.habitacion = habitacion;
        this.numerohabitacion = numerohabitacion;
        this.preciohabi = preciohabi;
        this.cantidaddias = cantidaddias;
        this.totalhabita = totalhabita;
        this.subtotal = subtotal;
        this.igv = igv;
        this.totalfinal = totalfinal;
    }
    //METODOS SET AND GET
    public double getTotalfinal() {
        return totalfinal;
    }
    public void setTotalfinal(double totalfinal) {
        this.totalfinal = totalfinal;
    }
    public String getNombrecli() {
        return nombrecli;
    }
    public void setNombrecli(String nombrecli) {
        this.nombrecli = nombrecli;
    }
    public int getIdventa() {
        return idventa;
    }
    public void setIdventa(int idventa) {
        this.idventa = idventa;
    }
    public String getNombreproducto() {
        return nombreproducto;
    }
    public void setNombreproducto(String nombreproducto) {
        this.nombreproducto = nombreproducto;
    }
    public double getPrecioproducto() {
        return precioproducto;
    }
    public void setPrecioproducto(double precioproducto) {
        this.precioproducto = precioproducto;
    }
    public double getCantidadproduc() {
        return cantidadproduc;
    }
    public void setCantidadproduc(double cantidadproduc) {
        this.cantidadproduc = cantidadproduc;
    }
    public double getTotalpro() {
        return totalpro;
    }
    public void setTotalpro(double totalpro) {
        this.totalpro = totalpro;
    }
    public String getHabitacion() {
        return habitacion;
    }
    public void setHabitacion(String habitacion) {
        this.habitacion = habitacion;
    }
    public double getPreciohabi() {
        return preciohabi;
    }
    public void setPreciohabi(double preciohabi) {
        this.preciohabi = preciohabi;
    }
    public double getCantidaddias() {
        return cantidaddias;
    }
    public void setCantidaddias(double cantidaddias) {
        this.cantidaddias = cantidaddias;
    }
    public double getTotalhabita() {
        return totalhabita;
    }
    public void setTotalhabita(double totalhabita) {
        this.totalhabita = totalhabita;
    }
    public double getSubtotal() {
        return subtotal;
    }
    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }
    public double getIgv() {
        return igv;
    }
    public void setIgv(double igv) {
        this.igv = igv;
    }
    public String getNumerohabitacion() {
        return numerohabitacion;
    }
    public void setNumerohabitacion(String numerohabitacion) {
        this.numerohabitacion = numerohabitacion;
    }
}
