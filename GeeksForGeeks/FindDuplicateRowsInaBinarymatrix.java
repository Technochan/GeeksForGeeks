package GeeksForGeeks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FindDuplicateRowsInaBinarymatrix {
	public static void main(String[] args) {
		int R = 4, C = 3;
		int	matrix[][] = {{ 1, 0, 0},
				          { 1, 0, 0},
				          { 0, 0, 0},
				          { 0, 0, 0}};
		ArrayList<Integer> res = repeatedRows(matrix,R,C);
		System.out.println(res);
	}
	public static ArrayList<Integer> repeatedRows(int matrix[][], int m, int n)
    {
		ArrayList<Integer> list = new ArrayList<>();
        HashMap<String, Integer> hmap = new HashMap<>();

        for (int i = 0; i < m; i++) {
            String rowKey = Arrays.toString(matrix[i]);
            if (hmap.containsKey(rowKey)) {
                list.add(i);
            }
            hmap.put(rowKey, i);
        }
        return list;

    }
}
