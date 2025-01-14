import java.io.*;
import java.util.*;

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else if (ch == ')') {
                boolean val = handleClosing(st, '(');
                if (val == false) {
                    System.out.println(val);
                    return;
                }
            } else if (ch == '}') {
                boolean val = handleClosing(st, '{');
                if (val == false) {
                    System.out.println(val);
                    return;
                }
            } else if (ch == ']') {
                boolean val = handleClosing(st, '[');
                if (val == false) {
                    System.out.println(val);
                    return;
                }
            }
        }
        if (st.size() == 0) {                       //if stack size is 0 ,at end
            System.out.println(true);
        } else {                                    //if stack size is non zero
            System.out.println(false);
        }
    }

    public static boolean handleClosing(Stack<Character> st, char corresoch) {            // //corresponding opening character
        if (st.size() == 0) {                         //extra closing bracket
            return false;
        } else if (st.peek() != corresoch) {         
            return false;
        } else {
            st.pop();
            return true;
        }
    }
}