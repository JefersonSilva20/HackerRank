package billdivision;

import java.util.Arrays;
import java.util.List;

public class BillDivision {

    // Complete the bonAppetit function below.
    static void bonAppetit(List<Integer> bill, int k, int b) {
        int totalCostPerPerson = (bill.stream().mapToInt(Integer::intValue).sum() - bill.get(k)) / 2;
        System.out.println((totalCostPerPerson == b) ? "Bon Appetit" : (b - totalCostPerPerson));
    }

    public static void main(String[] args) {
        bonAppetit(Arrays.asList(3, 10, 2, 9), 1, 7);
    }
}
