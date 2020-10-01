package SiTU.model;
import org.junit.Test;

import model.Alumno;
import model.Inscripcion;

import static org.junit.Assert.*;


public class InscripcionTest {
	
	@Test
	public void testGetAlumno() {
		Inscripcion inscripcion = new Inscripcion("1","Galileo Luna", "123456","PP2","A102","2020-03-09");
		assertEquals("Galileo Luna",inscripcion.getAlumno());
	}
	@Test
	public void testGetID() {
		Inscripcion inscripcion = new Inscripcion("1","Galileo Luna", "123456","PP2","A102","2020-03-09");
		assertEquals("1",inscripcion.getId());
	}
	@Test
	public void testGetLegajo() {
		Inscripcion inscripcion = new Inscripcion("1","Galileo Luna", "123456","PP2","A102","2020-03-09");
		assertEquals("123456",inscripcion.getLegajo());
	}
	
	
	@Test
	public void testGetMateria() {
		Inscripcion inscripcion = new Inscripcion("1","Galileo Luna", "123456","PP2","A102","2020-03-09");
		assertEquals("PP2",inscripcion.getMateria());
	}
	
	@Test
	public void testGetCodigo() {
		Inscripcion inscripcion = new Inscripcion("1","Galileo Luna", "123456","PP2","A102","2020-03-09");
		assertEquals("A102",inscripcion.getCodigo());
	}
	
	@Test
	public void testGetFecha() {
		Inscripcion inscripcion = new Inscripcion("1","Galileo Luna", "123456","PP2","A102","2020-03-09");
		assertEquals("2020-03-09",inscripcion.getFecha());
	}
	
	

}
