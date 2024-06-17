import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class MinHeap {
    static int[] minHeap(int n, int[][] q) {
        // Write your code here.
        PriorityQueue<Integer> pq = new PriorityQueue<>();
         List<Integer> al = new ArrayList<Integer>();
        for(int i = 0 ; i < q.length ; i++) {
            if(q[i].length == 2)pq.add(q[i][1]);
            else al.add(pq.poll());
        }
        int[] arr = al.stream().mapToInt(i -> i).toArray();
        return arr;

    }   
}
