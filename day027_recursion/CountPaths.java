
public class CountPaths {
		public static int countPath(int i, int j, int row, int col){
				if(i == row - 1 && j == col - 1){
						return 1;
				}
				
				// backtracking
				if(i == row || j == col){
						return 0;
				}
				
				// move forward
				int fw = countPath(i, j+1, row, col);
				
				// move down
				int dw = countPath(i+1, j, row, col);
				
				return fw + dw;
		}
		
		public static void main(String[] args) {
				int row = 4, col = 4;
				int paths = countPath(0, 0, row, col);
				
				System.out.println(paths);
		}
}