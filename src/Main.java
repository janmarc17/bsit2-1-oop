public class Main {
    public static void main(String[] args) {
        // Create student objects
        Student s1 = new Student("Alice", 20, "BSIT", 85.0, 90.0, 88.0);
        Student s2 = new Student("Bob", 19, "BSCS", 92.0, 95.0, 89.0);
        Student s3 = new Student("Charlie", 21, "BSIT", 65.0, 70.0, 68.0);

        int passingCount = 0;

        System.out.println("----- Student Grades -----");
        s1.displayResult();
        s2.displayResult();
        s3.displayResult();

        System.out.println("Summary: " + passingCount + " out of 3 students are passing.");
    }
}
