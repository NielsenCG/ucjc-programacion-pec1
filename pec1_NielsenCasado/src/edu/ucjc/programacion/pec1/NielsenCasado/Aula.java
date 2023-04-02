package edu.ucjc.programacion.pec1.NielsenCasado;

public class Aula {
	
	private int [] numero; // Número de la clase
	private String [] planta; // Planta en la que se encuentra la clase
	private Alumno [][] asientos; // Array de dos dimensiones filas nº de asientos y columnas nº de clases
	
	// Contructor
	public Aula(int[] numero, String[] planta, Alumno[][] asientos) {
		super();
		this.numero = numero;
		this.planta = planta;
		this.asientos = asientos;
	}

	// Getters y setters
	public int[] getNumero() {
		return numero;
	}

	public void setNumero(int[] numero) {
		this.numero = numero;
	}

	public String[] getPlanta() {
		return planta;
	}

	public void setPlanta(String[] planta) {
		this.planta = planta;
	}

	public Alumno[][] getAsientos() {
		return asientos;
	}

	public void setAsientos(Alumno[][] asientos) {
		this.asientos = asientos;
	}
}