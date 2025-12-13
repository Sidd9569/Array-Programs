//Q14.
//You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m 
//and n, representing the number of elements in nums1 and nums2 respectively.
// Merge nums1 and nums2 into a single array sorted in non-decreasing order.
import java.util.*;
public class prob32{
    public static void main(String [] args){
        int [] nums1 ={10,20,30,40,50,60};
        int [] nums2 = {20,40,60,80,100};
        int m = nums1.length;
        int n = nums2.length;
        int [] crr = new int [m+n];

        int i = 0 ;
        int j = 0 ;
        int k = 0 ;

        while(i < m && j < n){
            if (nums1[i] < nums2[j] && nums1[i] != nums2[j]){
                crr[k] = nums1[i];
                i++;
                k++;
            }
            else if (nums1[i]==nums2[j]){
                crr[k] = nums1[i];
                i++;
                k++;
            }
            else{
                crr[k] = nums2[j];
                j++;
                k++;
            }
        }

        while(i < m){
            crr[k] = nums1[i];
            i++;
            k++;
        }

        while(j < n){
            crr[k] = nums2[j];
            j++;
            k++;
        }
        System.out.println(Arrays.toString(crr));
        
    }
}

