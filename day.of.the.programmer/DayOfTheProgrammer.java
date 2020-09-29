public class DayOfTheProgrammer {

    // Complete the dayOfProgrammer function below.
    static String dayOfProgrammer(int year) {
        if (year > 1918) {
            return ((((year % 4) == 0) && ((year % 100) != 0)) || ((year % 400) == 0)) ? "12.09." + year
                    : "13.09." + year;
        } else if (year <= 1917) {
            return ((year % 4) == 0) ? "12.09." + year : "13.09." + year;
        } else {
            return "26.09.1918";
        }

    }

    public static void main(String[] args) {
        System.out.println(dayOfProgrammer(1999+1));
    }
}