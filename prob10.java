//Q11. Sort the array.
import java.util.*;
public class prob10{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no.of elements in the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements of an array :");
        for(int i = 0; i< n ; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        for(int i = 0 ; i<n; i++){
            for(int j  =  i+1; j < n; j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr [j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));


    }
}