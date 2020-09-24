package SiTU.model;

import org.junit.Test;

import model.Materia;

import static org.junit.Assert.*;


public class MateriaTest {
	
	@Test
	public void getId() {
		Materia materia = new Materia(1,"PP2");
		assertEquals(1,materia.getId());
		
	}
	@Test
	public void getNombre() {
		Materia materia = new Materia(1,"PP2");
		assertEquals("PP2",materia.getNombre());
	}
	
	
	@Test
	public void setId() {
		Materia materia = new Materia(1,"PP2");
		materia.setId(2);
		assertEquals(2,materia.getId());
		
	}
	@Test
	public void setNombre() {
		Materia materia = new Materia(1,"PP2");
		materia.setNombre("Discreta");
		assertEquals("Discreta",materia.getNombre());
		
	}

}
