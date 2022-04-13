package ud06;

import java.util.Scanner;

public class Test04 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		System.out.print("Dime un número : ");
		int num = sc.nextInt();
		
		sc.close();
		// invoco el metodo
		int resultado = multiplica(num);
		System.out.println("El resultado es: " + resultado);
	}
	
	//1*1 = 1*2 = 2*3 = 6*4 = 24*5 = 120 
	//creo el metodo
	public static int multiplica (int num) {//5*4*3*2*1 
		int x = 1;
		int operacion = 1;
		while (x <= num) { //
			operacion = operacion * x;
			x++;
		}
		return operacion;
		
	}
}
