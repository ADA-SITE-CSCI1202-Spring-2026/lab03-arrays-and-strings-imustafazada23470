package week05;

import java.util.Arrays;

public class Sorting {
    public static String sort(String s) {
        char[] c_array = s.toCharArray();
        Arrays.sort(c_array);
        return new String(c_array);
    }

    public static void main(String[] args) {
        String s1 = "country";
        System.out.println(sort(s1));
    }
    
}

