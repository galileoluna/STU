package db;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoClient;
import com.mongodb.MongoClientSettings;
import com.mongodb.MongoClientURI;
import com.mongodb.ConnectionString;
import com.mongodb.DB;
import com.mongodb.ServerAddress;
import com.mongodb.MongoCredential;

public class ConexionMongo {

	public DB conexionMongo() {
			MongoClient mongoClient=MongoClients.create("mongodb+srv://admin:admin@cluster0.ui4uq.mongodb.net/stu?retryWrites=true&w=majority");
			DB database = mongoClient.getDB("stu");
			return database;
	} 

		

}
