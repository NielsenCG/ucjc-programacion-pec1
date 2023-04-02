package edu.ucjc.programacion.pec1.NielsenCasado;

import java.util.Scanner;

public class GestionColegios {
	
	// Repositorio: https://github.com/NielsenCG/ucjc-programacion-pec1
	
	/**
	 * Función main que crea un colegio y ejecuta las funciones colegioElegido y selectorClaseAsientos
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		UtilsColegio utils = new UtilsColegio();
		int [] n = {1, 2, 3};
		String [] p = {"Planta Baja", "Planta Baja", "Primera Planta"};
		Alumno [] [] a = new Alumno [3] [3];
		Aula aula1 = new Aula(n, p, a);
		Colegio colegio1 = new Colegio("Andres Segovia", "Calle Aguila N 24", aula1);
				
		colegioElegido(colegio1, utils.crearAlumnos(9));
		colegio1.selectorClaseAsientos(utils.crearAlumnos(9));
		}
	
	/**
	 * Función que recoge el colegio y los alumnos y proporciona información sobre estos
	 * 
	 * @param Objeto de la clase Colegio
	 * @param Objeto, array de la clase Alumnos
	 */
	public static void colegioElegido(Colegio colegio, Alumno [] alumnos) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Bienvenidos al colegio "+colegio.getNombre());
		System.out.println("\t* Direccion: "+colegio.getDireccion());
		System.out.println("\t* Numero de aulas del colegio: "+colegio.getAulas().getNumero().length+" aulas");
		System.out.println("\t* Capacidad del colegio: "+colegio.getAulas().getAsientos().length*colegio.getAulas().getNumero().length+" alumnos");
		System.out.println("\n\tVamos a ver que alumnos han sido seleccionados");
		System.out.println("\tPulsa ENTER para continuar");
		scan.nextLine();
		System.out.println("\nLos alumnos que se han presentado son:");
		for (Alumno alumno : alumnos) {
			System.out.println("\n\t* Nombre: "+alumno.getNombre());
			System.out.println("\t*Apellido: "+alumno.getApellidos());
			System.out.println("\t*DNI: "+alumno.getDni());
		}
		System.out.println("\n\tVamos a ver en que asientos han sido asignados");
		System.out.println("\tPulsa ENTER para continuar");
		scan.nextLine();
	}
		
		
		
	
	
}
