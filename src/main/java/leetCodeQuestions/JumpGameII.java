package leetCodeQuestions;

public class JumpGameII {
	
	public static int jump(int[] nums) {
        if(nums.length == 1){
            return 0;
        }
        int max = 0;
        int curr = 0;
        int count = 0;
        for(int i = 0 ; i < nums.length - 1 ; i++){
        	System.out.println("count -->> "+ count+ " i-->> "+ i +" curr -->>  "+ curr + " max -->> "+ max);
            max = Math.max(max , i + nums[i]);
            if(curr == i){
                curr = max;
                count++;
            }
            if(curr>nums.length-1){
            	System.out.println("curr before exit  -->>  "+  curr);
                return count;
            }
        }
        return count;
    }
	
/*
 	 public int jump(int[] N) {
	        int len = N.length - 1, curr = -1, next = 0, ans = 0;
	        for (int i = 0; next < len; i++) {
	            if (i > curr) {
	                ans++;
	                curr = next;
	            };
	            next = Math.max(next, N[i] + i);
	        };
	        return ans;
	    };

*/	

	public static void main(String[] args) {
		 
		int[] ip = {2,3,1,1,4};
		
			int result = jump(ip);
			System.out.println(result);
		

	}

}
