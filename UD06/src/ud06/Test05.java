package ud06;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		System.out.print("Dime un número : ");
		int num = sc.nextInt();
		
		sc.close();
		
		// invocamos el método
		calculaBinario(num);
		
		
	}
	
	
	//110010 binary = 50 decimal
	// 50 % 2 = 0
	// 25 % 2 = 1
	// 12 % 2 = 0
	// 6 % 2 = 0
	// 3 % 2 = 1
	// 1 % 2 = 1
	
	
	public static String calculaBinario(int num) {
		String binario = "";
		//Mietras el numero introducido es mayor que cero, entra en el while.
		while (num > 0) {
				// si el resto del numero es 0 se escribe '0'
			
			if (num % 2 == 0) {
					binario = "0" + binario;
				// si no se escribe el '1'
				} else {
					binario = "1" + binario;
				}// si no se divide entre '2'
				num = num / 2;
			}
		// si el numero es igual a '0'
		if (num < 0) {
			 System.out.println("Tienes que introducir un numero positivo");
			
		}
		
		return binario;
	}

// No es parte del ejercicio, es para practicar el reverse
/* 
	public static String girarCadena (String cadena) {//for(inici; final; increment // 100 ; 0 ; +1 // abcdefgh.legnth = 8  7
		String girarCadena = "";
		for (int x = cadena.length() - 1; x >= 0; x--)
			girarCadena += cadena.charAt(x);
		System.out.println(girarCadena);
		
		return girarCadena;
		
	}
*/
}

	

