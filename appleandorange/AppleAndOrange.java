package appleandorange;

public class AppleAndOrange {

    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int countApples = calDistances(apples, a, s, t);
        int countOranges = calDistances(oranges, b, s, t);
        System.out.println(countApples);
        System.out.println(countOranges);

    }

    static int calDistances(int[] fruitsPositions, int localizationTree, int samsHouseStarting, int samHouseEnding) {
        int fruitPositionsTree = 0;
        int countFruit = 0;
        for (int i = 0; i < fruitsPositions.length; i++) {
            fruitPositionsTree = fruitsPositions[i] + localizationTree;
            if (fruitPositionsTree >= samsHouseStarting && fruitPositionsTree <= samHouseEnding) {
                countFruit++;
            }
        }
        return countFruit;
    }

    public static void main(String[] args) {
        countApplesAndOranges(7, 11,5, 15,new int[]{-2, 2, 1},new int[]{5,-6});

    }
}
