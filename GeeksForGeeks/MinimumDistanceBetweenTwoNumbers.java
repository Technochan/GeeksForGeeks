package GeeksForGeeks;
public class MinimumDistanceBetweenTwoNumbers {
	public static void main(String[] args) {
	
		int a[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21};
		int n = a.length;
		int x = 1, y = 15;
		int val = minDist(a, n,  x, y);
		System.out.println(val);
	}
	public static int minDist (int a[], int n, int x, int y)
	{ 
		int dis = 0;
		int first = 0;
		int last = n-1;
		if(x==y)
		{
			return 0;
		}
		while(first<n)
		{
			if(a[first] == x)
			{
				while(last>=0)
				{
					if(a[last] ==y)
					{
						int temp = last-first;
						
						 dis = Math.abs(temp);
					}
					last--;
				}
			}
			first++;
		}
		if(dis==0) {
			dis = -1;
		}
		
		return dis;
	}
}
