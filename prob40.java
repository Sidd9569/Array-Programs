//Q6 : Write a program to change the given matrix with its
//transpose.    ---> This is only possible with square Matrix means using the same matrix.

import java.util.*;
public class prob40{
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        int [][] arr = new int [3][3];
        int m = arr.length;
        int n = arr[0].length;

        for( int i = 0 ; i < m ; i++){
            for( int j = 0 ; j < n ; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for( int [] ele : arr){
            for(int x : ele){
                System.out.print(x + " ");
            }
            System.out.println();
        }

        System.out.println();

        for( int i = 0 ; i < n; i++){
            for( int j = 0 ; j < i ; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i]= temp;
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