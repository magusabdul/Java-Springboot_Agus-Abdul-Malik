public class Task3 {
    public static void main(String[] args) {
        hitungFaktor(6);
        hitungFaktor(20);
    }
    public static void hitungFaktor(int input){
        int output = 0;
        System.out.println("Input = "+input);
        System.out.println("Output :");
        for (int i = 0; i <= input; i++) {
            output++;
            if (input % output == 0) {
                System.out.print(output+" ");
            }
        }
        System.out.println("\n");
    }
}
