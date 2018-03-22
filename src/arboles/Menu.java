/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arboles;

import javax.swing.JOptionPane;


public class Menu {
    
     private static ArbolBinarioBusqueda a = new ArbolBinarioBusqueda();
     
     public static void main(String[] args) throws Exception {
    
     int opciones;
        
        do{
            opciones = Integer.parseInt(JOptionPane.showInputDialog(""
                    + "      MENU     \n "
                    + "1- Busqueda\n"
                    + "2- Insercion\n"
                    + "3- Borrar\n"
                    + "4- Rescorrido en orden\n"
                    + "5- Recorrido en PostOrder\n"
                    + "6- Recorrido inorden\n"
                    + "7- Salir"));
            options(opciones);
        }while(opciones !=7 && opciones>=1 && opciones <=7);
    
    }
       public static void options(int n) throws Exception{
        switch(n){
            case 1:
                String algo = JOptionPane.showInputDialog("Ingrese lo que quiera buscar");
                a.buscar(algo).visitar();
                break;
            case 2:
                a.insertar(Integer.parseInt(JOptionPane.showInputDialog("inserte algo")));
                break;
            case 3:
                a.eliminar(JOptionPane.showInputDialog("elimine algo"));
                break;
            case 4:
                Recorrido.preorden(a.raiz);
                
                break;
            case 5:
                Recorrido.postorden(a.raiz);
                break;
            case 6:
                Recorrido.inorden(a.raiz);
                break;
            case 7:
                break;
               
                
            default:
        }

    }
}