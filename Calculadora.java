
import java.util.Scanner;
import java.io.Console;

public class Calculadora {

	public static void main (String []args) {
		Integer a;
		Integer b;
		Integer opcion;
		Integer resultado;
		Scanner teclado = new Scanner(System.in);
		
			System.out.println("Ingrese su operacion /n 1 para RESTA /n 2 para SUMA /n 3 para DIVIDIR / n 4 para MULTIPLICAR");
			opcion = teclado.nextInt(); 
			
		 switch (opcion) {
				case 1 :
					resultado=a-b;
					break;
				case 2 :
					resultado=a+b;
					break;
				case 3 :
					resultado=a/b;
					break;
				case 4 :
					resultado=a*b;
					break;
				default: System.out.println("Opción no valida");	
					
					
			}
			System.out.println("El resultado es: " +resultado.toString());

}

}
