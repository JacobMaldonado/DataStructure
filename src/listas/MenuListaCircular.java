/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

import javax.swing.JOptionPane;

public class MenuListaCircular {
    ListaCircular l;
    
    public static void main(String[] args) {
        MenuListaCircular m= new MenuListaCircular();
        JOptionPane J = null ;
        int opcion;
        
        do{
        opcion = Integer.parseInt(J.showInputDialog("     Opciones     \n"
                + "1-Inicializar\n"
                + "2-Insertar\n"
                + "3-Eliminar\n"
                + "4-Busqueda\n"
                + "5-Recorrido\n"
                + "6- salir"));
        m.opciones(opcion);
        }while(opcion != 6);
    }
    
    public void opciones(int o){
        
        switch(o){
            case 1 :
                l = new ListaCircular();
                System.out.println("Se ha creado la lista");
                break;
            case 2 :
                l.insertar(JOptionPane.showInputDialog("inserte algo"));
                break;
            case 3:
                l.eliminar(JOptionPane.showInputDialog("elimine algo"));
                break;
            case 4:
                System.out.println(l.buscar(
                        JOptionPane.showInputDialog("elimine algo")));
                
                break;
            case 5:
                l.recorrer();
                break;
            default:
        }
    }
}
