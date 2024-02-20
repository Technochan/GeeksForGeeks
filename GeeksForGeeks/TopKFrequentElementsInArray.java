//Given a non-empty array nums[] of integers of length N, find the top k elements 
//which have the highest frequency in the array. If two numbers have same frequencies, 
//then the larger number should be given more preference.
//Input:
//N = 8
//nums = {1,1,2,2,3,3,3,4}
//k = 2
//Output: {3, 2}
//Explanation: Elements 1 and 2 have the
//same frequency ie. 2. Therefore, in this
//case, the answer includes the element 2
//as 2 > 1.


package GeeksForGeeks;
import java.util.*;
public class TopKFrequentElementsInArray {
	public static void main(String[] args) {
		int[] nums = {1,1,2,2,3,3,3,4};
		int k = 4;
		int[] res = topK(nums,k);
		for(int i : res)
			System.out.println(i);
	}
	public static int[] topK(int[] nums, int k) {
		Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        System.out.println(freqMap);
        // Step 2: Create a list of Map.Entry objects (element, frequency)
        List<Map.Entry<Integer, Integer>> freqList = new ArrayList<>(freqMap.entrySet());
        System.out.println(freqList);
        // Step 3: Sort the list by frequency and element value
        Collections.sort(freqList, (a, b) -> {
        	 System.out.println(a.getValue()+" "+ b.getValue());
            if (a.getValue().equals(b.getValue())) {
            	System.out.println(b.getKey()+"        "+ a.getKey());
                return Integer.compare(b.getKey(), a.getKey()); // Sort by element value in descending order
            } else {
            	System.out.println(b.getValue()+"               "+ a.getValue());
                return Integer.compare(b.getValue(), a.getValue()); // Sort by frequency in descending order
            }
        });
        System.out.println(freqList);
        // Step 4: Select the top k elements
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = freqList.get(i).getKey();
        }

        return result;
        
    }
}
