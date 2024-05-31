import java.util.StringTokenizer;

class tokenizerSearch {
    public static void main(String args[]) {
        String sentence = "ITI develops people and ITI house of developers and ITI for people ITI";
        String word = "ITI";

 	//object is created by passing the sentence and a space as the delimiter 
	//This means the string will be split into tokens wherever there is a space

        StringTokenizer tokenizer = new StringTokenizer(sentence, " ");
        int occurrencesCount = 0;

        // loop is used to iterate through the tokens obtained from the StringTokenizer
	while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            if (token.equals(word)) {
                occurrencesCount++;
            }
System.out.println(token);
        }

        System.out.println("Count of occurrences of 'ITI' using StringTokenizer: " + occurrencesCount);
    }
}
