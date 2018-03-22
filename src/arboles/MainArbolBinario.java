
package arboles;

import javax.swing.JOptionPane;

public class MainArbolBinario {
    
    private ArbolBinario arbol;
    
    public MainArbolBinario(){
        arbol = new ArbolBinario();
    }
    
    public static void main(String[] args) {
        MainArbolBinario op = new MainArbolBinario();
        
        int opcion;
        do{
            opcion = Integer.parseInt(JOptionPane.showInputDialog("seleccione\n"
                    + "1-insertar\n"
                    + "2-recorrer preorden\n"
                    + "3-recorrer postorden\n"
                    + "4-recorrer orden\n"
                    + "5-salir"));
            op.opciones(opcion);
        }while(opcion != 5);
        
        
    }
    
    public void opciones(int o){
        switch(o){
            case 1: //agregar dato 
                 arbol.insertar(Integer.parseInt(JOptionPane.showInputDialog("ponga algo")));
                break;
            case 2: //recorrer preorden
                Recorrido.preorden(arbol.raiz);
                System.out.println("");
                break;
            case 3: //recorrer posorden
                Recorrido.postorden(arbol.raiz);
                System.out.println("");
                break;
            case 4: //recorrer orden
                Recorrido.inorden(arbol.raiz);
                System.out.println("");
                break;
        
        }
    }
}
