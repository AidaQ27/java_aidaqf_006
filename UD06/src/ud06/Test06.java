package ud06;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		System.out.print("Dime un número : ");
		int num = sc.nextInt();
		
		//invocamos la funcion
		cuentaNum(num);
		sc.close();

	}
	
	public static void cuentaNum (int num) {
		// Lo convertimos porque en String, porque si no, no reconoce la funcion 'length'
		String n = Integer.toString(num);
		System.out.println(num + " tiene un total" + n.length() + " digitos ");
		
	}

}
