//Input:
//N = 3 
//matrix[][] = {{45, 48, 54},
//             {21, 89, 87}
//             {70, 78, 15}}
//Output: 
//45 48 54 87 89 21 70 78 15 
//Explanation:
//Matrix is as below:
//45 48 54
//21 89 87
//70 78 15
//Printing it in snake pattern will lead to 
//the output as 45 48 54 87 89 21 70 78 15.

package GeeksForGeeks;
import java.util.*;
public class PrintMatrixinSnakePattern
{
	public static void main(String[] args)
	{
	    int matrix[][] = {{45, 48, 54},
				          {21, 89, 87},
				          {70, 78, 15}};
	    ArrayList al = new ArrayList();
	    al = snakePattern(matrix);
	}
	 static ArrayList<Integer> snakePattern(int matrix[][])
	{
		 ArrayList<Integer> list = new ArrayList<Integer>();

	        int len = matrix.length;

	        for (int i = 0; i < len; i++) {

	            if (i%2 == 0) {

	                for (int j = 0; j < len; j++) {

	                    list.add(matrix[i][j]);

	                }

	            } else {

	                for (int k = len-1; k >= 0; k--) {

	                    list.add(matrix[i][k]);

	                }

	            }

	        }
	        System.out.println(list);
	        return list;
    }
}
