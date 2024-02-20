//Given two strings 'str1' and 'str2', check if these two 
//strings are isomorphic to each other.
//
//If the characters in str1 can be changed to get str2, 
//then two strings, str1 and str2, are isomorphic. A character
//must be completely swapped out for another character while
//maintaining the order of the characters. A character may
//map to itself, but no two characters may map to the same character.
//
//Example 1:
//
//Input:
//str1 = aab
//str2 = xxy
//Output: 
//1
//Explanation: 
//There are two different characters in aab and xxy,
//i.e a and b with frequency 2 and 1 respectively.

package GeeksForGeeks;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
	public static void main(String[] args) {
		String str1 = "ehj";
		String str2 = "el";
		Boolean res = areIsomorphic(str1,str2);
		System.out.println(res);
	}
	public static boolean areIsomorphic(String str1,String str2)
	{
		Map<Character, Character> map1 = new HashMap<>();
		Map<Character, Character> map2 = new HashMap<>();
		if(str1.length() != str2.length())
		return false;
	
		for(int i=0 ; i<str1.length() ; i++)
		{
			char a = str1.charAt(i);
			char b = str2.charAt(i);
			if(map1.containsKey(a) && map1.get(a) != b || map2.containsKey(b) && map2.get(b) != a)
				return false;
			map1.put(a, b);
			map2.put(b, a);
		}

		return true;
	}
}
