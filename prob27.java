//factorial

public class prob27{
    static int fact(int n){
        if (n==0){
            return 1;
        }
        else{
            
            int result = n * fact(n-1);
            System.out.println(n);
            return result;
        }
    }
    public static void main(String [] args){
        int result = fact(5);
        System.out.println("Factorial = " + result);
    }

}