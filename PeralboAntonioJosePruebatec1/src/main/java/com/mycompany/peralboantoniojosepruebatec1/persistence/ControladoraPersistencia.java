package com.mycompany.peralboantoniojosepruebatec1.persistence;

import com.mycompany.peralboantoniojosepruebatec1.models.Empleados;
import com.mycompany.peralboantoniojosepruebatec1.persistence.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {

    EmpleadosJpaController empleadosJPA = new EmpleadosJpaController();

    public void ingresarEmpleado(Empleados empleado) {
        empleadosJPA.create(empleado);
    }

    public void eliminarEmpleado(int id) {
        try {
            empleadosJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarEmpleado(Empleados empleado) {
        try {
            empleadosJPA.edit(empleado);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public Empleados buscarEmpleado(int id) {
        return empleadosJPA.findEmpleados(id);
    }

    public ArrayList<Empleados> buscarListaEmpleados() {
        
        List <Empleados> lista = empleadosJPA.findEmpleadosEntities();
        ArrayList<Empleados> listaEmpleados = new ArrayList<>(lista);
        return listaEmpleados;
        
    }

}
