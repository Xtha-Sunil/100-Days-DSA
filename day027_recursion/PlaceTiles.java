// fill the floor of size row*col with tile of size 1*col


public class PlaceTiles {
		public static int fillFloor(int row, int col){
				if(row == col){
						return 2;
				}
				
				if(row < col){
						return 1;
				}
				
				// fill row wise
				int horizontally = fillFloor(row-1, col);
				
				// fill col wise
				int vertically = fillFloor(row-col, col);
				
				return horizontally + vertically;
		}
		
		public static void main(String[] args) {
				int row = 4, col = 2;
				System.out.println(fillFloor(row, col));
		}
}