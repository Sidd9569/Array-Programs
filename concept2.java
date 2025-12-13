/*passing method to array -  here when we change the array the change may not occur after again we call 
 * if we change the name of the array ,the value of array would not be change because it is working on principle called pass by reference 
 * so  both array name would be same and have same value also both have same memory location. so if any change occur it  reflects on both array */

public class concept2{
    public static void main(String [] args){
        int[] x ={10, 20, 30 , 40};
        System.out.println(x[0]);//10
        change(x);
        System.out.println(x[0]);// 90
    }

    public static void change(int[] x){
        x[0]=90;
    }
}