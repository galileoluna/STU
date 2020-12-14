package data;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verifyNoMoreInteractions;

import gateway.ApiGateway;
import model.Inscripcion;

@RunWith(MockitoJUnitRunner.class)
public class InscripcionUOWTest {
	

	private final Inscripcion inscripcion1= new Inscripcion("5f6d2c43a91109d21ca3fef7","galileo","12345678","PP1","A101","2020-09-24T00:00:00Z");
	private final Inscripcion inscripcion2= new Inscripcion("5f6d2c43a91109d21ca3fef7","galileo","12345678","PP1","A101","2020-09-24T00:00:00Z");
	private final Inscripcion inscripcion3= new Inscripcion("5f6d2c43a91109d21ca3fef7","lautaro","12345678","PP1","A101","2020-09-24T00:00:00Z");
	

	private Map<String, ArrayList<Inscripcion>> inscripciones;

	@Mock
	private InscripcionMapper inscripcionMapper;
	private InscripcionUOW inscripcionUOF;
	
	@Before
	public void configuracion() {
		inscripciones = new HashMap<>();
		inscripcionUOF = new InscripcionUOW(inscripciones,inscripcionMapper);
	 }
	
	
	@Test
	public void testRegisterNew() throws Exception {
		
		doNothing().when(inscripcionUOF).registerNew(inscripcion2);
				
	    verifyNoMoreInteractions(inscripcionMapper);

	}
	
	@Test
	public void testRegisterDirty() throws Exception {
		
		doNothing().when(inscripcionUOF).registerDirty(inscripcion2);
				
	    verifyNoMoreInteractions(inscripcionMapper);

	}
	
	@Test
	public void testRegisterDelete() throws Exception {
		
		doNothing().when(inscripcionUOF).registerDeleted(inscripcion2);
				
	    verifyNoMoreInteractions(inscripcionMapper);

	}
	
	public void testCommit() throws Exception {
		
		doNothing().when(inscripcionUOF).registerNew(inscripcion2);
		doNothing().when(inscripcionUOF).registerDirty(inscripcion2);
		doNothing().when(inscripcionUOF).registerDeleted(inscripcion3);
		doNothing().when(inscripcionUOF).commit();
		
	    verifyNoMoreInteractions(inscripcionMapper);

	}

	
}
