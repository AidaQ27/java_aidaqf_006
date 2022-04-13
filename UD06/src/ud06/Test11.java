package ud06;

import java.util.Scanner;

public class Test11 {
// Crea dos arrays de numeros con la dimension pasado por teclado
// uno de ellos con numeros aleatorios y el otro apuntara al array anterior
//reasigna los valores del segundo array con valores aleatorios
// crea un metodo que tenga como parametros, los dos arrays y devuelva uno nuevo con la multiplicacion
// por ultimo muestra el contenido del array

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce la dimension del array : ");
		int num = sc.nextInt();

		int lista1[] = new int[num];
		lista1 = rellenar(lista1);
		
		int lista2[] = new int[num];
		lista2 = lista1;
		lista2 = rellenar(lista2);
		
		int lista3[] = multiplicacion(lista1, lista2);
		
		System.out.println("----- Lista 1 ------");
		mostrar(lista1);
		System.out.println("----- Lista 2 ------");
		mostrar(lista2);
		System.out.println("----- Lista 3 ------");
		mostrar(lista3);
		
		sc.close();
		

	}
	// Creamos un numero aleatorio
	public static int crearAleatorio(int minimo, int maximo) {
		int aleatorio = 0;
		
		aleatorio = (int) (Math.random() * (minimo - maximo + 1) + maximo);
		
		return aleatorio;

	}
	// rellenamos la lista con el numero aleatorio
	public static int[] rellenar(int lista[]) {
		for (int i = 0; i < lista.length; i++) {
			
			lista[i] = crearAleatorio(0, 100);
		}

		return lista;
	}
	
	// multiplicamos comparando los valores dde las dos listas
	public static int[] multiplicacion(int lista1[], int lista2[]) {
		int lista3[] = new int [lista1.length];
		for (int i = 0; i < lista3.length; i++) {
			lista3[i] = lista1[i] * lista2[i];
		}
		
		return lista3;
	
	}
	// y las mostramos en pantalla
	public static void mostrar(int lista[]) {
		for (int i = 0; i < lista.length; i++) {
			System.out.println("Posicion: " + (i+1) + " con valor aleatorio es " + lista[i]);

		}
	}
	
	
}
	
	
	
