package ud06;
import java.util.Scanner;

// Crea una app que nos calcules el area de un circulo, cuadrado o triangulo.
public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner (System.in);
		// Pedimos que area queremos calcular
		System.out.print("Que figura quieres calcular : ");
		String figura = sc.nextLine();
		
		// con switch elegimos que opcion queremos
		switch (figura) {
		
		case "circulo":
			System.out.print("Introduce el radio:  ");
			double radio = sc.nextDouble();
			
			System.out.print("El área del circulo es: " + circulo(radio));
		
			break;
			
		case "triangulo":
			System.out.println("Introduce la base: ");
			double base = sc.nextDouble();
			
			System.out.println("Introduce la altura: ");
			double altura = sc.nextDouble();
			
			System.out.println("El área del triangulo es: " + triangulo(base, altura));
			
			break;
			
		case"cuadrado":
			System.out.println("Introduce el lado: ");
			double lado = sc.nextDouble();
			
			System.out.println("El área del cuadrado es : " + cuadrado(lado));
			
			break;
			
		default:
			System.out.println("La figura introducida no se puede calcular");
			
		}
		
		sc.close();
		
	// Creamos un método para cada figura
	}
	
	public static double circulo (double radio){
		
		 double resultadoCirculo = (Math.pow(radio, 2)*Math.PI);
		 return resultadoCirculo;
		
	}
	
	public static double triangulo (double base, double altura){
		
		double resultadoTriangulo = (base * altura)/2;
		return resultadoTriangulo;
		
		
	}
	
	public static double cuadrado (double lado) {
		
		double resultadoCuadrado = lado*lado;
		return resultadoCuadrado;
		
	}
	
}
