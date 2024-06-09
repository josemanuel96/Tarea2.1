/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea_2_1;

/**
 *
 * @author JoseManuelVicenteCheco
 */

//Clase Main Prueba

public class Prueba {

    public static void main(String[] args) {

        
        // Tres instancias de la clase Tv, con valores en cada atributo y cada metodo invocado.
        
        System.out.println("Tele1:");

        System.out.println("--------------------------------");

        Tv tele1 = new Tv("Samsung", "R57", "Gris", "50 pulgadas");
        tele1.mostrarMarca();
        tele1.escribirModelo();
        tele1.ponerTamano();
        tele1.describirColor();

        System.out.println("--------------------------------");

        System.out.println("Tele2:");

        Tv tele2 = new Tv("Lg", "LifeGood", "Negra", "30 pulgadas");
        tele2.mostrarMarca();
        tele2.escribirModelo();
        tele2.ponerTamano();
        tele2.describirColor();

        System.out.println("--------------------------------");

        System.out.println("Tele3:");

        Tv tele3 = new Tv("TCL", "AndroidTv", "Negra", "43 pulgadas");
        tele3.mostrarMarca();
        tele3.escribirModelo();
        tele3.ponerTamano();
        tele3.describirColor();

    }

}
