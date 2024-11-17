package servicios;

import java.util.HashMap;
import java.util.Map;

import modelos.Alumno;


public class AlumnoServicio {
	private Map<String, Alumno> listaAlumnos = new HashMap<>();
	
	public void crearAlumno(Alumno alumno) {
		listaAlumnos.put(alumno.getRut(), alumno);
	}

}
