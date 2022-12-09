package leetCodeQuestions;

public class ContactStringArray {

	public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
		StringBuilder sbld1 = new StringBuilder();
		StringBuilder sbld2 = new StringBuilder();
		int word1Index =0;
		int word2Index =0;
		int iteration = 0;
		while(iteration < (word1.length>word2.length?word1.length:word2.length)) {
			if(word1Index< word1.length) {
				sbld1.append(word1[word1Index]);
				word1Index++;
			}
			if(word2Index < word2.length) {
				sbld2.append(word2[word2Index]);
				word2Index++;
			}
			iteration++;
		}
					
		System.out.println(sbld1);
		System.out.println(sbld1);
		return sbld1.toString().equals(sbld2.toString()) ? true : false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] word1 = {"abc", "d", "defg"};
		String[] word2 = {"abcddefg"};
		System.out.println(String.join("",word1).length());
		System.out.println(arrayStringsAreEqual(word1, word2));

	}

}
