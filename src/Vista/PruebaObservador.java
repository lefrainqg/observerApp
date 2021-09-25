/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.ObservadorCodigoBarras;
import Modelo.ObservadorCosto;
import Modelo.ObservadorGrafico;
import Modelo.Producto;
import java.util.Scanner;

public class PruebaObservador {

    public static void main(String args[]) {

        // Crear Objeto Producto y sus Observadores .
        Producto p = new Producto("123456", 1987.29f, 2123.10f);
        ObservadorCodigoBarras ObsCodigo = new ObservadorCodigoBarras();
        ObservadorCosto ObsCosto = new ObservadorCosto();
        ObservadorGrafico ObsGrafico = new ObservadorGrafico();

        // Agregando los Observadores para Producto!
        p.addObserver(ObsCodigo);
        p.addObserver(ObsCosto);
        p.addObserver(ObsGrafico);

        // Crear y Manipular Cambios en el Producto.
        System.out.println("=============EVENTO 1=========================");
        System.out.println("---------Cambio de Codigo Barras--------------");

        p.setCodigoBarra("P00010");

        System.out.println("=============EVENTO 2=========================");
        System.out.println("-------------Cambio de Precio------------------");

        p.setCosto(18879.6f);

    }
}
