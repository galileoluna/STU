package data;

import java.util.LinkedList;

import model.Transaccion;


public interface ITransaccionMapper {
	public boolean insert(Transaccion transaccion);
	public boolean update(Transaccion transaccion);
	public boolean delete(Transaccion transaccion);
	public boolean getById(Transaccion transaccion);
	public LinkedList<Transaccion> getAll();

}
