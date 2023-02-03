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
public class trabajador extends persona {
      private Double sueldo;
     private String acceso;
     private String login;
     private String password;
     private String estado;
     
     public trabajador () {}
     
     public trabajador (Double sueldo, String acceso, String login, String password, String estado){
        this.sueldo = sueldo;
        this.acceso = acceso;
        this.login = login;
        this.password = password;
        this.estado = estado;
     }

    /**
     * @return the sueldo
     */
    public Double getSueldo() {
        return sueldo;
    }

    /**
     * @param sueldo the sueldo to set
     */
    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }

    /**
     * @return the acceso
     */
    public String getAcceso() {
        return acceso;
    }

    /**
     * @param acceso the acceso to set
     */
    public void setAcceso(String acceso) {
        this.acceso = acceso;
    }

    /**
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
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
