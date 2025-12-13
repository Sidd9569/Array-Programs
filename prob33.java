//Count the number of triplets whose sum is equal to the given value x.
import java.util.*;
public class prob33{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 4, 6, 2, 3, 8};
        int n = arr.length;
        int target = sc.nextInt();
        
        int count = 0;

        for(int i = 0 ; i < n ; i++){
            for(int j = i+1 ; j < n ; j++){
                for( int k = i+2 ; k < n ; k++){
                    if(arr[i] + arr[j] + arr[k] == target){
                        System.out.println(arr[i] + "," + arr[j] + "," + arr[k] );
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}