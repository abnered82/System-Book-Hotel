/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades2;
import java.sql.Date;

/**
 *
 * @author Usuario
 */


public class Pago {
    private int idpago;
    private int idreserva;
    private String tipo_comprobante;
    private String num_comprobante;
    private Double igv;
    private Double total_pago;
    private Date fecha_emision;
    private Date fecha_pago;
    
    
    public Pago(){}
    
    
    public Pago(int idpago, int idreserva, String tipo_comprobante, String num_comprobante, Double igv, Double total_pago, Date fecha_emision, Date fecha_pago){
    
    this.idpago = idpago;
        this.idreserva = idreserva;
        this.tipo_comprobante = tipo_comprobante;
        this.num_comprobante = num_comprobante;
        this.igv = igv;
        this.total_pago = total_pago;
        this.fecha_emision = fecha_emision;
        this.fecha_pago = fecha_pago;
    }

    /**
     * @return the idpago
     */
    public int getIdpago() {
        return idpago;
    }

    /**
     * @param idpago the idpago to set
     */
    public void setIdpago(int idpago) {
        this.idpago = idpago;
    }

    /**
     * @return the idreserva
     */
    public int getIdreserva() {
        return idreserva;
    }

    /**
     * @param idreserva the idreserva to set
     */
    public void setIdreserva(int idreserva) {
        this.idreserva = idreserva;
    }

    /**
     * @return the tipo_comprobante
     */
    public String getTipo_comprobante() {
        return tipo_comprobante;
    }

    /**
     * @param tipo_comprobante the tipo_comprobante to set
     */
    public void setTipo_comprobante(String tipo_comprobante) {
        this.tipo_comprobante = tipo_comprobante;
    }

    /**
     * @return the num_comprobante
     */
    public String getNum_comprobante() {
        return num_comprobante;
    }

    /**
     * @param num_comprobante the num_comprobante to set
     */
    public void setNum_comprobante(String num_comprobante) {
        this.num_comprobante = num_comprobante;
    }

    /**
     * @return the igv
     */
    public Double getIgv() {
        return igv;
    }

    /**
     * @param igv the igv to set
     */
    public void setIgv(Double igv) {
        this.igv = igv;
    }

    /**
     * @return the total_pago
     */
    public Double getTotal_pago() {
        return total_pago;
    }

    /**
     * @param total_pago the total_pago to set
     */
    public void setTotal_pago(Double total_pago) {
        this.total_pago = total_pago;
    }

    /**
     * @return the fecha_emision
     */
    public Date getFecha_emision() {
        return fecha_emision;
    }

    /**
     * @param fecha_emision the fecha_emision to set
     */
    public void setFecha_emision(Date fecha_emision) {
        this.fecha_emision = fecha_emision;
    }

    /**
     * @return the fecha_pago
     */
    public Date getFecha_pago() {
        return fecha_pago;
    }

    /**
     * @param fecha_pago the fecha_pago to set
     */
    public void setFecha_pago(Date fecha_pago) {
        this.fecha_pago = fecha_pago;
    }
    
    
}
