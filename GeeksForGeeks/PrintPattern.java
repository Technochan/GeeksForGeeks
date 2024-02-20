//Print a sequence of numbers starting with N, 
//without using loop, where replace N with N - 5, 
//until N > 0. After that replace N with N + 5 until N regains its initial value.
//
//Example 1:
//
//Input: 
//N = 16
//Output: 
//16 11 6 1 -4 1 6 11 16
//Explaination: 
//The value decreases until it is greater than 0. 
//After that it increases and stops when it becomes 16 again.


package GeeksForGeeks;
import java.util.*;

public class PrintPattern{
	static int count = 1;
    public static void main(String[] args) {
		
        // code here
    	int N = 16;
        List<Integer> arr=new ArrayList<>();
        boolean left=false;
        arr.add(N);
        if(N>0) {
        	System.out.println("hai");
        	 helper(arr,N-5,N,left);
        }
       
        for(int ele : arr) {
        	System.out.println(ele);
        }
    }
    
    public static void helper(List<Integer> l,int n,int o,boolean bool)
    {
      
        if(n==o)
        {
            l.add(n);
            return;
        }
        
        if(n>0 && bool==false)
        {
//        	  System.out.println(count++ + "hai");
            l.add(n);
            helper(l,n-5,o,bool);
        }
        else
        {
//        	  System.out.println(count++ + "haielse" + n);
            l.add(n);
            helper(l,n+5,o,true);
        }
        
    }
}



