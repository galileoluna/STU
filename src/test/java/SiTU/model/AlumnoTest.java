package SiTU.model;
import org.junit.Test;

import model.Alumno;

import static org.junit.Assert.*;



public class AlumnoTest {
	
	@Test
	public void testGetNombre() {
		Alumno alumno = new Alumno(1,"Franco", 1234);
		assertEquals("Franco",alumno.getNombre());
	}
	
	@Test
	public void testGetLegajo() {
		Alumno alumno = new Alumno(1,"Franco", 1234);
		assertEquals(1234,alumno.getLegajo(),0.1);
	}
	@Test
	public void testGetId() {
		Alumno alumno = new Alumno(1,"Franco", 1234);
		assertEquals(1,alumno.getId(),0.1);
	}
	
	@Test
	public void testSetNombre() {
		Alumno alumno = new Alumno(1,"Franco", 1234);
		alumno.setNombre("Claudio");
		assertEquals("Claudio",alumno.getNombre());
	}
	
	@Test
	public void testSetLegajo() {
		Alumno alumno = new Alumno(1,"Franco", 1234);
		alumno.setLegajo(12345);
		assertEquals(12345,alumno.getLegajo(),0.1);
	}
	@Test
	public void testSetId() {
		Alumno alumno = new Alumno(1,"Franco", 1234);
		alumno.setId(2);
		assertEquals(2,alumno.getId(),0.1);
	}
	
}
