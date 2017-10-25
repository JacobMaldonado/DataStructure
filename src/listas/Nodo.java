package listas;

// clase Nodo con las dos partes de un nodo y su constructor

import colas.*;
// clase Nodo con las dos partes de un nodo y su constructor
public class Nodo {

    String dato;
    Nodo enlace;

    public Nodo(String x) {
        dato = x;
        enlace = null;
    }

    public String getDato() {
        return dato;
    }

    public Nodo getEnlace() {
        return enlace;
    }

    public void setEnlace(Nodo enlace) {
        this.enlace = enlace;
    }
}

