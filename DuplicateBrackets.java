import java.io.*;
import java.util.*;

public class DuplicateBrackets{

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        Stack<Character> st = new Stack<>();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch == ')'){
                if(st.peek() == '('){           //if we directly get ( in peek, then duplicacy is there 
                    System.out.println(true);
                    return;
                
            } else {
                while(st.peek() != '('){        //while we do not find '(' at pop
                    st.pop();
                }
                st.pop();               //in order to remove the opening bracket also
            }
            } else {
            st.push(ch);                //if opening br, letter,sign then push 
        }
    }

    System.out.println(false);          //duplicacy not found
 }
}