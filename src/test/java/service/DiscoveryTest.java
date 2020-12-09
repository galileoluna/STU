package service;

import static org.junit.Assert.assertEquals;

import java.io.File;

import org.junit.Test;

import servicios.Discovery;

public class DiscoveryTest {
	
	@Test
	public void testGetMongo() throws Exception {
		Discovery findMongo = new Discovery();
		File f = new File("./services/mongo/mongoproyect.jar");
		assertEquals(3,Discovery.findDataBases(f).size());
	}
	
	@Test
	public void testGetBlockChain() throws Exception {
		Discovery findBlockchain = new Discovery();
		File f = new File("./services/blockchain/stublockchain.jar");
		assertEquals(11,Discovery.findDataBases(f).size());
	}
}
