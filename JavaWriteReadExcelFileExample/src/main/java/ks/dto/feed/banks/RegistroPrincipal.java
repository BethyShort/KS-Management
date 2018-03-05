package ks.dto.feed.banks;

import java.util.ArrayList;
import java.util.List;

import ks.types.dataFeed.banks.IRegistroComplementario;
import ks.types.dataFeed.banks.IRegistroPrincipal;

public class RegistroPrincipal implements IRegistroPrincipal {
	
	private List <IRegistroComplementario> rComplementarios=new ArrayList<IRegistroComplementario>();
	private byte codigoRegistro;	
	private short codigoOficinaOrigen;
	private short filler;
	private int fechaOperacion;
	private int fechaValor;
	private short conceptoComun;
	private short conceptoPropio;
	private byte claveDebeHaber;
	private double importe;
	private long codigoDocumento;
	private String referencia1;
	private String referencia2;

	public List<IRegistroComplementario> getrComplementarios() {return rComplementarios;}
	public byte getCodigoRegistro() {return codigoRegistro;}
	public short getCodigoOficinaOrigen() {return codigoOficinaOrigen;}
	public short getFiller() {return filler;}
	public int getFechaOperacion() {return fechaOperacion;}
	public int getFechaValor() {return fechaValor;}
	public short getConceptoComun() {return conceptoComun;}
	public short getConceptoPropio() {return conceptoPropio;}
	public byte getClaveDebeHaber() {return claveDebeHaber;}
	public double getImporte() {return importe;}
	public long getCodigoDocumento() {return codigoDocumento;}
	public String getReferencia1() {return referencia1;}
	public String getReferencia2() {return referencia2;}
	
	public void addRComplementarios(IRegistroComplementario rComplementarios) {this.rComplementarios.add(rComplementarios);}
	public void setCodigoRegistro(byte codigoRegistro) {this.codigoRegistro = codigoRegistro;}
	public void setCodigoOficinaOrigen(short oficinaOrigen) {codigoOficinaOrigen=oficinaOrigen;}
	public void setFiller(short filler) {this.filler = filler;}
	public void setFechaOperacion(int fechaOperacion) {this.fechaOperacion = fechaOperacion;}
	public void setFechaValor(int fechaValor) {this.fechaValor = fechaValor;}
	public void setConceptoComun(short conceptoComun) {this.conceptoComun = conceptoComun;}
	public void setConceptoPropio(short conceptoPropio) {this.conceptoPropio = conceptoPropio;}
	public void setClaveDebeHaber(byte claveDebeHaber) {this.claveDebeHaber = claveDebeHaber;}
	public void setImporte(double importe) {this.importe = importe;}
	public void setCodigoDocumento(long codigoDocumento) {this.codigoDocumento = codigoDocumento;}
	public void setReferencia1(String referencia1) {this.referencia1 = referencia1;}
	public void setReferencia2(String referencia2) {this.referencia2 = referencia2;}	
}
