import java.io.*;
import java.util.*;

public class rough{

//     public static void main(String args[]){
//     Stack<Integer> st = new Stack<>();

//     st.push(10);
//     System.out.println(st + "->" + st.peek() + " " + st.size());
//     st.push(20);
//     System.out.println(st + "->" + st.peek() + " " + st.size());
//     st.push(30);
//     System.out.println(st + "->" + st.peek() + " " + st.size());
//     st.push(40);
//     System.out.println(st + "->" + st.peek() + " " + st.size());
//     st.pop();
//     System.out.println(st + "->" + st.peek() + " " + st.size());
//     st.pop();
//     System.out.println(st + "->" + st.peek() + " " + st.size());
//     st.pop();
//     System.out.println(st + "->" + st.peek() + " " + st.size());
//     }
// }



public static void main(String[] args) {
    Queue<Integer> que = new ArrayDeque<>();

    que.add(10);
    System.out.println(que);
    que.add(20);
    System.out.println(que);
    que.add(30);
    System.out.println(que);

    System.out.println(que.peek());
    System.out.println(que);

    System.out.println(que.remove());
    System.out.println(que);
}
}    