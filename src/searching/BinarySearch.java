package searching;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,4,2,3,6,5,8,7,9,10,23,14};
        int element=10;
        elementSearch(arr, element);
    }

    private static void elementSearch(int[] arr, int element) {
        Arrays.sort(arr);

        int low=0;
        int high= arr.length-1;
        int mid= low+(high-low)/2;
        while(element!=mid){
            if(arr[mid]<element)
                low=arr[mid];
                



        }

    }
}
