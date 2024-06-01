package Basic;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LonelyElement {
    public static void main(String[] args) {
        int[] arr={1,1,2,2,2,3,4,4};
        Map<Integer,Integer> mp= new HashMap<>();
        for(int i = 0; i<=arr.length-1 ; i++){
            if(mp.containsKey(arr[i])){
                mp.put(arr[i], mp.get(arr[i])+1);
            }
            else
                mp.put(arr[i], 1);
        }
        for (Map.Entry<Integer, Integer> entry : mp.entrySet())
	        {
	            if (entry.getValue()==1)
                    System.out.println(entry.getKey());
	        }
    }
}
