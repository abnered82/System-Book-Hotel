/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades2;

/**
 *
 * @author Usuario
 */
public class Consumo {
       private int idconsumo;
    private int idreserva;
    private int idproducto;
    private Double cantidad;
    private Double precio_venta;
    private String estado;
    
    public Consumo () {}
    public Consumo (int idconsumo, int idreserva, int idproducto, Double cantidad, Double precio_venta, String estado) {
     this.idconsumo = idconsumo;
        this.idreserva = idreserva;
        this.idproducto = idproducto;
        this.cantidad = cantidad;
        this.precio_venta = precio_venta;
        this.estado = estado;
    }

    /**
     * @return the idconsumo
     */
    public int getIdconsumo() {
        return idconsumo;
    }

    /**
     * @param idconsumo the idconsumo to set
     */
    public void setIdconsumo(int idconsumo) {
        this.idconsumo = idconsumo;
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
     * @return the idproducto
     */
    public int getIdproducto() {
        return idproducto;
    }

    /**
     * @param idproducto the idproducto to set
     */
    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }

    /**
     * @return the cantidad
     */
    public Double getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the precio_venta
     */
    public Double getPrecio_venta() {
        return precio_venta;
    }

    /**
     * @param precio_venta the precio_venta to set
     */
    public void setPrecio_venta(Double precio_venta) {
        this.precio_venta = precio_venta;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
}
