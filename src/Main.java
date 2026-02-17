public class Main {
    public static void main(String[] args) {
        GradeCalculator gc = new GradeCalculator();

        String studentName = "john smith";
        double average = gc.calculateAverage(89.5, 87.0, 94.5, 92.9);
        String letterGrade = gc.getLetterGrade(average);

        gc.displayResult(studentName, average);
        gc.displayResult(studentName, average, letterGrade);
    }
}
