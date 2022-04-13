package ud06;
// Crea un array de numeros pasado por teclado
// el array contendrá numeros aleatorios primos, entre los numeros desesados
// y indicar cual es el mayor de todos
// Haz un metodo para comprobar que el numero aleatorio es primo

import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce la longitud del array : ");
		int num = sc.nextInt();

		int lista2[] = new int[num];
		lista2 = rellenar(lista2);
		
		mostrar(lista2);
		mayor(lista2);
		
		sc.close();

	}
	// Creamos un numero aleatorio
	public static int crearAleatorio(int minimo, int maximo) {
		int aleatorio = 0;
		do {
			aleatorio = (int) (Math.random() * (minimo - maximo + 1) + maximo);
		}
		while (esPrimo(aleatorio));
		return aleatorio;

	}
	
	// Comprobamos si es numero primo o no
	public static boolean esPrimo(int num) {
		boolean condicio = false;
		if (num==1) { 
			condicio = true;
			}
		for (int i = 2; i < num-1; i++) {
			if (num%i == 0) {
			condicio = true;
			}
		}
		return condicio;
	}
	
	// rellenamos la lista con los numeros aleatorios
	public static int[] rellenar(int lista[]) {
		for (int i = 0; i < lista.length; i++) {
			
			lista[i] = crearAleatorio(0, 100);
		}

		return lista;

	}
	// lo mostramos recorriendo la lista
	public static void mostrar(int lista[]) {
		for (int i = 0; i < lista.length; i++) {
			System.out.println("Posicion: " + (i+1) + " con valor aleatorio es " + lista[i]);

		}
	}
	
	//  void
	//  int/string/float/boolean
	// mostramos el mayor de los numeros
	public static void mayor (int lista[]) {
		int mayor = 0;
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] > mayor) {
				mayor = lista[i];
			}	
		}
		System.out.println("El mayor de los numeros es : " + mayor);
		
	}
}


