package ks.types.dataFeed.banks;

public interface IPie 
{
	public static final byte IPIE_CONSTANT_CODIGO_REGISTRO			=	2;
	public static final byte IPIE_CONSTANT_NUEVES					=	18;
	public static final byte IPIE_CONSTANT_NUMERO_REGISTRO			=	6;
	
	public byte getCodigoRegistro();
	public long getNueves() ;
	public long getNumeroRegistros() ;
	public long getFiller() ;
	
	public void setCodigoRegistro(byte codigoRegistro) ;
	public void setNueves(long nueves) ;
	public void setNumeroRegistros(long numeroRegistros) ;
	public void setFiller(long filler);
}
