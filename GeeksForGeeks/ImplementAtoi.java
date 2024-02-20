package GeeksForGeeks;

public class ImplementAtoi {
	public static void main(String[] args) {
		String s = "123-";
		int res = atoi(s);
		System.out.println(res);
	}
	
	static int atoi(String s) {
		boolean minus = s.charAt(0) == '-' ? true : false;
		int start = s.charAt(0) == '-' ? 1 : 0;
		int result = 0;
		
		for(int i = start ; i<s.length() ; i++) {
			if(s.charAt(i) + '0' > 144 || s.charAt(s.length()-1) == '-') return -1;			int val = ('0' - ('a' - s.charAt(i))) + 1;
			if(result == 0) {
				result = val;
			} else {
				result = result * 10 + val;
			}
			
		}
	
		return minus == true ? (-1 * result ) : result ;
	}
}
