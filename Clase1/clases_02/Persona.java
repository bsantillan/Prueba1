package clases_02;

import java.util.ArrayList;
import java.util.List;

public class Persona {
	String nombre;
	float ingresos;
	int inmueble;
	boolean embarcacion, aeronave, tit_act;
	List<Vehiculo> cant=new ArrayList<>();
	
	public Persona(String nom, float ing, int inmu, boolean emb, boolean aer, boolean tit_a) {
		this.nombre=nom;
		this.ingresos=ing;
		this.inmueble=inmu;
		this.embarcacion=emb;
		this.aeronave=aer;
		this.tit_act=tit_a;
	}
	
	public String ver_nom() {
		return nombre;
	}
	
	public float ver_ingre() {
		return ingresos;
	}
	
	public int ver_inmue() {
		return inmueble;
	}
	
	public boolean ver_emb() {
		return embarcacion;
	}
	
	public boolean ver_aer() {
		return aeronave;
	}
	
	public boolean ver_tit_act(){
		return tit_act;
	}
	
	public void mod_nom(String otro_nom) {
		this.nombre=otro_nom;
	}
	
	public void mod_ingre(float otro_ingre) {
		this.ingresos=otro_ingre;
	}
	
	public void mod_inmue(int otro_inmue) {
		this.inmueble=otro_inmue;
	}
	
	public void mod_emb(boolean otra_emb) {
		this.embarcacion=otra_emb;
	}
	
	public void mod_aer(boolean otra_aer) {
		this.aeronave=otra_aer;
	}
	
	public void mod_tit_a(boolean otro_tit_a) {
		this.tit_act=otro_tit_a;
	}
	
	public Vehiculo recuperar(int i) {
		return cant.get(i);
	}
	
	public void agregar(Vehiculo veh) {
		cant.add(veh);
	}
	
	public void eliminar(int i) {
		cant.remove(i);
	}
	
	public int tamaño() {
		return cant.size();
	}
	
	public boolean es_vacia() {
		return cant.isEmpty();
	}
	
	
}
