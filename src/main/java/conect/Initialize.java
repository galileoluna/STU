package conect;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

import org.json.JSONArray;

import servicios.BuscadorBasesDeDatos;

public class Initialize {

	public Method[] mongoConexion() {
		BuscadorBasesDeDatos findMongo = new BuscadorBasesDeDatos();
		File f = new File("./services/mongo/mongoproyect.jar");
		Class conec = BuscadorBasesDeDatos.findDataBases(f).get(0);
		Method metodos[] = conec.getMethods();
		//"mongodb+srv://admin:admin@cluster0.ui4uq.mongodb.net/STU?retryWrites=true&w=majority"
		return metodos;
	}
	public Method[] getRequest() {
		BuscadorBasesDeDatos findBlockchain = new BuscadorBasesDeDatos();
		File f = new File("./services/blockchain/stublockchain.jar");
		ArrayList<Class> conec =BuscadorBasesDeDatos.findDataBases(f);
		Method[] metodos= conec.get(9).getMethods();
		int tmn =metodos.length;
		Method a= null;
		Method b= null;
		Method[] finales = {a,b};
		for(int i=0;i<tmn-1;i++) {
			System.out.println(metodos[i].toString());
			if(metodos[i].toString().equalsIgnoreCase("public org.json.JSONArray stublockchain.ApiGateway.getInscripciones(java.lang.String) throws java.io.IOException")) {
				finales[0]=metodos[i];
			}
			if(metodos[i].toString().equalsIgnoreCase("public void stublockchain.ApiGateway.insertInscripcion(org.json.JSONObject) throws java.io.IOException")) {
				finales[1]=metodos[i];
			}
		}
		return finales;
	}
	public static void main(String args[]) throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		BuscadorBasesDeDatos findMongo = new BuscadorBasesDeDatos();
		File f = new File("./services/mongo/mongoproyect.jar");
		ArrayList<Class> conec =BuscadorBasesDeDatos.findDataBases(f);
		//6 APi gateway
		Method[] metodos= conec.get(9).getMethods();
		int tmn =metodos.length;
		Method a= null;
		Method b= null;
		Method[] finales = {a,b};
		System.out.println(metodos.length);
		for(int i=0;i<tmn-1;i++) {
			System.out.println(metodos[i].toString());
			if(metodos[i].toString().equalsIgnoreCase("public org.json.JSONArray stublockchain.ApiGateway.getInscripciones(java.lang.String) throws java.io.IOException")) {
				finales[0]=metodos[i];
			}
			if(metodos[i].toString().equalsIgnoreCase("public void stublockchain.ApiGateway.insertInscripcion(org.json.JSONObject) throws java.io.IOException")) {
				finales[1]=metodos[i];
			}
		}
		System.out.println(finales[0].toString());
		System.out.println(finales[1].toString());
		Method getInscripciones = conec.get(6).getDeclaredMethod("getInscripciones", null);
		Object instance = null;
		JSONArray inscripciones = (JSONArray) getInscripciones.invoke(instance, null);
	}

}
