package ks.types.dataFeed.accounting.csv;

public interface IAccountingCell {
	
	public double getDoubleValue();
	public String getStringValue();
	
	public void setValue(String value);
	public void setValue(double value);
	
	public String getComment();
	public void addComment(String value);

}
