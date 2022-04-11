public class Task2 {
    public static void main(String[] args) {
        System.out.println("Diberi nomor "+fib(0)+", cetak Nomor Fibonacci ke-" + fib(0));
        System.out.println("Diberi nomor "+fib(7)+", cetak Nomor Fibonacci ke-" + fib(7));
    }
    public static long fib(long n) {
        if ((n == 0) || (n == 1))
           return n;
        else
           return fib(n - 1) + fib(n - 2);
    }
}
