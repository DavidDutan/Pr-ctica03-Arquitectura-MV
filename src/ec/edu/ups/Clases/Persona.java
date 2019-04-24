/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.Clases;

/**
 *
 * @author David
 */
public class Persona {
    
    private String nombre;
    private String cedula;
    private double sueldo;
    private double  codigo;

    public Persona(String nombre, String cedula, double sueldo, double codigo) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.sueldo = sueldo;
        this.codigo = codigo;
    }

    public Persona(String nombre, String cedula, double sueldo) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.sueldo = sueldo;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getCodigo() {
        return codigo;
    }

    public void setCodigo(double codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", cedula=" + cedula + ", sueldo=" + sueldo + ", codigo=" + codigo + '}';
    }

   
    
}
