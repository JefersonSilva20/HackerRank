package diagonaldifferences;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiagonalDifference {
    public static int diagonalDifference(List<List<Integer>> arr) {
        int diagonalResult1 = 0;
        int diagonalResult2 = 0;
        
        for (int i = 0, j = arr.size()-1; i < arr.size() && j >= 0 ; i++, j--) {
            List<Integer> row = arr.get(i);
            diagonalResult1 += row.get(i);
            diagonalResult2 += row.get(j);
        }

        return Math.abs(diagonalResult1-diagonalResult2);
    }

    public static void main(String[] args) throws Exception {
        List<Integer> list1 = Arrays.asList(new Integer[] { 11, 2, 4 });
        List<Integer> list2 = Arrays.asList(new Integer[] { 4, 5, 6 });
        List<Integer> list3 = Arrays.asList(new Integer[] { 10, 8,-12 });
        List<List<Integer>> arr = new ArrayList<>();
        arr.add(list1);
        arr.add(list2);
        arr.add(list3);
        System.out.println(diagonalDifference(arr));

    }
}
