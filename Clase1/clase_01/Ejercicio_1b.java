package clase_01;

import java.util.Scanner;

/*Muestra todos los numeros pares entre dos numeros*/


public class Ejercicio_1b {
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
			if(a%2==0) {
				System.out.print(a);
				System.out.print("\t");
			}
			a++;
}
}
}
