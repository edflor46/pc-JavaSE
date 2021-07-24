package com.edflor.pc;

/**
 *
 * @author luis.flores.ramirez
 */
public class Orden {
    //Atributos
    private final int idOrden;
    private Computadora computadoras[];
    private static int contadorOrdenes;
    private static final int MAX_COMPUTADORAS = 10;
    private int contadorComputadoras;
    
    //Constructor vacio - Inicializar contador y array
    public Orden(){
        this.idOrden = ++Orden.contadorOrdenes;
        this.computadoras = new Computadora[MAX_COMPUTADORAS];
    }
    
    
    
    
}
