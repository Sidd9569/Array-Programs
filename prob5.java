import java.util.*;
/* Q7 : Find the second largest element in the given Array */

public class prob5{
    public static void main(String [] args){
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

        int y = arr[0];
        
        for (int i=0; i < n; i++){
            if (y < arr[i] && x > y){
                int flag  = arr[i];
                arr[i] = y;
                y = flag;
            }
        }

        System.out.println("second maximum no.: " + y);
    }
}