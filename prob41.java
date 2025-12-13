//Q7 : Write a program to rotate the matrix by 90 degrees
//clockwise.

import java.util.*;
public class prob41{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int [][] arr =  new int [3][3];

        int m = arr.length;
        int n = arr[0].length;
        
        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for( int i = 0 ; i < m ; i++){
            for( int j = 0 ; j < i ;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            } 
        }

        for(int i = 0 ; i < m ; i++){
            int low = 0;
            int high = m-1;
            while(low < high){
                int x = arr[i][low];
                arr[i][low]=arr[i][high];
                arr[i][high] = x;
                low++;
                high--;
            }
        }

        for(int [] ele : arr){
            for(int y : ele){
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }
}