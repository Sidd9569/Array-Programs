import java.util.*;
//Q9 :  Write a program to reverse the array without using any 
//extra array

public class prob7{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no.of elements in the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements of an array :");
        for(int i = 0; i< n ; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        
        int i = 0 ;
        int j = n-1;
        while(i<j){
            int temp =arr[i];
            arr[i]=arr[j];
            arr[j]= temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));
    }
}