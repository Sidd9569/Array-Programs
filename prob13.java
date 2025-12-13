//Q12. Sort the array of 0’s , 1’s and 2’s . (Dutch Flag Algorithm)
import java.util.*;
public class prob13{
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

        int low = 0 ;
        int high = n-1;
        int mid =0 ; 

        while(mid <= high){

            if (arr[mid]==0){
                int temp = arr[mid];
                arr[mid]= arr[low];
                arr[low]= temp;
                low++;
                mid++;
            }

            else if(arr[mid]==1){
                mid++;
            }

            else{
                int temp = arr[mid];
                arr[mid]= arr[high];
                arr[high] = temp;
                high--;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}