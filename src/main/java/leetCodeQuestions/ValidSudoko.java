package leetCodeQuestions;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoko {
	 public boolean isValidSudoku(char[][] board) {
	        Set<String> seen = new HashSet<>();
	        for (int row = 0; row < 9; row++) {
	            for (int column = 0; column < 9; column++) {
	                char number = board[row][column];
	                if (number != '.') {
	                    if (!seen.add(number + " in row " + row) ||
	                            !seen.add(number + " in column " + column) ||
	                            !seen.add(number + " in block " + (row / 3) + "," + (column / 3)))
	                        return false;
	                }
	            }
	        }
	        return true;
	    }

	 // another approach 
	 /*
	  
	   public boolean isValidSudoku(char[][] board) {
         for(int i = 0; i<9; i++){
        HashSet<Character> rows = new HashSet<Character>();
        HashSet<Character> columns = new HashSet<Character>();
        HashSet<Character> cube = new HashSet<Character>();
        for (int j = 0; j < 9;j++){
            if(board[i][j]!='.' && !rows.add(board[i][j]))
                return false;
            if(board[j][i]!='.' && !columns.add(board[j][i]))
                return false;
            int RowIndex = 3*(i/3);
            int ColIndex = 3*(i%3);
            if(board[RowIndex + j/3][ColIndex + j%3]!='.' && !cube.add(board[RowIndex + j/3][ColIndex + j%3]))
                return false;
        }
    }
    return true;
    }
	  
	  
	  */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[][] ip ={
					 {'5','3','.','.','7','.','.','.','.'}	
					,{'6','.','.','1','9','5','.','.','.'}
					,{'.','9','8','.','.','.','.','6','.'}
					,{'8','.','.','.','6','.','.','.','3'}
					,{'4','.','.','8','.','3','.','.','1'}
					,{'7','.','.','.','2','.','.','.','6'}
					,{'.','6','.','.','.','.','2','8','.'}
					,{'.','.','.','4','1','9','.','.','5'}
					,{'.','.','.','.','8','.','.','7','9'}};
		

	}

}
