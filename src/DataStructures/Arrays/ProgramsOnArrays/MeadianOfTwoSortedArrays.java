package DataStructures.Arrays.ProgramsOnArrays;

import java.util.Arrays;

//Given two sorted arrays of size m and n respectively return the  median of the two arrays
public class MeadianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int size = nums1.length+ nums2.length;

        int[] arr = new int[size];

        int i = 0, j = 0, k = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                arr[k] = nums1[i];
                i++;
            } else {
                arr[k] = nums2[j];
                j++;
            }
            k++;
        }

        while (i < nums1.length) {
            arr[k] = nums1[i];
            i++;
            k++;
        }

        while (j < nums2.length) {
            arr[k] = nums2[j];
            j++;
            k++;
        }

        double median;

        if(size%2==0){
            int mid1 = arr[size / 2 - 1];
            int mid2 = arr[size / 2];
            median = (mid1 + mid2) / 2.0;
        }
        else{
            median = 1.0*arr[size/2];
        }
        return median;

    }
}
