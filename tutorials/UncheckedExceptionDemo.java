public class UncheckedExceptionDemo {
    public static void main(String[] args) {
        // 1. ArrayIndexOutOfBoundsException
        try {
            int[] numbers = {1, 2, 3};
            System.out.println("Trying to access index 5: " + numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array bounds error: " + e.getMessage());
        }

        // 2. NullPointerException
        try {
            String str = null;
            System.out.println("String length: " + str.length());
        } catch (NullPointerException e) {
            System.out.println("Null pointer error: " + e.getMessage());
        }

        // 3. ArithmeticException
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error: " + e.getMessage());
        }

        // 4. NumberFormatException
        try {
            int number = Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            System.out.println("Number format error: " + e.getMessage());
        }

        // 5. Custom unchecked exception
        try {
            validateBalance(-100);
        } catch (InvalidBalanceException e) {
            System.out.println("Balance error: " + e.getMessage());
        }
    }

    // Custom unchecked exception (extends RuntimeException)
    public static class InvalidBalanceException extends RuntimeException {
        public InvalidBalanceException(String message) {
            super(message);
        }
    }

    // Method throwing custom unchecked exception
    public static void validateBalance(double balance) {
        if (balance < 0) {
            throw new InvalidBalanceException("Balance cannot be negative");
        }
        System.out.println("Balance is valid: " + balance);
    }
} 