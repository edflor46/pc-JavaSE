package mundopc;

import com.edflor.pc.*;

/**
 *
 * @author luis.flores.ramirez
 */
public class MundoPC {
    public static void main(String[] args) {
        //Computadora 1
        Monitor monitorHP = new Monitor("HP", 13);
        Teclado tecladoHP = new Teclado("Bluetooth", "HP");
        Raton ratonHp = new Raton("Bluetooth", "HP");
        Computadora computadoraHP = new Computadora("Computadora HP", monitorHP,
                tecladoHP, ratonHp);
        
        //Computadora 2
        Monitor monitorGamer = new Monitor("Gamer", 34);
        Teclado tecladoGamer = new Teclado("Bluetooth", "Gamer");
        Raton ratonGamer = new Raton("Bluetooth", "Gamer");
        Computadora computadoraGamer = new Computadora("Computadora Gamer", 
                monitorGamer, tecladoGamer, ratonGamer);
        
        //Orden
        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadoraHP);
        orden1.agregarComputadora(computadoraGamer);
        
        orden1.mostrarOrden();
    }
}
