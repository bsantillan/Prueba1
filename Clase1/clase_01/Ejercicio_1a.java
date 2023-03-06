package clase_01;

import java.util.Scanner;

/*Muestra todos los numeros entre dos numeros*/
public class Ejercicio_1a {
	public static void main(String[] args){
	
	Scanner escaner= new Scanner(System.in);
	int a;
	int b;
	
	System.out.print("Ingrese el primer numero: ");
	a= escaner.nextInt();
	
	System.out.print("Ingrese el segundo numero: ");
	b=escaner.nextInt();
	escaner.close(); 
	
	while(a<=b) {
		System.out.print(a);
		System.out.print("\t");
		a++;
}
}
}
