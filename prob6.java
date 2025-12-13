import java.util.*;

// Q8 : Find the doublet in the Array whose sum is equal to the 
//given value x. (Two Sum)

public class prob6{
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

        System.out.println("enter the target element:");
        int x = sc.nextInt();// target element
        for (int i = 0 ; i<n; i++){
            for(int j = i+1; j < n; j++){
                if(x==(arr[i]+ arr[j])){
                    System.out.println("first index is :" + i + " and  second index is :" + j);
                    break;
                }
            }
        }
    }
}