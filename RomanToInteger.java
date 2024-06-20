import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class RomanToInteger {
    public int romanToInt(String s) {
        Map<Character, int[]> mp = new HashMap<>();
        mp.put('I', new int[] { 1, 1 });
        mp.put('V', new int[] { 5, 2 });
        mp.put('X', new int[] { 10, 3 });
        mp.put('L', new int[] { 50, 4 });
        mp.put('C', new int[] { 100, 5 });
        mp.put('D', new int[] { 500, 6 });
        mp.put('M', new int[] { 1000, 7 });

        int cnt = 0;
        Stack<Character> st = new Stack<>();

        for (int i = s.length() - 1; i >= 0; i--) {
            if (st.empty())
                cnt += mp.get(s.charAt(i))[0];
            else if (mp.get(st.peek())[1] > mp.get(s.charAt(i))[1]) {
                cnt -= mp.get(s.charAt(i))[0];
            } else {
                cnt += mp.get(s.charAt(i))[0];
            }
            st.push(s.charAt(i));
        }
        return cnt;
    }
}
