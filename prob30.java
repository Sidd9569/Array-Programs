// Find the unique number in a given Array where all the elements are being repeated twice with one value being unique.
public class prob30 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 3, 4, 5, 5};
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j] && i != j) {
                    count++;
                }
            }
            if (count == 0) { // found the unique number
                System.out.println("Unique number: " + arr[i]);
                break;
            }
        }
    }
}

