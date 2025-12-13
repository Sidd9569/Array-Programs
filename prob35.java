// Q1 : Write a program to store roll number and marks
//obtained by 4 students side by side in a matrix.
import java.util.*;
public class prob35{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int [][] data = new int[2][4];
        int m = data.length ;
        int n = data[0].length;
        for(int i = 0 ; i < m; i++){
            for(int j = 0 ; j < n; j++){
                data[i][j] = sc.nextInt();
            }
        }

        for(int [] data1 : data ){
            for(int data2 : data1){
                System.out.print(data2 + " ");
            }
            System.out.println();
        }
    }
}