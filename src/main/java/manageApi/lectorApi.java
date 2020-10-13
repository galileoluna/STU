/*
 * ====================================================================
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 * ====================================================================
 *
 * This software consists of voluntary contributions made by many
 * individuals on behalf of the Apache Software Foundation.  For more
 * information on the Apache Software Foundation, please see
 * <http://www.apache.org/>.
 *
 */
package manageApi;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;  
import org.json.JSONArray;

import model.Alumno;
import model.Inscripcion;
import model.Materia;

/**
 * This example demonstrates the use of the {@link ResponseHandler} to simplify
 * the process of processing the HTTP response and releasing associated resources.
 */
public class lectorApi {
	
	
	
	public static ArrayList<Alumno> getAlumnos()  throws Exception{	
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
	
	
	
public static ArrayList<Materia> getMaterias()  throws Exception{
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
	
public static ArrayList<Inscripcion> getInscripciones()  throws Exception{	
	ArrayList<Inscripcion> inscripciones = new ArrayList<Inscripcion>();
	CloseableHttpClient httpclient = HttpClients.createDefault();
	try {
		HttpGet httpget = new HttpGet("https://apiungs.herokuapp.com/getInscripciones?pagina=1");
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
				Inscripcion inscripcion= new Inscripcion(null, null, null, null, null, null);
				inscripcion.setId(object.getString("id"));
				inscripcion.setAlumno(object.getString("alumno"));
				inscripcion.setMateria(object.getString("materia"));
				inscripcion.setLegajo(object.getString("legajo"));
				inscripcion.setCodigo(object.getString("codigo"));
				inscripcion.setFecha(object.getString("fecha"));
				inscripciones.add(inscripcion);
				
		}  
		
					
		
	} finally {
		httpclient.close();
	}	
	return inscripciones;
}
	
	
	public final static void main(String[] args) throws Exception {
		
			System.out.println(getMaterias().size());
			System.out.println(getAlumnos().size());
			System.out.println(getInscripciones().size());
	
	}


}
