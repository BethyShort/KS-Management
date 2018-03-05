package ks.dto.feed.accounting.csv;

import java.util.Date;
import java.util.Hashtable;

import ks.types.dataFeed.accounting.csv.IAccountingCell;
import ks.types.dataFeed.accounting.csv.IAccountingRow;
import ks.types.dataFeed.accounting.csv.IAccountingSheet;

public class AccountingSheet <R extends IAccountingRow<IAccountingCell>, C extends IAccountingCell> implements IAccountingSheet<R, C> {

	private Hashtable<Date , IAccountingRow<IAccountingCell> > rows=new Hashtable<Date , IAccountingRow<IAccountingCell>>();
	
	public IAccountingRow<IAccountingCell> getRow(Date day) {
		return rows.get(day);
	}

	public void addRow(Date day, IAccountingRow<IAccountingCell> row) {
		rows.put(day, row);
	}
}
