//Q4 : Write a program to add two matrices.
import java.util.*;
public class prob38{
    public static void main(String [] args){
        int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int [][] brr = {{1,3,5},{6,8,9},{4,2,1}};

        int m = arr.length;
        int n = arr[0].length;

        int [][] res = new int[m][n];

        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                res[i][j] = arr[i][j]+brr[i][j];
            }
        }
        
        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}
