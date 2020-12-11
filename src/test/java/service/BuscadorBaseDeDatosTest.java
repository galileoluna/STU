package service;

import static org.junit.Assert.assertEquals;

import java.io.File;

import org.junit.Test;

import servicios.BuscadorBasesDeDatos;

public class BuscadorBaseDeDatosTest {
	
	@Test
	public void testGetMongo() throws Exception {
		BuscadorBasesDeDatos findMongo = new BuscadorBasesDeDatos();
		File f = new File("./src/test/java/service/mongo.jar");
		assertEquals(9,BuscadorBasesDeDatos.findDataBases(f).size());
	}
	
	@Test
	public void testGetBlockChain() throws Exception {
		BuscadorBasesDeDatos findBlockchain = new BuscadorBasesDeDatos();
		File f = new File("./src/test/java/service/stublockchain.jar");
		assertEquals(11,BuscadorBasesDeDatos.findDataBases(f).size());
	}
}
