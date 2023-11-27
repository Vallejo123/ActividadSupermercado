package com.iudigital.ActividadHilos;
//Nombre de la clasee. Además se convierte en clase hija de la clase Thread

class Cajera extends Thread {

    //Definición de variables.
    String nombre;
    Cliente cliente;
//Método cajera con la definición de variables.

    public Cajera(String nombre, Cliente cliente) {
        this.nombre = nombre;
        this.cliente = cliente;
    }
//Método para sobreescribir

    @Override
    public void run() {
        cobrar(cliente);
    }
//Método para que la cajera realice el cobro y para el control del tiempo del cobro

    public void cobrar(Cliente cliente) {
        System.out.println("Cajera " + nombre + " está cobrando a " + cliente.nombre);

        long tiempoInicio = System.currentTimeMillis();

        for (Producto producto : cliente.productos) {
            System.out.println("Procesando producto: " + producto.nombre);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
//Variables para calcular el tiempo que demora la cajera
        long tiempoFin = System.currentTimeMillis();
        long tiempoTotal = tiempoFin - tiempoInicio;

//Mensaje de salida para información en pantalla del proceso.       
        System.out.println("Cobro completado para " + cliente.nombre + ". Tiempo total: " + tiempoTotal + " ms\n");
    }
}
