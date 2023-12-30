package com.mycompany.peralboantoniojosepruebatec1;

import com.mycompany.peralboantoniojosepruebatec1.models.ServicesEmpleado;

import java.text.ParseException;

import java.util.Scanner;

public class PeralboAntonioJosePruebatec1 {

    public static void main(String[] args) throws ParseException {
        boolean flag = true;
        int optionCrud;
        ServicesEmpleado servicio = new ServicesEmpleado();
        Scanner scan = new Scanner(System.in);
    
//iniciamos un ciclo while para que pueda utilizar de forma indefinida la aplicacion hasta que el usuario decida salir
        while (flag) {
            System.out.println("\n");
            System.out.println(" -----------------------------------");
            System.out.println(" -Seleciones la opcion que desee : -");
            System.out.println(" -----------------------------------");
            System.out.println("\n");
            System.out.println(" 1 . Agregar usuario.");
            System.out.println(" 2 . Ver lista de usuarios.");
            System.out.println(" 3 . Editar usuario.");
            System.out.println(" 4 . Eliminar usuario.");
            System.out.println(" 5 . Ver lista por cargo.");
            System.out.println(" 0 . Salir de la aplicacion.");
            optionCrud = scan.nextInt();
// Utilizamos el dato que nos ha facilitado para realizar un switch con su eleccion.
            switch (optionCrud) {
                case 1: // Agregar nuevo empleado
                    servicio.crearUsuario();

                    break;

                case 2: // Lectura por pantalla de la tabla

                    servicio.verListaCompleta();

                    break;

                case 3: // Para editar cada campo usamos un nuevo switch en el que eliga por consola el atributo que quiera cambiar
                    servicio.modificarUsuario();

                    break;

                case 4: // eliminacion del empleado en la tabla
                    servicio.borrarUsuario();

                    break;

                case 5: // flitro de los empleados por cargo
                    servicio.filtroCargo();

                    break;
                case 0:
                    System.out.println(" -----------------------------------");
                    System.out.println("        -Cerrando aplicacion-");
                    System.out.println(" -----------------------------------");
                    if (optionCrud == 0) {
                        flag = false;

                    }
                    break;
                default:
                    System.out.println("Por favor ingrese un numero del 0 al 5");

            }

        }
    }
}
