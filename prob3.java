/*Linear search
Q5 : Find the element ‘x’ in the array . Take array
and x as input. */
import java.util.*;
public class prob3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to search for:");
        int x = sc.nextInt();
        boolean found = false;
        for(int i = 0; i<n; i++){
            if (x==arr[i]){
                found = true;
                System.out.println("element is found in the array");
                break;
            }
        }
        if (found == false){
            System.out.println("element is not in the array");
        }
        



    }
    

}