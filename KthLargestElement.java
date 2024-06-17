import java.util.PriorityQueue;

public class KthLargestElement {
     public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq =new PriorityQueue<>((x, y) -> Integer.compare(y, x));
        for(int i = 0 ; i < nums.length ; i++) {
            pq.add(nums[i]);
        }

        while(k > 1) {
            System.out.println(pq.poll());
            k--;
        }

        return pq.poll();
    }
}
