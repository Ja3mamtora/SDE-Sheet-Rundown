import java.util.Stack;

public class ValidParanthesis {
     public boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>(); 

        for(int i = 0 ; i < s.length() ; i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                st.push(s.charAt(i));
            }
            else{
                char ch = s.charAt(i);
                if(st.size() <= 0)return false;
                char tp = st.peek();
                st.pop();
                if(tp == '(' && ch == ')' || tp == '{' && ch == '}' || tp == '[' && ch == ']')continue;
                else return false;
            }
        }
        if(st.size() == 0)
        return true;
        else return false;
    }
}
