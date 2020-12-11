package data;

import java.util.ArrayList;
import java.util.Map;

import model.Inscripcion;

public class InscripcionUOW implements IUnitOfWork<Inscripcion>{
	
	private final Map<String, ArrayList<Inscripcion>> context;
	private final InscripcionMapper inscripcionMapper;
	
	

	public InscripcionUOW(Map<String, ArrayList<Inscripcion>> context, InscripcionMapper inscripcionMapper) {
		super();
		this.context = context;
		this.inscripcionMapper = inscripcionMapper;
	}

	@Override
	public void registerNew(Inscripcion inscripcion) {
		register(inscripcion, "INSERT");
	}

	@Override
	public void registerDirty(Inscripcion inscripcion) {
		register(inscripcion, "MODIFY");
	}

	@Override
	public void registerClean(Inscripcion inscripcion) {
		register(inscripcion, "DELETE");
	}

	@Override
	public void registerDeleted(Inscripcion inscripcion) {
		// TODO Auto-generated method stub
		
	}
	
	private void register(Inscripcion inscripcion, String operacion) {
		ArrayList<Inscripcion> InscripcionesAOperar = context.get(operacion);
		if (InscripcionesAOperar == null) {
			InscripcionesAOperar = new ArrayList<>();
		}
		InscripcionesAOperar.add(inscripcion);
		context.put(operacion, InscripcionesAOperar);
	}
	
	private void commitInsert() {
		ArrayList<Inscripcion> InscripcionesAInsertar = context.get("INSERT");
	    for (Inscripcion inscripcion : InscripcionesAInsertar) {
	    	inscripcionMapper.insert(inscripcion);
	    }
	}	
	
	private void commitModify() {
		ArrayList<Inscripcion> InscripcionesAModificar = context.get("MODIFY");
	    for (Inscripcion inscripcion : InscripcionesAModificar) {
	    	inscripcionMapper.update(inscripcion);
	    }		
	}
	
	private void commitDelete() {
		ArrayList<Inscripcion> InscripcionesAEliminar = context.get("DELETE");
	    for (Inscripcion inscripcion : InscripcionesAEliminar) {
	    	inscripcionMapper.delete(inscripcion);
	    }
	}
	
	@Override
	public void commit() {
	    if (context == null || context.size() == 0) {
	        return;
	      }
	    
	      if (context.containsKey("INSERT")) {
	        commitInsert();
	      }

	      if (context.containsKey("MODIFY")) {
	        commitModify();
	      }
	      if (context.containsKey("DELETE")) {
	        commitDelete();
	      }
		
	}

	@Override
	public void rollback() {
		// TODO Auto-generated method stub
		
	}

} 