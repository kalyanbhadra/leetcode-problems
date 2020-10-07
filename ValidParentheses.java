import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
*/

public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(new ValidParentheses().isValid("{[]}"));
    }

    public boolean isValid(String s) {
        char firstOpen = '('; char firstClose = ')';
        char secondOpen = '{'; char secondClose = '}';
        char thirdOpen = '['; char thirdClose = ']';
        Map<Character,Character> pair = new HashMap<Character,Character>();
        pair.put(firstOpen, firstClose);
        pair.put(secondOpen, secondClose);
        pair.put(thirdOpen, thirdClose);

        char[] ca = s.toCharArray();
            
        Stack<Character> st = new Stack<Character>();
        for(int i = 0; i < ca.length ; i++){
            if(ca[i] == firstOpen || ca[i] == secondOpen || ca[i] == thirdOpen){
                st.push(ca[i]);
            }
            else if(st.empty() && (ca[i] == firstClose || ca[i] == secondClose || ca[i] == thirdClose)){
                return false;
            }
            else {
                if(pair.get(st.peek()) == ca[i]){
                    st.pop();
                }
                else{
                    return false;
                }
            }
        }
        if(st.empty()){
            return true;
        }
        else{
            return false;
        }
    }
}