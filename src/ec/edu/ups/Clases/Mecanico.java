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
public abstract class Mecanico extends Persona{
    private double numeroDeHerramientas;
    private int horarioDeTrabajo;
    private String direccion;
    private int telefono;

    public Mecanico(double numeroDeHerramientas, int horarioDeTrabajo, String direccion, int telefono, String nombre, String cedula, double sueldo, double codigo) {
        super(nombre, cedula, sueldo, codigo);
        this.numeroDeHerramientas = numeroDeHerramientas;
        this.horarioDeTrabajo = horarioDeTrabajo;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public Mecanico(double numeroDeHerramientas, int horarioDeTrabajo, String direccion, int telefono, String nombre, String cedula, double sueldo) {
        super(nombre, cedula, sueldo);
        this.numeroDeHerramientas = numeroDeHerramientas;
        this.horarioDeTrabajo = horarioDeTrabajo;
        this.direccion = direccion;
        this.telefono = telefono;
    }
    
    

    public double getNumeroDeHerramientas() {
        return numeroDeHerramientas;
    }

    public void setNumeroDeHerramientas(double numeroDeHerramientas) {
        this.numeroDeHerramientas = numeroDeHerramientas;
    }

    public int getHorarioDeTrabajo() {
        return horarioDeTrabajo;
    }

    public void setHorarioDeTrabajo(int horarioDeTrabajo) {
        this.horarioDeTrabajo = horarioDeTrabajo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    
}
