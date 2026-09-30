package clases;

public class Cliente {
	
	private String nombre;
	private String dni;
	private String telefono;
	private String direccion;
	
	public Cliente(String nombre, String dni, String telefono, String direccion) {
		this.nombre = nombre;
		this.dni = dni;
		this.telefono = telefono;
		this.direccion = direccion;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getDni() {
		return dni;
	}
	
	public String getTelefono() {
		return telefono;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	@Override
	public String toString() {
		return nombre;
	}
}
