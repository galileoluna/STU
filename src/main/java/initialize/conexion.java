package initialize;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

import org.json.JSONArray;

import servicios.BuscadorBasesDeDatos;

public class conexion {

	public void mongoConexion() {
		BuscadorBasesDeDatos findMongo = new BuscadorBasesDeDatos();
		File f = new File("./services/mongo/mongoproyect.jar");
		Class conec = BuscadorBasesDeDatos.findDataBases(f).get(0);
		Method m[] = conec.getMethods();
		//"mongodb+srv://admin:admin@cluster0.ui4uq.mongodb.net/STU?retryWrites=true&w=majority"
	}
	
	public static void main(String args[]) throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		BuscadorBasesDeDatos findMongo = new BuscadorBasesDeDatos();
		File f = new File("./services/blockchain/stublockchain.jar");
		ArrayList<Class> conec =BuscadorBasesDeDatos.findDataBases(f);
		//6 APi gateway
		Method[] metodos= conec.get(6).getMethods();
		int tmn =metodos.length;
		System.out.println(metodos[0].toString());
		Method getInscripciones = conec.get(6).getDeclaredMethod("getInscripciones", null);
		Object instance = null;
		JSONArray inscripciones = (JSONArray) getInscripciones.invoke(instance, null);
		System.out.println(inscripciones.length());
		/*
		for (Class clas : conec) {
			String funcion ="setConexion";
			System.out.println(clas.getClass());
		}*/
	}

}
