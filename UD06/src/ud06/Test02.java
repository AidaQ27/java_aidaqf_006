package ud06;
import java.util.Scanner;

// Crea una app que nos genere una cantidad de numeros enteros aleatorios que nosotros le pasaremos por teclado.
// Crea un metodo donde pasamos como parametros entre que numeros queremos que los genere, podemos pedirlas por teclado antes de generar los números.
public class Test02 {

	// En el metodo main  inicilizamos el scanner, e invocamos el metodo.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Dime un número : ");
		int primerNum = sc.nextInt();
		
		numeroAleatorio(primerNum);
		
		sc.close();
	}
	// Creamos la función 
	public static void numeroAleatorio(int num) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Dime un minimo : ");
		int minimo = sc.nextInt();
		
		System.out.print("Dime un maximo : ");
		int maximo = sc.nextInt();
		
		// generar num random
		//for (inici; final; autoincrement)
		
		for (int i = 0; i < num; i++) {  
			System.out.println("Numero " + i + " aleatorio: ");
			System.out.println((int)(Math.random()*(minimo-maximo+1)+maximo));
		}
		
		sc.close();
	}
	
	
	
			

		

}