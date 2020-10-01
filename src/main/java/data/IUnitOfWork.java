package data;

import java.util.ArrayList;

import model.Inscripcion;

public interface IUnitOfWork {
	
	public ArrayList<Inscripcion> registerNew(Inscripcion inscripcion);
	public ArrayList<Inscripcion> registerDirty(Inscripcion inscripcion);
	public ArrayList<Inscripcion> registerClean(Inscripcion inscripcion);
	public ArrayList<Inscripcion> registerDeleted(Inscripcion inscripcion);
	public void commit();
	public void rollback();

}
