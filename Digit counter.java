public class DigitCounter {
    public static void main(String[] args) {
        int num = 987654, count = 0;

        while (num != 0) {
            num /= 10;
            count++;
        }

        System.out.println("Number of digits: " + count);
    }
}
