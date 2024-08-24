import java.util.Scanner;

public class ArrayPractice{
    public static void main(String[] args){
        try(Scanner inp = new Scanner(System.in)){
            // 1d array
            int[] roll = new int[10];
            // String[] name= new String[10];

            // populating and printing
            for(int i=0;i<10;i++){
                inp.nextInt();
            }

            for(int r : roll){
                System.out.print(r + ", ");
            }

            // 2d array 
            int[][] mat = {{1,2,3},{4,5,6}, {7,8,9}};

            for(int i=0; i<3; i++){
                for (int j = 0; j < 3; j++) {
                    System.out.print(mat[i][j] + " ");
                }
                System.out.println();
            }


            for(int[] arr : mat){
                for(int num : arr){
                    System.out.print(num + " ");
                }
                System.out.println();
            }
            inp.close();
    }
    }
}
