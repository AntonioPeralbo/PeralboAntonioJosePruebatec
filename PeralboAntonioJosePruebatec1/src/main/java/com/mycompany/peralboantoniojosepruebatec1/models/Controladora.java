package com.mycompany.peralboantoniojosepruebatec1.models;

import com.mycompany.peralboantoniojosepruebatec1.persistence.ControladoraPersistencia;
import java.util.ArrayList;

public class Controladora {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void ingresarEmpleado(Empleados empleado) {
        controlPersis.ingresarEmpleado(empleado);
    }

    public void eliminarEmpleado(int id) {
        controlPersis.eliminarEmpleado(id);
    }

    public void editarEmpleado(Empleados empleado) {
        controlPersis.editarEmpleado(empleado);

    }

  public Empleados buscarEmpleado (int id){
  
      return controlPersis.buscarEmpleado (id);
  }
  
  public ArrayList <Empleados> buscarListaEmpleados(){
  return controlPersis.buscarListaEmpleados();
  }
}
