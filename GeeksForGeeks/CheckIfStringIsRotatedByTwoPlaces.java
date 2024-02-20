//Given two strings a and b. The task is to find if the string 'b' 
//can be obtained by rotating (in any direction) string 'a' by exactly 2 places.
//
//Example 1:
//
//Input:
//a = amazon
//b = azonam
//Output: 
//1
//Explanation: 
//amazon can be rotated anti-clockwise by two places, which will make it as azonam.


package GeeksForGeeks;

public class CheckIfStringIsRotatedByTwoPlaces {
	public static void main(String[] args) {
		String a = "geeksforgeeks";
		String b = "geeksgeeksfor";
		boolean res = isRotated(a,b);
		System.out.println(res);
	}
	
	public static boolean isRotated(String str1, String str2)
    {
		  if(str1.equals(str2)) return false;
	        StringBuffer s=new StringBuffer(str1);
	        if((s.reverse().toString()).equals(str2)) return false;
	        str1=str1+str1;
	        return str1.contains(str2);
    }
}
