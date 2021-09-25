/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Observable;

//Sujeto 
public class Producto extends Observable {

    //Atributos
    private String CodigoBarra;
    private float Precio;
    private float Costo;

    //Metodos    
    public String getCodigoBarra() {
        return CodigoBarra;
    }

    public float getPrecio() {
        return Precio;
    }

    public float getCosto() {
        return Costo;
    }

    public void setPrecio(float Precio) {
        this.Precio = Precio;
        setChanged();
        notifyObservers(Precio);
    }

    public void setCodigoBarra(String CodigoBarra) {
        this.CodigoBarra = CodigoBarra;
        setChanged();
        notifyObservers(CodigoBarra);
    }

    public void setCosto(float Costo) {
        this.Costo = Costo;
        setChanged();
        notifyObservers(Costo);
    }

    public Producto(String codigoBarra, float costo, float precio) {
        this.CodigoBarra = codigoBarra;
        this.Precio = precio;
        System.out.println("Producto Creado Codigo: " + codigoBarra
                + " Costo: " + costo + " Precio: " + precio);
    }
}
