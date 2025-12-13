import java.util.*;
public class builtInFunction{
    public static void main(String[] args){
        
        int[] arr ={20,10,40,30};
        int n = arr.length;
        int x = 30;
        int y = Math.max(x,arr[1]);// it gives the maximum value .
        System.out.println(y);
        int z = Math.min(x,arr[0]);// it gives the minimum value .
        System.out.println(z);

        Arrays.sort(arr);

        for(int e:arr){
            System.out.print(e +" ");
        }

        //concept of shallow copy.

        /*here new memory is not allocated for brr array they both have same memory allocation in last chapters we have learn about
        passing method to array so here is also same concept that is known as pass by reference so, here we have same array with different
        name , so when we try to change any one in one array it will reflect on another because both are same array  */

        System.out.println();

        int [] brr = arr;
        brr[0]= 50;
        System.out.println(arr[0]);// 50
        System.out.println(Arrays.toString(arr));// 50,20,30,40


        // concept of deep copy

        /*here we allocating new memory allocation to new array so if we change one array it reflect on same array not on the other array  */

        int [] crr = Arrays.copyOf(arr,n);// in brackets (we have array we want to copy,that arrays length)
        crr[0]= 60;
        System.out.println(arr[0]);//50
        System.out.println(Arrays.toString(crr));// 60,20,30,40
        System.out.println(Arrays.toString(arr));// 50,20,30,40

        //another way to copy
        int[] drr = new int [n];

        for(int i = 0 ; i < n; i++){
            drr[i]=arr[i];
        }

        System.out.println(Arrays.toString(drr));// 50,20,30,40


    }
}