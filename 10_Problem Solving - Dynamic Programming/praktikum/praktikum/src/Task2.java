public class Task2 {
    public static void main(String[] args) {
        System.out.println(fibonacciBottomUp(5));
    }

    static int[] F = new int[50]; //array to store fibonacci terms

    public static int fibonacciBottomUp(int n) {
        F[n] = 0;
        F[1] = 1;

        for(int i=2; i<=n; i++) {
        F[i] = F[i-1] + F[i-2];
        }
        return F[n];
    }
}
