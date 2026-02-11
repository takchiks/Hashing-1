public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> charToWord = new HashMap<>();
        Map<String, Character> wordToChar = new HashMap<>();

        char[] p = pattern.toCharArray();
        String[] words = s.split(" ");
        // check if the length is the same
        if (p.length != words.length) {
            return false;
        }

        for (int i = 0; i < p.length; i++) {
            char c = p[i];
            String word = words[i];

            if (charToWord.containsKey(c)) {
                if (!charToWord.get(c).equals(word)) {
                    return false;
                }
            } else {
                if (wordToChar.containsKey(word)) {
                    return false;
                }
                // if the sord doesnt already exist add them to the map and reverse map
                charToWord.put(c, word);
                wordToChar.put(word, c);
            }
        }

        return true;
    }
}