import java.util.Scanner;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class MyAccountTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		MyAccount myAccount = new MyAccount(1122,100000);
		myAccount.setAnnualInterestRate(.045);
		
		try{
            KeyGenerator keygenerator = KeyGenerator.getInstance("DES");
            SecretKey myDesKey = keygenerator.generateKey();

            Cipher desCipher;
            desCipher = Cipher.getInstance("DES");
            
            System.out.println("Enter account balance: ");
    		double accountBalance = input.nextDouble();
    		System.out.println("Enter an amount to withdraw: ");
    		double withdraw = input.nextDouble();
    		System.out.println("Enter an amount to deposit: ");
    		double deposit = input.nextDouble();
    		
    		byte[] text = ("Account balance: " + (accountBalance + deposit - withdraw)).getBytes("UTF8");
    		byte[] text1 = ("Monthly Interest Rate: " + myAccount.getMonthlyInterestRate()).getBytes("UTF8");
    		byte[] text2 = ("Date Craeted: " + myAccount.getDateCreated()).getBytes("UTF8");

            desCipher.init(Cipher.ENCRYPT_MODE, myDesKey);
            byte[] textEncrypted = desCipher.doFinal(text);
            byte[] textEncrypted1 = desCipher.doFinal(text1);
            byte[] textEncrypted2 = desCipher.doFinal(text2);

            String s = new String(textEncrypted);
            String d = new String(textEncrypted1);
            String a = new String(textEncrypted2);
            System.out.println(s + d + a);

            desCipher.init(Cipher.DECRYPT_MODE, myDesKey);
            byte[] textDecrypted = desCipher.doFinal(textEncrypted);
            byte[] textDecrypted1 = desCipher.doFinal(textEncrypted1);
            byte[] textDecrypted2 = desCipher.doFinal(textEncrypted2);

            s = new String(textDecrypted);
            d = new String(textDecrypted1);
            a = new String(textDecrypted2);
            
            System.out.println(s);
            System.out.println(d);
            System.out.println(a);
        }catch(Exception e)
        {
            System.out.println("Exception");
        }
	}
}