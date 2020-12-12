package conect;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import javassist.compiler.MemberResolver.Method;

public class TestInitialize {
	@Test
	public void testGetRequest(){
		String getInscri="public org.json.JSONArray stublockchain.ApiGateway.getInscripciones(java.lang.String) throws java.io.IOException";
		String insertInscri="public void stublockchain.ApiGateway.insertInscripcion(org.json.JSONObject) throws java.io.IOException";	
		Initialize init= new Initialize();	
		java.lang.reflect.Method[] metodos = init.getRequest();
		assertEquals(getInscri,metodos[0].toString());
		assertEquals(insertInscri,metodos[1].toString());
	}
	@Test
	public void testGetQuerys(){
		String getInscri="public org.json.JSONArray stublockchain.ApiGateway.getInscripciones(java.lang.String) throws java.io.IOException";
		String insertInscri="public void stublockchain.ApiGateway.insertInscripcion(org.json.JSONObject) throws java.io.IOException";	
		Initialize init= new Initialize();	
		java.lang.reflect.Method[] metodos = init.getRequest();
		assertEquals(getInscri,metodos[0].toString());
		assertEquals(insertInscri,metodos[1].toString());
	}
	@Test
	public void testGetMongo(){
		Initialize init= new Initialize();	
		java.lang.reflect.Method[] metodos = init.getRequest();
		assertEquals(2,metodos.length);
	}
}
