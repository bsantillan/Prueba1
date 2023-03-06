package clase_01;

import java.util.Scanner;
import clases_02.*;

public class Ejercicio_2 {
	
	public static boolean evaluar_ant(Persona persona1) {
		int cant=0, i;
		if(persona1.tamaño()>=3) {
			for(i=0;i<=persona1.tamaño()-1;i++) {
				Vehiculo veh=persona1.recuperar(i);
				if(veh.ver_antiguedad()<5) {
					cant++;
				}
			}
			if(cant>=3) {
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
	}
	public static void main(String[] args){
		float ingre;
		String nom;
		int ant, inmu, rta, i;
		boolean emb, aer, tit_ac;
		Scanner escaner = new Scanner(System.in);
		Vehiculo veh;
		
		System.out.print("Indique su nombre: ");
		nom= escaner.next();
		
		System.out.print("Indique sus ingresos mensuales en el hogar: ");
		ingre= escaner.nextFloat();
		
		System.out.print("Indique cuantos inmuebles posee: ");
		inmu=escaner.nextInt();
		
		System.out.print("¿Tiene una embarcacion?(1->Si // 0->No): ");
		rta= escaner.nextInt();
		if(rta==1) {
			emb=true;
		}else {
			emb=false;
		}
		
		System.out.print("¿Tiene una aeronave?(1->Si // 0->No): ");
		rta= escaner.nextInt();
		if(rta==1) {
			aer=true;
		}else {
			aer=false;
		}
		
		System.out.print("¿Es titutar de activos?(1->Si // 0->No): ");
		rta= escaner.nextInt();
		if(rta==1) {
			tit_ac=true;
		}else {
			tit_ac=false;
		}
		Persona persona1= new Persona(nom, ingre, inmu, emb, aer, tit_ac);
		
		
		System.out.print("\nIndique cuantos vehiculos posee: ");
		rta= escaner.nextInt();
		for(i=0;i<=rta-1;i++) {
			System.out.print("Indique la antiguedad del vehiculo " + (i+1)+ ":");
			ant=escaner.nextInt();
			veh=new Vehiculo(ant);
			persona1.agregar(veh);

		}
		escaner.close(); 
		System.out.print("\nDatos de la persona 1 \n\n");
		System.out.print("Nombre: "+ persona1.ver_nom() +"\n");
		System.out.print("Ingresos: "+ persona1.ver_ingre() +"\n");
		System.out.print("Cantidad de Inmuebles: "+ persona1.ver_inmue() +"\n");
		System.out.print("Embarcacion: "+ persona1.ver_emb() +"\n");
		System.out.print("Aeronave: "+ persona1.ver_aer() +"\n");
		System.out.print("Titular de Activos: "+ persona1.ver_tit_act() +"\n");
		for(i=0;i<=persona1.tamaño()-1;i++) {
			 veh=persona1.recuperar(i);
			System.out.print("Antiguedad del vehiculo "+(i+1) + ": " + veh.ver_antiguedad()+"\n");
		}
		
		boolean cond1=persona1.ver_ingre()>=489083;
		boolean cond2=persona1.ver_inmue()>=3;
		boolean cond3=persona1.ver_emb()==true;
		boolean cond4=persona1.ver_aer()==true;
		boolean cond5=persona1.ver_tit_act()==true;
		
		
		if(cond1==true | cond2==true | cond3==true | cond4==true | cond5==true | evaluar_ant(persona1)==true) {
			System.out.print("\n\nUsted pertenece al segmento de ingresos altos");
		}else {
			System.out.print("\n\nUsted no pertenece al segmento de ingresos altos");
		}
	}
}
