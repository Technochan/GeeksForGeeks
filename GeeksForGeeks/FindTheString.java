//
//Given two integers N and K, the task is to find the string S of minimum length such that it contains all possible strings of size N as a substring. The characters of the string should be from integers ranging from 0 to K-1.  
//
//Example 1:
//
//Input:
//N = 2, K = 2
//Output: 
//00110
//Explanation: 
//Allowed characters are from 0 to k-1 (i.e., 0 and 1).
//There are 4 string possible of size N=2 
//(i.e "00", "01","10","11")
//"00110" contains all possible string as a 
//substring. It also has the minimum length.
//Example 2:
//
//Input:
//N = 2, K = 3
//Output: 
//0010211220
//Explanation: 
//Allowed characters are from 0 to k-1 (i.e., 0, 1 and 2).
//There are total 9 strings possible
//of size N, given output string has the minimum
//length that contains all those strings as substring.
package GeeksForGeeks;
import java.util.*;
public class FindTheString {
	public static void main(String[] args) {
		int N = 2, K = 2;
		String res= findString(N,K);
		System.out.println(res);
	}
	public static String findString(int n, int k){
        StringBuilder ans = new StringBuilder();
      for(int i = 0; i < n; i++){
          ans.append('0'); // intiate with 0. because minimal n can be 1.
      }
      
      HashMap<String, Integer> map = new HashMap<>();
      map.put(ans.toString(), 1);// 1 is just for maintaing the hashmap requirements.
      
      int cnt = k-1;
      StringBuilder curr = new StringBuilder();
      curr.append(ans);
      
      
      while(true){
         StringBuilder temp = new StringBuilder(curr.substring(1));
         temp.append((char)(cnt + '0'));
        
         if(!map.containsKey(temp.toString())){
             map.put(temp.toString(), 1);
             ans.append((char)(cnt + '0'));
             curr = temp;
             cnt = k-1;
         }else{
             cnt--;
         }
         if(cnt == -1){
             break;
         }
      }
      
      return ans.toString();
	}
}
