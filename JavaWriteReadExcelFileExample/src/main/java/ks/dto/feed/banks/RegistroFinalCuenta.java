package ks.dto.feed.banks;

import ks.types.dataFeed.banks.IRegistroFinalCuenta;

public class RegistroFinalCuenta implements IRegistroFinalCuenta{	
	private byte codigoRegistro;	
	private short claveEntidad;
	private short claveOficina;
	private int numeroCuenta;
	private short numeroApuntesDebe;
	private long totalImportesDebe;
	private short numeroApuntesHaber;
	private long totalImportesHaber;
	private byte codigoSaldoFinal;
	private double saldoFinal;
	private short claveDivisa;
	private short libre;
	
	public byte getCodigoRegistro() {return codigoRegistro;}
	public short getClaveEntidad() {return claveEntidad;}
	public short getClaveOficina() {return claveOficina;}
	public int getNumeroCuenta() {return numeroCuenta;}
	public short getNumeroApuntesDebe() {return numeroApuntesDebe;}
	public long getTotalImportesDebe() {return totalImportesDebe;}
	public short getNumeroApuntesHaber() {return numeroApuntesHaber;}
	public long getTotalImportesHaber() {return totalImportesHaber;}
	public byte getCodigoSaldoFinal() {return codigoSaldoFinal;}
	public double getSaldoFinal() {return saldoFinal;}
	public short getClaveDivisa() {return claveDivisa;}
	public short getLibre() {return libre;}
	
	
	public void setCodigoRegistro(byte codigoRegistro) {this.codigoRegistro = codigoRegistro;}
	public void setClaveEntidad(short claveEntidad) {this.claveEntidad = claveEntidad;}
	public void setClaveOficina(short claveOficina) {this.claveOficina = claveOficina;}
	public void setNumeroCuenta(int numeroCuenta) {this.numeroCuenta = numeroCuenta;}
	public void setNumeroApuntesDebe(short numeroApuntesDebe) {this.numeroApuntesDebe = numeroApuntesDebe;}
	public void setTotalImportesDebe(long totalImportesDebe) {this.totalImportesDebe = totalImportesDebe;}
	public void setNumeroApuntesHaber(short numeroApuntesHaber) {this.numeroApuntesHaber = numeroApuntesHaber;}
	public void setTotalImportesHaber(long totalImportesHaber) {this.totalImportesHaber = totalImportesHaber;}
	public void setCodigoSaldoFinal(byte codigoSaldoFinal) {this.codigoSaldoFinal = codigoSaldoFinal;}
	public void setSaldoFinal(double saldoFinal) {this.saldoFinal = saldoFinal;}
	public void setClaveDivisa(short claveDivisa) {this.claveDivisa = claveDivisa;}
	public void setLibre(short libre) {this.libre = libre;}
}
