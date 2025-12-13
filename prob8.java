/*Q10 : Rotate the given array ‘a’ by k steps, where k is
non-negative. using an extra array * /

/*i.e, if we have an array as 10,20,30,40,50,60 and we have to rotate this with k as 2 then we have array as 60,50,10,20,30,40 */

import java.util.*;
public class prob8{
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

        int [] brr = new int [n];
        int k = sc.nextInt();

        for(int i = 0; i < k; i++){
            brr[i] = arr[n-k+i];
        }

        System.out.println(Arrays.toString(brr));

        for(int i = 0; i < n-k ; i++){
            brr[k+i]=arr[i];
        }
        System.out.println(Arrays.toString(brr));







    }
}