import java.util.ArrayDeque;
import java.util.Deque;

public class SlidingWindowMaximum {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int sz = nums.length-k+1;
        int [] ans = new int[sz];

        Deque<Integer> q = new ArrayDeque<>();
        int i = 0 , j = 0 , ind = 0;

        while(j < nums.length) {
            while(q.size() > 0 && q.peekLast() < nums[j])q.pollLast();

            q.addLast(nums[j]);
            if(j-i+1 < k)j++;
            else if(j-i+1 >= k) {
                ans[ind] = q.peek();
                ind++;
                if(q.peek() == nums[i]) {
                    q.poll();
                }
                i++;
                j++;
            }
        }
        return ans;
    }
}
