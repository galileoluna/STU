package model;

public class Inscripcion {
	
	public String id;
	public String alumno;
	public String legajo;
	public String materia;
	public String codigo;
	public String fecha;
	
	public Inscripcion(String id,String alumno,String legajo,String materia,String codigo,String fecha) {
		this.id=id;
		this.alumno=alumno;
		this.legajo=legajo;
		this.materia=materia;
		this.codigo=codigo;
		
		this.fecha=fecha;	
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAlumno() {
		return alumno;
	}

	public void setAlumno(String alumno) {
		this.alumno = alumno;
	}

	public String getLegajo() {
		return legajo;
	}

	public void setLegajo(String legajo) {
		this.legajo = legajo;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	

}
