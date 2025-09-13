public class BasicGradeSystem {
    public static void main(String[] args) {
        double[][] grades = {
                {7.5, 8.0, 9.0},
                {6.0, 7.5, 8.5},
                {8.0, 9.0, 9.5}
        };

        for(int i = 0; i < grades.length; i++) {
            double totalGrade = 0;

            for(int j = 0; j < grades[i].length; j++) {
                totalGrade += grades[i][j];
            }
            double average = totalGrade / grades[i].length;
            System.out.printf("Average grade of student %d: %.2f%n", (i + 1), average);
        }
    }
}
