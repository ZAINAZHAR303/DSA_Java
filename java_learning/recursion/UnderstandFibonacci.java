package recursion;

public class UnderstandFibonacci {

    public static void main(String[] args) {
        int n = 7;  // Change this number to find a different Fibonacci number
        System.out.println("Fibonacci number at position " + n + " is: " + fibonacci(n));



    }
    public static int fibonacci(int n) {
        // Base cases: 0th = 0, 1st = 1
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        // Recursive call: fib(n) = fib(n-1) + fib(n-2)


        return fibonacci(n - 1) + fibonacci(n - 2);
    }


}
