import java.util.*;

// Letter class represents a single letter
class Letter {
    private char character;

    public Letter(char character) {
        this.character = character;
    }

    public char getCharacter() {
        return character;
    }

    public boolean isVowel() {
        char lowerChar = Character.toLowerCase(character);
        return lowerChar == 'a' || lowerChar == 'e' || lowerChar == 'i' || lowerChar == 'o' || lowerChar == 'u';
    }
}
