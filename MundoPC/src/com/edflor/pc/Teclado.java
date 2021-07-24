package com.edflor.pc;

/**
 *
 * @author luis.flores.ramirez
 */
public class Teclado extends DispositivoEntrada{
      //Atributos clase teclado
    private final int idTeclado;
    private static int contadorTeclados;
    
    //Constructor aplicando herencia
    public Teclado(String tipoEntrada, String marca){
        super(tipoEntrada, marca);
        this.idTeclado = ++Teclado.contadorTeclados;
    }
    
    //Metodo toString
    @Override
    public String toString() {
        return "Teclado{" + "idTeclado=" + idTeclado + ", " + super.toString()+'}';
    }
}
