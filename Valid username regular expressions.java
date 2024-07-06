import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class UsernameValidator {
    public static final String regularExpression = "^[a-zA-Z][a-zA-Z0-9_]{7,29}$";
}

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        Pattern pattern = Pattern.compile(UsernameValidator.regularExpression);
        
        for (int i = 0; i < n; i++) {
            String username = scanner.nextLine();
            Matcher matcher = pattern.matcher(username);
            
            if (matcher.matches()) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
        
        scanner.close();
    }
}