package ks.dto.feed.accounting.csv;

import java.util.Hashtable;

import ks.types.dataFeed.accounting.csv.IAccountingCell;
import ks.types.dataFeed.accounting.csv.IAccountingRow;

public class AccountingRow <C extends IAccountingCell> implements IAccountingRow <C> {

	private Hashtable<String, IAccountingCell> celdas=new Hashtable <String, IAccountingCell>();
	
	public void addCellValue(String name, IAccountingCell cell) {
		celdas.put(name, cell);
	}

	public IAccountingCell getCellValue(String name){
		return celdas.get(name);
	}

}
