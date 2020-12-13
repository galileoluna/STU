package conect;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.UpdateResult;


import org.json.JSONArray;

import servicios.BuscadorBasesDeDatos;

public class Initialize {

	public Method[] mongoConexion() {
		BuscadorBasesDeDatos findMongo = new BuscadorBasesDeDatos();
		File f = new File("./services/mongo/mongoproyect.jar");
		Class conec = BuscadorBasesDeDatos.findDataBases(f).get(0);
		Method metodos[] = conec.getMethods();
		int tmn =metodos.length;
		Method a= null;
		Method b= null;
		Method c= null;
		Method d= null;
		Method[] finales = {a,b,c,d};
		
		for(int i=0;i<tmn-1;i++) {
			System.out.println(metodos[i].toString());
			if(tmn<4) {
				finales[i]=metodos[i];
			}
		}
		return finales;
	}
	public Method[] getMongoQuerys() {
		BuscadorBasesDeDatos findMongo = new BuscadorBasesDeDatos();
		File f = new File("./src/test/java/service/mongoproyect.jar");
		Class conec = BuscadorBasesDeDatos.findDataBases(f).get(1);
		Method metodos[] = conec.getMethods();
		//"mongodb+srv://admin:admin@cluster0.ui4uq.mongodb.net/STU?retryWrites=true&w=majority"
		return metodos;
	}
	public Method[] getRequest() {
		BuscadorBasesDeDatos findBlockchain = new BuscadorBasesDeDatos();
		File f = new File("./src/test/java/service/stublockchain.jar");
		ArrayList<Class> conec =BuscadorBasesDeDatos.findDataBases(f);
		Method[] metodos= conec.get(9).getMethods();
		int tmn =metodos.length;
		Method a= null;
		Method b= null;
		Method[] finales = {a,b};
		for(int i=0;i<tmn-1;i++) {
			if(metodos[i].toString().equalsIgnoreCase("public org.json.JSONArray stublockchain.ApiGateway.getInscripciones(java.lang.String) throws java.io.IOException")) {
				finales[0]=metodos[i];
			}
			if(metodos[i].toString().equalsIgnoreCase("public void stublockchain.ApiGateway.insertInscripcion(org.json.JSONObject) throws java.io.IOException")) {
				finales[1]=metodos[i];
			}
		}
		return finales;
	}
}
