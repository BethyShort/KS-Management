package ks.dto.feed.banks;

import ks.types.dataFeed.banks.IRegistroInformacionEquivalencia;

public class RegistroInformacionEquivalencia implements IRegistroInformacionEquivalencia {
	private byte codigoRegistro;	
	private byte codigoDato;
	private short claveDivisa;
	private double importe;
	private long filler;
	
	public byte getCodigoRegistro() {return codigoRegistro;}
	public byte getCodigoDato() {return codigoDato;}
	public short getClaveDivisa() {return claveDivisa;}
	public double getImporte() {return importe;}
	public long getFiller() {return filler;}
	
	public void setCodigoRegistro(byte codigoRegistro) {this.codigoRegistro = codigoRegistro;}
	public void setCodigoDato(byte codigoDato) {this.codigoDato = codigoDato;}
	public void setClaveDivisa(short claveDivisa) {this.claveDivisa = claveDivisa;}
	public void setImporte(double importe) {this.importe = importe;}
	public void setFiller(long filler) {this.filler = filler;}
}
