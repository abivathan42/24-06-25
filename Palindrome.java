public class PalindromeNumber {
    public static void main(String[] args) {
        int number = 121, original = number, reversed = 0;

        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        System.out.println(original == reversed ? "Palindrome" : "Not Palindrome");
    }
}
