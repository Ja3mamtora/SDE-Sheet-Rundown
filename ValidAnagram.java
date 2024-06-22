import java.util.Arrays;

public class ValidAnagram {
    boolean isAnagram(String s, String t) {
        char ch[] = s.toCharArray();
        char ch1[] = t.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ch1);
        s = ch.toString();
        t = ch1.toString();
        if (s.compareTo(t) == 0)
            return true;
        else
            return false;
    }
}
