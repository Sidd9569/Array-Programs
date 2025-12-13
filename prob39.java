//Q5 : Write a program to print the transpose of the matrix
//entered by the user and store it in a new matrix.
 import java.util.*;
 public class prob39{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int [][] arr = new int[3][4] ;

        int m = arr.length;
        int n = arr[0].length;

        int [][] brr = new int[n][m];

        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i = 0 ; i < n; i++){
            for(int j = 0 ; j < m; j++){
                brr[i][j] = arr[j][i];
            }
        }

        for(int [] ele : brr){
            for(int x : ele){
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
 }