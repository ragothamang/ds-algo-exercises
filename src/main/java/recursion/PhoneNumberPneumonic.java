package recursion;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneNumberPneumonic {

	private static final String[] KEYPAD = {
			"0", "1", "abc", "def", "ghi",
			"jkl", "mno", "pqrs", "tuv", "wxyz"
	};

	private static void phoneNumberMnemonics(
			String phoneNumber, int index, StringBuilder current, ArrayList<String> mnemonics) {
		/**
		 * Base Case.
		 */
		if (index == phoneNumber.length()) {
			mnemonics.add(current.toString());
			return;
		}

		char[] keypadLetters = KEYPAD[phoneNumber.charAt(index) - '0'].toCharArray();
		for (char letter : keypadLetters) {
			// First, we append the
			// current letter
			current.append(letter);

			// Then, we try out all
			// the possibilities
			phoneNumberMnemonics(phoneNumber, index + 1, current, mnemonics);

			// Then, we remove the letter
			current.deleteCharAt(current.length() - 1);
		}
	}


	public static  ArrayList<String> phoneNumberMnemonics(String phoneNumber) {
		// Recursive solution


		ArrayList<String> mnemonics = new ArrayList<>();

		phoneNumberMnemonics(phoneNumber, 0, new StringBuilder(""), mnemonics);
		return mnemonics;

		// Iterative method
		/*		
		HashMap<Integer, String> map  = new HashMap<Integer, String>();

		map.put(0, "0");
		map.put(1, "1");
		map.put(2, "abc");
		map.put(3, "def");
		map.put(4, "ghi");
		map.put(5, "jkl");
		map.put(6, "mno");
		map.put(7, "pqrs");
		map.put(8, "tuv");
		map.put(9, "wxyz");

		ArrayList<String> res = new ArrayList<String>();
		res.add("");
		for(char c : phoneNumber.toCharArray()) {
			System.out.println("c>>  "+ c);
			ArrayList<String> updatedRes = new ArrayList<String>();
			String mapVals = map.get(Character.getNumericValue(c));
			for(char possibleCharacter : mapVals.toCharArray()) {
				System.out.println("possibleChar >> "+ possibleCharacter);
				System.out.println("res size "+ res.size()+"  res>> "+ res );
				for(String previousIterationValue : res) {
					String character = Character.toString(possibleCharacter);
					String updatedValue = previousIterationValue+character;
					updatedRes.add(updatedValue);		
					System.out.println("updatedRes >> "+ updatedRes);
				}				
			}
			res = updatedRes;
		}		
		return res;
		 */
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String ip = "2905";
		System.out.println(ip);
		ArrayList<String> op = phoneNumberMnemonics(ip);
		System.out.println(op);

	}

}
