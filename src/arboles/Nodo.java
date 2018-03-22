package arboles;

public class Nodo implements Comparador{

    protected Object dato;
    protected Nodo izdo;
    protected Nodo dcho;

    public Nodo(Object valor) {
        dato = valor;
        izdo = dcho = null;
    }
    
    public Nodo(Nodo ramaIzdo, Object valor, Nodo ramaDcho) {
        dato = valor;
        izdo = ramaIzdo;
        dcho = ramaDcho;
    }
// operaciones de acceso

    public Object valorNodo() {
        return dato;
    }

    public Nodo subarbolIzdo() {
        return izdo;
    }

    public Nodo subarbolDcho() {
        return dcho;
    }

    public void nuevoValor(Object d) {
        dato = d;
    }

    public void ramaIzdo(Nodo n) {
        izdo = n;
    }

    public void ramaDcho(Nodo n) {
        dcho = n;
    }
    
    public void visitar() {
        System.out.print(dato + " ");
    }

    @Override
    public boolean igualQue(Object q) {
        return dato.equals(q);
    }

    @Override
    public boolean menorQue(Object q) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean menorIgualQue(Object q) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean mayorQue(Object q) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean mayorIgualQue(Object q) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
