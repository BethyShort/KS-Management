package ks.types.dataFeed.banks;

public interface IRegistroFinalCuenta {
	
	//definición de las constantes de posición que definen el registro
	public static final byte IREGISTRO_FINAL_CUENTA_CONSTANT_CODIGO_REGISTRO		=	2;	
	public static final byte IREGISTRO_FINAL_CUENTA_CONSTANT_CLAVE_ENTIDAD			=	4;	
	public static final byte IREGISTRO_FINAL_CUENTA_CONSTANT_CLAVE_OFICINA			=	4;	
	public static final byte IREGISTRO_FINAL_CUENTA_CONSTANT_NUMERO_CUENTA			=	10;	
	public static final byte IREGISTRO_FINAL_CUENTA_CONSTANT_NUMERO_APUNTES_DEBE	=	5;	
	public static final byte IREGISTRO_FINAL_CUENTA_CONSTANT_TOTAL_IMPORTES_DEBE	=	14;	
	public static final byte IREGISTRO_FINAL_CUENTA_CONSTANT_NUMERO_APUNTES_HABER	=	5;	
	public static final byte IREGISTRO_FINAL_CUENTA_CONSTANT_TOTAL_IMPORTES_HABER	=	14;	
	public static final byte IREGISTRO_FINAL_CUENTA_CONSTANT_CODIGO_SALDO_FINAL		=	1;	
	public static final byte IREGISTRO_FINAL_CUENTA_CONSTANT_SALDO_FINAL			=	14;
	public static final byte IREGISTRO_FINAL_CUENTA_CONSTANT_CLAVE_DIVISA			=	3;

	public byte getCodigoRegistro();
	public short getClaveEntidad() ;
	public short getClaveOficina() ;
	public int getNumeroCuenta() ;
	public short getNumeroApuntesDebe() ;
	public long getTotalImportesDebe() ;
	public short getNumeroApuntesHaber() ;
	public long getTotalImportesHaber() ;
	public byte getCodigoSaldoFinal() ;
	public double getSaldoFinal() ;
	public short getClaveDivisa() ;
	public short getLibre() ;
	
	
	public void setCodigoRegistro(byte codigoRegistro) ;
	public void setClaveEntidad(short claveEntidad) ;
	public void setClaveOficina(short claveOficina) ;
	public void setNumeroCuenta(int numeroCuenta) ;
	public void setNumeroApuntesDebe(short numeroApuntesDebe) ;
	public void setTotalImportesDebe(long totalImportesDebe) ;
	public void setNumeroApuntesHaber(short numeroApuntesHaber) ;
	public void setTotalImportesHaber(long totalImportesHaber) ;
	public void setCodigoSaldoFinal(byte codigoSaldoFinal) ;
	public void setSaldoFinal(double saldoFinal) ;
	public void setClaveDivisa(short claveDivisa) ;
	public void setLibre(short libre) ;

}
