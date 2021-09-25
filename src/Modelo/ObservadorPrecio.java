/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Observable;
import java.util.Observer;

public class ObservadorPrecio implements Observer {

    private float Precio;

    public ObservadorPrecio() {
        Precio = 0;
        //System.out.println("ObservadorPrecio creado Precio es " + Precio);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof Float) {
            Precio = ((Float) arg).floatValue();
            System.out.println("Observador de Precio: ! Cambiado Precio a " + Precio);
        } else {
            System.out.println("Observador de Precio: !Todo Igual Nada Cambiado en Costo!");
        }
    }
}
