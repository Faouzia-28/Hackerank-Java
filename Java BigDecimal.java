import java.math.BigDecimal;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        // Scanner to read input
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of real number strings
        int n = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character

        // Create an array to store the real number strings
        String[] numbers = new String[n];

        // Read each real number string and store it in the array
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextLine();
        }

        // Close the scanner
        scanner.close();

        // Sort the array in descending order using BigDecimal for numeric comparison
        Arrays.sort(numbers, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                // Create BigDecimal instances for comparison
                BigDecimal num1 = new BigDecimal(a);
                BigDecimal num2 = new BigDecimal(b);

                // Compare in reverse order (descending)
                return num2.compareTo(num1);
            }
        });

        // Print the sorted array elements
        for (String number : numbers) {
            System.out.println(number);
        }
    }
}
