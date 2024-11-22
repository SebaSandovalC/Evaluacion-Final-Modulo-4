package vistas;

import servicios.AlumnoServicio;
import servicios.ArchivoServicio;

public class Menu extends MenuTemplate{
	private AlumnoServicio alumnoservicio = new AlumnoServicio();
	private ArchivoServicio archivoservicio = new ArchivoServicio();
	
	@Override
	public void crearAlumno() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void agregarMateria() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void agregarNotaPasoUno() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void listarAlumnos() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void exportarDatos() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void terminarPrograma() {
		System.out.println("Finalizando el programa....");
		
	}
	public AlumnoServicio getAlumnoservicio() {
		return alumnoservicio;
	}
	public void setAlumnoservicio(AlumnoServicio alumnoservicio) {
		this.alumnoservicio = alumnoservicio;
	}
	public ArchivoServicio getArchivoservicio() {
		return archivoservicio;
	}
	public void setArchivoservicio(ArchivoServicio archivoservicio) {
		this.archivoservicio = archivoservicio;
	}

}
