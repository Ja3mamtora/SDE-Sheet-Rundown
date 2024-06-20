import java.util.*;
public class ReverseWordsInAString {
    public String reverseWords(String s) {
        ArrayList<String> arr = new ArrayList<>();
        for(int i = 0 ; i < s.length() ;) {
            String tmp = "";
            while(i < s.length() && s.charAt(i) != ' ') {
                tmp += s.charAt(i);
                i++;
            }
            if(tmp.length() > 0)
            arr.add(tmp);
            i++;
        }
        Collections.reverse(arr);
        String ans = "";
        for(int i = 0 ; i < arr.size() ; i++) {
            ans += arr.get(i);
            if(i != arr.size()-1)
            ans += " ";
        }
        return ans;
    }
}
