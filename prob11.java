//Q12. Sort the array of 0’s , 1’s and 2’s . (Dutch Flag Algorithm)
import java.util.*;
public class prob11{
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

        int m = 0 ; // as no. of zeroes
        int x= 0 ; // as no. of Ones
        int y = 0 ; // as no. of Two's
         
        for (int i=0; i<n ; i++){
            if (arr[i]==0){
                m++;
            }
            if (arr[i]==1){
                x++;
            }
            if (arr[i]==2){
                y++;
            }
        }

        for (int i = 0 ; i<m ; i++){
            arr[i] = 0 ;
        }

        for (int i = m ; i<m+x ; i++){
            arr[i] = 1 ;
        }

        for (int i = m+x ; i<m+x+y ; i++){
            arr[i] = 2 ;
        }

        System.out.println(Arrays.toString(arr));


  
    }
}