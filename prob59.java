// Q10. Write a program to print the matrix in wave form.
// 1 2 3
// 4 5 6
// 7 8 9
public class prob59 {
    public static void main(String[] args) {
        
        int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};

        int m = arr.length;
        int n = arr[0].length;

        for(int j = 0 ; j < n ; j++){
            if(j%2==0){
                int low = 0;
                int high = m-1;
                while(low < high){
                    int temp = arr[low][j];
                    arr[low][j] = arr[high][j];
                    arr[high][j] = temp;
                    low++;
                    high--;
                }
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
