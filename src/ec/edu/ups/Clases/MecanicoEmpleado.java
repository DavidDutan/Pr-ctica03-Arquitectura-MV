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
public class MecanicoEmpleado extends Mecanico{
    
    private int usuario;
    private int horario;
    private double horasExtras;
    private double numeroDehijos;

    public MecanicoEmpleado(int usuario, int horario, double horasExtras, double numeroDehijos, double numeroDeHerramientas, int horarioDeTrabajo, String direccion, int telefono, String nombre, String cedula, double sueldo, double codigo) {
        super(numeroDeHerramientas, horarioDeTrabajo, direccion, telefono, nombre, cedula, sueldo, codigo);
        this.usuario = usuario;
        this.horario = horario;
        this.horasExtras = horasExtras;
        this.numeroDehijos = numeroDehijos;
    }

    public MecanicoEmpleado(int usuario, int horario, double horasExtras, double numeroDehijos, double numeroDeHerramientas, int horarioDeTrabajo, String direccion, int telefono, String nombre, String cedula, double sueldo) {
        super(numeroDeHerramientas, horarioDeTrabajo, direccion, telefono, nombre, cedula, sueldo);
        this.usuario = usuario;
        this.horario = horario;
        this.horasExtras = horasExtras;
        this.numeroDehijos = numeroDehijos;
    }
    
    

    public int getUsuario() {
        return usuario;
    }

    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }

    public int getHorario() {
        return horario;
    }

    public void setHorario(int horario) {
        this.horario = horario;
    }

    public double getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(double horasExtras) {
        this.horasExtras = horasExtras;
    }

    public double getNumeroDehijos() {
        return numeroDehijos;
    }

    public void setNumeroDehijos(double numeroDehijos) {
        this.numeroDehijos = numeroDehijos;
    }

    @Override
    public String toString() {
        return "MecanicoEmpleado{" + "usuario=" + usuario + ", horario=" + horario + ", horasExtras=" + horasExtras + ", numeroDehijos=" + numeroDehijos + '}';
    }
    
    
    
}
