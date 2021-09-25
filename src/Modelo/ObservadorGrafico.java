package Modelo;

import javax.swing.JOptionPane;

public class ObservadorGrafico implements java.util.Observer {

    private String codigoBarras;

    public ObservadorGrafico() {
        codigoBarras = null;
    }

    @Override
    public void update(java.util.Observable o, Object arg) {
        if (arg instanceof String) {
            codigoBarras = (String) arg;
            JOptionPane.showMessageDialog(null, "ObservadorCodigoBarras: Cambiado a " + codigoBarras);
            //System.out.println("ObservadorCodigoBarras: Cambiado a " + codigoBarras);
        } else {
            JOptionPane.showMessageDialog(null, "Codigo de Barra Repostandose sin Cambios");
            //System.out.println("ObservadorCodigoBarras Reportandose Todo Igual!");
        }
    }
}
