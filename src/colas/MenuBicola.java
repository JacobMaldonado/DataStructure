package colas;

import javax.swing.JOptionPane;

public class MenuBicola {
    
    public static void main(String[] args) throws Exception{
        int opcion;
        Bicola bicola = null;
        do{
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Escoja una opcion\n"
                    + "1-Crear Bicola\n"
                    + "2-¿Esta vacia?\n"
                    + "3-¿Insertar por la izquierda ?\n"
                    + "4-¿Insertar por la Derecha ?\n "
                    + "5-¿Desea Quita por la Izquierda? \n"
                    + "6-¿Desea Quitar Por la Derecha?\n"
                    + "7 Salir........ :v "));
            
            switch(opcion){
                case 1:
                       bicola = new Bicola();
                       System.out.println(" se acaba de crear la cola......");
                    break;
                case 2:
                    if(bicola!= null){
                           System.out.println(bicola.bicolaVacia());
                    }
                    else
                        System.out.println("No tienes cola as gym");
                break;
                case 3:
                    if(bicola!= null){
                           bicola.ponerFrente(
                                   JOptionPane.showInputDialog("ingrese algo:"));
                    }
                    else
                        System.out.println("ERROR");
                    break;
                case 4:
                    if(bicola!= null){
                           bicola.ponerFinal(
                                   JOptionPane.showInputDialog("ingrese algo:"));
                    }
                    else
                        System.out.println("ERROR");
                    break;
            case 5:
                if(bicola!= null){
                           System.out.println((String)bicola.quitarFrente());
                    }
                    else
                        System.out.println("ERROR");
                
                    break;
                case 6:
                    if(bicola!= null){
                           System.out.println((String)bicola.quitarFinal());
                    }
                    else
                        System.out.println("ERROR");
                    break;
                default:
                    
            }
        }while(opcion!=7 && opcion >= 1 && opcion <= 7);
        
    }
    
}
