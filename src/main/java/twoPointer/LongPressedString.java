package twoPointer;

public class LongPressedString {
	public static boolean isLongPressedName(String name, String typed) {
		/* My solution Starts*/
		/*
		int firstIndex = 0;
		int movingIndex = 0;
		boolean lPressed = false;		
		for(int i =0; i<name.length();i++) {	
			System.out.println("Name char >  "+ name.charAt(i));
			if(name.charAt(i)==typed.charAt(firstIndex)) {
				while( movingIndex < typed.length() &&  name.charAt(i)==typed.charAt(movingIndex)) {
					System.out.println(" *** "+ typed.charAt(movingIndex));
					if(typed.charAt(firstIndex)==typed.charAt(movingIndex)) {
						movingIndex++;	
					}else {		
						System.out.println("frist MI "+ movingIndex);						
						break;
					}
				}
				firstIndex = movingIndex;
			}else {		
				lPressed = false;
				break;
			}			
		}		
		System.out.println("MI -> "+ movingIndex);
//		System.out.println("l-> "+ longStrIndex);
		if(movingIndex==typed.length()){
			lPressed = true;
		}else{
			lPressed = false;
		}
		return lPressed;
*/		
		/* My solution ends*/
		
		/*Solution 1 - starts*/
		/*
		if(name.length() > typed.length()) return false;
        
        int i =0 , j = 0;
        while(i < name.length() && j < typed.length()){
            if(name.charAt(i) == typed.charAt(j)) {
                i++; j++;
            }else if(i > 0 && name.charAt(i-1) == typed.charAt(j)) j++;
            else{
                return false;
            }
       }
       while(j < typed.length()){
           if(name.charAt(i-1) != typed.charAt(j)) return false;
           j++;
       }
        return i < name.length() ? false : true;
        */
        /*Solution 1 - Ends*/
		
		/*Solution 2 - Starts - Optimal*/
		if (name.charAt(0) != typed.charAt(0)) return false;
        int i = 1;
        int j = 1;
        while (i < typed.length()) {
            if (j < name.length() && typed.charAt(i) == name.charAt(j)) {
                i++;
                j++;
            }
            else if (typed.charAt(i) == name.charAt(j - 1)) i++;
            else return false;
        }
        return j == name.length();
        /*Solution 2 - Ends - Optimal*/
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String name = "saeed";
//		String typed ="ssaaedd";
		String name = "alex";
		String typed = "aaleex";
		boolean temp = isLongPressedName(name, typed);
		System.out.println(temp);
	}

}
