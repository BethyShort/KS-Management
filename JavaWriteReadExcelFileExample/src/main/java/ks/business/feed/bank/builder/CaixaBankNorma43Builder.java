package ks.business.feed.bank.builder;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import ks.dto.feed.banks.Norma43;
import ks.dto.feed.banks.Registro;
import ks.factories.data.feed.banks.CaixaBankTypesFactory;
import ks.types.dataFeed.banks.ICabecera;
import ks.types.dataFeed.banks.INorma43;
import ks.types.dataFeed.banks.IPie;
import ks.types.dataFeed.banks.IRegistro;
import ks.types.dataFeed.banks.IRegistroFinalCuenta;
import ks.types.dataFeed.banks.IRegistroInformacionEquivalencia;
import ks.types.dataFeed.banks.IRegistroPrincipal;

public class CaixaBankNorma43Builder {

	private CaixaBankTypesFactory factory = new CaixaBankTypesFactory();
	private static CaixaBankNorma43Builder instance = null;
	private List<String> elementos = null;

	/**
	 * Constructor de clase. Delega la inicialización al método init()
	 *
	 * @param value
	 */
	private CaixaBankNorma43Builder(List<String> value) {
		init(value);
	}

	/**
	 * Constructor de clase. Delega la inicialización al método init()
	 *
	 * @param value
	 */
	private CaixaBankNorma43Builder() {

	}

	/**
	 * Inicializa todos los elementos necesarios para el funcionamiento de la
	 * clase
	 *
	 * @param value
	 */
	private void init(List<String> value) {
		elementos = value;
	}

	/**
	 * Genera y devuelve un elemento INorma43.
	 *
	 * @return
	 */
	public INorma43<ICabecera, IPie, IRegistro<List<IRegistroPrincipal>, IRegistroInformacionEquivalencia, IRegistroFinalCuenta>> createNorma43() {
		return generarElementos();
	}

	public static CaixaBankNorma43Builder getInstance(List<String> value) {
		if (instance == null)
			return new CaixaBankNorma43Builder(value);
		else
			return instance;

	}

	/**
	 * Se recorren la lista de líneas del fichero, se identifica a que
	 * corresponde cada una de ellas y se construye el objeto correspondiente
	 *
	 * @return
	 */
	private INorma43<ICabecera, IPie, IRegistro<List<IRegistroPrincipal>, IRegistroInformacionEquivalencia, IRegistroFinalCuenta>> generarElementos() {
		INorma43<ICabecera, IPie, IRegistro<List<IRegistroPrincipal>, IRegistroInformacionEquivalencia, IRegistroFinalCuenta>> norma43 = new Norma43<ICabecera, IPie, IRegistro<List<IRegistroPrincipal>, IRegistroInformacionEquivalencia, IRegistroFinalCuenta>>();
		IRegistro<List<IRegistroPrincipal>, IRegistroInformacionEquivalencia, IRegistroFinalCuenta> registro = new Registro<List<IRegistroPrincipal>, IRegistroInformacionEquivalencia, IRegistroFinalCuenta>();
		Iterator<String> lineas = elementos.iterator();

		IRegistroPrincipal rPrincipal = null;
		List<IRegistroPrincipal> lrPrincipal = new ArrayList<IRegistroPrincipal>();
		while (lineas.hasNext()) {
			String linea = lineas.next();
			byte id = Byte.parseByte(linea.substring(0, INorma43.ID_NORMA43_CODIGO_REGISTRO));

			switch (id) {
			case INorma43.ID_NORMA43_REGISTRO_CABECERA:
				norma43.setCabecera(factory.createCabeceraN43(linea));
				break;
			case INorma43.ID_NORMA43_REGISTRO_PRINCIPAL:
				if (rPrincipal == null)
					rPrincipal = factory.createRegistroPrincipal43(linea);
				lrPrincipal.add(rPrincipal);
				break;
			case INorma43.ID_NORMA43_REGISTRO_COMPLEMENTARIO:
				rPrincipal.addRComplementarios(factory.createRegistroComplementario43(linea));
				break;
			case INorma43.ID_NORMA43_REGISTRO_INFORMACION_EQUIVALENCIA:
				registro.setRegistroEquivalencia(factory.createRegistroInformacionEquivalencia43(linea));
				break;
			case INorma43.ID_NORMA43_REGISTRO_FINAL_CUENTA:
				registro.setRegistrofinalCuenta(factory.createRegistroFinalCuenta43(linea));
				break;
			case INorma43.ID_NORMA43_REGISTRO_FINAL_FICHERO:
				norma43.setPie(factory.createPieN43(linea));
				break;
			}
		}
		registro.setRegistroPrincipal(lrPrincipal);
		norma43.setRegistro(registro);
		return norma43;
	}
}
