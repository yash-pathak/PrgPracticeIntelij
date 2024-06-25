import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordFrequency {
    public static void main(String[] args){
        String s = "the The dog is Is IS";

//        List<String> s1= Arrays.stream(s.split(" ")).map(i->i.toLowerCase()).collect(Collectors.toList());
//        Map<String, Long> m1= s1.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//        m1.entrySet().forEach(i-> System.out.println(i.getKey()+" "+i.getValue()));

        Arrays.stream(s.split(" ")).map(i->i.toLowerCase()).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().forEach(i-> System.out.println(i.getKey()+"->"+i.getValue()));




    }
}
