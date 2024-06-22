public class CountAndSay {
    String solve(String ans) {
        String temp = "";
        char ch = ans.charAt(0);
        int cnt = 1;

        for (int i = 1; i < ans.length(); i++) {
            if (ans.charAt(i) == ch) {
                cnt++;
            } else {
                temp += cnt;
                temp += ch;
                cnt = 1;
                ch = ans.charAt(i);
            }
        }
        temp += cnt;
        temp += ch;
        return temp;
    }

    public String countAndSay(int n) {
        String ans = "1";

        for (int i = 1; i < n; i++) {
            ans = solve(ans);
        }
        return ans;
    }
}
