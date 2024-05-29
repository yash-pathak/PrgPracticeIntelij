import java.security.KeyStore;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

// to print element with max frequemcy
public class ElementFrequencyCount {

    public static void main(String[] args){
        int[] arr = {1,1,3,3,3,5};
        List<Map.Entry<Integer, Long>> maxTwoRecord = countFrequency(arr);

      if (maxTwoRecord!=null)
          System.out.println(maxTwoRecord);
      else
          System.out.println("no record");
    }

    private static List<Map.Entry<Integer, Long>> countFrequency(int[] arr) {
        // elemet frequescy
        Map<Integer, Long> mp = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        //System.out.println(mp);

        // geting nth heighest frequency elements
        List<Map.Entry<Integer, Long>> maxEntry = mp.entrySet().stream().sorted(Map.Entry.<Integer,Long>comparingByValue().reversed()).limit(2).collect(Collectors.toList());

        return maxEntry;
    }
}
