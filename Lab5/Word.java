class Word {
    private Letter[] letters;

    public Word(String word) {
        letters = new Letter[word.length()];
        for (int i = 0; i < word.length(); i++) {
            letters[i] = new Letter(word.charAt(i));
        }
    }

    public Letter[] getLetters() {
        return letters;
    }

    public int getVowelCount() {
        int count = 0;
        for (Letter letter : letters) {
            if (letter.isVowel()) {
                count++;
            }
        }
        return count;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Letter letter : letters) {
            sb.append(letter.getCharacter());
        }
        return sb.toString();
    }
}


