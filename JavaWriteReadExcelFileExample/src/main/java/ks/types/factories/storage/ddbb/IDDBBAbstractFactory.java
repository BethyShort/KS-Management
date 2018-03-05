package ks.types.factories.storage.ddbb;

import ks.types.storage.ddbb.IDataAccessObject;
import ks.types.storage.ddbb.IDataSource;

public interface IDDBBAbstractFactory {
	public IDataSource createDataSource();
	public IDataAccessObject createDataAccessObject(byte DAOType);
}
