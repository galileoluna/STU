package data;

import java.util.LinkedList;

import model.Alumno;

public interface IAlumnoMapper {
	public boolean insert(Alumno alumno);
	public boolean update(Alumno alumno);
	public boolean delete(Alumno alumno);
	public boolean getById(Alumno alumno);
	public LinkedList<Alumno> getAll();
	

}
