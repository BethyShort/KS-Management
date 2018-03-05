package ks.types.dataFeed.banks;

public interface IRegistroInformacionEquivalencia {
	
	//definición de las constantes de posición que definen el registro
	public static final byte IREGISTRO_INFORMACION_EQUIVALENCIA_CONSTANT_CODIGO_REGISTRO	=	2;	
	public static final byte IREGISTRO_INFORMACION_EQUIVALENCIA_CONSTANT_CODIGO_DATO		=	2;	
	public static final byte IREGISTRO_INFORMACION_EQUIVALENCIA_CONSTANT_CLAVE_DIVISA		=	3;	
	public static final byte IREGISTRO_INFORMACION_EQUIVALENCIA_CONSTANT_IMPORTE			=	14;	

	public byte getCodigoRegistro();
	public byte getCodigoDato() ;
	public short getClaveDivisa();
	public double getImporte();
	public long getFiller();
	
	public void setCodigoRegistro(byte codigoRegistro);
	public void setCodigoDato(byte codigoDato);
	public void setClaveDivisa(short claveDivisa);
	public void setImporte(double importe);
	public void setFiller(long filler);
}
