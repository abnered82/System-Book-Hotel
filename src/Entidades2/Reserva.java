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
public class Reserva {
     private int idreserva;
    private int idhabitacion;
    private int idcliente;
    private int idtrabajador;
    private String tipo_reserva;
    private Date fecha_reserva;
    private Date fecha_ingresa;
    private Date fecha_salida;
    private Double costo_alojamiento;
    private String estado;
    
    public Reserva(){}
    public Reserva(int idreserva, int idhabitacion, int idcliente, int idtrabajador, String tipo_reserva, Date fecha_reserva, Date fecha_ingresa, Date fecha_salida, Double costo_alojamiento, String estado){
     this.idreserva = idreserva;
        this.idhabitacion = idhabitacion;
        this.idcliente = idcliente;
        this.idtrabajador = idtrabajador;
        this.tipo_reserva = tipo_reserva;
        this.fecha_reserva = fecha_reserva;
        this.fecha_ingresa = fecha_ingresa;
        this.fecha_salida = fecha_salida;
        this.costo_alojamiento = costo_alojamiento;
        this.estado = estado;
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
     * @return the idhabitacion
     */
    public int getIdhabitacion() {
        return idhabitacion;
    }

    /**
     * @param idhabitacion the idhabitacion to set
     */
    public void setIdhabitacion(int idhabitacion) {
        this.idhabitacion = idhabitacion;
    }

    /**
     * @return the idcliente
     */
    public int getIdcliente() {
        return idcliente;
    }

    /**
     * @param idcliente the idcliente to set
     */
    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    /**
     * @return the idtrabajador
     */
    public int getIdtrabajador() {
        return idtrabajador;
    }

    /**
     * @param idtrabajador the idtrabajador to set
     */
    public void setIdtrabajador(int idtrabajador) {
        this.idtrabajador = idtrabajador;
    }

    /**
     * @return the tipo_reserva
     */
    public String getTipo_reserva() {
        return tipo_reserva;
    }

    /**
     * @param tipo_reserva the tipo_reserva to set
     */
    public void setTipo_reserva(String tipo_reserva) {
        this.tipo_reserva = tipo_reserva;
    }

    /**
     * @return the fecha_reserva
     */
    public Date getFecha_reserva() {
        return fecha_reserva;
    }

    /**
     * @param fecha_reserva the fecha_reserva to set
     */
    public void setFecha_reserva(Date fecha_reserva) {
        this.fecha_reserva = fecha_reserva;
    }

    /**
     * @return the fecha_ingresa
     */
    public Date getFecha_ingresa() {
        return fecha_ingresa;
    }

    /**
     * @param fecha_ingresa the fecha_ingresa to set
     */
    public void setFecha_ingresa(Date fecha_ingresa) {
        this.fecha_ingresa = fecha_ingresa;
    }

    /**
     * @return the fecha_salida
     */
    public Date getFecha_salida() {
        return fecha_salida;
    }

    /**
     * @param fecha_salida the fecha_salida to set
     */
    public void setFecha_salida(Date fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

    /**
     * @return the costo_alojamiento
     */
    public Double getCosto_alojamiento() {
        return costo_alojamiento;
    }

    /**
     * @param costo_alojamiento the costo_alojamiento to set
     */
    public void setCosto_alojamiento(Double costo_alojamiento) {
        this.costo_alojamiento = costo_alojamiento;
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
