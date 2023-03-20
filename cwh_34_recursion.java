public class cwh_34_recursion {
    static int fact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return fact(n - 1) * n;
        }
    }

    static int fib(int m) {
        if (m == 0) {
            return 0;
        } else if (m == 1) {
            return 1;
        } else {
            return fib(m - 1) + fib(m - 2);
        }
    }

    public static void main(String[] args) {
        int x = 8;
        System.out.printf("The factorial of %d is %d", x, fact(x));
        System.out.println("");
        System.out.printf("The fibonacci of %d is %d", x, fib(x));
    }
}
