
import java.util.Scanner;
import java.io.Console;

public class Calculadora {

	public static void main (String []args) {
		Integer a;
		Integer b;
		Integer opcion;
		Integer resultado;
		Scanner teclado = new Scanner(System.in);
		do{
			System.out.println("Ingrese su operacion /n 1 para sumar /n 2 para restar /n 3 para multiplicar / n 4 para dividir");
			opcion = teclado.nextInt(); 
			
		} switch (opcion) {
				case 1 :
					resultado=a+b;
					break;
				case 2 :
					resultado=a-b;
					break;
				case 3 :
					resultado=a*b;
					break;
				case 4 :
					resultado=a/b;
					break;
				default: System.out.println("Opción no valida");	
					
					
			}
			System.out.println("El resultado es: " +resultado.toString());

}

}
