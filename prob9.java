/*Q10 : Rotate the given array ‘a’ by k steps, where k is
non-negative. without using an extra array * /

/*i.e, if we have an array as 10,20,30,40,50,60 and we have to rotate this with k as 2 then we have array as 60,50,10,20,30,40 */

import java.util.*;
public class prob9{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no.of elements in the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements of an array :");
        for(int i = 0; i< n ; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));// 10,20,30,40,50,60
        
        // now we reverse that array 
        int i = 0;
        int j = n-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp ; 
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));// 60,50,40,30,20,10

        // now reverse those part of an array in which the element which has value  in the range of k 
        int m = 0 ;
        int o = sc.nextInt();
        int y = o % n;
        int k = y-1;
        while(m<k){
            int temp = arr[m];
            arr[m] = arr[k];
            arr[k] = temp ; 
            m++;
            k--;
        }
        System.out.println(Arrays.toString(arr));//50,60,40,30,20,10

        // now reverse the rest of the element of the last 
        int x = o ;
        int z = n-1;
        while(x < z){
            int temp = arr[x];
            arr[x] = arr[z];
            arr[z] = temp;
            x++;
            z--;
        }
        System.out.println(Arrays.toString(arr));// 50,60,10,20,30,40



    }
}