package gateway;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

import org.json.JSONArray;

import model.Alumno;
import model.Inscripcion;
import model.Materia;
import servicios.BuscadorBasesDeDatos;

public class APIGateway {
	static ImageAlumnos alumnos ;
	static ImageMaterias materias;
	static ImageInscripciones inscripciones;
	
	
	public static ArrayList<Alumno> getAlumnos() throws IOException{
		return alumnos.getAlumnos();
	}
	public static ArrayList<Materia> getMaterias() throws IOException{
		return materias.getMaterias();
	}
	public static ArrayList<Inscripcion> getInscripciones() throws IOException{
		return inscripciones.getInscripciones();
	}
	
	public static void main(String args[]) throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, IOException {
		ArrayList<Alumno> al =getAlumnos();
		System.out.println(al.size());
	}
}
