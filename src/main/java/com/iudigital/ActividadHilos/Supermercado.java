
package com.iudigital.ActividadHilos;


public class Supermercado { //Nombre de la clase

    public static void main(String[] args) { //Clase principal que se ejecuta para iniciar el programa.
        //Agregar productos
        Producto producto1 = new Producto("AZUCAR", 2.4);
        Producto producto2 = new Producto("PANELA", 2.6);
        Producto producto3 = new Producto("HARINA", 2.9);
        
        //Agragar clientes
        Cliente cliente1 = new Cliente("Andrés");
        Cliente cliente2 = new Cliente("Roberto");
        
        //Asignar productos a clientes
        cliente1.agregarProducto(producto1);
        cliente1.agregarProducto(producto2);
        cliente1.agregarProducto(producto3);
        cliente2.agregarProducto(producto1);
        cliente2.agregarProducto(producto2);
        cliente2.agregarProducto(producto3);
        
        //Se crea cada una de las instancias de cada cajera
        Cajera cajera1 = new Cajera("CAJERA UNO", cliente1);
        Cajera cajera2 = new Cajera("CAJERA DOS", cliente2);
        
        
        //Inicio del programa
        cajera1.start(); //Se ejecuta cobro en cajera1
        cajera2.start(); //Se ejecuta cobro en cajera2
        cliente1.calcularCostoTotal(); //Se calcula el costo total por cliente
        cliente2.calcularCostoTotal();
        
        //Control de errores
        try {
            cajera1.join();
            cajera2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
    

  

