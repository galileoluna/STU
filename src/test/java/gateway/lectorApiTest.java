package gateway;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

import gateway.lectorApi;
import model.Alumno;
import model.Inscripcion;
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
		ArrayList<Materia> materiasAPI=lectorApi.getMaterias();
		
		assertEquals(materias.get(0).getCodigo(),materiasAPI.get(0).getCodigo());
		
	}
	
	@Test
	public void testGetAlumnos() throws Exception {
		lectorApi lector = new lectorApi();
		ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
		Alumno alumno= new Alumno("5f6d0cc13d55c27575758e67","leonardo","cantarini","1995-06-30T00:00:00Z","leonardocantarini@gmail.com ","$2a$08$u0HnyGTdTioXna9iV2wmo.szoynCEaQ8kVALNUWH5Mi.d3mFh9dFu","12345678");
		
		alumnos.add(alumno);
		
		ArrayList<Alumno> alumnosAPI=lectorApi.getAlumnos();
		
		assertEquals(alumnos.get(0).getLegajo(),alumnosAPI.get(1).getLegajo());
		
	}
	@Test
	public void testGetInscripciones() throws Exception {
		lectorApi lector = new lectorApi();
		ArrayList<Inscripcion> Inscripciones = new ArrayList<Inscripcion>();
		Inscripcion inscripcion1= new Inscripcion("5f6d2c43a91109d21ca3fef7","leonardo","12345678","PP1","A101","2020-09-24T00:00:00Z");

		Inscripciones.add(inscripcion1);
		ArrayList<Inscripcion> inscripcionesAPI=lectorApi.getInscripciones();
		
		assertEquals(Inscripciones.get(0).getId(),inscripcionesAPI.get(0).getId());
		
	}
	
	


}
