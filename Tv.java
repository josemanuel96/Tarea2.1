/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea_2_1;

/**
 *
 * @author JoseManuelVicenteCheco
 */


//Clase.

public class Tv {
    
    
    //Atributos de la clase.
    
    String marca;
    String modelo;
    String color;
    String tamano;

    public Tv() {
    }
    

        
    //Metodo constructor.
    
    public Tv(String marca, String modelo, String color, String tamano) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tamano = tamano;
    }
    
    
    
    //Metodos.
    
    public void mostrarMarca(){
    
        System.out.println("La marca de la TV es: " + marca);
    }
    
    
    public void escribirModelo (){
    
        System.out.println("El modelo de la TV es: " + modelo); 
    }
    
    
    public void describirColor (){
    
        System.out.println("El color de la TV es: " + color);
    }
    
    
    public void ponerTamano (){
    
        System.out.println(tamano + " Es el tamano de la TV.");
    }
    
}
