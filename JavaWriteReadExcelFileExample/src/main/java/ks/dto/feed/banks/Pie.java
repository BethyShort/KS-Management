package ks.dto.feed.banks;

import ks.types.dataFeed.banks.IPie;

public class Pie implements IPie {
	private byte codigoRegistro;	
	private long nueves;
	private long numeroRegistros;
	private long filler;
	
	public byte getCodigoRegistro() {return codigoRegistro;}
	public long getNueves() {return nueves;}
	public long getNumeroRegistros() {return numeroRegistros;}
	public long getFiller() {return filler;}
	
	public void setCodigoRegistro(byte codigoRegistro) {this.codigoRegistro = codigoRegistro;}
	public void setNueves(long nueves) {this.nueves = nueves;}
	public void setNumeroRegistros(long numeroRegistros) {this.numeroRegistros = numeroRegistros;}
	public void setFiller(long filler) {this.filler = filler;}
}
