package clases;

public class Mascota {
	private String nombre;
	private String especie;
	private String raza;
	private int edad;
	private Cliente cliente;
	
	public Mascota(String nombre, String especie, String raza, int edad, Cliente cliente) {
		this.nombre = nombre;
		this.especie = especie;
		this.raza = raza;
		this.edad = edad;
		this.cliente = cliente;
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
    
    public Cliente getCliente() {
    	return cliente;
    }
}
