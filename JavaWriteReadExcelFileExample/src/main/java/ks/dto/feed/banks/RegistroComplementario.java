package ks.dto.feed.banks;

import ks.types.dataFeed.banks.IRegistroComplementario;

public class RegistroComplementario implements IRegistroComplementario {
	private byte codigoRegistro;	
	private byte codigoDato;
	private String concepto1;
	private String concepto2;
	
	public byte getCodigoRegistro() {return codigoRegistro;}
	public byte getCodigoDato() {return codigoDato;}
	public String getConcepto1() {return concepto1;}
	public String getConcepto2() {return concepto2;}
	
	public void setCodigoRegistro(byte codigoRegistro) {this.codigoRegistro = codigoRegistro;}
	public void setCodigoDato(byte codigoDato) {this.codigoDato = codigoDato;}
	public void setConcepto1(String concepto1) {this.concepto1 = concepto1;}
	public void setConcepto2(String concepto2) {this.concepto2 = concepto2;}
}
