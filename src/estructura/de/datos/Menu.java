/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructura.de.datos;

import javax.swing.JOptionPane;
/**
 *
 * @author jacob
 */
public class Menu {

    public static void main(String[] args) {
        PilaLineal pila = new PilaLineal();
        
        int opciones;
        
        do{
            opciones = Integer.parseInt(JOptionPane.showInputDialog(""
                    + "      MENU     \n "
                    + "1-¿pila esta vacia?\n"
                    + "2-¿pila esta llena?\n"
                    + "3-Agregar elemento\n"
                    + "4-Quitar elemento \n"
                    + "5-Elemento en cima\n"
                    + "6-Ver numero de elementos\n"
                    + "7-salir\n"));
            try{
            options(opciones,pila);
            }catch(Exception e){
                System.out.println("Error");
            }
        }while(opciones !=7 && opciones>=1 && opciones <=7);
        
    }
    
    public static void options(int n, PilaLineal pila) throws Exception{
        switch(n){
            case 1:
                JOptionPane.showMessageDialog(null, "¿pila vacia?: "
                        +String.valueOf(pila.pilaVacia()));
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "¿pila llena?: "
                        +String.valueOf(pila.pilaLlena()));
                break;
            case 3:
                pila.insertar(new Integer(pila.numeroElementosPila()));
                JOptionPane.showMessageDialog(null, "se inserto un elemento");
                break;
            case 4:
                pila.quitar();
                JOptionPane.showMessageDialog(null, "se elimino un elemento");
                break;
            case 5:
                JOptionPane.showMessageDialog(null,"El numero a la cima es: "
                        +pila.cimaPila());
                break;
            case 6:
                JOptionPane.showMessageDialog(null,"Numero de elementos: "
                        +pila.numeroElementosPila());
                break;
            default:
        }
    }
}
