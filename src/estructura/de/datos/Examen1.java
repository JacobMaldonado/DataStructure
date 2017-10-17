/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructura.de.datos;

import javax.swing.JOptionPane;

public class Examen1 {
    public static void main(String[] args) {
        int numero,suma;
        String resultado;
        String insIngreso = "Ingrese un numero par mayor a 2";
        
        numero = Integer.parseInt(JOptionPane.showInputDialog(insIngreso));
        suma = sumaPar(numero);
        
        if(suma == 0)
            JOptionPane.showMessageDialog(null,
                    "El numero no es par o es menor a 2");
        else 
            JOptionPane.showMessageDialog(null,"El resultado es: " + suma);
        
    }
    
    public static int sumaPar(int n){
        if(n%2 == 0 && n >= 2)
            return n+sumaPar(n-2);
        else
            return 0;
    }
    
}
