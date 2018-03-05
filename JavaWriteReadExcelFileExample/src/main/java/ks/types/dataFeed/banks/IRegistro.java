package ks.types.dataFeed.banks;

import java.util.List;

public interface IRegistro<RRPP extends List<IRegistroPrincipal>, RIE extends IRegistroInformacionEquivalencia, RFC extends IRegistroFinalCuenta> {

	public RRPP getRegistroPrincipal();

	public RIE getRegistroEquivalencia();

	public RFC getRegistrofinalCuenta();

	public void addRegistroPrincipal(IRegistroPrincipal lRegistrosPrincipales);

	public void setRegistroPrincipal(List<IRegistroPrincipal> registrosPrincipales);

	public void setRegistroEquivalencia(RIE registroInformacionEquivalencia);

	public void setRegistrofinalCuenta(RFC registroFinalCuenta);
}
