package ks.types.dataFeed.banks;

/**
 * Interfaz de definición del registro complementario de la norma43
 * @author sorel
 *
 */
public interface IRegistroComplementario {
	
	//definición de las constantes de posición que definen el registro
	public static final byte IREGISTRO_COMPLEMENTARIO_CONSTANT_CODIGO_REGISTRO		=	2;	
	public static final byte IREGISTRO_COMPLEMENTARIO_CONSTANT_CODIGO_DATO			=	2;
	public static final byte IREGISTRO_COMPLEMENTARIO_CONSTANT_CONCEPTO1			=	38;
	public static final byte IREGISTRO_COMPLEMENTARIO_CONSTANT_CONCEPTO2			=	38;
	

	public byte getCodigoRegistro();
	public byte getCodigoDato();
	public String getConcepto1();
	public String getConcepto2();
	
	public void setCodigoRegistro(byte codigoRegistro);
	public void setCodigoDato(byte codigoDato);
	public void setConcepto1(String concepto1);
	public void setConcepto2(String concepto2);
}
