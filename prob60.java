import java.util.*;
public class prob60 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] arr = new int[n][n];

        int top = 0 ;
        int bottom = n-1;
        int right = n-1;
        int left  = 0;
        int num = 1;
        

        while(num <= n*n){

            // from left to right at the top
            for(int j = left ; j <= right; j++){
                arr[top][j] = num ;
                num = num + 1;
            }
            top++;

            //from top to bottom
            for(int i = top; i <= bottom; i++){
                arr[i][right] = num;
                num = num + 1;
            }
            right--;

            //from right to left
            for(int j = right; j >=left; j--){
                arr[bottom][j] = num;
                num = num + 1;
            }
            bottom--;

            // from bottom to top
            for(int i = bottom ; i >= top; i--){
                arr[i][left] = num;
                num = num + 1;
            }
            left++;

        }

        for( int [] ele : arr){
            for(int x : ele){
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
