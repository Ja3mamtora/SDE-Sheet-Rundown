import java.util.Arrays;
import java.util.Stack;

public class MaxSlidingWindow {
    public static int[] maxMinWindow(int[] a, int n) {
        Stack<Integer> s = new Stack<>();
        int ans[] = new int[n];
        int prev[] = new int[n];
        Arrays.fill(ans, Integer.MIN_VALUE);

        for (int i = 0; i < n; i++) {
            while (!s.isEmpty() && a[s.peek()] > a[i]) {
                int ind = s.pop();
                int len = i - prev[ind] - 1;
                ans[len - 1] = Math.max(ans[len - 1], a[ind]);
            }
            prev[i] = s.size() == 0 ? -1 : s.peek();
            s.push(i);
        }
        while (!s.isEmpty()) {
            int ind = s.pop();
            int len = n - prev[ind] - 1;
            ans[len - 1] = Math.max(ans[len - 1], a[ind]);
        }
        for (int i = n - 2; i >= 0; i--) {
            ans[i] = Math.max(ans[i], ans[i + 1]);
        }
        return ans;
    }
}
