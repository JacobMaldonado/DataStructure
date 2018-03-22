/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

public class ListaCircular {

    private NodoCircular lc;
    private int contador;

    public ListaCircular() {
        contador = 0;
    }

    public ListaCircular insertar(Object entrada) {
        NodoCircular nuevo;
        contador ++;
        nuevo = new NodoCircular(entrada);
        if (lc != null) // lista circular no vacía
        {
            nuevo.enlace = lc.enlace;
            lc.enlace = nuevo;
        }
        lc = nuevo;
        return this;
    }

    public void eliminar(Object entrada) {
        NodoCircular actual;
        actual = lc;
        while ((actual.enlace != lc)
                && !(actual.enlace.dato.equals(entrada))) {
            if (!actual.enlace.dato.equals(entrada)) {
                actual = actual.enlace;
            }
        }
// Enlace de nodo anterior con el siguiente
// si se ha encontrado el nodo.
        if (actual.enlace.dato.equals(entrada)) {
            NodoCircular p;
            contador --;
            p = actual.enlace; // Nodo a eliminar
            if (lc == lc.enlace) // Lista con un solo nodo
            {
                lc = null;
            } else {
                if (p == lc) {
                    lc = actual; // Se borra el elemento referenciado por lc,
// el nuevo acceso a la lista es el anterior
                }
                actual.enlace = p.enlace;
            }
            p = null;
        }
    }

    public boolean buscar(Object entrada){
        NodoCircular actual;
        int cont = 0;
        actual = lc;
        do {
            
            if (actual.enlace.dato.equals(entrada)) {
                return true;
            }
            actual = actual.enlace;
            cont ++;
        }while ((actual != lc) && contador > cont );
        return false;
    }
    
    public void borrarLista() {
        NodoCircular p;
        if (lc != null) {
            p = lc;
            do {
                NodoCircular t;
                t = p;
                p = p.enlace;
                t = null; // no es estrictamente necesario
            } while (p != lc);
        } else {
            System.out.println("\n\t Lista vacía.");
        }
        lc = null;
    }

    public void recorrer() {
        NodoCircular p;
        if (lc != null) {
            p = lc.enlace; // siguiente nodo al de acceso
            do {
                System.out.println("\t" + p.dato);
                p = p.enlace;
            } while (p != lc.enlace);
        } else {
            System.out.println("\t Lista Circular vacía.");
        }
    }
}
