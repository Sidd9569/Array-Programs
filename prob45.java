// Write a program to print the multiplication of two matrices given by the user

import java.util.*;
public class prob45{
    public static void main(String [] args){
        int [][] a = {{1,2,1},{2,1,2}};
        int [][] b = {{1,0,1,2},{2,1,0,0},{0,3,1,1}};
        
        if(a[0].length != b.length){
            System.out.println("Multiplication is not possible");
        }

        int [][] c = new int [a.length][b[0].length];

        for(int i = 0 ; i < a.length ; i++){
            for( int j = 0 ; j < c[0].length ; j++){
                for(int k = 0 ; k < b.length; k++){
                    c[i][j] = c[i][j] + a[i][k] * b[k][j];
                }
            }
        }

        for(int [] ele : c){
            for(int x : ele){
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}