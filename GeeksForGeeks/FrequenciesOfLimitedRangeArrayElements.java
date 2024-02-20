package GeeksForGeeks;

public class FrequenciesOfLimitedRangeArrayElements {
	public static void main(String[] args) {
		int arr[] = {2, 3, 2, 3, 5};
		int n = 5;
		int start = 1;
		while(n>0)
		{
			int count = 0;
			for(int i =0 ; i<arr.length ; i++)
			{
				if(arr[i] == start)
				{
					count++;
				}
					
			}
			System.out.print(count+" ");
			n--;
			start++;
		}
		
	}
}
//ans is : 0 2 2 0 1 
//because in the above array 
//1 present 0 times
//2 present 2 times
//3 present 2 times
//4 present 0 times
//5 present 1 times
//this is based on the N