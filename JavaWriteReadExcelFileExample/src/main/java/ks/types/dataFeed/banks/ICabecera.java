package ks.types.dataFeed.banks;

public interface ICabecera {
	
	public static final byte ICABECERA_CONSTANT_CODIGO_REGISTRO			=	2;	
	public static final byte ICABECERA_CONSTANT_CLAVE_ENTIDAD	 		=	4;
	public static final byte ICABECERA_CONSTANT_CLAVE_OFICINA			=	4;
	public static final byte ICABECERA_CONSTANT_NUMERO_CUENTA	 		=	10;
	public static final byte ICABECERA_CONSTANT_FECHA_INICIAL			=	6;
	public static final byte ICABECERA_CONSTANT_FECHA_FINAL		 		=	6;
	public static final byte ICABECERA_CONSTANT_ES_HABER				=	1;
	public static final byte ICABECERA_CONSTANT_SALDO_INICIAL	 		=	14;
	public static final byte ICABECERA_CONSTANT_CLAVE_DIVISA			=	3;
	public static final byte ICABECERA_CONSTANT_MODALIDAD_INFORMACION 	=	1;
	public static final byte ICABECERA_CONSTANT_NOMBRE_ABREVIADO		=	26;
	
	public byte getCodigoRegistro();	
	public short getClaveEntidad();
	public short getClaveOficina();
	public long getNumeroCuenta();
	public int getFechaInicial();	
	public int getFechafinal();
	public byte getEsHaber();	
	public double getSaldoInicial();	
	public short getClaveDivisa();
	public byte getModalidadInformacion();	
	public String getNombreAbreviado();
	public short getFiller();
	
	public void setCodigoRegistro(byte codigoRegistro);
	public void setClaveEntidad(short claveEntidad);
	public void setClaveOficina(short claveOficina);
	public void setNumeroCuenta(long numeroCuenta);
	public void setFechaInicial(int fechaInicial);
	public void setFechafinal(int fechafinal);
	public void setEsHaber(byte esHaber);
	public void setSaldoInicial(double saldoInicial);
	public void setClaveDivisa(short claveDivisa);
	public void setModalidadInformacion(byte modalidadInformacion);
	public void setNombreAbreviado(String nombreAbreviado);	
	public void setFiller(short filler);
}
