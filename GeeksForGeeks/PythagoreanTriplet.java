//Given an array arr of n integers, write a function that returns
//true if there is a triplet (a, b, c) from the array (where a, b, and c are 
//on different indexes) that satisfies a2 + b2 = c2, otherwise return false.

package GeeksForGeeks;

public class PythagoreanTriplet {
	public static void main(String[] args) { 
		int Arr[] = {13, 9, 16, 3 ,15, 8, 1, 28, 3, 12, 29, 3 ,28 ,19 ,11 ,25 ,11 ,26 ,19 ,3};
		int n = Arr.length;
		boolean res = checkTriplet(Arr,n);
		System.out.println(res);
	}
	static boolean checkTriplet(int[] arr, int n)  //(9, 12, 15)
	{
		boolean no = false;
        boolean yes = true;
//		if(1 <= n && n<= 100000) 
//		{		
//			for(int i=0 ; i<n ; i++)
//			{
//				
//				if(1 <= arr[i] && arr[i]<= 1000)
//				{
//					for(int j=i+1 ; j<n ; j++)
//					{
//						int last = n-1;
//						int temp =(arr[i]*arr[i])+(arr[j]*arr[j]);
//						while(last>0)
//						{
//							if( temp == (arr[last]*arr[last]))
//							{
//								boolean yes = true;
//								return yes ;
//							}
//							last--;
//						}
//					}
//				}
//			}
//		}
//		boolean no=false;
//		return no;
		
		if (n < 3) {
            return no;
        }

        int maxElement = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > maxElement) {
                maxElement = arr[i];
            }
        }
//        System.out.println(maxElement);

        int maxElementSquare = maxElement * maxElement;
//        System.out.println(maxElementSquare);

        int[] squares = new int[maxElementSquare + 1];

        for (int i = 0; i < n; i++) {
            squares[arr[i] * arr[i]] = 1;
        }
       

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int sumOfSquares = arr[i] * arr[i] + arr[j] * arr[j];
              
                if (sumOfSquares <= maxElementSquare && squares[sumOfSquares] == 1) {
                	  System.out.println(sumOfSquares);
                	  System.out.println(squares[sumOfSquares]);
                    return yes;
                }
            }
        }

        return no;
    }
}
