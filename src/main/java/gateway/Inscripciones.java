package gateway;

import java.io.IOException;
import java.util.ArrayList;

import model.Inscripcion;

public interface Inscripciones {
	 public static ArrayList<Inscripcion> getInscripciones() throws IOException;
}
