package toString;

import java.util.ArrayList;

public class toStringMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("PARTE 1 Objeto Unico");
		
		toString p1 = new toString ("Mouse", 150.00);
		System.out.println(p1);
		
		System.out.println("PARTE 2 ArrayList");
		ArrayList<toString> lista = new ArrayList<>();
		lista.add(new toString("Monitor",800.50));
		lista.add(new toString("SSD",80.50));
		lista.add(new toString("CPU",75.00));
		
		System.out.println("Lista Criada: ");
		System.out.println(lista);
		
		}

	}


