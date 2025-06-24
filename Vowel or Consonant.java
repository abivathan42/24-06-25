public class VowelOrConsonant {
    public static void main(String[] args) {
        char ch = 'e';

        if ("aeiouAEIOU".indexOf(ch) != -1)
            System.out.println(ch + " is a vowel.");
        else if (Character.isLetter(ch))
            System.out.println(ch + " is a consonant.");
        else
            System.out.println("Not an alphabet character.");
    }
}
