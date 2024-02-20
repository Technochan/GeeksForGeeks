//Input:
//N = 10
//A[] = {6,1,2,8,3,4,7,10,5}
//Output: 9

package GeeksForGeeks;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingNumberInArray {
	public static void main(String[] args) {
		int arr[] =  {6,1,2,8,3,4,7,10,5};
		int n = arr.length;
		System.out.println(missingNumber(arr,n));
	}
	static int missingNumber(int[] array, int n)
	{
		  Arrays.sort(array);

	       int ans=0;
	       int flag=0; 
	       for(int i=0;i<n-1;i++){
	             if(array[i] != i+1 ){
	                 ans=i+1;
	                 flag=1;
	                 break;
	             }
	       }
	       
	       if(flag==0) return n; 
	       
	        return ans;
	    }
	
}
