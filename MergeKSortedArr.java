import java.util.ArrayList;
import java.util.PriorityQueue;

public class MergeKSortedArr {
    public static ArrayList<Integer> mergeKSortedArrays(ArrayList<ArrayList<Integer>> karr, int k)
	{
		// Write your code here.
		PriorityQueue<Integer>pq = new PriorityQueue<>();
		for(int i = 0 ; i < k ; i++) {
			ArrayList<Integer>temp = karr.get(i);
			for(int j = 0 ; j < temp.size() ; j++) {
				pq.add(temp.get(j));
			}
		}

		ArrayList<Integer>arr = new ArrayList<>();
		while(!pq.isEmpty()) {
			arr.add(pq.poll());
		}

		return arr;
	}
}
