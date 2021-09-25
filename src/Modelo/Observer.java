package Modelo;

//clase que llama a actualizador/update

public interface Observer {
    
//llamada apdate
    void update(Observable o, Object arg);
}
