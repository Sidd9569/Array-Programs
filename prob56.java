// Q8. Write a program to print the elements of both the diagonals in a square matrix.
// 1     3
//    5 
// 7     9
public class prob56 {
    public static void main(String[] args) {
        
        int [][] arr = { {1,2,3},{4,5,6},{7,8,9}};
        int m = arr.length;
        int n = arr[0].length;

        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j  < n; j++){
                if((j%2 == 0) && (i%2==0)){
                    System.out.print(arr[i][j] + "      ");
                }

                else if((i%2!= 0) && (j%2 != 0)){
                    System.out.print("   " + arr[i][j]);
                }

            }
            System.out.println();
        }
    }
}
