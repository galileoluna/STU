package initialize;

import java.awt.List;
import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;

import servicios.Discovery;

public class conexion {
	
	
	public void mongoConexion() {
		Discovery findMongo = new Discovery();
		File f = new File("./services/mongo/mongoproyect.jar");
		Class conec = Discovery.findDataBases(f).get(0);
		
		Method m[] = conec.getMethods();
	
		//"mongodb+srv://admin:admin@cluster0.ui4uq.mongodb.net/STU?retryWrites=true&w=majority"
	}
	
	public static void main(String args[]) throws ClassNotFoundException {
		Discovery findMongo = new Discovery();
		File f = new File("./services/mongo/mongoproyect.jar");
		Class conec = Discovery.findDataBases(f).get(0);
		
		
		
	}

}
