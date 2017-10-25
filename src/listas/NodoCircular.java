
package listas;

public class NodoCircular {

    NodoCircular enlace;
    Object dato;

    public NodoCircular(Object entrada) {
        dato = entrada;
        enlace = this; // se apunta asímismo
    }
}

