package data;

public interface IUnitOfWork<T> {
	
	public void registerNew(T entity);
	public void registerDirty(T entity);
	public void registerClean(T entity);
	public void registerDeleted(T entity);
	public void commit();
	public void rollback();

}
