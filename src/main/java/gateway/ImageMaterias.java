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

import model.Materia;

public class ImageMaterias implements Materias{

	public static ArrayList<Materia> getMaterias() throws IOException {
		ArrayList<Materia> materias = new ArrayList<Materia>();	
		CloseableHttpClient httpclient = HttpClients.createDefault();
		try {
			HttpGet httpget = new HttpGet("https://apiungs.herokuapp.com/getMaterias?pagina=1");
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
					Materia materia = new Materia(null, null, null);
					
					materia.setId(object.getString("id"));
					materia.setNombre(object.getString("nombre"));
					materia.setCodigo(object.getString("codigo"));	
					materias.add(materia);
			}  
		} finally {
			httpclient.close();
		}
		return materias;
	}

}
