package ks.dto.feed.banks;

import ks.types.dataFeed.banks.ICabecera;

/**
 * Cabecera según estándar norma 43
 * @author sorel
 *
 */
public class Cabecera implements ICabecera {
	
	private byte codigoRegistro;	
	private short claveEntidad;
	private short claveOficina;
	private long numeroCuenta;
	private int fechaInicial;
	private int fechafinal;
	private byte esHaber;
	private double saldoInicial;
	private short claveDivisa;
	private byte modalidadInformacion;
	private String nombreAbreviado;
	private short filler;
	
	public byte getCodigoRegistro() {return codigoRegistro;}	
	public short getClaveEntidad() {return claveEntidad;}
	public short getClaveOficina() {return claveOficina;}
	public long getNumeroCuenta() {return numeroCuenta;}	
	public int getFechaInicial() {return fechaInicial;}	
	public int getFechafinal() {return fechafinal;}	
	public byte getEsHaber() {return esHaber;}	
	public double getSaldoInicial() {return saldoInicial;}	
	public short getClaveDivisa() {return claveDivisa;}	
	public byte getModalidadInformacion() {return modalidadInformacion;}	
	public String getNombreAbreviado() {return nombreAbreviado;}
	public short getFiller() {return filler;}
	
	public void setCodigoRegistro(byte codigoRegistro) {this.codigoRegistro = codigoRegistro;}
	public void setClaveEntidad(short claveEntidad) {this.claveEntidad = claveEntidad;}
	public void setClaveOficina(short claveOficina) {this.claveOficina = claveOficina;}
	public void setNumeroCuenta(long numeroCuenta) {this.numeroCuenta = numeroCuenta;}
	public void setFechaInicial(int fechaInicial) {this.fechaInicial = fechaInicial;}
	public void setFechafinal(int fechafinal) {this.fechafinal = fechafinal;}
	public void setEsHaber(byte esHaber) {this.esHaber = esHaber;}
	public void setSaldoInicial(double saldoInicial) {this.saldoInicial = saldoInicial;}
	public void setClaveDivisa(short claveDivisa) {this.claveDivisa = claveDivisa;}
	public void setModalidadInformacion(byte modalidadInformacion) {this.modalidadInformacion = modalidadInformacion;}
	public void setNombreAbreviado(String nombreAbreviado) {this.nombreAbreviado = nombreAbreviado;}	
	public void setFiller(short filler) {this.filler = filler;}
}
