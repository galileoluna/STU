package service;

import static org.junit.Assert.assertEquals;

import java.io.File;

import org.junit.Test;

import servicios.BuscadorBasesDeDatos;

public class BuscadorBaseDeDatosTest {
	
	@Test
	public void testGetMongo() throws Exception {
		BuscadorBasesDeDatos findMongo = new BuscadorBasesDeDatos();
		File f = new File("./src/main/java/jars/mongoproyect.jar");
		assertEquals(3,BuscadorBasesDeDatos.findDataBases(f).size());
	}
	
	@Test
	public void testGetBlockChain() throws Exception {
		BuscadorBasesDeDatos findBlockchain = new BuscadorBasesDeDatos();
		File f = new File("./src/main/java/jars/stublockchain.jar");
		assertEquals(11,BuscadorBasesDeDatos.findDataBases(f).size());
	}
	
}
