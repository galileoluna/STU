package model;

import java.util.ArrayList;

public class Materia {
	public String id;
	public String nombre;
	public String codigo;
	public Materia(String id, String nombre,String codigo) {
		this.id=id;
		this.nombre=nombre;
		this.codigo=codigo;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

}
