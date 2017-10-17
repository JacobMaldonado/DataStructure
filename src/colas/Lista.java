package colas;

public class Lista {
    private int contador;
    protected Nodo primero;

    public Lista() {
        contador = 0;
        primero = null;
    }

    public Lista insertarCabezaLista(String entrada) {
        Nodo nuevo;
        nuevo = new Nodo(entrada);
        nuevo.enlace = primero;
        primero = nuevo;
        contador++;
        return this;
    }
    
    public int cantidad(){
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
}
