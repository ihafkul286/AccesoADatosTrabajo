package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("""
                1. Cargar la información de un fichero CSV. 
                2. Insertar un coche en una posición concreta del fichero.
                3. Ordenar el fichero por el campo matrícula.
                4. Borrar un registro concreto.
                5. Modificar el registro de una posición dada.\n
                """);
        System.out.println("Elige una opción de las mostradas previamente ");
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Ha elegido la opcion 1 : Cargar la información de un fichero CSV.");
                System.out.println("");
                BBDD.informationCharge();
        }
    }

}
