package gateway;

import java.io.IOException;
import java.util.ArrayList;

import model.Inscripcion;

public interface Inscripciones {
	 ArrayList<Inscripcion> getInscripciones() throws IOException;
}
