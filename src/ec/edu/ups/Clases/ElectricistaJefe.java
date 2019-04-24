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
public class ElectricistaJefe extends Electricista {
    private String cargo2;
    private String email;
    private double edad;
    private String estadoCivil;

    public ElectricistaJefe(String cargo2, String email, double edad, String estadoCivil, String cargo, Date fechaDeContrato, int añosTrabajando, String tipoSueldo, String nombre, String cedula, double sueldo, double codigo) {
        super(cargo, fechaDeContrato, añosTrabajando, tipoSueldo, nombre, cedula, sueldo, codigo);
        this.cargo2 = cargo2;
        this.email = email;
        this.edad = edad;
        this.estadoCivil = estadoCivil;
    }

    public ElectricistaJefe(String cargo2, String email, double edad, String estadoCivil, String cargo, Date fechaDeContrato, int añosTrabajando, String tipoSueldo, String nombre, String cedula, double sueldo) {
        super(cargo, fechaDeContrato, añosTrabajando, tipoSueldo, nombre, cedula, sueldo);
        this.cargo2 = cargo2;
        this.email = email;
        this.edad = edad;
        this.estadoCivil = estadoCivil;
    }

   
    

   
    
    

    public String getCargo2() {
        return cargo2;
    }

    public void setCargo(String cargo2) {
        this.cargo2 = cargo2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getEdad() {
        return edad;
    }

    public void setEdad(double edad) {
        this.edad = edad;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    @Override
    public String toString() {
        return "ElectricistaJefe{" + "cargo=" + cargo2 + ", email=" + email + ", edad=" + edad + ", estadoCivil=" + estadoCivil + '}';
    }

    
}
