package clase_01;

import java.util.Scanner;

/*Muestra todos los numeros pares entre dos numeros con un for en forma descendente*/


public class Ejercicio_1d {
	public static void main(String[] args){
		
		Scanner escaner= new Scanner(System.in);
		int a;
		int b;
		int i;
		
		System.out.print("Ingrese el primer numero: ");
		a= escaner.nextInt();
		
		System.out.print("Ingrese el segundo numero: ");
		b=escaner.nextInt();
		escaner.close(); 
		
		for(i=b;i>=a; i--) {
			if(i%2==0) {
				System.out.print(i);
				System.out.print("\t");
			}
		}
}
}
