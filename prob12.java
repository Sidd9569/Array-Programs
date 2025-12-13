//Q12. Sort the array of 0’s , 1’s and 2’s . (Dutch Flag Algorithm)
import java.util.*;
public class prob12{
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

        int x  = 0 ; // no. of zeroes
        int y = 0 ; // no. of ones 
        int z  = 0 ; // no. of two's

        for(int i = 0 ; i < n ; i++){
            if(arr[i] == 0){
                x++;
            }

            else if(arr[i]==1){
                y++;
            }

            else{
                z++;
            }

        }

        for(int i = 0 ; i < n ; i++){
            
            if(i < x){
                arr[i]= 0 ;
            }

            else if (i < x + y){
                arr[i] = 1 ;
            }

            else{
                arr[i] = 2;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}