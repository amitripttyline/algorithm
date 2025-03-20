import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Executable;
import java.io.FileNotFoundException;


class InvalidIdException extends Exception {
    public InvalidIdException(String message) {
        super(message);
    }
}

public class FileHandlingExceptionDemo {
    public static void main(String[] args) {
        // Demonstrate multiple checked exceptions

        // Student ram = new Student("Ram", 20);
        
        
        // ram.id; // Run Time Exception

        // readAndPrintFile("nonexistent.txt");

        try {
            readAndPrintFile("nonexistent.txt");
        } catch (FileNotFoundException e) {
            // please valid file name
            System.out.println("File not found error: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IO error occurred: " + e.getMessage());
        }

        // bookTicket(10);

        verifyPerson("12345678", "ABCDE12345");



        // // Demonstrate throws declaration
        // try {
        //     validateAge(-5);
        // } catch (AgeValidationException e) {
        //     System.out.println("Age validation error: " + e.getMessage());
        // }
    }

    // Method that declares checked exceptions using throws
    public static void readAndPrintFile(String filename) throws FileNotFoundException, IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }

    // Custom checked exception
    public static class AgeValidationException extends Exception {
        public AgeValidationException(String message) {
            super(message);
        }
    }

    // Method throwing custom checked exception
    public static void validateAge(int age) throws AgeValidationException {
        if (age < 0) {
            try {
                throw new AgeValidationException("Age cannot be negative");
            } catch (AgeValidationException e) {
                System.out.println("Age validation error: " + e.getMessage());
            }
        }
        System.out.println("Age is valid: " + age);
    }

    public static void bookTicket(int age) {
        
        // book10PlusTicket(-7);

        try {
            book10PlusTicket(-7);
        } catch (RuntimeException e) {
            System.out.println("Runtime error: " + e.getMessage());
            // book18PlusTicket(age);
        }
    }


    public static void book18PlusTicket(int age) throws AgeValidationException {
        if (age < 18) {
            throw new AgeValidationException("You must be at least 18 years old to book a ticket");
        }
        System.out.println("Ticket booked successfully");
    }

    public static void book10PlusTicket(int age) {
        if (age < 10) {
            throw new RuntimeException("You must be at least 10 years old to book a ticket");
        }
        System.out.println("Ticket booked successfully");
    }



    public static void verifyPerson(String aadharNumber, String panNumber) {
        try {
            verifyAadharCard(aadharNumber);
        } catch (Exception e) {
            System.out.println("Aadhar card verification failed: " + e.getMessage());
            try {
                verifyPanCard(panNumber);
            } catch (Exception e2) {
                System.out.println("Pan card verification failed: " + e2.getMessage());
            }
        }
    }

    public static void verifyAadharCard(String aadharNumber) throws Exception{
        if (aadharNumber.length() != 12) {
            // throw new Exception("Aadhar number must be 12 digits");
        }
        
        System.out.println("Aadhar card verified successfully");
    }

    public static void verifyPanCard(String panNumber) throws Exception {
        if (panNumber.length() != 10) {
            throw new Exception("Pan number must be 10 digits");
        }
        System.out.println("Pan card verified successfully");
    }
} 
