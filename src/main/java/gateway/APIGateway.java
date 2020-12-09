package gateway;

import java.io.IOException;
import java.util.ArrayList;

import model.Alumno;
import model.Inscripcion;
import model.Materia;

public class APIGateway {
	ImageAlumnos alumnos ;
	ImageMaterias materias;
	ImageInscripciones inscripciones;
	
	
	public ArrayList<Alumno> getAlumnos() throws IOException{
		return alumnos.getAlumnos();
	}
	public ArrayList<Materia> getMaterias() throws IOException{
		return materias.getMaterias();
	}
	public ArrayList<Inscripcion> getInscripciones() throws IOException{
		return inscripciones.getInscripciones();
	}
}
