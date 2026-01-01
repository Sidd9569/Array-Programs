// Write a program to add two matrices and save the result in one of the given matrices.
// 1 2 3           4 5 8         5 7 11
// 4 5 6     +     0 0 8    =    4 5 14
// 7 8 9           1 2 0         8 10 9
public class prob51 {
    public static void main(String[] args) {
        int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int [][] brr = {{4,5,8},{0,0,8},{1,2,0}};

        int m = arr.length;
        int n = arr[0].length;

        int [][] res = new int [m][n];

        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                res[i][j] = arr[i][j] + brr[i][j];
            }
        }

        for( int [] ele : res){
            for(int x : ele){
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
    
}
