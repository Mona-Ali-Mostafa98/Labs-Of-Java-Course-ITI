import java.util.*;

class Dictionary {
    private Map<Character, SortedSet<String>> createdMap;

    public Dictionary() {
        createdMap = new HashMap<>();
        for (char c = 'A'; c <= 'Z'; c++) {
            createdMap.put(c, new TreeSet<>());
        }
    }

    public void addWord(String word) {
        if (word.length() > 0) {
            char firstLetter = Character.toUpperCase(word.charAt(0));
            createdMap.computeIfPresent(firstLetter, (key, words) -> { words.add(word);return words;});
        }
    }

    public void printWordsOfLetter(char letter) {
        letter = Character.toUpperCase(letter);
        Set<String> words = createdMap.getOrDefault(letter, new TreeSet<>());

        if (!words.isEmpty()) {
            System.out.println("Words start with '" + letter + "': " + words);
        }
    }

    public void printAllLettersAndWords() {
        for (char letter = 'A'; letter <= 'Z'; letter++) {
            printWordsOfLetter(letter);
        }
    }

    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();

        dictionary.addWord("Aya");
        dictionary.addWord("Ali");
        dictionary.addWord("Carnm");
        dictionary.addWord("Doaa");
        dictionary.addWord("Joud");
        dictionary.addWord("Mona");
        dictionary.addWord("Sawsan");
        dictionary.addWord("Soad");
        dictionary.addWord("Fatama");
        dictionary.addWord("Rehab");
        dictionary.addWord("Mai");
        dictionary.addWord("Zaid");

        System.out.println("**********  print all the letters and corresponding words ********");
        dictionary.printAllLettersAndWords();

        System.out.println("**************** print the words of a given letter ****************");
        dictionary.printWordsOfLetter('A');
        dictionary.printWordsOfLetter('M');
        dictionary.printWordsOfLetter('D');
        dictionary.printWordsOfLetter('S');
    }
}
