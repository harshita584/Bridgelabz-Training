package runTimeAnalysis;

public class FibonacciPerformance{

    // Recursive Fibonacci
    public static int fibonacciRecursive(int n) {
        if (n <= 1)
            return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    // Iterative Fibonacci
    public static int fibonacciIterative(int n) {
        if (n <= 1)
            return n;
        int a = 0, b = 1, sum = 0;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }

    public static void main(String[] args) {
        int n = 30;

        long startRecursive = System.nanoTime();
        int recResult = fibonacciRecursive(n);
        long endRecursive = System.nanoTime();

        long startIterative = System.nanoTime();
        int iterResult = fibonacciIterative(n);
        long endIterative = System.nanoTime();

        System.out.println("Fibonacci Number (N): " + n);

        System.out.println("Recursive Result: " + recResult);
        System.out.println("Recursive Time: " + (endRecursive - startRecursive) / 1000000.0 + " ms");

        System.out.println("Iterative Result: " + iterResult);
        System.out.println("Iterative Time: " + (endIterative - startIterative) / 1000000.0 + " ms");
    }
}