import java.util.*;

public class Array2d {
	public static void main(String[] args) {
		// memory = (row*column)*dataTypeMemory
		
		//declaration
		// dataType [][] varName = new dataType[row][column]
		// eg:- int coordinate[][] = new int[5][5];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows and columns");
		int row = sc.nextInt();
		int column = sc.nextInt();
		
		int[][] matrix = new int[row][column];
		
		//input: outer loop control row and inner loop for column
		for(int i=0;i<row;i++){
			for(int j=0;j<column; j++){
				matrix[i][j] = sc.nextInt();
			}
		}
		//Display the matrix
		for (int i=0;i<row;i++){
			for(int j=0;j<column;j++){
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
		// search for X and print its location
		System.out.print("Enter what to search : ");
		int x = sc.nextInt();
		
		//linear search
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++){
				if( matrix[i][j] == x){
					System.out.println(x + " found at index " + i + " , " + j);
					break;
				}
			}
		}

	sc.close();
	}
}