import java.util.Scanner;

public class NumberSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int number1, number2, number3, number4, number5;
        int sum = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter number " + i + ": ");
            int inputNumber = scanner.nextInt();

            switch (i) {
                case 1:
                    number1 = inputNumber;
                    sum += number1;
                    break;
                case 2:
                    number2 = inputNumber;
                    sum += number2;
                    break;
                case 3:
                    number3 = inputNumber;
                    sum += number3;
                    break;
                case 4:
                    number4 = inputNumber;
                    sum += number4;
                    break;
                case 5:
                    number5 = inputNumber;
                    sum += number5;
                    break;
            }
        }


        System.out.println("Total Number: " + sum);


        scanner.close();
    }
}
