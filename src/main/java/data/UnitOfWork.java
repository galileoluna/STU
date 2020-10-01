package data;

import java.util.ArrayList;

import model.Inscripcion;

public class UnitOfWork implements IUnitOfWork{

	@Override
	public ArrayList<Inscripcion> registerNew(Inscripcion inscripcion) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Inscripcion> registerDirty(Inscripcion inscripcion) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Inscripcion> registerClean(Inscripcion inscripcion) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Inscripcion> registerDeleted(Inscripcion inscripcion) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void commit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void rollback() {
		// TODO Auto-generated method stub
		
	}

}
