// Q9. Write a program to rotate the matrix by 90 degrees anti-clockwise.
// 1 2 3               3 6 9
// 4 5 6    ------>    2 5 8    ------> transpose & reverse
// 7 8 9               1 4 7
public class prob58 {
    public static void main(String[] args) {
        int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};

        int m = arr.length;
        int n = arr[0].length;
        
        //transpose
        for(int i = 0 ; i < m ; i++){
            for(int j = i ; j < n ; j++){ // fixed condition required
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        
        
        for( int [] ele : arr){
            for(int x : ele){
                System.out.print(x + " ");
            }
            System.out.println();
        }

        System.out.println();
        
        //Reverse 
        for(int j = 0; j < n ; j++){
            int high = m-1;
            int low = 0;
            while(low<high){
                int temp = arr[low][j];
                arr[low][j] = arr[high][j];
                arr[high][j] = temp;
                low++;
                high--;
            }
        }


        for( int [] ele : arr){
            for(int x : ele){
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
