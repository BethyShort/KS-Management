package ks;

import java.io.IOException;
import java.util.List;

import org.apache.commons.configuration.ConfigurationException;

import ks.business.feed.bank.builder.CaixaBankNorma43Builder;
import ks.business.feed.bank.builder.SabadellBankNorma43Builder;
import ks.encryption.EncryptDecrypt;
import ks.io.files.csv.ReadExcelFile;
import ks.io.files.text.ReadTextFile;
import ks.types.dataFeed.banks.INorma43;

public class AppStart {

	public static void main(String args[]) {
		Runtime rt = Runtime.getRuntime();
		EncryptDecrypt encriptador = new EncryptDecrypt("F:\\config.properties");

		try {
			String password = encriptador.getEncriptedProperty("file.pass");
			String unidad = encriptador.getProperty("file.unidad");
			String ruta = encriptador.getProperty("file.raiz");
			rt
					.exec("C:/Program Files/TrueCrypt/truecrypt /v F:\\2g /l" + unidad + " /a /p " + password + " /b");

			encriptador.decryptFile();
			ReadExcelFile.getStudentsListFromExcel("Z:\\Karenina&Sorel\\Orense\\datos\\2015\\contabilidad\\2015.xlsm");
			String fichero = "Z:\\Karenina&Sorel\\Orense\\datos\\2015\\contabilidad\\7125_000001360246_07012016.csv";
			fichero="Z:\\Karenina&Sorel\\La Gavia\\datos\\2015\\contabilidad\\TT080116.306";
			List<String> lineas = ReadTextFile.readSmallFileLines(fichero);
			INorma43 movimientos = SabadellBankNorma43Builder.getInstance(lineas).createNorma43();
			movimientos = CaixaBankNorma43Builder.getInstance(lineas).createNorma43();
			System.out.print("el tamaño de la lista es:"+movimientos.getRegistro().getRegistroPrincipal().size());

		} catch (IOException e) {
			e.printStackTrace();
		} catch (ConfigurationException e) {
			e.printStackTrace();
		}

	}

}
