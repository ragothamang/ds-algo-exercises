package stringManipulation;

public class CaesarCypherEncryptor {
	
	public static String caesarCypherEncryptor(String str, int key) {
	    // Write your code here.
	    if (str == null || str.length() == 0) return key == 0 ? str : "";

	    key %= 26;
	    System.out.println("key--> "+ key);
	    char[] ch = str.toCharArray();

	    for (int i = 0; i < ch.length; i++) {
	    	System.out.println("(ch[i]) "+ (ch[i]));
	    	int charVal = (ch[i]);
	    	char c = (ch[i]);
	      int newPos = key + (ch[i]);
	      System.out.print("  newPos "+ newPos+ " charVal  "+ charVal +" c  "+ c);
	      ch[i] = newPos > 122 ? (char) ('a' + (newPos % 122) - 1) : (char) (newPos);
	    }

	    return new String(ch);
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = caesarCypherEncryptor("awufqnkqkqoolxzzlzihqfm", 25);
		System.out.println(str);

	}

}
