package servicios;

import java.util.List;
import java.util.Map;

import modelos.Alumno;

public class ArchivoServicio {
	private List<Alumno> alumnosACargar;
	private PromedioServicioImp promediosServicioImp;
	
	public void exportarDatos(Map<String, Alumno> alumnos, String ruta) {
		
	}

	public List<Alumno> getAlumnosACargar() {
		return alumnosACargar;
	}

	public void setAlumnosACargar(List<Alumno> alumnosACargar) {
		this.alumnosACargar = alumnosACargar;
	}

	public PromedioServicioImp getPromediosServicioImp() {
		return promediosServicioImp;
	}

	public void setPromediosServicioImp(PromedioServicioImp promediosServicioImp) {
		this.promediosServicioImp = promediosServicioImp;
	}

}
