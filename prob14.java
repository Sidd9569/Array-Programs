import java.util.*;

public class prob14 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no.of elements in the first and second array:");
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];
        int[] brr = new int[m];
        int[] crr = new int[m + n];

        System.out.println("Enter the elements of the first sorted array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        System.out.println("Enter the elements of the second sorted array:");
        for (int j = 0; j < m; j++) {
            brr[j] = sc.nextInt();
        }
        System.out.println(Arrays.toString(brr));

        int x = 0, y = 0, z = 0;

        // Merge process
        while (x < n && y < m) {
            if (arr[x] <= brr[y]) {
                crr[z] = arr[x];
                x++;
                z++;
            } else {
                crr[z] = brr[y];
                y++;
                z++;
            }
        }

        // Copy remaining elements of arr
        while (x < n) {
            crr[z] = arr[x];
            x++;
            z++;
        }

        // Copy remaining elements of brr
        while (y < m) {
            crr[z] = brr[y];
            y++;
            z++;
        }

        System.out.println("Merged Sorted Array: " + Arrays.toString(crr));
    }
}
