import java.io.*;
import java.util.*;

public class InfixEvaluation{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();

    // code
    Stack<Integer> opnds = new Stack<>();   //operands
    Stack<Character> optors = new Stack<>(); //operator
    for(int i = 0; i < exp.length(); i++){
        char ch = exp.charAt(i);
        
        if(ch == '('){
            optors.push(ch);
        } else if(Character.isDigit(ch)){
            opnds.push(ch - '0');   //char to integer
        } else if(ch == ')'){
            while(optors.peek() != '('){
                char optor = optors.pop();
                int v2 = opnds.pop();
                int v1 = opnds.pop();   //as v1 is pushed earlier and pop later
                
                int opv = operation(v1, v2, optor);    //operation value
                opnds.push(opv);    //push the result in operands
            }
            optors.pop();   //for poping the opening bracket
        } else if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
            //ch is wanting higher priority to solve first
            while(optors.size() > 0 && optors.peek() != '(' && precedence(ch) <= precedence(optors.peek())){  //priority at peek is equal or greater than us
                char optor = optors.pop();
                int v2 = opnds.pop();
                int v1 = opnds.pop();   //as v1 is pushed earlier and pop later
                
                int opv = operation(v1, v2, optor);    //operation value
                opnds.push(opv);    //push the result in operands
            }
            //ch is pushing itself now
            optors.push(ch);    //pushing my own operator 
        }
        
    }
    
     while(optors.size() != 0){
                char optor = optors.pop();
                int v2 = opnds.pop();
                int v1 = opnds.pop();   //as v1 is pushed earlier and pop later
                
                int opv = operation(v1, v2, optor);    //operation value
                opnds.push(opv);    //push the result in operands
            }
            System.out.println(opnds.peek());
 }
 
 public static int precedence(char optor){
     if(optor == '+'){
         return 1;
     }
     else if(optor == '-'){
         return 1;
     }
     else if(optor == '*'){
         return 2;
     }
     else{
         return 2;
     }
 }
 
 public static int operation(int v1, int v2, char optor){
        if(optor == '+'){
         return v1 + v2;
     }
     else if(optor == '-'){
         return v1 - v2;
     }
     else if(optor == '*'){
         return v1 * v2;
     }
     else {
         return v1 / v2;
     }
 }
}