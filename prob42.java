//Q8 : Write a program to print the matrix in wave form.
import java.util.*;
public class prob42{
    public static void main(String [] args){
        int [][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int m = arr.length;
        int n = arr[0].length;

        for(int i = 0 ; i < n ; i++){
            if(i % 2 != 0){
                int low = 0;
                int high = n -1;
                while(low < high){
                    int temp = arr[i][low];
                    arr[i][low] = arr[i][high];
                    arr[i][high] = temp;
                    low++;
                    high--;
                }
            }
        }
        
        for(int ele[] : arr){
            for(int x : ele ){
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}