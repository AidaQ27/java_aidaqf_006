package ud06;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Dime un número : ");
		int primerNum = sc.nextInt();
		
		// 
		if (numPrimo(primerNum)) {
			System.out.println(primerNum + " no es primo");
		}else{
			System.out.println(primerNum + " es primo");
		}
		sc.close();
	}

	// 12 %  1 == 0 && 12 % 12 == 0
	// 12 % 2= 0
	// num % i = ?
	// 7 % 1 = 0
	
	//2-3-4-5-6-7-8-9-10-11
	// En el metodo inicilizamos la variable 'concidicio' como false, si entra en el if pasra a ser true
	public static boolean numPrimo(int num) {
		boolean condicio = false;
		for (int i = 2; i < num-1; i++) {
			if (num%i == 0) {
			condicio = true;
			}
		}
		return condicio;
	}
			
}
	
		
		
		
		

	


