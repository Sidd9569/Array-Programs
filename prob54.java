// Q5. Write a program to print the row number having the maximum sum in a given matrix.
// 1 3 5 7
// 3 4 7 8
// 1 4 12 3
public class prob54 {
    public static void main(String[] args) {
        
        int [][] arr = {{1,3,5,7},{3,4,7,8},{1,4,12,3}};
        int m = arr.length;
        int n = arr[0].length;

        
        int row = 0;
        int sum  = 0;

        for(int i = 0 ; i < m ; i++){
            int max = 0; // to reset again with zero
            for(int j = 0 ; j < n; j++){
                max = max + arr[i][j];

            }
            if(sum < max){
                sum = max;
                row = i;
            }


        }
        System.out.println("Row no." +" "+ row + " and" + " The sum is :" + sum);
    }
}
