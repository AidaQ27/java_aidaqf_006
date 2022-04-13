package ud06;
// Crea un array de numeros de un tamaño pasado por teclado
// el array contendrá numeros aleatorios del 1 a 300
//mostrara aquellos que acaben en un digito que nosotros indiquemos
// estos deben guardarse en un nuevo array

/* Crear array lista1
 * Definir tamaño de la lista1
 * Introducir tamaño por teclado
 * Crear numeros aleatorios
 * Añadir a lista1, numeros aleatorios//
 * Introducir numero que queremos que acaben
 * Mostrar solo los numeros que acaben, seleccionados por el terminal
 * crear nuevo array lista2
 */

import java.util.Scanner;

public class Test12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce la dimension del array : ");
		int dimension = sc.nextInt();

		int lista1[] = new int[dimension];

		System.out.println("Introduce el numero que quieres que busque: ");
		int numero = sc.nextInt();
		
		
		lista1 = rellenar(lista1);
		mostrarListaCoincidencia(lista1, numero);

	}
	public static int[] mostrarListaCoincidencia(int lista[], int num) {
		int repertido = 0;
		int incrementador = 0;
		
		for (int i = 0; i < lista.length; i++) { //averiguar cuantas veces coincide el num  con el final de los numeros
			//System.out.println(lista[i]);
			String enteroAcadena = String.valueOf(lista[i]);
			String numAcadena =String.valueOf(num);
			
			if (enteroAcadena.endsWith(numAcadena)) { // pasamos un entero a una cadena
				repertido++;
			}
		}
		int lista2[] = new int[repertido]; //crear lista con tamaño sacado del repetidor anterior
		for (int j = 0; j < lista.length; j++) {
			String enteroAcadena = String.valueOf(lista[j]);
			String numAcadena =String.valueOf(num);
			
			if (enteroAcadena.endsWith(numAcadena)) {
				
				lista2[incrementador] = lista[j];
				incrementador++;
			}
		
		}
		for (int i = 0; i < lista2.length; i++) {
			System.out.println(lista2[i]);
		}
		
		return lista2;
		
		
		
	}

	public static int crearAleatorio(int minimo, int maximo) {
		int aleatorio = 0;

		aleatorio = (int) (Math.random() * (minimo - maximo + 1) + maximo);

		return aleatorio;

	}

	public static int[] rellenar(int lista[]) {
		for (int i = 0; i < lista.length; i++) {

			lista[i] = crearAleatorio(1, 300);
		}

		return lista;
	}

	/*public static int[] selecciona(int lista[], int num) {
		String cadena = "";
		int count = 0;
		for (int i = 0; i < lista.length; i++) {
			String var = String.valueOf(lista[i]);
			String numero = String.valueOf(num);
			if (var.endsWith(numero) ) {
				count ++;
				
			}
			int array[] = new int[count];
			
		}
		
		}
		
		*/
		
	
}
