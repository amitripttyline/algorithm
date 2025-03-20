package String;

public class StringVsStringBuilderVsBuffer {
    public static void main(String[] args) {
        // Using String (Immutable)
        String str = "Hello";
        str.concat(" World");
        System.out.println("String: " + str); // Output: Hello (original string remains unchanged)
        
        str = str.concat(" World"); // Assigning the new concatenated value
        System.out.println("Modified String: " + str); // Output: Hello World

        // Using StringBuilder (Mutable, Not Thread-Safe, Faster)
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println("StringBuilder: " + sb); // Output: Hello World

        // Using StringBuffer (Mutable, Thread-Safe, Slower)
        StringBuffer sbf = new StringBuffer("Hello");
        sbf.append(" World");
        System.out.println("StringBuffer: " + sbf); // Output: Hello World
        
        // Performance Test
        long startTime, endTime;

        // String Performance Test
        startTime = System.nanoTime();
        String testStr = "Hello";
        for (int i = 0; i < 10000; i++) {
            testStr = testStr + "!";
        }
        endTime = System.nanoTime();
        System.out.println("String Time: " + (endTime - startTime) + " ns");

        // StringBuilder Performance Test
        startTime = System.nanoTime();
        StringBuilder testSb = new StringBuilder("Hello");
        for (int i = 0; i < 10000; i++) {
            testSb.append("!");
        }
        endTime = System.nanoTime();
        System.out.println("StringBuilder Time: " + (endTime - startTime) + " ns");

        // StringBuffer Performance Test
        startTime = System.nanoTime();
        StringBuffer testSbf = new StringBuffer("Hello");
        for (int i = 0; i < 10000; i++) {
            testSbf.append("!");
        }
        endTime = System.nanoTime();
        System.out.println("StringBuffer Time: " + (endTime - startTime) + " ns");
    }
}
