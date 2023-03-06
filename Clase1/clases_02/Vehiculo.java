package clases_02;

public class Vehiculo {
	int antiguedad;
	
	public Vehiculo(int antiguedad) {
		this.antiguedad=antiguedad;
	}
	
	public int ver_antiguedad() {
		return antiguedad;
	}
	
	public void mod_antiguedad(int otra_antg) {
		this.antiguedad=otra_antg;
	}
}
