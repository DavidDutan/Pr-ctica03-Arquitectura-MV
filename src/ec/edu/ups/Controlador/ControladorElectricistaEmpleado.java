/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.Controlador;

import ec.edu.ups.Clases.ElectricistaEmpleado;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author David
 */

public class ControladorElectricistaEmpleado {
    private List<ElectricistaEmpleado>lista;
    int codigo;
    public ControladorElectricistaEmpleado()
    {
        codigo=0;
        lista=new ArrayList<>();
    }
    
    public void create  (ElectricistaEmpleado objeto)
    {
        codigo++;
        objeto.setCodigo(codigo);
        lista.add(objeto);
    }
    public ElectricistaEmpleado read(int codigo)
    {
        for(ElectricistaEmpleado ElectricistaEmpleado : lista)
        {
            if(ElectricistaEmpleado.getCodigo()==codigo)
            {
                return ElectricistaEmpleado;
            }
        }
        return null;
    }
    public void update(ElectricistaEmpleado objeto)
    {
        for(int i=0; i<lista.size();i++)
        {
            ElectricistaEmpleado elemento = lista.get(i);
            if(elemento.getCodigo()== objeto.getCodigo())
            {
                lista.set(i, elemento);
            }
        }
    }
    public void delete(int codigo)
    {
        for(int i=0;i<lista.size();i++)
        {
            ElectricistaEmpleado elemento=lista.get(i);
            if(elemento.getCodigo()==codigo)
            {
                lista.remove(i);
                break;
            }
        }
    }
    public void litar()
    {
        for(ElectricistaEmpleado electricistaEmpleado : lista)
        {
            System.out.println(electricistaEmpleado);
        }
    }
    
}
