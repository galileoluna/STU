package model;

public class Alumno {
	public int id ;
	public String nombre ;
	public int legajo;
	
	
	public Alumno(int id, String nombre ,int legajo) {
		this.id=id;
		this.legajo=legajo;
		this.nombre=nombre;
	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getLegajo() {
		return legajo;
	}
	public void setLegajo(Integer legajo) {
		this.legajo = legajo;
	}
	
	

	

}
