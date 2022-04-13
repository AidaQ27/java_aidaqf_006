package ud06;
// Crea un array de 10 posiciones con valores pedidos por teclado
//Muestra por consola el indice y el valor al que corresponde.
// Haz dos metodos, uno para rellenar valores y otro para mostrar

import java.util.Scanner;

public class Test08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//Scanner sc = new Scanner (System.in);
		//array 10 posicones
		//llenar array por sc
		//mostrar posicion i valor que contiene
		
		//creamos una lista de 10 posiciones
		int lista[] = new int [10];	
		
		//invocamos el metodo
		lista = rellenar(lista);
		mostrar(lista);
	

		}
		

	//int[] nom;
	//int nom[];
	
	public static int[] rellenar(int lista[]) {
		Scanner sc = new Scanner (System.in);
		
		// recorremos el for inicilizandolo con zero, y finalizando según su longitud
		for(int i=0; i < lista.length; i++) {
			System.out.print("Dime un número : ");
			//lo añadimos a la lista
			lista[i]= sc.nextInt();
		
		}
		sc.close();
		return lista;

	}
	
	public static void mostrar(int lista[]) {
		// recorremos con un la lista con el for y lo printemaos
		for (int i=0; i < lista.length; i++) {
			System.out.println("Posicion: " + i + " con valor " + lista[i]);
			
		}
		
	}
}
	
