public class FibonacciRecursive {
    static int fib(int n) {
        if (n <= 1) return n;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        int count = 7;
        for (int i = 0; i < count; i++) {
            System.out.print(fib(i) + " ");
        }
    }
}
