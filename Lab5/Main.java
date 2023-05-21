import java.util.*;

public class Main {
    public static void main(String[] args) {
        String inputText = "The sun shines bright, warming our souls! \n" +
                "Love conquers all, even in darkest times?\n" +
                "Embrace change, for growth awaits within. ";
        inputText = inputText.replaceAll("\s+", " ");
        Text text = new Text(inputText);

        // сортування слів за збільшенням кількості голосних
        List<Word> words = new ArrayList<>();
        for (Sentence sentence : text.getSentences()) {
            words.addAll(Arrays.asList(sentence.getWords()));
        }
        Collections.sort(words, Comparator.comparingInt(Word::getVowelCount));

        // Print sorted words
        for (Word word : words) {
            System.out.println(word.toString());
        }
    }
}
