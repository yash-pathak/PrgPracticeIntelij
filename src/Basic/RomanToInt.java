package Basic;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {
    public static void main(String[] args) {
        String roman = "MCMXC";
        int result = romanToInt(roman);
        System.out.println(result); // Output: 1990
    }

    public static int romanToInt(String s) {
        Map<Character, Integer> romanToIntMap = new HashMap<>();
        romanToIntMap.put('I', 1);
        romanToIntMap.put('V', 5);
        romanToIntMap.put('X', 10);
        romanToIntMap.put('L', 50);
        romanToIntMap.put('C', 100);
        romanToIntMap.put('D', 500);
        romanToIntMap.put('M', 1000);

        int total = 0;

        for (int i = 0; i < s.length(); i++) {
            int currentVal = romanToIntMap.get(s.charAt(i));

            // If current value is less than next value, subtract it
            if (i + 1 < s.length() && currentVal< romanToIntMap.get(s.charAt(i + 1)) ) {
                total -= currentVal;
            } else {
                total += currentVal;
            }
        }

        return total;
    }
}