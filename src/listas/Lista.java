package listas;

import colas.*;

public class Lista {

    private int contador;
    protected Nodo primero;
    protected Nodo ultimo;

    public Lista() {
        contador = 0;
        primero = null;
        ultimo = null;
    }

    public Lista insertarCabezaLista(String entrada) {
        Nodo nuevo = new Nodo(entrada);   
        
        nuevo.enlace = primero;
        primero = nuevo;
        if(ultimo == null)
            ultimo = primero;
        contador++;
        return this;
    }

    public int cantidad() {
        return contador;
    }

    public void visualizar() {
        Nodo n;
        n = primero;
        while (n != null) {
            System.out.print(n.dato + "\n");
            n = n.enlace;
        }
    }

    public Lista insertarUltimo( String entrada) {
        
        ultimo.enlace = new Nodo(entrada);
        ultimo = ultimo.enlace;
        return this;
    }

    public Lista insertarLista(String antiguo, String entrada) {
        Nodo anterior;
        anterior = buscarLista(antiguo);
        Nodo nuevo;
        nuevo = new Nodo(entrada);
        nuevo.enlace = anterior.enlace;
        anterior.enlace = nuevo;
        return this;
    }
    

    public Nodo buscarLista(String destino) {
        Nodo indice;
        for (indice = primero; indice != null; indice = indice.enlace) {
            if (destino.equals(indice.dato))
            {
                return indice;
            }
        }
        return null;
    }
    
    public void desplegar(){
        Nodo indice;
        for (indice = primero; indice != null; indice = indice.enlace) {
            System.out.println(indice.dato);
        }
    }

    public void eliminar(String entrada) {
        Nodo actual, anterior;
        boolean encontrado;
//inicializa los apuntadores
        actual = primero;
        anterior = null;
        encontrado = false;
// búsqueda del nodo y del anterior
        while ((actual != null) && (!encontrado)) {
            encontrado = (actual.dato.equals(entrada));
//con objetos: actual.dato.equals(entrada)
            if (!encontrado) {
                anterior = actual;
                actual = actual.enlace;
            }
        }
// Enlace del nodo anterior con el siguiente
        if (actual != null) {
// Distingue entre que el nodo sea el cabecera,
// o del resto de la lista
            if (actual == primero) {
                primero = actual.enlace;
            } else {
                anterior.enlace = actual.enlace;
            }
            actual = null; // no es necesario al ser una variable local
        }
    }
}
