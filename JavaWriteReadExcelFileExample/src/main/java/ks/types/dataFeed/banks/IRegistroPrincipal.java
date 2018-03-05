package ks.types.dataFeed.banks;

import java.util.List;

/**
 * Interfaz que define el registro principal para la norma43
 * @author sorel
 *
 */
public interface IRegistroPrincipal {
	
	//definición de las constantes de posición que definen el registro
	public static final byte IREGISTRO_PRINCIPAL_CONSTANT_CODIGO_REGISTRO			=	2;	
	public static final byte IREGISTRO_PRINCIPAL_CONSTANT_LIBRE						=	4;	
	public static final byte IREGISTRO_PRINCIPAL_CONSTANT_CODIGO_OFICINA_ORIGEN		=	4;	
	public static final byte IREGISTRO_PRINCIPAL_CONSTANT_FECHA_OPERACION			=	6;	
	public static final byte IREGISTRO_PRINCIPAL_CONSTANT_FECHA_VALOR				=	6;	
	public static final byte IREGISTRO_PRINCIPAL_CONSTANT_CONCEPTO_COMUN			=	2;	
	public static final byte IREGISTRO_PRINCIPAL_CONSTANT_CONCEPTO_PROPIO			=	3;	
	public static final byte IREGISTRO_PRINCIPAL_CONSTANT_ES_DEBE					=	1;	
	public static final byte IREGISTRO_PRINCIPAL_CONSTANT_IMPORTE					=	14;	
	public static final byte IREGISTRO_PRINCIPAL_CONSTANT_NUMERO_DOCUMENTO			=	10;	
	public static final byte IREGISTRO_PRINCIPAL_CONSTANT_REFERENCIA1				=	12;
	public static final byte IREGISTRO_PRINCIPAL_CONSTANT_REFERENCIA2				=	16;	

	//Definición de los métodos de la interfaz
	public byte getCodigoRegistro();
	public short getCodigoOficinaOrigen();
	public short getFiller() ;
	public int getFechaOperacion();
	public int getFechaValor();
	public short getConceptoComun();
	public short getConceptoPropio();
	public byte getClaveDebeHaber();
	public double getImporte();
	public long getCodigoDocumento();
	public String getReferencia1();
	public String getReferencia2();
	public List<IRegistroComplementario> getrComplementarios();
	
	public void addRComplementarios(IRegistroComplementario rComplementarios);
	public void setCodigoRegistro(byte codigoRegistro);
	public void setCodigoOficinaOrigen(short oficinaOrigen);
	public void setFiller(short filler);
	public void setFechaOperacion(int fechaOperacion);
	public void setFechaValor(int fechaValor);
	public void setConceptoComun(short conceptoComun);
	public void setConceptoPropio(short conceptoPropio);
	public void setClaveDebeHaber(byte claveDebeHaber) ;
	public void setImporte(double importe);
	public void setCodigoDocumento(long codigoDocumento);
	public void setReferencia1(String referencia1);
	public void setReferencia2(String referencia2);
}
