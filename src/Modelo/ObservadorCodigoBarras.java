/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Observable;
import java.util.Observer;


public class ObservadorCodigoBarras implements Observer {

    private String codigoBarras;

    public ObservadorCodigoBarras() {
        codigoBarras = null;
       //System.out.println("ObservadorCodigoBarras creado es " + codigoBarras);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof String) {
            codigoBarras = (String) arg;
            System.out.println("ObservadorCodigoBarras: Cambiado a " + codigoBarras);
        } else {
            System.out.println("ObservadorCodigoBarras Reportandose Todo Igual!");
        }
    }
}
