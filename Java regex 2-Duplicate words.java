import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        for (int i = 0; i < n; i++) {
            String sentence = scanner.nextLine();
            
            // Regex pattern to match repeated words, case-insensitive
            Pattern pattern = Pattern.compile("\\b(\\w+)\\b", Pattern.CASE_INSENSITIVE);
            
            // Matcher to find repeated words
            Matcher matcher = pattern.matcher(sentence);
            StringBuffer sb = new StringBuffer();
            while (matcher.find()) {
                String word = matcher.group(1); // Get the matched word
                if (!isFirstOccurrence(sb.toString(), word)) {
                    matcher.appendReplacement(sb, ""); // Replace with empty string
                }
            }
            matcher.appendTail(sb);
            
            // Print the modified sentence
            System.out.println(sb.toString().trim());
        }
        
        scanner.close();
    }
    
    // Helper method to check if the word is the first occurrence in the sentence
    private static boolean isFirstOccurrence(String sentence, String word) {
        // Case-insensitive check for first occurrence of the word in the sentence
        return !Pattern.compile("\\b" + word + "\\b", Pattern.CASE_INSENSITIVE).matcher(sentence).find();
    }
}
