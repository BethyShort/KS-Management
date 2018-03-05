package ks.encryption;
 
import java.util.Iterator;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
 
public class EncryptDecrypt {
    private final String propertyFileName;
 
    
    /**
     * En el constructor únicamente se asigna el fichero de propiedades que se va a tratar
	 * 
	 * @param pPropertyFileName fichero de propiedades que contiene las constraseñas
	 */
    public EncryptDecrypt(String pPropertyFileName){
        this.propertyFileName = pPropertyFileName;
    }
    
    public String getEncriptedProperty(String pUserPasswordKey)throws ConfigurationException{
    	encryptPropertyValue(pUserPasswordKey);
    	return decryptPropertyValue(pUserPasswordKey);
    }
    
    public String getProperty(String pUserPasswordKey)throws ConfigurationException{
 
        PropertiesConfiguration config = new PropertiesConfiguration(propertyFileName); 
        return config.getString(pUserPasswordKey);
    }
 
    /**
     * Método que encripta ila password en el fichero de propiedades.
     * Primero comprueba si la password ha sido ya encriptada o no. 
     * Si no lo ha sido, encriptará la password.
     * 
     * @throws ConfigurationException
     */
    private void encryptPropertyValue(String propertyKey) throws ConfigurationException {
        System.out.println("Starting encryption operation");
        System.out.println("Start reading properties file");
 
        //Apache Commons Configuration 
        PropertiesConfiguration config = new PropertiesConfiguration(propertyFileName);
 
        //Retrieve boolean properties value to see if password is already encrypted or not
        String isPropertyEncrypted=propertyKey+"IsEncrypted";
        String isEncrypted = config.getString(isPropertyEncrypted);
 
        if (isEncrypted==null || isEncrypted.equals("false")){ //Check if password is encrypted?
            String tmpPwd = config.getString(propertyKey);
            //System.out.println(tmpPwd); 
            //Encrypt
            StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
            // This is a required password for Jasypt. You will have to use the same password to
            // retrieve decrypted password later. T
            // This password is not the password we are trying to encrypt taken from properties file.
            encryptor.setPassword("portal23369");
            String encryptedPassword = encryptor.encrypt(tmpPwd);
            System.out.println("Encryption done and encrypted password is : " + encryptedPassword ); 
 
            // Overwrite password with encrypted password in the properties file using Apache Commons Cinfiguration library
            config.setProperty(propertyKey, encryptedPassword);
            
            if (isEncrypted==null||isEncrypted.equals("false"))
            	config.setProperty(isPropertyEncrypted,"true");
            // Save the properties file
            config.save();
        }else{
        	 System.out.println("User password is already encrypted.\n ");
        }
    }
 
    private String decryptPropertyValue(String propertyKey) throws ConfigurationException {
    	System.out.println("Starting decryption");
        PropertiesConfiguration config = new PropertiesConfiguration(propertyFileName);
        String encryptedPropertyValue = config.getString(propertyKey);
        //System.out.println(encryptedPropertyValue); 
 
        StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
        encryptor.setPassword("portal23369");
        String decryptedPropertyValue = encryptor.decrypt(encryptedPropertyValue);
        //System.out.println(decryptedPropertyValue); 
 
        return decryptedPropertyValue;
    }
    
    public void decryptFile()throws ConfigurationException{
    	PropertiesConfiguration config = new PropertiesConfiguration(propertyFileName);
    	Iterator<String> propiedades=config.getKeys();
    	while (propiedades.hasNext()){
    		String aux=propiedades.next();
    		String isPropertyEncrypted=aux+"IsEncrypted";
    		String isEncrypted = config.getString(isPropertyEncrypted);
    		if (isEncrypted!=null && isEncrypted.equals("true"))
    		{
                StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
                // This is a required password for Jasypt. You will have to use the same password to
                // retrieve decrypted password later. T
                // This password is not the password we are trying to encrypt taken from properties file.
                encryptor.setPassword("portal23369");
                String encryptedPassword = encryptor.decrypt(config.getString(aux));
                System.out.println("Encryption done and encrypted password is : " + encryptedPassword ); 
     
                // Overwrite password with encrypted password in the properties file using Apache Commons Cinfiguration library
                config.setProperty(aux, encryptedPassword);
                
               	config.setProperty(isPropertyEncrypted,"false");
                // Save the properties file
    		}
    	}
        config.save();	
    }

}
