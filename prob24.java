//Check if the given array is sorted or not
import java.util.*;
public class prob24{
    public static void main(String [] args){
        int [] arr ={10,20,30,40,50,60};
        int n = arr.length;
        
        boolean flag = true;
        for(int i= 0 ; i < n-1 ; i++){
            if(arr[i] > arr[i+1]){
                flag = false ;
            }
            else{
                flag = true;
            }
        }
        if (flag== true){
            System.out.println(" array is sorted ");
        }
        else{
            System.out.println("array is not sorted");
        }
    }
}