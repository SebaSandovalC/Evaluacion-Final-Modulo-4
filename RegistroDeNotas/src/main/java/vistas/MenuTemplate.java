package vistas;


import java.util.Scanner;

public abstract class MenuTemplate {
	protected Scanner scanner = new Scanner(System.in);
	
	public void iniciarMenu() {
		int opcion;
		do {
			System.out.println("1- Crear Alumnos");
			System.out.println("2- Agregar Materia");
			System.out.println("3- Agregar Nota");
			System.out.println("4- Listar Alumnos");
			System.out.println("5- Exportar Datos");
			System.out.println("6- Salir");
			System.out.println("Seleccione una opción: ");
			String input = scanner.nextLine();
			opcion = Integer.parseInt(input);
			
			switch (opcion) {
			case 1: crearAlumno();
			break;
			case 2: agregarMateria();
			break;	
			case 3: agregarNotaPasoUno();
			break;
			case 4: listarAlumnos();
			break;
			case 5: exportarDatos();
			break;
			case 6: terminarPrograma();
			break;
			default: System.out.println("Opción ingresada no es válida.");
			break;
			
			}
		} while (opcion != 6);
	}

	public abstract void crearAlumno();
	
	public abstract void agregarMateria();
	
	public abstract void agregarNotaPasoUno();
	 
	public abstract void listarAlumnos();
	
	public abstract void exportarDatos();
	
	public abstract void terminarPrograma();
	
}