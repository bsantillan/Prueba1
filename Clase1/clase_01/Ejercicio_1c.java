package clase_01;

import java.util.Scanner;

/*Muestra todos los numeros impares o pares entre dos numeros*/


public class Ejercicio_1c {
	public static void main(String[] args){
		
		Scanner escaner= new Scanner(System.in);
		int a;
		int b;
		int eleccion;
		
		System.out.print("Ingrese el primer numero: ");
		a= escaner.nextInt();
		
		System.out.print("Ingrese el segundo numero: ");
		b=escaner.nextInt();
		
		System.out.print("¿Desea mostras los numeros pares o impares? (1-->Impar /// 0-->Par): ");
		eleccion= escaner.nextInt();
		escaner.close(); 
		if(eleccion==0) {
			while(a<=b) {
				if(a%2==0) {
					System.out.print(a);
					System.out.print("\t");
				}
				a++;
		}
		}else{
			while(a<=b) {
				if(a%2!=0) {
					System.out.print(a);
					System.out.print("\t");
				}
				a++;
			}
		}
}
}
