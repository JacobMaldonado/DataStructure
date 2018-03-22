package estructura.de.datos;

import javax.swing.JOptionPane;
import java.util.Date;
import java.util.Vector;

public class Examen2 {

    public static void main(String[] args) {
        PilaVector<Desastre> pila = new PilaVector<Desastre>();
        JOptionPane J = new JOptionPane();
        Vector<Desastre> v = new Vector<Desastre>();

        String fecha;
        String algo[];
        int victimas;
        Date f = new Date();

        for (int i = 0; i < 10; i++) {
            fecha = J.showInputDialog("inserte la fecha de forma dd/mm/aaaa");
            victimas = Integer.parseInt(
                    J.showInputDialog("inserte las victimas"));

            algo = fecha.split("/");
            f.setDate(Integer.parseInt(algo[0]));
            f.setMonth(Integer.parseInt(algo[1]) - 1);
            f.setYear(Integer.parseInt(algo[2]) - 1900);
            v.add(new Desastre(f, victimas));

        }

        Vector<Desastre> aux = (Vector<Desastre>) v.clone();
        Date anterior = null;
        try {
            for (int c = 0; c < 10; c++) {
                int mayor = 0, indice = 0;
                

                for (int i = 0; i < aux.size(); i++) {
                    if (aux.elementAt(i).getVictimas() > mayor) {
                        mayor = aux.elementAt(i).getVictimas();
                        indice = i;
                    }
                }
                
                for (int i = 0; i < 10; i++) {
                    if (v.elementAt(indice).getVictimas() == mayor && anterior !=null) {
                        v.elementAt(indice).setUltimoDesastre(anterior);
                    }
                }
                pila.insertar(aux.remove(indice));
                anterior = ((Desastre) pila.cimaPila()).getFecha();
            }
        } catch (Exception e) {
            System.out.println("no se pudo insertar, vuelva a llamar mas tarde");
        }
        
        for(int i = 0; i<10;i++){
            System.out.println(v.elementAt(i).getFecha().toString());
            System.out.println(v.elementAt(i).getVictimas());
            System.out.println(v.elementAt(i).getUltimoDesastre());
        }

    }
}
