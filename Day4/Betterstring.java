import java.util.function.BiPredicate;

class BetterStringMethod {
    public static String betterString(String firstString, String secondString, BiPredicate<String, String> condition) {
        if (condition.test(firstString, secondString)) {
            return firstString;
        } else {
            return secondString;
        }
    }
}

class BetterString{
    public static void main(String[] args) {
        String string1 = "Mona";
        String string2 = "Mostafa";
        String longerString = BetterStringMethod.betterString(string1, string2, (s1, s2) -> s1.length() > s2.length());
        System.out.println("Longest String : " + longerString);
        String firstString = BetterStringMethod.betterString(string1, string2, (s1, s2) -> true);
        System.out.println("First String : " + firstString);
    }
}