/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructura.de.datos;

public class PilaLineal {

        private static final int TAMPILA = 79;
        private int cima;
        private final Object[] listaPila;

        public PilaLineal() {
            cima = -1;
            listaPila = new Object[TAMPILA];
        }

        public void insertar(Object elemento) throws Exception {
            if (pilaLlena()) {
                throw new Exception("Desbordamiento pila");
            }
            cima++;
            listaPila[cima] = elemento;
        }

        public Object quitar() throws Exception {
            Object aux;
            if (pilaVacia()) {
                throw new Exception("Pila vacía, no se puede extraer.");
            }
            aux = listaPila[cima];
            cima--;
            return aux;
        }

        public Object cimaPila() throws Exception {
            if (pilaVacia()) {
                throw new Exception("Pila vacía, no se puede extraer.");
            }
            return listaPila[cima];
        }

        public boolean pilaVacia() {
            return cima == -1;
        }

        public boolean pilaLlena() {
            return cima == TAMPILA - 1;
        }

        public void limpiarPila() {
            cima = -1;
        }
        
        public int numeroElementosPila(){
            return cima+1;
        }
    }
