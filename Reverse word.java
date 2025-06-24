public class ReverseWords {
    public static void main(String[] args) {
        String sentence = "Java is awesome";
        String[] words = sentence.split(" ");

        for (String word : words) {
            StringBuilder sb = new StringBuilder(word);
            System.out.print(sb.reverse().toString() + " ");
        }
    }
}
