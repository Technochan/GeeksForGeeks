//Input:
//N = 3 
//mat[][] = {{6, 5, 4},
//           {1, 2, 5}
//           {7, 9, 7}}
//Output: 
//29 32
//Explanation:
//The given matrix is
//6 5 4
//1 2 5
//7 9 7
//The elements of upper triangle are
//6 5 4
//  2 5
//    7
//Sum of these elements is 6+5+4+2+5+7=29.
//The elements of lower triangle are
//6
//1 2
//7 9 7
//Sum of these elements is 6+1+2+7+9+7= 32.

package GeeksForGeeks;

import java.util.ArrayList;

public class SumofUpperandLowerTriangles {
	public static void main(String[] args) {
		int n = 3; 
		int mat[][] = {{6, 5, 4},
		               {1, 2, 5},
		               {7, 9, 7}};
		ArrayList<Integer> ans = sumTriangles(mat,n);
		for(Integer val : ans)
			System.out.print(val+" ");
	}
    static ArrayList<Integer> sumTriangles(int matrix[][], int n)
	{
    	ArrayList<Integer> res = new ArrayList();
    	int uSum = 0;
    	int lSum = 0;
    	for(int i=0 ; i<n ; i++)
    	{
    		for(int j=0+i ; j<n ; j++)
    		{	
    			uSum = uSum + matrix[i][j];
    		}
    		for(int j=0 ; j<i+1 ; j++)
    	    {
    	    	lSum = lSum + matrix[i][j];
    	    }
    		
    	}
    	res.add(uSum);
    	res.add(lSum);
		return res;
	}
}
