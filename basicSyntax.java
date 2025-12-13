public class basicSyntax {
    public static void main(String[] args) {

        // array declaration
        int[] jrr;
        int[] prr = {1,2,3,4,5,6};

        // Getting the length of the array
        int length = prr.length;
         
        int[] arr = new int[5];

        // Setting the first element of the array
        arr[0] = 1;

        // Changing the first element to 20
        arr[0] = 20; 

        // traversing array
        for (int i = 0; i < 5; i++) {
            System.out.print(prr[i] + " ");
        }
    }
}
