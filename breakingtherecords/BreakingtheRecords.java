package breakingtherecords;

public class BreakingtheRecords {

    static int[] breakingRecords(int[] scores) {
        int highScore = scores[0], lowScore = scores[0], highRecords = 0, lowRecords = 0;
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > highScore) {
                highScore = scores[i];
                highRecords++;
            }
            if (scores[i] < lowScore) {
                lowScore = scores[i];
                lowRecords++;
            }
        }
        return new int[] { highRecords, lowRecords };
    }

    public static void main(String[] args) {
        int[] result = breakingRecords(new int[]{10, 5, 20, 20, 4, 5, 2, 25, 1});
        System.out.println(result[0]+" "+result[1]);
        
    }

}
