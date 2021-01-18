package practiceCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Dictionary_Final {

    public static void main(String [] args) {
        ArrayList<String> str_arr = new ArrayList <>();
        str_arr.add("kgkbjjbbgbbjb");
        str_arr.add("bjggjggkjmkmj");
        str_arr.add("bbmmjmb");
        str_arr.add("bbmmjmbddfff");

        Collections.sort(str_arr, (a,b) -> {
            HashMap<Character, Integer> dictionary = new HashMap<>();
            dictionary.put('k', 1);
            dictionary.put('m', 2);
            dictionary.put('g', 3);
            dictionary.put('j', 4);
            dictionary.put('b', 5);

            int lengthOfa = a.length();
            int lengthOfb = b.length();

            int use = lengthOfa - lengthOfb > 0 ? lengthOfb : lengthOfa;

            for (int i = 0; i < use; i++) {
                if (dictionary.get(a.charAt(i)) == dictionary.get(b.charAt(i))) continue;
                else return dictionary.get(a.charAt(i)) - dictionary.get(b.charAt(i));
            }
            return lengthOfa - lengthOfb;
        });

        for (String s : str_arr) {
            System.out.println(s);
        }
    }
}
