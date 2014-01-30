/*
 * Stephen Buckley
 * 10/7/09
 * The Impossible Encryptor
 * Which Uses Evil Magic
 * To Complete Its Sinister Plans
 * (Secrets phase)
 */

public class Secrets {
	

	public int key;
	public String result= "";
	
	
	public Secrets(String originaltext)
	{
		key = originaltext.length(); //I talked to Professor Ames about making my key the length of the string put in.
	}
	
	public String encrypt(String clearText)
	{
		int i;
		String encryptedText= "";
		int charun=0;
		
		for(i=0; i<=clearText.length()-1; ++i)
		{
			 charun = clearText.charAt(i);
			 charun = charun + key; 
			 if(charun>126)
			 {
				 charun = charun -95;// it's a wrap!  This won't work if the length of the message goes beyond 95 characters.  But it would be solvable if I just took everything and looped it until it was under 126.  It would just make decrypting it difficult.
			 }
			 encryptedText = encryptedText + (char)charun;
		}
		
		return encryptedText;
	}
	
	public String decrypt(String cipherText)
	{
		int i=0;
		String decodedText = "";
		int charde = 0;
		
		for(i=0; i<=cipherText.length()-1; ++i){
			 charde = cipherText.charAt(i);
			 charde = charde - key; 
			 if(charde<32)
			 {
				 charde = charde +95;
			 }
			 
			 decodedText = decodedText + (char)charde; //In this line I add the encrypted character to the encryptedText String. This doesn't seem to be working.
			 result = decodedText;
		}
		
		return result;
	}

}
