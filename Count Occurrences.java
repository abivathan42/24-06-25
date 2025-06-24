public class CharCount {
    public static void main(String[] args) {
        String str = "programming";
        char target = 'g';
        int count = 0;

        for (char c : str.toCharArray()) {
            if (c == target) count++;
        }

        System.out.println("Count of '" + target + "': " + count);
    }
}
