import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
     Queue<Integer>q = new LinkedList<Integer>();
    public void MyStack() {
        
    }
    
    public void push(int x) {
        q.add(x);

        for(int i = 0 ; i < q.size()-1 ; i++) {
            q.add(q.peek());
            q.remove();
        }
    }
    
    public int pop() {
        int t = q.remove();
        return t;
    }
    
    public int top() {
        return q.peek();
    }
    
    public boolean empty() {
        return q.size() == 0;
    }
}
