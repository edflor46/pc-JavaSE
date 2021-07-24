package com.edflor.pc;

/**
 *
 * @author luis.flores.ramirez
 */
public class Raton extends DispositivoEntrada{
    //Atributos clase raton
    private final int idRaton;
    private static int contadorRatones;
    
    //Constructor aplicando herencia
    public Raton(String tipoEntrada, String marca){
        super(tipoEntrada, marca);
        this.idRaton = ++Raton.contadorRatones;
    }
    
    //Metodo toString

    @Override
    public String toString() {
        return "Raton{" + "idRaton=" + idRaton + ", " + super.toString()+'}';
    }
    
}
