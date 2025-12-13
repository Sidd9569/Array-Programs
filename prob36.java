//Q2 : Write a JAVA program to find the largest element of a
//given 2D array of integers.

import java.util.*;
public class prob36{
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        int [][] arr = new int [3][4];

        int m = arr.length;
        int n = arr[0].length;

        

        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j <  n ; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int mx = Integer.MIN_VALUE;

        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                mx = Math.max(mx,arr[i][j]);
            }
        }
        System.out.println(mx);
    }
}