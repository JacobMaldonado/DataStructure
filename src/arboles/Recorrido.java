package arboles;

public class Recorrido {

    public static void preorden(Nodo r) {
        if (r != null) {
            r.visitar();
            preorden(r.subarbolIzdo());
            preorden(r.subarbolDcho());
        }
    } // Recorrido de un árbol binario en inorden

    public static void inorden(Nodo r) {
        if (r != null) {
            inorden(r.subarbolIzdo());
            r.visitar();
            inorden(r.subarbolDcho());
        }
    } // Recorrido de un árbol binario en postorden

    public static void postorden(Nodo r) {
        if (r != null) {
            postorden(r.subarbolIzdo());
            postorden(r.subarbolDcho());
            r.visitar();
        }
    }

    public static int numNodos(Nodo raiz) {
        if (raiz == null) {
            return 0;
        } else {
            return 1 + numNodos(raiz.subarbolIzdo())
                    + numNodos(raiz.subarbolDcho());
        }
    }

}
