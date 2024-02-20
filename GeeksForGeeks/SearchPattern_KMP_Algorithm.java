package GeeksForGeeks;
import java.util.*;
public class SearchPattern_KMP_Algorithm {
		public static void main(String[] args) {
			String txt = "aageeksforgeeks";
	        String pat = "geek";   
	        ArrayList<Integer> as = search(pat,txt);
	        System.out.println(as);
	        char s = '(';
		}
		public static  ArrayList<Integer> search(String pat, String txt)
		    {
		        // your code here
			  ArrayList<Integer> list = new ArrayList<>();

		        int m = pat.length();
		        int n = txt.length();

		        for (int i = 0; i <= n - m; i++) {
		            int j;
//		            System.out.println(i);
		            for (j = 0; j < m; j++) {
//		            	System.out.println(j);
		                if (txt.charAt(i + j) != pat.charAt(j)) {
		                	System.out.println(j);
		                    break;
		                }
		            }
		            System.out.println(j);
		            if (j == m) {
		                list.add(i + 1);
		            }
		        }

		        return list;
		    
		    }
//	public static ArrayList<Integer> search(String pat, String str)
//    {
//        // your code here
//		String txt = str.toLowerCase();
//        String find = pat.toLowerCase();
//        ArrayList<Integer> al = new ArrayList<Integer>();
//        int findIndex = 0;
//
//        
//        for(int i=0 ; i<txt.length();i++) {
//        	if(findIndex == find.length()-1 && find.length() > 1)
//        	{
//        		al.add((i+1)-findIndex);
//        		findIndex = 0;
//        	}
//        	if(findIndex < find.length()) {
//        		if(txt.charAt(i) == find.charAt(findIndex)) {
//        			findIndex++;
//        		}
//        	}
//        	
//        	
//        }
//        
//        return al;
//    }
}
