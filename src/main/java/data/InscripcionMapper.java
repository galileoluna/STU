package data;

import java.util.ArrayList;

import com.mongodb.DB;

import db.ConexionMongo;
import model.Inscripcion;

public class InscripcionMapper implements IInscripcionMapper{

	@Override
	public Inscripcion find(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(Inscripcion student) {
		ConexionMongo conect= new ConexionMongo();
		DB database = conect.conexionMongo();
		DBCollection collection = database.getCollection("customers");
		BasicDBObject document = new BasicDBObject();
		document.put("name", "Shubham");
		document.put("company", "Baeldung");
		collection.insert(document);
		
	}

	@Override
	public void update(Inscripcion student) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Inscripcion student) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<Inscripcion> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
