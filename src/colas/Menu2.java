/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colas;

import colas.ColaCircular;
import javax.swing.JOptionPane;

/**
 *
 * @author jacob
 */
public class Menu2 {
    private static int contador =0;

    public static void main(String[] args) {
        ColaCircular colacircular = new ColaCircular();
        
        int opciones;
        
        do{
            opciones = Integer.parseInt(JOptionPane.showInputDialog(""
                    + "      MENU     \n "
                    + "1- Insertar\n"
                    + "2- Eliminar\n"
                    + "3- Desplegar elementos\n"
                    + "4- Salir\n"));
            try{
            options(opciones,colacircular);
            }catch(Exception e){
                System.out.println("Error");
            }
        }while(opciones !=4 && opciones>=1 && opciones <=4);
        
    }
    
    public static void options(int n, ColaCircular colacircular) throws Exception{
        switch(n){
            case 1:
                String palabra;
                palabra = JOptionPane.showInputDialog("Inserta el valor: ");
                JOptionPane.showMessageDialog(null, "Has ingresado el valor: " + palabra);
                colacircular.insertar((Object)palabra);
                contador ++;
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "se quito el elemento: "
                        + (String) colacircular.quitar());
                contador --;
                break;
            case 3:
                System.out.println("Elementos");
                for(int i = 0; i < contador;i++){
                    System.out.println(colacircular.elementoIndice(i));
                }
                
            default:
        }
    }
}

    

