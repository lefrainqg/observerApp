package Modelo;

import java.util.Vector;

// Esta clase representa un objeto observable, o "datos"
public class Observable {
    private boolean changed = false;
    private Vector obs;

   //Construir un observable con cero observadores. 
    public Observable() {
        obs = new Vector();
    }

    
    //Añade un observador para el conjunto de observadores para este objeto
    public synchronized void addObserver(Observer o) {
        if (o == null)
            throw new NullPointerException();
        if (!obs.contains(o)) {
            obs.addElement(o);
        }
    }

    //Elimina un observador del grupo de observadores de este objeto.
    public synchronized void deleteObserver(Observer o) {
        obs.removeElement(o);
    }

    //Metodo que notifica a los observadores los cambios.
    public void notifyObservers() {
        notifyObservers(null);
    }
    
    public void notifyObservers(Object arg) {
        
        Object[] arrLocal;

        synchronized (this) {
          
            if (!changed)
                return;
            arrLocal = obs.toArray();
            clearChanged();
        }

        for (int i = arrLocal.length-1; i>=0; i--)
            ((Observer)arrLocal[i]).update(this, arg);
    }

    // Borra la lista de observadores para que este objeto ya no tiene observadores.
    public synchronized void deleteObservers() {
        obs.removeAllElements();
    }

   //Marca los observadores que fueron observados
    protected synchronized void setChanged() {
        changed = true;
    }

    
    //Indica que el objeto no ha cambiado
    protected synchronized void clearChanged() {
        changed = false;
    }

    //Prueba si el objeto ha cambiado
    public synchronized boolean hasChanged() {
        return changed;
    }

    //Retorna el numero de objetos observados
    public synchronized int countObservers() {
        return obs.size();
    }
}
