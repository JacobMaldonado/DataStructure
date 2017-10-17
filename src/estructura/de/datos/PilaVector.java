/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructura.de.datos;

import java.util.Vector;

/**
 *
 * @author jacob
 */
public class PilaVector <E>{

    private static final int INICIAL = 19;
    private int cima;
    private Vector<E> listaPila;

    public PilaVector() {
        cima = -1;
        listaPila = new Vector<E>(INICIAL);
    }

    public void insertar(Object elemento) throws Exception {
        cima++;
        listaPila.addElement((E) elemento);
    }

    public Object quitar() throws Exception {
        Object aux;
        if (pilaVacia()) {
            throw new Exception("Pila vacía, no se puede extraer.");
        }
        aux = listaPila.elementAt(cima);
        listaPila.removeElementAt(cima);
        cima--;
        return aux;
    }

    public Object cimaPila() throws Exception {
        if (pilaVacia()) {
            throw new Exception("Pila vacía, no se puede extraer.");
        }
        return listaPila.elementAt(cima);
    }

    public boolean pilaVacia() {
        return cima == -1;
    }

    public void limpiarPila() throws Exception {
        while (!pilaVacia()) {
            quitar();
        }
    }
}
