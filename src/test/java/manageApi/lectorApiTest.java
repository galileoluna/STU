package manageApi;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

import model.Alumno;
import model.Materia;

public class lectorApiTest {
	
	@Test
	public void testGetMaterias() throws Exception {
		lectorApi lector = new lectorApi();
		ArrayList<Materia> materias = new ArrayList<Materia>();
		Materia pp2= new Materia("5f6d1a5beeb9a140e1b5e2e8","PP2","A102");
		Materia pp1= new Materia("5f6d1a6feeb9a140e1b5e2e9","PP1","A101");
		materias.add(pp2);
		materias.add(pp1);
		Materia a = new Materia("5f6d1a6feeb9a140e1b5e2e9","PP1","A101");
		
		assertTrue(a.arrayEquals(materias,lector.getMaterias()));
		
		
	}

}
