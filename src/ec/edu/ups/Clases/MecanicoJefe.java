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
public class MecanicoJefe extends Mecanico{
     private String cargo;
    private String email;
    private double edad;
    private String estadoCivil;

    public MecanicoJefe(String cargo, String email, double edad, String estadoCivil, double numeroDeHerramientas, int horarioDeTrabajo, String direccion, int telefono, String nombre, String cedula, double sueldo, double codigo) {
        super(numeroDeHerramientas, horarioDeTrabajo, direccion, telefono, nombre, cedula, sueldo, codigo);
        this.cargo = cargo;
        this.email = email;
        this.edad = edad;
        this.estadoCivil = estadoCivil;
    }

    public MecanicoJefe(String cargo, String email, double edad, String estadoCivil, double numeroDeHerramientas, int horarioDeTrabajo, String direccion, int telefono, String nombre, String cedula, double sueldo) {
        super(numeroDeHerramientas, horarioDeTrabajo, direccion, telefono, nombre, cedula, sueldo);
        this.cargo = cargo;
        this.email = email;
        this.edad = edad;
        this.estadoCivil = estadoCivil;
    }
    
    

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
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
        return "MecanicoJefe{" + "cargo=" + cargo + ", email=" + email + ", edad=" + edad + ", estadoCivil=" + estadoCivil + '}';
    }
    
    
}
