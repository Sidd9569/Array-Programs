import java.util.*;
 /*Q6 : Find the maximum value out of all the elements in the 
array*/

public class prob4{
    public static void main(String [] args ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int x  = Integer.MIN_VALUE;

        for(int i=0 ; i < n ; i++){
            if (x < arr[i]){
                int temp = arr[i];
                arr[i] = x;
                x = temp;  
            }
        }
        System.out.println("maximum no. is :" + x);
    }
}
