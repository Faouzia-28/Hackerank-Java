import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfLines = Integer.parseInt(scanner.nextLine());
        
        // Regular expression to match tags and their contents
        Pattern tagPattern = Pattern.compile("<(.+?)>([^<>]*)</\\1>");
        
        for (int i = 0; i < numberOfLines; i++) {
            String line = scanner.nextLine();
            Matcher matcher = tagPattern.matcher(line);
            boolean found = false;
            
            while (matcher.find()) {
                String content = matcher.group(2);
                if (!content.isEmpty()) {
                    System.out.println(content);
                    found = true;
                }
            }
            
            if (!found) {
                System.out.println("None");
            }
        }
        
        scanner.close();
    }
}
