package ks.factories.data.feed.banks;

import java.util.List;

import ks.dto.feed.banks.Cabecera;
import ks.dto.feed.banks.Norma43;
import ks.dto.feed.banks.Pie;
import ks.dto.feed.banks.Registro;
import ks.dto.feed.banks.RegistroComplementario;
import ks.dto.feed.banks.RegistroFinalCuenta;
import ks.dto.feed.banks.RegistroInformacionEquivalencia;
import ks.dto.feed.banks.RegistroPrincipal;
import ks.types.dataFeed.banks.ICabecera;
import ks.types.dataFeed.banks.INorma43;
import ks.types.dataFeed.banks.IPie;
import ks.types.dataFeed.banks.IRegistro;
import ks.types.dataFeed.banks.IRegistroComplementario;
import ks.types.dataFeed.banks.IRegistroFinalCuenta;
import ks.types.dataFeed.banks.IRegistroInformacionEquivalencia;
import ks.types.dataFeed.banks.IRegistroPrincipal;
import ks.types.factories.banks.IBanksTypesFactory;

public class CaixaBankTypesFactory implements IBanksTypesFactory {

	public INorma43<ICabecera, IPie, IRegistro<List<IRegistroPrincipal>, IRegistroInformacionEquivalencia, IRegistroFinalCuenta>> createNorma43(
			ICabecera cabecera, IPie pie,
			IRegistro<List<IRegistroPrincipal>, IRegistroInformacionEquivalencia, IRegistroFinalCuenta> registro) {

		INorma43<ICabecera, IPie, IRegistro<List<IRegistroPrincipal>, IRegistroInformacionEquivalencia, IRegistroFinalCuenta>> norma43 = new Norma43<ICabecera, IPie, IRegistro<List<IRegistroPrincipal>, IRegistroInformacionEquivalencia, IRegistroFinalCuenta>>();

		norma43.setCabecera(cabecera);
		norma43.setPie(pie);
		norma43.setRegistro(registro);
		return norma43;
	}

	/**
	 * Se crea la cabecera a partir del registro
	 */
	public ICabecera createCabeceraN43(String valor) {
		// se inicializan las variables
		int offset = 0;
		int siguiente = 0;
		String aux;
		ICabecera cabecera = new Cabecera();

		// CODIGO DE REGISTRO
		siguiente = offset + ICabecera.ICABECERA_CONSTANT_CODIGO_REGISTRO;
		aux = valor.substring(offset, siguiente);
		cabecera.setCodigoRegistro(Byte.parseByte(aux));
		offset = siguiente;

		// CLAVE ENTIDAD
		siguiente += ICabecera.ICABECERA_CONSTANT_CLAVE_ENTIDAD;
		aux = valor.substring(offset, siguiente);
		cabecera.setClaveEntidad(Short.parseShort(aux));
		offset = siguiente;

		// CLAVE OFICINA
		siguiente += ICabecera.ICABECERA_CONSTANT_CLAVE_OFICINA;
		aux = valor.substring(offset, siguiente);
		cabecera.setClaveOficina(Short.parseShort(aux));
		offset = siguiente;

		// NÚMERO DE CUENTA
		siguiente += ICabecera.ICABECERA_CONSTANT_NUMERO_CUENTA;
		aux = valor.substring(offset, siguiente);
		cabecera.setNumeroCuenta(Long.parseLong(aux));
		offset = siguiente;

		// FECHA INICIAL
		siguiente += ICabecera.ICABECERA_CONSTANT_FECHA_INICIAL;
		aux = valor.substring(offset, siguiente);
		cabecera.setFechaInicial(Integer.parseInt(aux));
		offset = siguiente;

		// FECHA FINAL
		siguiente += ICabecera.ICABECERA_CONSTANT_FECHA_FINAL;
		aux = valor.substring(offset, siguiente);
		cabecera.setFechafinal(Integer.parseInt(aux));
		offset = siguiente;

		// CLAVE DEBE O HABER
		siguiente += ICabecera.ICABECERA_CONSTANT_ES_HABER;
		aux = valor.substring(offset, siguiente);
		cabecera.setEsHaber(Byte.parseByte(aux));

		// SALDO INICIAL
		siguiente += ICabecera.ICABECERA_CONSTANT_SALDO_INICIAL;
		aux = valor.substring(offset, siguiente);
		cabecera.setSaldoInicial(Double.parseDouble(aux));
		offset = siguiente;

		// CLAVE DIVISA
		siguiente += ICabecera.ICABECERA_CONSTANT_CLAVE_DIVISA;
		aux = valor.substring(offset, siguiente);
		cabecera.setClaveDivisa(Short.parseShort(aux));
		offset = siguiente;

		// MODALIDAD DE INFORMACIÓN
		siguiente += ICabecera.ICABECERA_CONSTANT_MODALIDAD_INFORMACION;
		aux = valor.substring(offset, siguiente);
		cabecera.setModalidadInformacion(Byte.parseByte(aux));
		offset = siguiente;

		// NOMBRE ABREVIADO
		siguiente += ICabecera.ICABECERA_CONSTANT_NOMBRE_ABREVIADO;
		aux = valor.substring(offset, siguiente);
		cabecera.setNombreAbreviado(aux);
		offset = siguiente;

		return cabecera;
	}

	public IPie createPieN43(String valor) {
		// se inicializan las variables
		int offset = 0;
		int siguiente = 0;
		String aux;
		IPie pie = new Pie();

		// CODIGO DE REGISTRO
		siguiente = offset + ICabecera.ICABECERA_CONSTANT_CODIGO_REGISTRO;
		aux = valor.substring(offset, siguiente);
		pie.setCodigoRegistro(Byte.parseByte(aux));
		offset = siguiente;

		// NUEVES
		siguiente += IPie.IPIE_CONSTANT_NUEVES;
		aux = valor.substring(offset, siguiente);
		pie.setNueves(Long.parseLong(aux));
		offset = siguiente;

		// NUEVES
		siguiente += IPie.IPIE_CONSTANT_NUMERO_REGISTRO;
		aux = valor.substring(offset, siguiente);
		pie.setNumeroRegistros(Long.parseLong(aux));
		offset = siguiente;

		return pie;
	}

	public IRegistro<List<IRegistroPrincipal>, IRegistroInformacionEquivalencia, IRegistroFinalCuenta> createRegistro43(
			List<IRegistroPrincipal> list, IRegistroInformacionEquivalencia rie, IRegistroFinalCuenta rfc) {

		IRegistro<List<IRegistroPrincipal>, IRegistroInformacionEquivalencia, IRegistroFinalCuenta> registro = new Registro<List<IRegistroPrincipal>, IRegistroInformacionEquivalencia, IRegistroFinalCuenta>();
		registro.setRegistroPrincipal(list);
		registro.setRegistrofinalCuenta(rfc);
		registro.setRegistroEquivalencia(rie);
		return registro;
	}

	public IRegistroComplementario createRegistroComplementario43(String valor) {
		// se inicializan las variables
		int offset = 0;
		int siguiente = 0;
		String aux;
		IRegistroComplementario registro = new RegistroComplementario();

		// CODIGO DE REGISTRO
		siguiente += IRegistroComplementario.IREGISTRO_COMPLEMENTARIO_CONSTANT_CODIGO_REGISTRO;
		aux = valor.substring(offset, siguiente);
		registro.setCodigoRegistro(Byte.parseByte(aux));
		offset = siguiente;

		// CODIGO DE REGISTRO
		siguiente += IRegistroComplementario.IREGISTRO_COMPLEMENTARIO_CONSTANT_CODIGO_DATO;
		aux = valor.substring(offset, siguiente);
		registro.setCodigoDato(Byte.parseByte(aux));
		offset = siguiente;

		// CODIGO DE REGISTRO
		siguiente += IRegistroComplementario.IREGISTRO_COMPLEMENTARIO_CONSTANT_CONCEPTO1;
		aux = valor.substring(offset, siguiente);
		registro.setConcepto1(aux);
		offset = siguiente;

		// CODIGO DE REGISTRO
		siguiente += IRegistroComplementario.IREGISTRO_COMPLEMENTARIO_CONSTANT_CONCEPTO2;
		aux = valor.substring(offset, siguiente);
		registro.setConcepto1(aux);
		offset = siguiente;

		return registro;
	}

	public IRegistroFinalCuenta createRegistroFinalCuenta43(String valor) {
		// se inicializan las variables
		int offset = 0;
		int siguiente = 0;
		String aux;
		IRegistroFinalCuenta registro = new RegistroFinalCuenta();

		// CODIGO DE REGISTRO
		siguiente += IRegistroFinalCuenta.IREGISTRO_FINAL_CUENTA_CONSTANT_CODIGO_REGISTRO;
		aux = valor.substring(offset, siguiente);
		registro.setCodigoRegistro(Byte.parseByte(aux));
		offset = siguiente;

		// CLAVE ENTIDAD
		siguiente += IRegistroFinalCuenta.IREGISTRO_FINAL_CUENTA_CONSTANT_CLAVE_ENTIDAD;
		aux = valor.substring(offset, siguiente);
		registro.setClaveEntidad(Short.parseShort(aux));
		offset = siguiente;

		// CLAVE OFICINA
		siguiente += IRegistroFinalCuenta.IREGISTRO_FINAL_CUENTA_CONSTANT_CLAVE_OFICINA;
		aux = valor.substring(offset, siguiente);
		registro.setClaveOficina(Short.parseShort(aux));
		offset = siguiente;

		// NUMERO CUENTA
		siguiente += IRegistroFinalCuenta.IREGISTRO_FINAL_CUENTA_CONSTANT_NUMERO_CUENTA;
		aux = valor.substring(offset, siguiente);
		registro.setNumeroCuenta(Integer.parseInt(aux));
		offset = siguiente;

		// NÚMERO APUNTES DEBE
		siguiente += IRegistroFinalCuenta.IREGISTRO_FINAL_CUENTA_CONSTANT_NUMERO_APUNTES_DEBE;
		aux = valor.substring(offset, siguiente);
		registro.setNumeroApuntesDebe(Short.parseShort(aux));
		offset = siguiente;

		// TOTAL IMPORTES DEBE
		siguiente += IRegistroFinalCuenta.IREGISTRO_FINAL_CUENTA_CONSTANT_TOTAL_IMPORTES_DEBE;
		aux = valor.substring(offset, siguiente);
		registro.setTotalImportesDebe(Integer.parseInt(aux));
		offset = siguiente;

		// NÚMERO APUNTES HABER
		siguiente += IRegistroFinalCuenta.IREGISTRO_FINAL_CUENTA_CONSTANT_NUMERO_APUNTES_HABER;
		aux = valor.substring(offset, siguiente);
		registro.setNumeroApuntesHaber(Short.parseShort(aux));
		offset = siguiente;

		// TOTAL IMPORTES HABER
		siguiente += IRegistroFinalCuenta.IREGISTRO_FINAL_CUENTA_CONSTANT_TOTAL_IMPORTES_HABER;
		aux = valor.substring(offset, siguiente);
		registro.setTotalImportesHaber(Integer.parseInt(aux));
		offset = siguiente;

		// CODIGO SALDO FINAL
		siguiente += IRegistroFinalCuenta.IREGISTRO_FINAL_CUENTA_CONSTANT_CODIGO_SALDO_FINAL;
		aux = valor.substring(offset, siguiente);
		registro.setCodigoSaldoFinal(Byte.parseByte(aux));
		offset = siguiente;

		// SALDO FINAL
		siguiente += IRegistroFinalCuenta.IREGISTRO_FINAL_CUENTA_CONSTANT_SALDO_FINAL;
		aux = valor.substring(offset, siguiente);
		registro.setSaldoFinal(Double.parseDouble(aux));
		offset = siguiente;

		// CLAVE DIVISA
		siguiente += IRegistroFinalCuenta.IREGISTRO_FINAL_CUENTA_CONSTANT_CLAVE_DIVISA;
		aux = valor.substring(offset, siguiente);
		registro.setClaveDivisa(Short.parseShort(aux));
		offset = siguiente;

		return registro;
	}

	public IRegistroInformacionEquivalencia createRegistroInformacionEquivalencia43(String valor) {
		// se inicializan las variables
		int offset = 0;
		int siguiente = 0;
		String aux;
		IRegistroInformacionEquivalencia registro = new RegistroInformacionEquivalencia();

		// CODIGO DE REGISTRO
		siguiente += IRegistroInformacionEquivalencia.IREGISTRO_INFORMACION_EQUIVALENCIA_CONSTANT_CODIGO_REGISTRO;
		aux = valor.substring(offset, siguiente);
		registro.setCodigoRegistro(Byte.parseByte(aux));
		offset = siguiente;

		// CODIGO DATO
		siguiente += IRegistroInformacionEquivalencia.IREGISTRO_INFORMACION_EQUIVALENCIA_CONSTANT_CODIGO_DATO;
		aux = valor.substring(offset, siguiente);
		registro.setCodigoDato(Byte.parseByte(aux));
		offset = siguiente;

		// CLAVE DIVISA
		siguiente += IRegistroInformacionEquivalencia.IREGISTRO_INFORMACION_EQUIVALENCIA_CONSTANT_CLAVE_DIVISA;
		aux = valor.substring(offset, siguiente);
		registro.setClaveDivisa(Short.parseShort(aux));
		offset = siguiente;

		// IMPORTE
		siguiente += IRegistroInformacionEquivalencia.IREGISTRO_INFORMACION_EQUIVALENCIA_CONSTANT_IMPORTE;
		aux = valor.substring(offset, siguiente);
		registro.setImporte(Double.parseDouble(aux));

		return registro;
	}

	public IRegistroPrincipal createRegistroPrincipal43(String valor) {
		// se inicializan las variables
		int offset = 0;
		int siguiente = 0;
		String aux;
		IRegistroPrincipal registroPrincipal = new RegistroPrincipal();

		// CODIGO DE REGISTRO
		siguiente += IRegistroPrincipal.IREGISTRO_PRINCIPAL_CONSTANT_CODIGO_REGISTRO;
		aux = valor.substring(offset, siguiente);
		registroPrincipal.setCodigoRegistro(Byte.parseByte(aux));

		// campo libre, solo se mueve el offset
		siguiente += IRegistroPrincipal.IREGISTRO_PRINCIPAL_CONSTANT_LIBRE;
		offset = siguiente;

		// CÓDIGO OFICINA ORIGEN
		siguiente += IRegistroPrincipal.IREGISTRO_PRINCIPAL_CONSTANT_CODIGO_OFICINA_ORIGEN;
		aux = valor.substring(offset, siguiente);
		registroPrincipal.setCodigoOficinaOrigen(Short.parseShort(aux));
		offset = siguiente;

		// FECHA OPERACION
		siguiente += IRegistroPrincipal.IREGISTRO_PRINCIPAL_CONSTANT_FECHA_OPERACION;
		aux = valor.substring(offset, siguiente);
		registroPrincipal.setFechaOperacion(Integer.parseInt(aux));
		offset = siguiente;

		// FECHA VALOR
		siguiente += IRegistroPrincipal.IREGISTRO_PRINCIPAL_CONSTANT_FECHA_VALOR;
		aux = valor.substring(offset, siguiente);
		registroPrincipal.setFechaValor(Integer.parseInt(aux));
		offset = siguiente;

		// CONCEPTO COMÚN
		siguiente += IRegistroPrincipal.IREGISTRO_PRINCIPAL_CONSTANT_CONCEPTO_COMUN;
		aux = valor.substring(offset, siguiente);
		registroPrincipal.setConceptoComun(Short.parseShort(aux));
		offset = siguiente;

		// CONCEPTO PROPIO
		siguiente += IRegistroPrincipal.IREGISTRO_PRINCIPAL_CONSTANT_CONCEPTO_PROPIO;
		aux = valor.substring(offset, siguiente);
		registroPrincipal.setConceptoPropio(Short.parseShort(aux));
		offset = siguiente;

		// CONCEPTO PROPIO
		siguiente += IRegistroPrincipal.IREGISTRO_PRINCIPAL_CONSTANT_ES_DEBE;
		aux = valor.substring(offset, siguiente);
		registroPrincipal.setClaveDebeHaber(Byte.parseByte(aux));
		offset = siguiente;

		// IMPORTE
		siguiente += IRegistroPrincipal.IREGISTRO_PRINCIPAL_CONSTANT_IMPORTE;
		aux = valor.substring(offset, siguiente);
		registroPrincipal.setImporte(Double.parseDouble(aux));
		offset = siguiente;

		// IMPORTE
		siguiente += IRegistroPrincipal.IREGISTRO_PRINCIPAL_CONSTANT_NUMERO_DOCUMENTO;
		aux = valor.substring(offset, siguiente);
		registroPrincipal.setCodigoDocumento(Long.parseLong(aux));

		// IMPORTE
		siguiente += IRegistroPrincipal.IREGISTRO_PRINCIPAL_CONSTANT_REFERENCIA1;
		registroPrincipal.setReferencia1(valor.substring(offset, siguiente));
		offset = siguiente;

		// IMPORTE
		siguiente += IRegistroPrincipal.IREGISTRO_PRINCIPAL_CONSTANT_REFERENCIA2;
		aux = valor.substring(offset, siguiente);
		registroPrincipal.setReferencia2(aux);

		return registroPrincipal;
	}
}
