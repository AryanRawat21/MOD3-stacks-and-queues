import java.io.*;
import java.util.*;

public class NextGreaterElementOnTheRight{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + "\n");
    }
    System.out.println(sb);
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }

    int[] nge = solve(a);
    display(nge);
 }

 public static int[] solve(int[] arr){
   // write your code here
   int[] nge = new int[arr.length];              //next greater element
   
   Stack<Integer> st = new Stack<>();

   st.push(arr[arr.length - 1]);          //last element ke index ko push
    nge[arr.length - 1] = -1;             //no next greater element of last element
   for(int i = arr.length - 2; i>=0; i--){      //ulta loop from 2nd last place
     // -(pop) a(ans) +(push)
    while(st.size() > 0 && arr[i] >= st.peek()){
      st.pop();

    }

    if(st.size() ==0){
      nge[i] = -1;                   //sbko pop krwa diya, cuz biggest element
    } else {
      nge[i] = st.peek();           //stack ke top p koi bada aagaya
    }

    st.push(arr[i]);                //therefore, khud ko push cuz left waalo ka next greater element to the right h
   }
   
   
    return nge;
 }

}