/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructura.de.datos;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class EjercicioArreglo {

    public static void main(String[] args) {
        int[] array = new int[10];
        Scanner s = new Scanner(System.in);
        PilaVector<Integer> pila = new PilaVector<Integer>();
        BufferedReader reader;
        reader = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            for (int i = 0; i < 10; i++) {
                System.out.print("Ingrese el valor " + (i + 1) + " : ");
                array[i] = s.nextInt();
                pila.insertar(new Integer(array[i]));
            }

            for (int i = 0; i < 10; i++) {
                System.out.print("\nEl elemento " + (i + 1) + " es: " 
                        + array[i]);
                System.out.print("\nEl siguiente elemento en la pila es: " 
                        + pila.quitar().toString());
            }
        } catch (Exception e) {
            System.out.println("Sucedio algun error :3\n");
        }
    }
}
