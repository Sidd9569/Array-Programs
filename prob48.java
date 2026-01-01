// Q13 : Write an efficient algorithm that searches for a value target
// in an m x n integer matrix which has the following properties :
// ● Integers in each row are sorted in ascending from left to right.
// ● Integers in each column are sorted in ascending from top to
// bottom.

import java.util.*;
public class prob48 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int [][] arr = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int target = sc.nextInt();
        int m = arr.length;
        int n = arr[0].length;

        int i = 0 ;
        int j = n-1;
        boolean k = false;

        while(i < m && j >= 0){
            if(arr[i][j] == target){
                k = true;
                System.out.println("Target Find");
                break;
            }

            else if(arr[i][j] > target){
                j--;
            }

            else{
                i++;
            }
        }

        if (k==false){
            System.out.println("Target value not exist in this");
        }
    }
}
