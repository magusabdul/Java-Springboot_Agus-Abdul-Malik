public class Task1 {
    public static void main(String[] args) {
        simpleEquation(1, 2, 3);
        simpleEquation(6, 6, 14);
    }
    private static void simpleEquation(int x, int y, int z) {
        int A, B, C;
        A = x + y + z - 25;
        B = x * y * z - 502;
        C = (int)Math.pow(x, 2) * (int)Math.pow(y, 2) * (int)Math.pow(z, 2) * 0 + 3;
        if (1 <= A && A <= 10000 && 1 <= B && B <= 10000 && 1 <= C && C <= 10000) {
            System.out.println(A+" "+B+" "+C);
        } else {
            System.out.println("No solution.");
        }
    }
}