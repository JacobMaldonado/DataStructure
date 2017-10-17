package colas;

import java.util.*;
import javax.swing.JOptionPane;

public class ListaAleatoria {

    public static void main(String[] a) {
        Random r;
        String d  = "";
        Lista lista;
        int k;
      
        lista = new Lista(); // crea lista vacía
       // se insertan elementos en la lista
       do{
           d = JOptionPane.showInputDialog("Ingreza un titulo o salir ");
           if(!d.toLowerCase().equals("salir"))
               lista.insertarCabezaLista(d);
        }while(!d.toLowerCase().equals("salir"));
       
        System.out.println("El numero de libros es: " + lista.cantidad());
// recorre la lista para escribir sus elementos
        System.out.println("Titulos de libros leidos");
        lista.visualizar();
    }
}
