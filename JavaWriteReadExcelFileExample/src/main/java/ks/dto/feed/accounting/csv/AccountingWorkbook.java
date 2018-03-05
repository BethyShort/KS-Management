package ks.dto.feed.accounting.csv;

import java.util.Hashtable;

import ks.types.dataFeed.accounting.csv.IAccountingCell;
import ks.types.dataFeed.accounting.csv.IAccountingRow;
import ks.types.dataFeed.accounting.csv.IAccountingSheet;
import ks.types.dataFeed.accounting.csv.IAccountingWorkbook;

public class AccountingWorkbook<S extends IAccountingSheet<IAccountingRow<IAccountingCell>, IAccountingCell>>
		implements IAccountingWorkbook<S> {

	private Hashtable<String, IAccountingSheet<IAccountingRow<IAccountingCell>, IAccountingCell>> sheets = new Hashtable<String, IAccountingSheet<IAccountingRow<IAccountingCell>, IAccountingCell>>();

	public S getSheetByName(String name) {
		return (S) sheets.get(name);
	}

	public void addSheet(String name) {
		IAccountingSheet<IAccountingRow<IAccountingCell>, IAccountingCell> sheet = new AccountingSheet<IAccountingRow<IAccountingCell>, IAccountingCell>();
		sheets.put(name, sheet);
	}

	public void addSheet(String name, S sheet) {
		sheets.put(name, sheet);
	}
}
