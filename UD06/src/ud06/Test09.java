package ud06;

import java.util.Scanner;

// Crea un array de numeros introducido por teclado
// Rellenamos el array con numeros aleatorio '1 al 9'
// Muestra por pantalla el valor de cada posicion y la suma de todos los valores
//Haz un metodo para rellenar el array (con los numeros a generar) y otro para mostrar el contenido y la suma

public class Test09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce la longitud del array : ");
		int num = sc.nextInt();

		int lista2[] = new int[num];
		lista2 = rellenar(lista2);
		mostrar(lista2);
		
		sc.close();

	}
	// Creamos un numero aleatorio, pasandole por el constructor un minimo y un maximo
	public static int crearAleatorio(int minimo, int maximo) {
		int aleatorio = (int) (Math.random() * (minimo - maximo + 1) + maximo);
		return aleatorio;

	}
	// Rellenamos la lista con el numero aleatorio creada en la funcion 'crear aleatorio'
	public static int[] rellenar(int lista[]) {
		for (int i = 0; i < lista.length; i++) {
			lista[i] = crearAleatorio(0, 9);
		}

		return lista;

	}
	//Mostramos la suma total de la lista
	public static void mostrar(int lista[]) {
		int suma = 0;
		for (int i = 0; i < lista.length; i++) {
			System.out.println("Posicion: " + (i+1) + " con valor aleatorio es " + lista[i]);
			suma += lista[i];
		}
		System.out.println("El total es: " + suma);
	}
	
	
}
