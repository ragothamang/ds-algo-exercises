package leetCodeQuestions;

import java.util.Arrays;

public class WordSearch {
	static boolean[][] visited;
	public static boolean exist(char[][] board, String word) {
		visited = new boolean[board.length][board[0].length];

		for(int i = 0; i < board.length; i++){
			for(int j = 0; j < board[i].length; j++){
				System.out.println("" +  board[i][j] );
				
				if((word.charAt(0) == board[i][j]) && search(board, word, i, j, 0)){
					return true;
				}
			}
		}

		return false;
	}

	private static boolean search(char[][]board, String word, int i, int j, int index){
		System.out.println("i   "+ i +"   j   "+ j + "  index  "+  index);
		if(index == word.length()){
			return true;
		}

		if(i >= board.length || i < 0 || j >= board[i].length || j < 0 || board[i][j] != word.charAt(index) || visited[i][j]){
			System.out.println("i   "+  i+ " j  "+  j);
			
			System.out.println(" return false ");
			return false;
		}

		visited[i][j] = true;
		System.out.println("------");
		if(
				search(board, word, i-1, j, index+1) || 
				search(board, word, i+1, j, index+1) ||
				search(board, word, i, j-1, index+1) || 
				search(board, word, i, j+1, index+1)
			)
		{
			System.out.println(" found word  " );
			return true;
		}
		System.out.println("  **********   ");

		visited[i][j] = false;
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
		boolean op = exist(board, "SEE");
		System.out.println(Arrays.toString(board[0]));
		System.out.println(Arrays.toString(board[1]));
		System.out.println(Arrays.toString(board[2]));
		System.out.println("result  >  "+  op);
		
	}

}
