import java.util.Stack;

public class QueueUsingStack {
    Stack<Integer> m = new Stack<>();
    Stack<Integer> t = new Stack<>();

    public void MyQueue() {

    }

    public void push(int x) {
        m.push(x);
    }

    public int pop() {
        if (t.empty()) {
            while (!m.empty()) {
                t.push(m.peek());
                m.pop();
            }
        }
        int x = t.peek();
        t.pop();
        return x;
    }

    public int peek() {
        if (t.empty()) {
            while (!m.empty()) {
                t.push(m.peek());
                m.pop();
            }
        }
        int x = t.peek();
        return x;
    }

    public boolean empty() {
        if (m.empty() && t.empty())
            return true;
        return false;
    }
}
