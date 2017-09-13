
package estructura.de.datos;
import javax.swing.JOptionPane;


public class factorial {


    public static void main(String[] args) {
        int n;
        
        long resultado,tiempoInicio,tiempoFinal;
        factorial f = new factorial();
        n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero entero positivo"));
        tiempoInicio=System.currentTimeMillis();
        resultado = f.factorialMetodo(n);
        tiempoFinal = System.currentTimeMillis();
        System.out.println ("tiempo recursivo: "+(tiempoFinal-tiempoInicio));
        System.out.println( resultado);
        tiempoInicio = System.currentTimeMillis();
        resultado = f.factorialIterativo(n);
        tiempoFinal = System.currentTimeMillis();
        System.out.println ("tiempo Iterativo: "+(tiempoFinal-tiempoInicio));
        System.out.println( resultado);
        
        
    }
    
    public long factorialMetodo(int n){
        if(n==0)
            return 1;
        else
            return n*factorialMetodo(n-1);
    }
    
    public long factorialIterativo(int n){
        long res=1;
        if(n==0)
            return 1;
        else
            for(int i=1;i<=n;i++)
                res*=i;
        return res;
    }
}
