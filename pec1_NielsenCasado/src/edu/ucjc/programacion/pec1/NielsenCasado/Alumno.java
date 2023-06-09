package edu.ucjc.programacion.pec1.NielsenCasado;

public class Alumno {
	
	private String nombre; // Nombre de los alumnos
	private String apellidos; // Apellido de los alumnos
	private String dni; // DNI de los alumnos
	
	// Constructor
	public Alumno(String nombre, String apellidos, String dni) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
	}
	
	// Getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	  
}
