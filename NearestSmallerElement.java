import java.util.*;
public class NearestSmallerElement {
    public ArrayList<Integer> prevSmaller(ArrayList<Integer> A) {
        ArrayList<Integer>arr = new ArrayList<>();
        Stack<Integer>st = new Stack<>();
        
        for(int i = 0 ; i < A.size() ; i++) {
            if(st.empty()){
                arr.add(-1);
            }
            else if(st.size() > 0) {
                while(!st.empty() && st.peek() >= A.get(i))st.pop();
                if(st.empty())arr.add(-1);
                else arr.add(st.peek());
            }
            else{
                if(st.size() > 0) {
                    arr.add(st.peek());
                }
            }
            st.push(A.get(i));
        }
        return arr;
    }
}
