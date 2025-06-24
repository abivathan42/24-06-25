public class ManualUppercase {
    public static void main(String[] args) {
        String input = "hello";
        StringBuilder result = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (c >= 'a' && c <= 'z')
                result.append((char)(c - 32));
            else
                result.append(c);
        }

        System.out.println("Uppercase: " + result);
    }
}
