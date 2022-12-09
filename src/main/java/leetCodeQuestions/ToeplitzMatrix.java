package leetCodeQuestions;

public class ToeplitzMatrix {
	public static boolean isToeplitzMatrix(int[][] matrix) {
		
		 for (int i = 0; i < matrix.length - 1; i++) {
	            for (int j = 0; j < matrix[i].length - 1; j++) {
	            	System.out.println(matrix[i ][j ]);
	            	System.out.println(matrix[i + 1][j + 1]);
	                if (matrix[i][j] != matrix[i + 1][j + 1]) return false;
	            }
	        }
	        return true;
		
		/*
		System.out.println("rows >  "+matrix.length);
		System.out.println("cols >  "+matrix[0].length);
		int topRight = matrix[0].length-2;
		int bottomLeft = matrix.length-2;
		boolean rst = false;
		while(bottomLeft>=0 && topRight>=0) {
			System.out.println("topRight      "+ topRight);
			System.out.println("bottomLeft    "+ bottomLeft);
			int j=topRight;
			int comp1 = matrix[0][j];
			
			for(int i=0; i<matrix[0].length-topRight;i++) {				
					System.out.println(matrix[i][j]);
					if(comp1==matrix[i][j]) {
						rst = true;
					}else {
						rst = false;
					}
					j++;				
			}
			int q = bottomLeft;
			int comp2 = matrix[q][0];
			for(int p=0; p<matrix.length-bottomLeft;p++) {				
				System.out.println(matrix[q][p]);
				if(comp2==matrix[q][p]) {
					rst = true;
				}else {
					rst = false;
				}
				q++;				
		}
			
			
			topRight--;
			bottomLeft--;
		}
        return rst==true?true:false;
        */
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[][] ipArray = {{1,2,3,4},{5,1,2,3},{9,5,1,2}};
//		int[][] ipArray = {{1,2},{2,2}};
		int[][] ipArray = {{84,2,3},{84}};
		boolean result = isToeplitzMatrix(ipArray);
System.out.println("final result "+ result);
	}

}
