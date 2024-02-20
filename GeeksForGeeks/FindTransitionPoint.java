//Given a sorted array containing only 0s and 1s, find the transition point, i.e.,
//the first index where 1 was observed, and before that, only 0 was observed.
//
//Example 1:
//
//Input:
//N = 5
//arr[] = {0,0,0,1,1}
//Output: 3
//Explanation: index 3 is the transition 
//point where 1 begins.

package GeeksForGeeks;

public class FindTransitionPoint {
	public static void main(String[] args) {
		int arr[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0};
		int n = arr.length;
		int res = verify(arr,n);
		System.out.println(res);
		
	}
	public static int verify(int[] arr,int n)
	{
		int index = 0;
		for(int i : arr) {
			if(i==0) {
				index++;
			}
			else {
				break;
			}
		}
		if(n==index) {
			return -1;
		}
		else {
		return index;
		}
		
	}

}
