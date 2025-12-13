/*passing integer to method - in output section here we are getting same value even if we change the value . */

public class concept1{
    public static void main(String [] args){
        int x = 5;
        System.out.println(x);// 5
        change(x);
        System.out.println(x);// 5
    }

    public static void change(int x){
        x=10;
    }
}