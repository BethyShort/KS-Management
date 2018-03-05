package ks.types.dataFeed.accounting.csv;

public interface IAccountingWorkbook <S extends IAccountingSheet<IAccountingRow<IAccountingCell>, IAccountingCell>>{

	public S getSheetByName(String name);
	public void addSheet(String name);
}
