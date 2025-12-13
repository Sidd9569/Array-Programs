// factorial
import java.util.*;
public class prob26{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        int w = 1 ;
        for (int i = n ; i > 0 ; i--){
            w = i*w;  
        }
        System.out.println(w);






    }
}