package arboles;
import java.util.*;
import estructura.de.datos.PilaLineal;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Expresiones {
    PilaLineal pOperandos;               // Pila de operandos
    PilaLineal pOperadores;              // Pila de operadores
    final String blanco;           // Cadena de espacios en blanco
    final String operadores;       // Cadena con operadores para expresiones

  /**
   * Constructor por omision
   */
    public Expresiones() {
	pOperandos = new PilaLineal();
	pOperadores = new PilaLineal();
	blanco = " \t";
	operadores = ")+-*/%^(";  //acomodados por precedencia;
    }

  /**
   * Metodo para construir un arbol para una expresion aritmetica dada.
   * @param expresion -- Cadena con la expresion aritmetica
   * @return NodoArbol -- nodo raiz del arbol creado
   */
    public Nodo construirArbol(String expresion) {
       	StringTokenizer tokenizer;
	String token;
	Nodo raiz = null;

	tokenizer = new StringTokenizer(expresion, blanco+operadores, true);
	try{
        while (tokenizer.hasMoreTokens()) {
	    token = tokenizer.nextToken();
	    if (blanco.indexOf(token) >= 0) 
		;               // Es un espacio en blanco, se ignora
	    else if (operadores.indexOf(token) < 0) {
               
                    // Es operando y lo guarda como nodo del arbol
                    pOperandos.insertar(new Nodo(token));
                
	    } else if(token.equals(")")) { // Saca elementos hasta encontrar (
		while (!pOperadores.pilaVacia() && !pOperadores.cimaPila().equals("(")) {
		    guardarSubArbol();
		}
		pOperadores.quitar();  // Saca el parentesis izquierdo
	    } else {
		if (!token.equals("(") && !pOperadores.pilaVacia()) {
		           //operador diferente de cualquier parentesis
		    String op = (String) pOperadores.cimaPila();
		    while (!op.equals("(") && !pOperadores.pilaVacia() 
			   && operadores.indexOf(op) >= operadores.indexOf(token)) {
			guardarSubArbol();
			if (!pOperadores.pilaVacia()) 
			    op = (String)pOperadores.cimaPila();
		    }
		}
		pOperadores.insertar(token);  //Guarda el operador
	    }
	}
	//Sacar todo lo que queda
	raiz = (Nodo)pOperandos.cimaPila();
	while (!pOperadores.pilaVacia()) {
	    if (pOperadores.cimaPila().equals("(")) {
		pOperadores.quitar();
	    } else {
	    guardarSubArbol();
	    raiz = (Nodo) pOperandos.cimaPila();
	    }
	}
        } catch (Exception ex) {
            Logger.getLogger(Expresiones.class.getName()).log(Level.SEVERE, null, ex);
        }
	return raiz;
    }

  /*
   * Metodo privado para almacenar en la pila un subarbol
   */
    private void guardarSubArbol() {
        try{
	Nodo op2 = (Nodo)pOperandos.quitar();
	Nodo op1 = (Nodo)pOperandos.quitar();
	pOperandos.insertar(new Nodo(op1, pOperadores.quitar(), op2));
        } catch (Exception ex) {
            Logger.getLogger(Expresiones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Metodo para imprimir un arbol en inorden
     * @param n -- nodo raiz
     */
    public void imprime(Nodo n) {
	if (n != null) {
	    imprime(n.izdo);
	    System.out.print(n.dato + " ");
	    imprime(n.dcho);
	}
    }

    /**
     * Metodo para imprimir un arbol en postorden
     * @param n -- nodo raiz
     */
    public void imprimePos(Nodo n) {
	if (n != null) {
	    imprimePos(n.izdo);
	    imprimePos(n.dcho);
	    System.out.print(n.dato+" ");
	}
    }

    /**
     * Metodo para imprimir un arbol en preorden
     * @param n -- nodo raiz
     */
    public void imprimePre(Nodo n) {
	if (n != null) {
	    System.out.print(n.dato+" ");
	    imprimePre(n.izdo);
	    imprimePre(n.dcho);
	}
    }

    public static void main (String[] pps) {
	Expresiones expr = new Expresiones();
       	
	String expresion = JOptionPane.showInputDialog("ingrese la expresion");
		Nodo raiz = expr.construirArbol(expresion);
		System.out.print("El arbol es ");
		expr.imprime(raiz);
		System.out.print("\nEl arbol en postfija es ");
		expr.imprimePos(raiz);
		//		System.out.println("\n");
		System.out.print("\nEl arbol en prefija es ");
		expr.imprimePre(raiz);
		System.out.println("\n\n");
	
    }
}