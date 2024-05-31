import java.util.function.IntPredicate;


public class AlphabetCheck {
    private static final IntPredicate charIsLetter = Character::isLetter;

    public static boolean isContainsOnlyAlphabets(String input) {
        for (int i = 0; i < input.length(); i++) {              
            char c = input.charAt(i);
	    if (!charIsLetter.test(c)) {
                return false;
            }
            //if (!Character.isLetter(c)) {
              //  return false;
            //}															
        }
        return true;
    }



    public static void main(String[] args) {
        String str1 = "MonaAli";
        String str2 = "monaali1234";
        String str3 = "mona@gmail.com";

        System.out.println("'" + str1 + "' contains only alphabets: " + isContainsOnlyAlphabets(str1));
        System.out.println("'" + str2 + "' contains only alphabets: " + isContainsOnlyAlphabets(str2));
        System.out.println("'" + str3 + "' contains only alphabets: " + isContainsOnlyAlphabets(str3));
    }

}












// (c : input.toCharArray())