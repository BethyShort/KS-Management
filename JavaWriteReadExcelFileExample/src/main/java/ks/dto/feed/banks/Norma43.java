package ks.dto.feed.banks;

import java.util.List;

import ks.types.dataFeed.banks.ICabecera;
import ks.types.dataFeed.banks.INorma43;
import ks.types.dataFeed.banks.IPie;
import ks.types.dataFeed.banks.IRegistro;
import ks.types.dataFeed.banks.IRegistroFinalCuenta;
import ks.types.dataFeed.banks.IRegistroInformacionEquivalencia;
import ks.types.dataFeed.banks.IRegistroPrincipal;

public class Norma43<
	L extends ICabecera, 
	P extends IPie, 
	R extends IRegistro <
		List<IRegistroPrincipal>, 
		IRegistroInformacionEquivalencia, 
		IRegistroFinalCuenta
		>
	> implements INorma43<L, P, R> {

	private L cabecera;
	private P pie;
	private R registro;
	
	public L getCabecera() {return cabecera;}
	public P getPie() {return pie;}
	public R getRegistro() {return registro;}
	public void setCabecera(L value) {cabecera=value;}
	public void setPie(P value) {pie=value;}
	public void setRegistro(R value) {registro=value;}
}

