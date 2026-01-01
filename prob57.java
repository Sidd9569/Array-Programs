// leetcode 1572
public class prob57 {
    public static void main(String[] args) {
        int [][] arr = { {1,2,3},{4,5,6},{7,8,9}};
        int m = arr.length;
        int n = arr[0].length;
        int sum = 0 ;

        for( int i = 0 ; i < m ; i++){
            sum = sum + arr[i][i];
            if (i != n-1-i){
                sum = sum + arr[i][n-1-i];
            }
        }
        System.out.println(sum);
    }
}
