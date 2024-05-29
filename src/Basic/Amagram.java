package Basic;

import java.util.Arrays;

public class Amagram {
    public static void main(String[] args) {
        String s1="brag";
        String s2="grab";

        if(s1.length()!=s2.length()) {
            System.out.println("not anagram");
        }
        else {
            char[] a1 = s1.toCharArray();
            char[] a2 = s2.toCharArray();
            Arrays.sort(a1);
            Arrays.sort(a2);
            if(Arrays.equals(a1,a2)){
                System.out.println("anagram");
            }
            else
                System.out.println("not");
        }
        }
    }

