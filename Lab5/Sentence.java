import java.util.*;
class Sentence {
    private Word[] words;
    private String punctuation;

    public Sentence(String sentence) {
        // Split sentence = Розділіть речення на слова та розставте розділові знаки
        String[] tokens = sentence.trim().split("(?<=\\b\\w+\\b)|(?<=\\p{Punct})|(?=\\s+)");

        List<Word> wordList = new ArrayList<>();
        for (String token : tokens) {
            if (!token.matches("\\s+")) {
                wordList.add(new Word(token));
            }
        }
        words = wordList.toArray(new Word[0]);

        punctuation = tokens[tokens.length - 1];
    }

    public Word[] getWords() {
        return words;
    }

    public String getPunctuation() {
        return punctuation;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Word word : words) {
            sb.append(word.toString()).append(" ");
        }
        sb.append(punctuation);
        return sb.toString();
    }
}


