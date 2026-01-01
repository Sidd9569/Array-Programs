// Q3. Given a matrix ‘A’ of dimension n x m and 2 coordinates (l1, r1) and (l2, r2). Return the sum of the
// rectangle from (l1,r1) to (l2, r2).

import java.util.Scanner;

public class prob52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [][] arr ={{1,2,-3,4},{0,0,-4,2},{1,-1,2,3},{-4,-5,-7,0}};

        int m = arr.length;
        int n = arr[0].length;

        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();

        int value = 0 ;

        for(int i = l1 ; i <= l2 ; i++){
            for(int j =r1; j <= r2; j++){
              value =  value + arr[i][j];
            }
        }
        System.out.println(value);
    }
}
