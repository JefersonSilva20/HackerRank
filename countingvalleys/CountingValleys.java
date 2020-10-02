package countingvalleys;

public class CountingValleys {

    public static int countingValleys(int steps, String path) {
        char[] stepsLevel = path.toCharArray();
        int countValleys = 0;
        int level = 0;
        boolean isValley = false;
        for (int i = 0; i < steps; i++) {
            level += (stepsLevel[i] == 'U') ? 1 : -1;
            if (level == -1) {
                isValley = true;
            }
            countValleys += (isValley && (level == 0)) ? 1 : 0;
            if (level == 0) {
                isValley = false;
            }
        }
        return countValleys;

    }

    public static void main(String[] args) {
        System.out.println(countingValleys(10, "DUDDDUUDUU"));
    }
}