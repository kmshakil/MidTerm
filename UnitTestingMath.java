package math.problems;

public class UnitTestingMath {
    public static void main(String[] args) {
    }

    //Apply Unit testing into each classes and methods in this package.
    public static int add(int firstNumber, int secondNumber) { return firstNumber + secondNumber;}


    public static int multiply(int multiplicand, int multiplier) {
        return multiplicand * multiplier;
    }

    public static double divide(int dividend, int divisor) {
        if (divisor == 0)
            throw new IllegalArgumentException("Cannot divide by zero (0).");

        return dividend / divisor;
    }
}



