package com.mycompany.peralboantoniojosepruebatec1.models;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class ServicesEmpleado {

    Date date1;
    int optionCrud;
    String createStartDate;
    String createLastName;
    String createName;
    String createPosition;
    double createSalary;
    String positionFilter;
    int optionEdit;
    String newName;
    String newLastName;
    String newPosition;
    double newSalary;
    Date newDate;
    String newCreateStartDate;

    Controladora control = new Controladora();

    Scanner scanCreate = new Scanner(System.in);
    Scanner scanCargo = new Scanner(System.in);
    Scanner scanFind = new Scanner(System.in);
    Scanner scanEdit = new Scanner(System.in);
    Scanner scan = new Scanner(System.in);

    public void crearUsuario() throws ParseException {

        System.out.println(" Ingrese datos del usuario: ");
        Empleados insertEmpleado = new Empleados();
        
        System.out.println("Ingrese el nombre: ");
        createName = scanCreate.nextLine();
        while (createName == "") {
            System.out.println("El campo no puede estar vacio, ingrese el nombre de nuevo");
            createName = scanCreate.nextLine();
        }
        System.out.println(" Ingrese el apellidos: ");
        createLastName = scanCreate.nextLine();
        while (createLastName == "") {
            System.out.println("El campo no puede estar vacio, ingrese los apellidos de nuevo");
            createLastName = scanCreate.nextLine();
        }
        System.out.println(" Ingrese el cargo: ");
        createPosition = scanCreate.nextLine();
        while (createPosition == "") {
            System.out.println("El campo no puede estar vacio, ingrese el cargo de nuevo");
            createPosition = scanCreate.nextLine();
        }
        System.out.println(" Ingrese el salario (valor numerico): ");
        createSalary = scanCreate.nextDouble();
        while (createSalary <= 0) {
            System.out.println("El valor numerico no puede ser negativo, ingrese el salario de nuevo.");
            createSalary = scanCreate.nextDouble();
        }
        try {System.out.println("Ingrese la fecha de inicio (en formato DD/MM/YYYY): ");
        createStartDate = scanCreate.next();
        date1 = new SimpleDateFormat("dd/MM/yyyy").parse(createStartDate);
            
        } catch (Exception e) {
            System.out.println("El valor indicado no se adecua al formato, comience de nuevo.");
        }


        insertEmpleado.setStartDate(date1);
        insertEmpleado.setSalary(createSalary);
        insertEmpleado.setPosition(createPosition);
        insertEmpleado.setLastName(createLastName);
        insertEmpleado.setName(createName);
        control.ingresarEmpleado(insertEmpleado);
        System.out.println("Se ha creado el usuario correctamente");
    }

    public void verListaCompleta() {
        ArrayList<Empleados> listaEmpleados = control.buscarListaEmpleados();
        for (Empleados listaEmpleado : listaEmpleados) {
            System.out.println(listaEmpleado.toString());
        }

    }

    public void modificarUsuario() throws ParseException {

        System.out.println("Ingrese el numero de empledado que desea modificar: ");
        Empleados empleadoEdit = control.buscarEmpleado(scanFind.nextInt());

        System.out.println("Ingrese el numero del campo que quiera modificar: ");
        System.out.println("\n 1. Nombre: ");
        System.out.println("2. Apellidos: ");
        System.out.println("3. Cargo: ");
        System.out.println("4. Salario: ");
        System.out.println("5. Fecha de inicio: ");
        optionEdit = scan.nextInt();
        switch (optionEdit) {
            case 1:

                System.out.println("Ingrese el nuevo nombre : ");
                newName = scanEdit.nextLine();
                empleadoEdit.setName(newName);
                while (newName == "") {
                    System.out.println("El campo no puede quedar vacio, ingrese el nombre de nuevo.");
                    newName = scanEdit.nextLine();
                    empleadoEdit.setName(newName);
                }
                control.editarEmpleado(empleadoEdit);
                System.out.println("Se ha modificado el nombre correctamente");
                break;
            case 2:

                System.out.println("Ingrese los nuevos apellidos : ");
                newLastName = scanEdit.nextLine();
                empleadoEdit.setLastName(newLastName);
                while (newLastName == "") {
                    System.out.println("El campo no puede quedar vacio, ingrese los apellidos de nuevo.");
                    newLastName = scanEdit.nextLine();
                    empleadoEdit.setLastName(newLastName);

                }
                control.editarEmpleado(empleadoEdit);
                System.out.println("Se han modificado los apellidos correctamente");
                break;
            case 3:

                System.out.println("Ingrese el nuevo cargo : ");
                newPosition = scanEdit.nextLine();
                empleadoEdit.setPosition(newPosition);
                while (newPosition == "") {
                    System.out.println("El campo no puede quedar vacio, ingrese el cargo de nuevo.");
                    newPosition = scanEdit.nextLine();
                    empleadoEdit.setPosition(newPosition);
                }
                control.editarEmpleado(empleadoEdit);
                System.out.println("Se ha modificado el cargo correctamente");
                break;
            case 4:

                System.out.println("Ingrese el nuevo salario : ");
                newSalary = scanEdit.nextDouble();
                empleadoEdit.setSalary(newSalary);
                while (newSalary <= 0) {
                    System.out.println("El valor numerico no puede ser negativo, ingrese el salario de nuevo..");
                    newSalary = scanEdit.nextDouble();
                    empleadoEdit.setSalary(newSalary);
                }
                control.editarEmpleado(empleadoEdit);
                System.out.println("Se ha modificado el salario correctamente ");
                break;
            case 5:
                try {System.out.println("Ingrese la nueva fecha inicio (en formato dd/MM/yyyy) : ");
                newCreateStartDate = scanEdit.nextLine();
                newDate = new SimpleDateFormat("dd/MM/yyyy").parse(newCreateStartDate);
                empleadoEdit.setStartDate(newDate);
                control.editarEmpleado(empleadoEdit);
                System.out.println("Se ha modificado la fecha correctamente");
                
            } catch (Exception e) {
                    System.out.println("El valor indicado no se adecua al formato, comience de nuevo.");
            }
                
                break;

            default:
                System.out.println("Ese número no se encuentra entre las opciones");

        }
    }

    public void borrarUsuario() {

        System.out.println(" Ingrese el Id del empleado que quiere eliminar: ");
        control.eliminarEmpleado(scan.nextInt());
        System.out.println("Se ha eliminado el empleado correctamente");

    }

    public void filtroCargo() {

        System.out.println("Escriba el cargo por el que desea filtrar");
        positionFilter = scanCargo.nextLine();

        ArrayList<Empleados> listaEmpleados2 = control.buscarListaEmpleados();
        for (Empleados listaEmpleado2 : listaEmpleados2) {
            if (positionFilter.equalsIgnoreCase(listaEmpleado2.getPosition())) {
                System.out.println(listaEmpleado2.toString());
            }
        }
    }
}
