// Q3 : Write a program to print sum of all the elements of a
//2D matrix.

import java.util.*;
public class prob37{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [][] arr = new int[3][4];
        int m = arr.length;
        int n = arr[0].length;

        for(int i  = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int sum = 0 ;
        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                sum = sum + arr[i][j];
            }
        }
        System.out.println(sum);
    }
}