class Text {
    private Sentence[] sentences;

    public Text(String text) {
        // Split text - Розбити текст на речення
        String[] sentenceTokens = text.trim().split("(?<=[.!?])\\s+");

        sentences = new Sentence[sentenceTokens.length];
        for (int i = 0; i < sentenceTokens.length; i++) {
            sentences[i] = new Sentence(sentenceTokens[i]);
        }
    }

    public Sentence[] getSentences() {
        return sentences;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Sentence sentence : sentences) {
            sb.append(sentence.toString()).append(" ");
        }
        return sb.toString().trim();
    }
}

