package colas;

import java.util.Vector;

public class Bicola extends Vector<Object> {
    private static int elementos;
    
    // inicializa frente y fin a null

    public Bicola() {
        super();
    }
// inserta por el final de la Bicola

    public void ponerFinal(Object elemento) {
        add(elemento); // método heredado de ColaLista
        elementos++;
    }
// inserta por el frente; método propio de Bicola

    public void ponerFrente(Object elemento) {
        add(0,elemento);
        elementos++;
    }
// retira elemento frente de la Bicola

    public Object quitarFrente() throws Exception {
        elementos--;
        return remove(0); // método heredado de ColaLista
    }
// retira elemento final; método propio de Bicola.

// Es necesario recorrer la bicola para situarse en
// el nodo anterior al final, para después enlazar.
    public Object quitarFinal() throws Exception {
        elementos--;
        return remove(elementos);
    }

    public Object frenteBicola() throws Exception {
        return elementAt(0); // método heredado de ColaLista
    }
// devuelve el elemento final

    public Object finalBicola() throws Exception {
        return elementAt(elementos-1);
    }
// comprueba el estado de la bicola

    public boolean bicolaVacia() {
        return isEmpty(); // método heredado de ColaLista
    }
//elimina la bicola

    public void borrarBicola() {
        clear(); // método heredado de ColaLista
    }

    public int numElemsBicola() // cuenta los elementos de la bicola
    {
        return elementos;
    }
}
