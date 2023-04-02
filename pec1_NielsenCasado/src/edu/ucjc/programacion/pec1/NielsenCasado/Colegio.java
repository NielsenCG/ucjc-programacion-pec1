package edu.ucjc.programacion.pec1.NielsenCasado;

public class Colegio {
	
	private String nombre; // Nombre de la clase
	private String direccion; // Dirección donde se encuentra la clase
	private Aula aulas; // Objeto Aula nombrado como aulas
	
	// Constructor
	public Colegio(String nombre, String direccion, Aula aulas) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.aulas = aulas;
	}

	// Getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Aula getAulas() {
		return aulas;
	}

	public void setAulas(Aula aulas) {
		this.aulas = aulas;
	}
	
	/* Función que se utiliza para asignar un asiento a cada alumno.
	 * En caso de estar ocupado este asiento, pondra el asiento que está ocupado y pasará al siguiente
	 *  
	 * @param Un array de una dimensión de la clase Alumno
	 */
	public void selectorClaseAsientos(Alumno [] alumno) {
		int i = 0;
		int [] numero = aulas.getNumero();
		String [] planta = aulas.getPlanta();
		Alumno [][] asientos = aulas.getAsientos();
		for (int x = 0; x < asientos.length; x++) {
			for (int y = 0; y < asientos[x].length; y++) {
				if (asientos[x][y] == null) {
					asientos[x][y] = alumno[i];
					System.out.println("El alumno "+alumno[i].getNombre()+" "+alumno[i].getApellidos()+" con DNI "+alumno[i].getDni());
					System.out.println("\t * Clase asignada: "+numero[x]);
					System.out.println("\t * Planta asignada: "+planta[x]);
					System.out.println("\t * Asiento asignado: "+(y+1)+"\n");
					i++;
				} else {
					System.out.println("El asiento"+(y+1)+" de la clase "+numero[x]+", que esta situada en "+planta[x]+" está ocupado");
				}
			}
		}
	}
}
