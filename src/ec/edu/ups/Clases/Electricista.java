/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.Clases;

import java.util.Date;

/**
 *
 * @author David
 */
public  abstract class Electricista extends Persona {
    private String cargo;
    private Date fechaDeContrato;
    private int añosTrabajando;
    private String tipoSueldo;

    public Electricista(String cargo, Date fechaDeContrato, int añosTrabajando, String tipoSueldo, String nombre, String cedula, double sueldo, double codigo) {
        super(nombre, cedula, sueldo, codigo);
        this.cargo = cargo;
        this.fechaDeContrato = fechaDeContrato;
        this.añosTrabajando = añosTrabajando;
        this.tipoSueldo = tipoSueldo;
    }

    public Electricista(String cargo, Date fechaDeContrato, int añosTrabajando, String tipoSueldo, String nombre, String cedula, double sueldo) {
        super(nombre, cedula, sueldo);
        this.cargo = cargo;
        this.fechaDeContrato = fechaDeContrato;
        this.añosTrabajando = añosTrabajando;
        this.tipoSueldo = tipoSueldo;
    }
    
    

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Date getFechaDeContrato() {
        return fechaDeContrato;
    }

    public void setFechaDeContrato(Date fechaDeContrato) {
        this.fechaDeContrato = fechaDeContrato;
    }

    public int getAñosTrabajando() {
        return añosTrabajando;
    }

    public void setAñosTrabajando(int añosTrabajando) {
        this.añosTrabajando = añosTrabajando;
    }

    public String getTipoSueldo() {
        return tipoSueldo;
    }

    public void setTipoSueldo(String tipoSueldo) {
        this.tipoSueldo = tipoSueldo;
    }

    @Override
    public String toString() {
        return "Electricista{" + "cargo=" + cargo + ", fechaDeContrato=" + fechaDeContrato + ", a\u00f1osTrabajando=" + añosTrabajando + ", tipoSueldo=" + tipoSueldo + '}';
    }
    
    
}
