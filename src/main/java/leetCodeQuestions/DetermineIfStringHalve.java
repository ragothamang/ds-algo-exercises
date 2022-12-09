package leetCodeQuestions;

public class DetermineIfStringHalve {
	
static String vowels = "aeiouAEIOU";
    
    public static boolean halvesAreAlike(String S) {
        int mid = S.length() / 2, ans = 0;
        for (int i = 0, j = mid; i < mid; i++, j++) {
            if (vowels.indexOf(S.charAt(i)) >= 0) ans++;
            if (vowels.indexOf(S.charAt(j)) >= 0) ans--;
        }
        return ans == 0;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String ip = "textbook";
		String ip = "book";
		boolean result = halvesAreAlike(ip);
		
		System.out.println(result);
		
	}

}
