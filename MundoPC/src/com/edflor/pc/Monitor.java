package com.edflor.pc;

/**
 *
 * @author luis.flores.ramirez
 */
public class Monitor {
    //Atributos
    private final int idMonitor;
    private String marca;
    private double tamanio;
    private static int contadorMonitores;
    
    //Constructor vacio
    private Monitor(){
        this.idMonitor = ++Monitor.contadorMonitores;
    }
    
    //Constructor publico
    public Monitor(String marca, double tamanio){
        this();
        this.marca = marca;
        this.tamanio = tamanio;
    }
    
    //Metodos GET y SET
    public int getIdMonitor(){
        return this.idMonitor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }
    
    //Metodo toString

    @Override
    public String toString() {
        return "Monitor{" + "idMonitor=" + idMonitor + ", marca=" + marca + ", tamanio=" + tamanio + '}';
    }
    
}
