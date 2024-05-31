class wordOccurrencesUsingStringMethods {

    public static void main(String[] args) {
        String sentence = "ITI develops people and ITI house of developers and ITI for people ITI";
        String word = "ITI";

        //******************************** Using split() ****************************************/
        // Replace all occurrences of the word with an empty string
        // and compare the lengths before and after replacement
	// The difference in lengths gives the total number of removed occurrences

        int originalLength = sentence.length();
        int newLength = sentence.replace(word, "").length();
        int occurrencesCount1 = (originalLength - newLength) / word.length();

        System.out.println("Count of occurrences of 'ITI': " + occurrencesCount1);

        //******************************** Using replace() ****************************************/
        // Splitting the sentence using the word as a delimiter
	// The number of occurrences is the length of the resulting array minus 1
        

	String[] words = sentence.split(" ");
        int occurrencesCount2 = 0;

        for (int i = 0; i<words.length; i++) {
            if (words[i].equals(word)) {
                occurrencesCount2++;
            }
        }

        System.out.println("Count of occurrences of 'ITI': " + occurrencesCount2);
    }
}
