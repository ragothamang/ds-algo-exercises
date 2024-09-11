package recursionBasic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//  https://leetcode.com/problems/generate-parentheses/discuss/1945298/Java-BackTracking-with-recursive-tree
//	https://leetcode.com/problems/generate-parentheses/discuss/327106/Easy-to-Understand-with-Diagram

public class ParanthesisValidCombinationBasic {
	public static List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<String>();
        backtrack(list, "", 0, 0, n);
        return list;
    }
    
    public static void backtrack(List<String> list, String str, int open, int close, int max){
    	System.out.println(" open "+open+" close "+close + "-->  "+ str+"  str length " + str.length());
        if(str.length() == max*2){
        	System.out.println(str);
            list.add(str);
            return;
        }
        
        if(open < max)
            backtrack(list, str+"(", open+1, close, max);
        System.out.println(" ------  open "+ open+ " close "+ close );
        if(close < open)
            backtrack(list, str+")", open, close+1, max);
    }

    public static List<String> generateParenthesisIterative(int n) {
        if (n < 0) {
            return new ArrayList<>();
        }

        List<List<String>> lists = new ArrayList<>();
        lists.add(Collections.singletonList(""));

        for (int i = 1; i <= n; i++) {
            List<String> list = new ArrayList<>();
            for (int j = 0; j < i; j++) {
                for (String first : lists.get(j)) {
                    for (String second : lists.get(i - 1 - j)) {
                        StringBuilder sb = new StringBuilder("(");
                        sb.append(first).append(")").append(second);
                        list.add(sb.toString());
                    }
                }
            }
            lists.add(list);
        }

        return lists.get(n);
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> generateParenthesis = generateParenthesis(2);
		System.out.println(generateParenthesis);
		generateParenthesis = generateParenthesisIterative(2);
		System.out.println("*********************************************************");
		System.out.println(generateParenthesis);
	}

}
