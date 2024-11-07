package DSA.Easy.Day3;
import java.util.*;

public class ValidParentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Boolean result = checkValidParentheses(s);
        System.out.println(result);
        sc.close();
    }

    public static Boolean checkValidParentheses(String s){
        Stack<Character> stack = new Stack<>();
        char current;
        for(int i=0; i<s.length(); i++){
            current = s.charAt(i);
            if(current == '[' || current == '{' || current == '('){
                stack.push(current);
            }
            else if( current == '}' && !stack.isEmpty() && stack.peek() == '{')
            stack.pop();
            else if( current == ']' && !stack.isEmpty() && stack.peek() == '[')
            stack.pop();
            else if( current == ')' && !stack.isEmpty() && stack.peek() == '(')
            stack.pop();
            else {
                return false;
            }
        }
        return stack.isEmpty();
    }

}
