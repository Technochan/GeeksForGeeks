//Given a string S consisting of the characters 0, 1 and 2. Your task is to find the length of the smallest substring of string S that contains all the three characters 0, 1 and 2. If no such substring exists, then return -1.
//
//Example 1:
//
//Input:
//S = 10212
//Output:
//3
//Explanation:
//The substring 102 is the smallest substring
//that contains the characters 0, 1 and 2.
//Example 2:
//
//Input: 
//S = 12121
//Output:
//-1
//Explanation: 
//As the character 0 is not present in the
//string S, therefor no substring containing
//all the three characters 0, 1 and 2
//exists. Hence, the answer is -1 in this case.

package GeeksForGeeks;

public class SmallestWindowContaining0and1and2 {
	public static void main(String[] args) {
		String s = "1000222";
		
		int ans = smallestSubstring(s);
		System.out.println(ans);
	}
	public static int smallestSubstring(String s) {
		
		String check = "012";
		int count=0;
		for(int i=0 ; i<check.length() ; i++) {
			for(int j=0 ; j< s.length() ; j++) {
				if(check.charAt(i) == s.charAt(j)) {
					count++;
					break;
				}
			}
		}
		if(count != 3)
			return -1;
		//                           "1000222"
		//                            012
		int ret = 0;
		String ss = "";
		int i=0;
		
		while( i < s.length())
		{
			boolean loop = true;
			char val = s.charAt(i); //1
			if(val == '0' || val =='1' || val == '2' )
			{
				int j = i+1;
				char val2 = s.charAt(j); // 0
				while(!loop && j<s.length()) 
				{
					if(val2 != val ) 
					{
						
					}
					else
					{
						loop = false;
					}
					j++;
				}
			}
			
			i++;
		}
        return count;
    }
}
