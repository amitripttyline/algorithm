package v1.Exceptionhandling;

import java.io.IOException;

public class CompileTimeExceptionExample {
    // Method that throws a checked exception
    public static void readFile() throws IOException {
        throw new IOException("File not found");
    }

    // Main method calling readFile() without handling the exception
    public static void main(String[] args) {
        readFile(); // ❌ Compile-time error: Unhandled exception
    }
    

    // public static void readFile() throws IOException {
    //     throw new IOException("File not found");
    // }

    // public static void main(String[] args) {
    //     try {
    //         readFile(); // No compilation error
    //     } catch (IOException e) {
    //         System.out.println("Exception handled: " + e.getMessage());
    //     }
    // }
}
