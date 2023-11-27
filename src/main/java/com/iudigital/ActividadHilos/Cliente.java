//Esta clase se encarga de la creación de los clientes
package com.iudigital.ActividadHilos;
//Importación de librerías
import java.util.ArrayList;
import java.util.List;

//Nombre de la clase
class Cliente {
    String nombre;
    Producto producto1;
    List<Producto> productos;
//Método con variables asignadas o declaradas.
    public Cliente(String nombre) {
        this.nombre = nombre;
        this.productos = new ArrayList<>();
    }
//Declaración del método para agregar los productos
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }
//Declaración del método para calcular el costo total del producto.
    public double calcularCostoTotal() {
        double costoTotal = 0;
        for (Producto producto : productos) {
            costoTotal += producto.precio;
        }
        System.out.println("El costo total es: " + costoTotal);
        return costoTotal;
        
    }
}
