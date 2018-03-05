package ks.types.factories.banks;

import java.util.List;

import ks.types.dataFeed.banks.ICabecera;
import ks.types.dataFeed.banks.INorma43;
import ks.types.dataFeed.banks.IPie;
import ks.types.dataFeed.banks.IRegistro;
import ks.types.dataFeed.banks.IRegistroComplementario;
import ks.types.dataFeed.banks.IRegistroFinalCuenta;
import ks.types.dataFeed.banks.IRegistroInformacionEquivalencia;
import ks.types.dataFeed.banks.IRegistroPrincipal;

public interface IBanksTypesFactory {

	INorma43<ICabecera, IPie, IRegistro<
	List<IRegistroPrincipal>,
	IRegistroInformacionEquivalencia,
	IRegistroFinalCuenta
	>> createNorma43(
			ICabecera cabecera, IPie pie, IRegistro<
			List<IRegistroPrincipal>,
			IRegistroInformacionEquivalencia,
			IRegistroFinalCuenta> valor);

	ICabecera createCabeceraN43(String valor);

	IPie createPieN43(String valor);

	IRegistroComplementario createRegistroComplementario43(String valor);
	IRegistroFinalCuenta createRegistroFinalCuenta43(String valor);
	IRegistroInformacionEquivalencia createRegistroInformacionEquivalencia43(String valor);
	IRegistroPrincipal createRegistroPrincipal43(String valor);
}
