package ud06;

import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Inicializo un scanner apra cada tipo de variable
		Scanner scInt = new Scanner(System.in);
		Scanner scString = new Scanner(System.in);
		
		
		System.out.println("Indica la cantidad: ");
		int value = scInt.nextInt(); 
		System.out.println("Escoge la moneda: ");
		String y = scString.nextLine(); 
		
		scInt.close();
		scString.close();
		
		conversor(value, y);
	}

	public static void conversor(int euros, String moneda) {
		// Inicilizo las variables
		double operacion = 0.0;
		String escogida = "";
		// Con el switch instanciamos las diferentes opciones
			switch(moneda) {
				case "libras":
					// Hacemos el calculo
					operacion = euros * 0.86;
					// modificamos la variable
					escogida = "libras";
					break;
				case "dolar":
					operacion = euros * 1.28611;
					escogida = "dolares";
					break;
				case "yenes":
					operacion = euros * 129.852;
					escogida = "yenes";
					break;
			
		}
		System.out.println(euros + " euros equivale a: " + operacion + " " +  escogida);
		
		
	}
}
