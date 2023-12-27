package com.mycompany.peralboantoniojosepruebatec1;

import com.mycompany.peralboantoniojosepruebatec1.models.Controladora;
import com.mycompany.peralboantoniojosepruebatec1.models.Empleados;
import static com.mycompany.peralboantoniojosepruebatec1.models.Empleados_.lastName;
import static com.mycompany.peralboantoniojosepruebatec1.models.Empleados_.name;
import static com.mycompany.peralboantoniojosepruebatec1.models.Empleados_.position;
import static com.mycompany.peralboantoniojosepruebatec1.models.Empleados_.startDate;
import com.mycompany.peralboantoniojosepruebatec1.persistence.ControladoraPersistencia;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class PeralboAntonioJosePruebatec1 {

    public static void main(String[] args) throws ParseException {
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

        Scanner scan = new Scanner(System.in);
//Solicitamos por consola que seleccione la opcion que necesite
        System.out.println("Seleciones la opcion que desee : ");
        System.out.println("\n 1. Agregar usuario.");
        System.out.println("2 . Ver lista de usuarios.");
        System.out.println("3 . Editar usuario.");
        System.out.println("4 . Eliminar usuario.");
        System.out.println("5 . Flitrar por cargo.");
        optionCrud = scan.nextInt();

        Scanner scanCreate = new Scanner(System.in);
        Scanner scanCargo = new Scanner(System.in);
        Scanner scanFind = new Scanner(System.in);
        Scanner scanEdit = new Scanner(System.in);
// Utilizamos el dato que nos ha facilitado para realizar un switch con su eleccion.
        switch (optionCrud) {
            case 1: // Agregar nuevo empleado

                System.out.println(" Ingrese datos del usuario: ");
                Empleados insertEmpleado = new Empleados();
                System.out.println(" Ingrese el apellidos: ");
                createLastName = scanCreate.nextLine();
                while (createLastName == "") {
                    System.out.println("El campo no puede estar vacio, ingrese los apellidos de nuevo");
                    createLastName = scanCreate.nextLine();
                }
                System.out.println("Ingrese el nombre: ");
                createName = scanCreate.nextLine();
                while (createName == "") {
                    System.out.println("El campo no puede estar vacio, ingrese el nombre de nuevo");
                    createName = scanCreate.nextLine();
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
                System.out.println("Ingrese la fecha de inicio (en formato DD/MM/YYYY): ");
                createStartDate = scanCreate.next();
                date1 = new SimpleDateFormat("dd/MM/yyyy").parse(createStartDate);

                insertEmpleado.setStartDate(date1);
                insertEmpleado.setSalary(createSalary);
                insertEmpleado.setPosition(createPosition);
                insertEmpleado.setLastName(createLastName);
                insertEmpleado.setName(createName);
                control.ingresarEmpleado(insertEmpleado);
                break;

            case 2: // Lectura por pantalla de la tabla

                ArrayList<Empleados> listaEmpleados = control.buscarListaEmpleados();
                for (Empleados listaEmpleado : listaEmpleados) {
                    System.out.println(listaEmpleado.toString());
                }

                break;

            case 3: // Para editar cada campo usamos un nuevo switch en el que eliga por consola el atributo que quiera cambiar
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
                        break;
                    case 5:

                        System.out.println("Ingrese la nueva fecha inicio: ");
                        newCreateStartDate = scanEdit.nextLine();
                        newDate = new SimpleDateFormat("dd/MM/yyyy").parse(newCreateStartDate);
                        empleadoEdit.setStartDate(newDate);
                        control.editarEmpleado(empleadoEdit);
                        break;

                    default:
                        throw new AssertionError();
                }

                break;

            case 4: // eliminacion del empleado en la tabla
                System.out.println(" Ingrese el Id del empleado que quiere eliminar: ");
                control.eliminarEmpleado(scan.nextInt());

                break;

            case 5: // flitro de los empleados por cargo

                System.out.println("Escriba el cargo por el que desea filtrar");
                positionFilter = scanCargo.nextLine();

                ArrayList<Empleados> listaEmpleados2 = control.buscarListaEmpleados();
                for (Empleados listaEmpleado2 : listaEmpleados2) {
                    if (positionFilter.equals(listaEmpleado2.getPosition())) {
                        System.out.println(listaEmpleado2.toString());
                    }
                }

                break;

            default:
                throw new AssertionError();
        }

    }
}
