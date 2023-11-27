//En esta clase se crean o definen los productos
package com.iudigital.ActividadHilos;

//Nombre de la clase
public class Producto {
  
    //Definición de variables
    String nombre;
    double precio;

    //Constructor con la asignación de variables.
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    } 

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", precio=" + precio + '}';
    }
    
}

