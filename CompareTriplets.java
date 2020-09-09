import java.util.Arrays;
import java.util.List;


public class CompareTriplets {

    // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int resultA = 0, resultB = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i)) {
                resultA++;
            }else if(b.get(i) > a.get(i)){
                resultB++;
            }
        }
        return Arrays.asList(new Integer[]{resultA,resultB});

    }

    public static void main(String[] args) throws Exception {
        List<Integer> resulta = Arrays.asList(new Integer[] { 5, 6, 7 });
        List<Integer> resultb = Arrays.asList(new Integer[] { 3,6,10 });
        for (Integer integer : compareTriplets(resulta, resultb)) {
            System.out.println(integer);
        }
        
    }
}
