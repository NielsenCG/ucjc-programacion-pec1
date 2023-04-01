package edu.ucjc.programacion.pec1.NielsenCasado;

public class UtilsColegio {
	public Alumno[] crearAlumnos (int asientos) {
		Alumno[] alumnos = new Alumno[asientos];
		for (int i = 0; i < asientos; i++) {
			alumnos[i] = new Alumno("Nombre"+(i+1), "Apellido"+(i+1), "0000000"+(i+1)+"S");
		}
		return alumnos;
	}
}


