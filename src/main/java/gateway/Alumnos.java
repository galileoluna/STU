package gateway;

import java.io.IOException;
import java.util.ArrayList;

import model.Alumno;

public interface Alumnos {
	public static ArrayList<Alumno> getAlumnos() throws IOException;
}
