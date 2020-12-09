package gateway;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import model.Alumno;

public class ImageAlumnos implements Alumnos {

	public ArrayList<Alumno> getAlumnos() throws IOException {
		ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
		CloseableHttpClient httpclient = HttpClients.createDefault();
		try {
			HttpGet httpget = new HttpGet("https://apiungs.herokuapp.com/getAlumnos?pagina=1");
			// Create a custom response handler
			ResponseHandler<String> responseHandler = new ResponseHandler<String>() {

				@Override
				public String handleResponse(
						final HttpResponse response) throws ClientProtocolException, IOException {
					
					int status = response.getStatusLine().getStatusCode();
					if (status >= 200 && status < 300) {
						HttpEntity entity = response.getEntity();
						return entity != null ? EntityUtils.toString(entity) : null;
					} else {
						throw new ClientProtocolException("Unexpected response status: " + status);
					}
				}
			};
			String responseBody = httpclient.execute(httpget, responseHandler);
			JSONArray array = new JSONArray(responseBody);  
			for(int i=0; i < array.length(); i++)   
			{  
					JSONObject object = array.getJSONObject(i);
					Alumno alumno= new Alumno(null, null, null, null, null, null, null);
					alumno.setId(object.getString("id"));
					alumno.setNombre(object.getString("nombre"));
					alumno.setApellidos(object.getString("apellidos"));
					alumno.setLegajo(object.getString("legajo"));
					alumno.setApellidos(object.getString("email"));
					alumno.setFechaNacimiento(object.getString("fechaNacimiento"));
					alumno.setPassword(object.getString("password"));
					alumnos.add(alumno);
					
			}  	
		} finally {
			httpclient.close();
		}	
		return alumnos;
	}

}
