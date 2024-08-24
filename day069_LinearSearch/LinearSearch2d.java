public class LinearSearch2d {
    public static void main(){
        int[][] mat = {{1,2,3}, {9,8,7}};
        int target = 8;

        for (int idx = 0; idx < mat.length; idx++) {
            for(int j=0;j<mat[idx].length; j++){
                if(mat[idx][j] == target){
                    System.out.println(idx+", " + j);
                }
            }            
        }
        
        System.out.println("No element found.");

    }

}
