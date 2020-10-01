package SiTU.model;
import org.junit.Test;

import model.Alumno;

import static org.junit.Assert.*;



public class AlumnoTest {
	

	
	@Test
	public void testGetNombre() {
		Alumno alumno= new Alumno("1", "Franco", "Gomez", "2020-02-06","a@a.com", "123456",  "1234") ;
		assertEquals("Franco",alumno.getNombre());
	}
	@Test
	public void testGetApellidos() {
		Alumno alumno= new Alumno("1", "Franco", "Gomez", "2020-02-06","a@a.com", "123456",  "1234") ;
		assertEquals("Gomez",alumno.getApellidos());
	}
	@Test
	public void testGetEmail() {
		Alumno alumno= new Alumno("1", "Franco", "Gomez", "2020-02-06","a@a.com", "123456",  "1234") ;
		assertEquals("a@a.com",alumno.getEmail());
	}
	@Test
	public void testGetPassword() {
		Alumno alumno= new Alumno("1", "Franco", "Gomez", "2020-02-06","a@a.com", "123456",  "1234") ;
		assertEquals("123456",alumno.getPassword());
	}
	
	@Test
	public void testGetfechaNacimiento() {
		Alumno alumno= new Alumno("1", "Franco", "Gomez", "2020-02-06","a@a.com", "123456",  "1234") ;
		assertEquals("2020-02-06",alumno.getFechaNacimiento());
	}
	
	
	@Test
	public void testGetLegajo() {
		Alumno alumno= new Alumno("1", "Franco", "Gomez", "2020-02-06","a@a.com", "123456",  "1234") ;
		assertEquals("1234",alumno.getLegajo());
	}
	@Test
	public void testGetId() {
		Alumno alumno= new Alumno("1", "Franco", "Gomez", "2020-02-06","a@a.com", "123456",  "1234") ;
		assertEquals("1",alumno.getId());
	}
	
	@Test
	public void testSetNombre() {
		Alumno alumno= new Alumno("1", "Franco", "Gomez", "2020-02-06","a@a.com", "123456",  "1234") ;
		alumno.setNombre("Claudio");
		assertEquals("Claudio",alumno.getNombre());
	}
	
	@Test
	public void testSetLegajo() {
		Alumno alumno= new Alumno("1", "Franco", "Gomez", "2020-02-06","a@a.com", "123456",  "1234") ;
		alumno.setLegajo("12345");
		assertEquals("12345",alumno.getLegajo());
	}
	@Test
	public void testSetId() {
		Alumno alumno= new Alumno("1", "Franco", "Gomez", "a@a.com", "1234", "123456", "2020-02-06") ;
		alumno.setId("2");
		assertEquals("2",alumno.getId());
	}
	
}
