package gateway;

import java.io.IOException;
import java.util.ArrayList;

import model.Materia;

public interface Materias {
	ArrayList<Materia> getMaterias() throws IOException;
}
