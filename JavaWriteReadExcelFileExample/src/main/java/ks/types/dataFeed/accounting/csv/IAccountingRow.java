package ks.types.dataFeed.accounting.csv;

public interface IAccountingRow <C extends IAccountingCell>{
	
	public void addCellValue(String name, IAccountingCell cell);
	public IAccountingCell getCellValue(String name);
}
