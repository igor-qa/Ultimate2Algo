package codingint;

import org.junit.Test;

import java.util.Stack;

/**
 * Created by borisgurtovyy on 11/6/17.
 */
public class isValidPar {


    @Test
    public void testIsValid() {
        String s = "{(])}";
        System.out.println(isValid(s));

    }

    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<Character>();

        for(char ch : s.toCharArray()){
            switch (ch) {
                case '(':
                    stack.push(')');
                    break;
                case '[':
                    stack.push(']');
                    break;
                case '{':
                    stack.push('}');
                    break;
                default:
                    if(stack.isEmpty() || stack.pop() != ch){
                        return false;
                    }
            }
        }
       return stack.isEmpty();
    }
}
