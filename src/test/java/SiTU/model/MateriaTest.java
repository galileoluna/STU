package SiTU.model;

import org.junit.Test;

import model.Materia;

import static org.junit.Assert.*;

public class MateriaTest {
	public String id;
	public String nombre;
	public String codigo;
	
	
	@Test
	public void getId() {
		Materia materia = new Materia("1","PP2","a101");
		assertEquals("1",materia.getId());
	}
	@Test
	public void getNombre() {
		Materia materia = new Materia("1","PP2","a101");
		assertEquals("PP2",materia.getNombre());
	}
	
	@Test
	public void getCodigo() {
		Materia materia = new Materia("1","PP2","a101");
		assertEquals("a101",materia.getCodigo());
	}
	@Test
	public void setId() {
		Materia materia = new Materia("1","PP2","a101");
		materia.setId("2");
		assertEquals("2",materia.getId());
	}
	@Test
	public void setNombre() {
		Materia materia = new Materia("1","PP2","a101");
		materia.setNombre("Discreta");
		assertEquals("Discreta",materia.getNombre());
	}
	@Test
	public void setCodigo() {
		Materia materia = new Materia("1","PP2","a101");
		materia.setCodigo("a102");
		assertEquals("a102",materia.getCodigo());
	}
	
	
}
