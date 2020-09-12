import java.util.Arrays;
import java.util.List;

public class GradingStudents {

    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        for (int i = 0; i < grades.size(); i++) {
            int rest = grades.get(i) % 5;
            if ((grades.get(i) >= 38) && (rest != 0) && (rest >= 3)) {
                grades.set(i, (grades.get(i) + (rest - 5) * -1));
            }
        }
        return grades;

    }

    public static void main(String[] args) {
        List<Integer> grades = Arrays.asList(new Integer[] { 73, 67, 38, 33, 39 });
        for (Integer integer : gradingStudents(grades)) {
            System.out.println(integer);
        }

    }
}
