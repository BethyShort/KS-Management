package ks.dto.feed.accounting.csv;

import ks.types.dataFeed.accounting.csv.IAccountingCell;

public class AccountingCell implements IAccountingCell {
	
	String cellStringValue;
	String cellComment;
	double cellDoubleValue;

	public double getDoubleValue() {return cellDoubleValue;}

	public String getStringValue() {return cellStringValue;}

	public void setValue(String value) {cellStringValue=value;}

	public void setValue(double value) {cellDoubleValue=value;}

	public String getComment() {return cellComment;}

	public void addComment(String value) {cellComment=value;}

}
