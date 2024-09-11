package recursionBasic;

public class SkipCharacter {

	static void skip(String p, String up) {
		if(up.isEmpty()) {
			System.out.println(p);
			return;
		}

		char ch = up.charAt(0);

		if( ch == 'a' ) {
			skip(p, up.substring(1));
		}
		else {
			skip(p+ch, up.substring(1));
		}
	}

	static String skip2(String up) {
		if(up.isEmpty()) {
			System.out.println(up);
			return"";
		}

		char ch = up.charAt(0);

		if( ch == 'a' ) {
			return skip2(up.substring(1));
		}
		else {
			return ch +skip2(up.substring(1));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("baccdah  ");
		
		skip("","baccdah");
		
		String re = skip2("baccdah");
		System.out.println(re);
	}

}
