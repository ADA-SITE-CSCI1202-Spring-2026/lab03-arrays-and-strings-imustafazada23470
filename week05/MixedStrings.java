
package week05;

public class MixedStrings {

    public static String mix(String sentence) {
        StringBuilder result = new StringBuilder();
        String[] s_array = sentence.split(" ");

        for (int i = 0; i < s_array.length; i++) {

            String word = s_array[i];
            char one = word.charAt(0);
            char three = word.charAt(word.length() - 1);

            String two = word.substring(1, word.length() - 1);

            result.append(three + two + one);

            if (i < s_array.length - 1) {
                result.append(" ");
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {

        String s = "This is PP2 Fall 2021";
        System.out.println(mix(s));
    }
}

