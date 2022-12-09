package stringManipulation;

public class RunLengthEncodingProgram {
	
	public static String runLengthEncoding(String string) {
	    // Write your code here.
		/* mySolution - partially worked
		System.out.println(string);
		int startWindow = 0;
		int endWindow = 0;
		int strIndex=0;
		StringBuilder sb=new StringBuilder();  
		while(strIndex<string.length()) {
//			System.out.println(string.charAt(strIndex));
			if((string.charAt(startWindow)==string.charAt(endWindow)) && (endWindow-startWindow < 10)) {
				System.out.println(string.charAt(strIndex)+ " -- "+ string.charAt(endWindow));
				endWindow++;
				strIndex++;	
			}else {				
				System.out.println(string.charAt(strIndex-1)+ " occurs "+ ((strIndex-1)-startWindow));
				if(startWindow ==0) {
					sb.append(((strIndex-1)-startWindow));  
					sb.append(string.charAt(strIndex-1));	
				}else {
					sb.append((strIndex-startWindow));  
					sb.append(string.charAt(strIndex-1));
				}
				if(string.charAt(strIndex-1)==string.charAt(strIndex)) {
					startWindow = strIndex-1;;
					endWindow = strIndex;
				}else {
					startWindow = strIndex;
					endWindow = strIndex;	
				}
				
//				System.out.println("win start "+ startWindow +"  "+ "wind end "+ (endWindow));				
			}
//			System.out.println("win start"+ startWindow +"  "+ "wind end "+ (endWindow-1));
		}
		System.out.println("startWin  "+ startWindow+" endWindow "+ endWindow);
		System.out.println(string.charAt(strIndex-1)+ " occurs "+ (strIndex-startWindow));
//		sb.append((strIndex-startWindow));  
		sb.append((strIndex-startWindow));
		sb.append(string.charAt(strIndex-1));
		System.out.println(sb);
	    return sb.toString();
	    */
		
		System.out.println(string);
		int startWindow = 0;
		
		int strIndex=0;
		StringBuilder sb=new StringBuilder();  
		while(strIndex<string.length()) {						
			if((string.charAt(startWindow)==string.charAt(strIndex)) && (strIndex-startWindow < 9)) {
						strIndex++;	
			}else {		
				sb.append((strIndex-startWindow));
				sb.append(string.charAt(startWindow));		
				startWindow = strIndex;
			}
		}
		if(strIndex !=0 ){
			sb.append((strIndex-startWindow));
			sb.append(string.charAt(string.length()-1));
		}

		System.out.println(sb);
		return sb.toString();
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String temp = runLengthEncoding("AAAAAAAAAAAAABBCCCCDD");
//		String temp = runLengthEncoding("AAAAAAAAAAAAABBC1CCCDD");
//		String temp = runLengthEncoding("CCCDD11ww");
	}

}
