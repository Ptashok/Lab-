import java.util.*;
public class Lab3 {
    public static void main(String[] args) {
        String text = "The sun shines bright, warming our souls! ";
        // Split the text into individual words
        String[] words = text.split(" ");
        // Sort the words based on the number of vowels
        Arrays.sort(words, Comparator.comparingInt(Lab3::countVowels));
        // Print the sorted words
        System.out.println("Sorted words:");
        for (String word : words) {
            System.out.println(word);
        }
    }
    private static int countVowels(String word) {
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < word.length(); i++) {
            if (vowels.contains(String.valueOf(word.charAt(i)))) {
                count++;
            }
        }
        return count;
    }
}
//було виконано варіант C3 - String, C17 - 6 варіант 

