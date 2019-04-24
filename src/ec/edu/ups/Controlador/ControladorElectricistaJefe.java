/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.Controlador;

import ec.edu.ups.Clases.ElectricistaJefe;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author David
 */
public class ControladorElectricistaJefe {
     private Set<ElectricistaJefe>lista;
    int codigo;
    public ControladorElectricistaJefe()
    {
        codigo=0;
        lista=new HashSet<>();
    }
     public void create  (ElectricistaJefe objeto)
    {
        codigo++;
        objeto.setCodigo(codigo);
        lista.add(objeto);
    }
    public ElectricistaJefe read(int codigo)
    {
        for(ElectricistaJefe ElectricistaEmpleado : lista)
        {
            if(ElectricistaEmpleado.getCodigo()==codigo)
            {
                return ElectricistaEmpleado;
            }
        }
        return null;
    }
    public void update(ElectricistaJefe objeto)
    {
        for (ElectricistaJefe electricistaJefe: lista)
        {
            if(electricistaJefe.equals(objeto))
            {
               lista.remove(electricistaJefe);
               lista.add(objeto);
               break;
            } 
            
        }
    }
    public void delete(int codigo)
    {
        for(ElectricistaJefe electricistaJefe: lista)
        {
            System.out.println(electricistaJefe);
                   
        }
    }
    public void litar()
    {
      for(ElectricistaJefe electricistaJefe : lista)
      {
          System.out.println(electricistaJefe);
      }  
    }
}
