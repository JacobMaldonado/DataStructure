/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arboles;

public class ArbolBinario {

    protected Nodo raiz;

    public ArbolBinario() {
        raiz = null;
    }

    public ArbolBinario(Nodo raiz) {
        this.raiz = raiz;
    }

    public Nodo raizArbol() {
        return raiz;
    }
// Comprueba el estatus del árbol

    boolean esVacio() {
        return raiz == null;

    }
    public void insertar (Object info)
      {
          Nodo nuevo;
          nuevo = new Nodo(info);
          nuevo.izdo = null;
          nuevo.dcho = null;
          if (raiz == null)
              raiz = nuevo;
          else
          {
              Nodo anterior = null, reco;
              reco = raiz;
              while (reco != null)
              {
                  anterior = reco;
                  if ((int)info < (int)reco.dato)
                      reco = reco.izdo;
                  else
                      reco = reco.dcho;
              }
              if ((int)info < (int)anterior.dato)
                  anterior.izdo = nuevo;
              else
                  anterior.dcho = nuevo;
          }
      }
    
    

    public static Nodo nuevoArbol(
            Nodo ramaIzqda, Object dato, Nodo ramaDrcha) {
        return new Nodo(ramaIzqda, dato, ramaDrcha);
    }
}
