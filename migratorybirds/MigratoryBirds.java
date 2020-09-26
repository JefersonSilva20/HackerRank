package migratorybirds;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class MigratoryBirds {

    // Complete the migratoryBirds function below.
    static int migratoryBirds(List<Integer> arr) {
        Set<Integer> birdsId = new HashSet<>(arr);
        Iterator<Integer> birdsIterator = birdsId.iterator();
        int occursBirdsCount = 1;
        int birdID = 0;
        for (int i = 0; i < birdsId.size(); i++) {
            int actualBirdID = birdsIterator.next();
            int occursActualBirdsCount = 1;
            for (int j = 0; j < arr.size(); j++) {
                if (actualBirdID == arr.get(j)) {
                    occursActualBirdsCount++;
                }
            }
            if (occursActualBirdsCount > occursBirdsCount) {
                birdID = actualBirdID;
                occursBirdsCount = occursActualBirdsCount;
            } else if (occursActualBirdsCount == occursBirdsCount) {
                birdID = (actualBirdID < birdID) ? actualBirdID : birdID;
            }
        }
        return birdID;
    }

    public static void main(String[] args) {
        System.out.println(migratoryBirds(Arrays.asList(1, 4, 4, 4, 5, 3)));
    }
}
