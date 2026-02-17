public class GradeCalculator {
    static double calculateAverage(double... grades){
        if (grades.length == 0) {
            return 0.0;
        }

        double sum = 0.0;
        for (double g : grades) {
            sum += g;
        }

        return sum / grades.length;
    }

    static String getLetterGrade(double average){
        if (average >= 90 && average <= 100) {
            return "A";
        } else if (average >= 80 && average < 90) {
            return "B";
        } else if (average >= 70 && average < 80) {
            return "C";
        } else if (average >= 60 && average < 70) {
            return "D";
        } else {
            return "F";
        }
    }

    public void displayResult(String studentName, double average) {
        System.out.println("Student: " + studentName + ", Average: " + average);
    }

    public void displayResult(String studentName, double average, String letterGrade) {
        System.out.println("Student: " + studentName + ", Average: " + average + " Grade: " + letterGrade);

    }
}

