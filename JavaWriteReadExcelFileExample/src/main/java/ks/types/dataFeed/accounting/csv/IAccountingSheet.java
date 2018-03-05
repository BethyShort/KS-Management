package ks.types.dataFeed.accounting.csv;

import java.util.Date;

public interface IAccountingSheet <R extends IAccountingRow<IAccountingCell>, C extends IAccountingCell>{
	
	public IAccountingRow<IAccountingCell> getRow(Date day);
	public void addRow(Date day, IAccountingRow<IAccountingCell> row);
}
