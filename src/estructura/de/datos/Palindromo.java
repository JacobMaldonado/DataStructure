/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructura.de.datos;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Palindromo {

    public static void main(String[] args) {
        PilaLineal pilaChar;
        //char ch;
        boolean esPal;
        String pal,pal2="";
        BufferedReader entrada = new BufferedReader(
                new InputStreamReader(System.in));
        try {
            pilaChar = new PilaLineal(); // crea pila vacía
            System.out.print("Teclea la palabra"
                    + " a verificar si es palíndromo: ");
            pal = entrada.readLine();
            for(int i = 0;i<pal.length();i++){
                if(pal.charAt(i) != ' ')
                    pal2 += String.valueOf(pal.charAt(i));
                
                
            }
            
            // se crea la pila con los caracteres de la palabra
            for (int i = 0; i < pal2.length();) {
                Character c;
                c = new Character(pal2.charAt(i++));
                pilaChar.insertar(c);
            }
            // se comprueba si es palíndromo
            esPal = true;
            for (int j = 0; esPal && !pilaChar.pilaVacia();) {
                Character c;
                c = (Character) pilaChar.quitar();
                esPal = pal2.charAt(j++) == c.charValue();
            }
            pilaChar.limpiarPila();
            if (esPal) {
                System.out.println("La palabra " + pal
                        + " es un palíndromo \n");
            } else {
                System.out.println("La palabra " + pal
                        + " no es un palíndromo \n");
            }
        } catch (Exception er) {
            System.err.println("Excepcion: " + er);
        }
    }

   
}
