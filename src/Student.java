public class Student {
    String name;
    int age;
    String course;
    double grade1;
    double grade2;
    double grade3;

    // Constructor
    public Student(String studentName, int studentAge, String studentCourse, double g1, double g2, double g3) {
        name = studentName;
        age = studentAge;
        course = studentCourse;
        grade1 = g1;
        grade2 = g2;
        grade3 = g3;
    }

    // Display student info
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Course: " + course);
        System.out.println("Grades: " + grade1 + ", " + grade2 + ", " + grade3);
    }

    // Calculate average grade
    public double calculateAverage() {
        return (grade1 + grade2 + grade3) / 3;
    }

    // Print letter grade
    public void getLetterGrade() {
        double avg = calculateAverage();

        if (avg >= 90) {
            System.out.println("Letter Grade: A");
        } else if (avg >= 80) {
            System.out.println("Letter Grade: B");
        } else if (avg >= 70) {
            System.out.println("Letter Grade: C");
        } else if (avg >= 60) {
            System.out.println("Letter Grade: D");
        } else {
            System.out.println("Letter Grade: F");
        }
    }

    // Check if passing
    public boolean isPassing() {
        return calculateAverage() >= 70;
    }

    // Display full result
    public void displayResult() {
        displayInfo();
        double avg = calculateAverage();
        System.out.printf("Average: %.2f\n", avg);
        getLetterGrade();
        System.out.println("Status: " + (isPassing() ? "PASSING" : "FAILING"));
        System.out.println();
    }
}
