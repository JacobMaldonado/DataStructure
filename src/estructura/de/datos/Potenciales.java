
package estructura.de.datos;
import javax.swing.JOptionPane;

public class Potenciales {
    static int i= 1;
    
    public static void main(String[] args) {
        int numero,exponente;
        long inicio,fin;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero a elevar"));
        exponente = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el exponente"));
        
        inicio = System.currentTimeMillis();
        System.out.println(potenciaRecursiva(numero,exponente));
        fin = System.currentTimeMillis();
        
        inicio = System.currentTimeMillis();
        System.out.println(potencialIterativo(numero, exponente));
        fin = System.currentTimeMillis();
        
        inicio = System.currentTimeMillis();
        System.out.println(potenciaRecursivaMejorada(numero, exponente));
        fin = System.currentTimeMillis();
        
    }
    
    static  int potenciaRecursiva(int x, int n){
        if(n==0)
            return 1;
        else
            return x *potenciaRecursiva(x,n-1);
    }
    
    static int potenciaRecursivaMejorada(int x,int n){
        int aux;
        if(n==0)
            return 1;
        else{
            aux = x*potenciaRecursivaMejorada(x, n/2);
            if(n%2 ==0)
                return aux*aux;
            else
                return x*aux*aux;
        }
    }
    
    static int potencialIterativo(int x,int n){
        int aux = 1;
        if(n==0){
            return 1;
        }
        for(int i=1;i<=n;i++){
                aux*=x;
        }
        
        return aux;
    }
    
}
