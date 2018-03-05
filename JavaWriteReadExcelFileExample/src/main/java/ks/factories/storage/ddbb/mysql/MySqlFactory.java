package ks.factories.storage.ddbb.mysql;

import ks.types.factories.storage.ddbb.IDDBBAbstractFactory;
import ks.types.storage.ddbb.IDataAccessObject;
import ks.types.storage.ddbb.IDataSource;

public class MySqlFactory implements IDDBBAbstractFactory{

	public IDataSource createDataSource() {
		return null;
	}

	public IDataAccessObject createDataAccessObject(byte DAOType) {
		return null;
	}

}
