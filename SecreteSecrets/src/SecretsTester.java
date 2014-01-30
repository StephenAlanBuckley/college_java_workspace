/*
 * Stephen Buckley
 * 10/7/09
 * The Impossible Encryptor
 * Which Uses Evil Magic
 * To Complete Its Sinister Plans
 * (SecretsTester phase)
 */

import javax.swing.JOptionPane;


public class SecretsTester
{
	
	
	public static void main(String[] args)
	{
		//window for entering String
		String returnString= "";
		String message =  JOptionPane.showInputDialog("Please enter your message:");
		
		//window for asking to encrypt or decrypt
		String doWhat = JOptionPane.showInputDialog("Encrypt or decrypt?");
		
		if(doWhat.equalsIgnoreCase("encrypt"))// if the user wants to encrypt...
		{
			Secrets test = new Secrets(message);
			
			JOptionPane.showMessageDialog(null, "This is the encrypted message: " + test.encrypt(message));
			
		}else{
			if(doWhat.equalsIgnoreCase("decrypt"));//if the user wants to decrypt...
			{
				Secrets test = new Secrets(message);
				
				returnString = test.decrypt(message);
			
				JOptionPane.showMessageDialog(null, "This is the decrypted message: " + returnString);	
			}
		}
			
			
				
			
	}

}
