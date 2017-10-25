/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

import colas.*;
import javax.swing.JOptionPane;

/**
 *
 * @author jacob
 */
public class MenuListasEnlazadas {
    private static int contador =0;

    public static void main(String[] args) {
        Lista lista = new Lista();
        
        int opciones;
        
        do{
            opciones = Integer.parseInt(JOptionPane.showInputDialog(""
                    + "      MENU     \n "
                    + "1- Insertar al principio.\n"
                    + "2- Insertar al final.\n"
                    + "3- Insertar en una posición especifica.\n"
                    + "4.- Eliminar.\n "
                    + "5.- Desplegar\n"
                    + "6- Salir\n"));
            try{
            options(opciones,lista);
            }catch(Exception e){
                System.out.println("Error");
            }
        }while(opciones !=6 && opciones>=1 && opciones <=6);
        
    }
    
    public static void options(int n, Lista lista) throws Exception{
        switch(n){
            case 1:
                String palabra;
                palabra = JOptionPane.showInputDialog("Inserta el valor: ");
                JOptionPane.showMessageDialog(null, "Has ingresado el valor: " + palabra);
                lista.insertarCabezaLista(palabra);
                contador ++;
                break;
            case 2:
                palabra = JOptionPane.showInputDialog("Inserta el valor: ");
                
                JOptionPane.showMessageDialog(null, "Has ingresado el valor: " + palabra);
                lista.insertarUltimo(palabra);
               
                contador --;
                break;
            case 3:
                String antiguo;
                antiguo = JOptionPane.showInputDialog("Inserta el valor: ");
                
                palabra = JOptionPane.showInputDialog("Inserta el valor: ");
                
                JOptionPane.showMessageDialog(null, "Has ingresado el valor: " + palabra);
                lista.insertarLista(antiguo, palabra);
               
                
                break;
            case 4:
                palabra = JOptionPane.showInputDialog("Inserta el valor a eliminar: ");
                
                JOptionPane.showMessageDialog(null, "Has eliminado el valor: " + palabra);
                lista.eliminar(palabra);
                break;
                
            case 5:
                lista.desplegar();
                
            default:
        }
    }
}
