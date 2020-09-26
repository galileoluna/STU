package data;

import java.util.ArrayList;
import model.Inscripcion;


public interface IInscripcionMapper {

    Inscripcion find(String id);

    void insert(Inscripcion student) ;

    void update(Inscripcion student) ;

    void delete(Inscripcion student);
    
	public ArrayList<Inscripcion> getAll();

}
