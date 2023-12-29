package com.mycompany.peralboantoniojosepruebatec1;

import com.mycompany.peralboantoniojosepruebatec1.models.ServicesEmpleado;

import java.text.ParseException;

import java.util.Scanner;

public class PeralboAntonioJosePruebatec1 {

    public static void main(String[] args) throws ParseException {

        int optionCrud;
        ServicesEmpleado servicio = new ServicesEmpleado();
        Scanner scan = new Scanner(System.in);
//Solicitamos por consola que seleccione la opcion que necesite
        System.out.println("Seleciones la opcion que desee : ");
        System.out.println("\n 1. Agregar usuario.");
        System.out.println(" 2 . Ver lista de usuarios.");
        System.out.println(" 3 . Editar usuario.");
        System.out.println(" 4 . Eliminar usuario.");
        System.out.println(" 5 . Flitrar por cargo.");
        System.out.println(" 0 . Salir de la aplicacion.");

        optionCrud = scan.nextInt();

// Utilizamos el dato que nos ha facilitado para realizar un switch con su eleccion.
        while (optionCrud != 0) {

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
                    System.out.println("saliendo");
                    break;
                default:
                    System.out.println("Por favor ingrese un numero del 0 al 5");

            }

        }
    }
}
