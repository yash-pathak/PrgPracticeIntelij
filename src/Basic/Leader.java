package Basic;

import java.util.Stack;

public class Leader {
    public static void main(String[] args) {
        int[] arr= {1,5,2,6,4,9,8};

        Stack<Integer> st= new Stack<>();
        st.push(arr[arr.length-1]);
        for (int i = arr.length-2; i>=0;i--){
            if (st.peek()<arr[i]){
                st.push(arr[i]);
            }
        }
        while (!st.empty()){
            System.out.println(st.pop());
        }
    }
}
