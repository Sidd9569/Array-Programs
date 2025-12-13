//Count the number of elements strictly greater than x.
import java.util.*;
public class prob22{
    public static void main(String [] args){
        int [] arr ={10,20,40,50,35};
        int n = arr.length;
        int x = 35;
        int count = 0;
        int i = 0;
        while(i< n){
            if (arr[i] > x){
                count++;
            }
            i++;
        }
        System.out.println(count);
    }
}