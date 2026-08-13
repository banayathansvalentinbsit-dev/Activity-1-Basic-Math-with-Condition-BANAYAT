public class BasicMathWithCondition {
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 5;
        int sum = number1 + number2;

        System.out.println("The sum is: " + sum);

        if (sum > 10) {
            System.out.println("The sum is greater than 10.");
        } else {
            System.out.println("The sum is not greater than 10.");
        }

        int difference = number1 - number2;
        System.out.println("The difference is: " + difference);
    }
}
