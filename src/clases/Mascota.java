package clases;

public class Mascota {
	private String nombre;
	private String especie;
	private String raza;
	private int edad;
	
	public Mascota(String nombre, String especie, String raza, int edad) {
		this.nombre = nombre;
		this.especie = especie;
		this.raza = raza;
		this.edad = edad;
	}
	
	public String getNombre() {
        return nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public String getRaza() {
        return raza;
    }

    public int getEdad() {
        return edad;
    }
}
