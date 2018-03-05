package ks.dto.feed.banks;

import java.util.ArrayList;
import java.util.List;

import ks.types.dataFeed.banks.IRegistro;
import ks.types.dataFeed.banks.IRegistroFinalCuenta;
import ks.types.dataFeed.banks.IRegistroInformacionEquivalencia;
import ks.types.dataFeed.banks.IRegistroPrincipal;

/**
 * Objeto "adicional" para agrupar el conjunto de registros que componen cada
 * uno de los registros
 *
 * @author sorel
 *
 * @param <RP>
 * @param <RRCC>
 * @param <RIE>
 * @param <RFC>
 */
public class Registro<RRPP extends List<IRegistroPrincipal>, RIE extends IRegistroInformacionEquivalencia, RFC extends IRegistroFinalCuenta>
	implements IRegistro<RRPP, RIE, RFC>{

	private RRPP registroPrincipal = (RRPP) new ArrayList<IRegistroPrincipal>();
	private RIE registroInformacionEquivalencia;
	private RFC registroFinalCuenta;

	public RRPP getRegistroPrincipal() {
		return registroPrincipal;
	}

	public RIE getRegistroEquivalencia() {
		return registroInformacionEquivalencia;
	}

	public RFC getRegistrofinalCuenta() {
		return registroFinalCuenta;
	}

	public void addRegistroPrincipal(IRegistroPrincipal rp) {
		registroPrincipal.add(rp);
	}

	public void setRegistroEquivalencia(RIE rie) {
		registroInformacionEquivalencia = rie;
	}

	public void setRegistrofinalCuenta(RFC rfc) {
		registroFinalCuenta = rfc;
	}

	public void setRegistroPrincipal(List<IRegistroPrincipal> registrosPrincipales) {
		registroPrincipal = (RRPP) registrosPrincipales;
	}
}
