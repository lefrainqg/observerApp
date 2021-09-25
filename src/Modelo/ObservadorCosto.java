/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Observable;
import java.util.Observer;

public class ObservadorCosto implements Observer {

    private float Costo;
    ObservadorPrecio ObsPrecio = new ObservadorPrecio();

    public ObservadorCosto() {
        Costo = 0;
        //System.out.println("ObservadorCosto creado costo es " + Costo);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof Float) {
            Costo = ((Float) arg);
            float Precio = (Costo * 1.1f);
            Precio = ((Float) Precio);
            System.out.println("Observador de Costo: ! Cambiado Costo a " + Costo);
            ObsPrecio.update(o, Precio);
        } else {
            System.out.println("Observador de Costo: !Todo Igual Nada Cambiado en Costo!");
        }
    }
}
