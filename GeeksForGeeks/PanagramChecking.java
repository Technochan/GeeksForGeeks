package GeeksForGeeks;

public class PanagramChecking {
	public static void main(String[] args) {
		String s = "Bawds jog, flick quartz, vex nymph";
		boolean res = checkPangram(s);
		System.out.println(res);
	}
	
	public static boolean checkPangram  (String str) {
        // your code here
		String s = str.toLowerCase();
		int[] alpha = new int[26];
		for(int i=0 ; i<s.length() ; i++) {
			if(Character.isLetter(s.charAt(i))) {
				alpha[s.charAt(i) - 'a'] = 1;
			}
		}
		
		for(int i : alpha) {
			if(i == 0) return false;
		}
		return true;
     }
}
