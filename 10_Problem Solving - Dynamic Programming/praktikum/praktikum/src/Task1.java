public class Task1{
    public static void main(String[] args) {
        initF();
        System.out.println(fibonacciTopDown(5));
    }

    static int[] F = new int[50];

    public static void initF() {
        for(int i=0; i<50; i++) {
        F[i] = -1;
        }
    }

    public static int fibonacciTopDown(int n) {
        if (F[n] < 0) {
        if (n==0) {
            F[n] = 0;
        }
        else if (n == 1) {
            F[n] = 1;
        }
        else {
            F[n] = fibonacciTopDown(n-1) + fibonacciTopDown(n-2);
        }
        }
        return F[n];
    }   
}