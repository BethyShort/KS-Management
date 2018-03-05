package ks.types.dataFeed.banks;

import java.util.List;

public interface INorma43 <
	L extends ICabecera,
	P extends IPie,
	R extends IRegistro <
	List<IRegistroPrincipal>,
	IRegistroInformacionEquivalencia,
	IRegistroFinalCuenta
	>>{

	public static final byte ID_NORMA43_REGISTRO_CABECERA					= 11;
	public static final byte ID_NORMA43_REGISTRO_PRINCIPAL					= 22;
	public static final byte ID_NORMA43_REGISTRO_COMPLEMENTARIO 			= 23;
	public static final byte ID_NORMA43_REGISTRO_INFORMACION_EQUIVALENCIA 	= 24;
	public static final byte ID_NORMA43_REGISTRO_FINAL_CUENTA 				= 33;
	public static final byte ID_NORMA43_REGISTRO_FINAL_FICHERO 				= 88;
	public static final byte ID_NORMA43_CODIGO_REGISTRO						=	2;

	public L getCabecera();
	public P getPie();
	public R getRegistro();

	public void setCabecera(L value);
	public void setPie(P value);
	public void setRegistro(R value);
}
