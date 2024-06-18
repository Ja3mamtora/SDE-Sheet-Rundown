import java.util.*;

public class SortStack {
    public static void sortStack(Stack<Integer> st) {
		// Write your code here.
		ArrayList<Integer>arr = new ArrayList<>();
		while(!st.empty()) {
			arr.add(st.peek());
			st.pop();
		}
		Collections.sort(arr);
		for(int i = 0 ; i < arr.size() ; i++) {
			st.push(arr.get(i));
		}
	}
}
