import java.util.Arrays;

import Exception.CustomException;
public class ArrayRotation {

    public static void main(String[] args){
        int[] arr ={1,2,3,4,5,6};
        int n =3;
        arrayRotation(n, arr);
        for (int i:arr){
            System.out.println(i);
        }

    }

    private static void arrayRotation(int n, int[] arr) {
        if (arr==null)
            throw new CustomException("empty array");
        for(int i = 0; i<n; i++){
            rotateLeft(arr);
        }
    }

    private static void rotateLeft(int[] arr) {
        int temp=arr[0];
        for (int i=0; i<arr.length-1;i++) {
            arr[i] = arr[i + 1];
        }
       arr[arr.length-1]=temp;
    }
}
