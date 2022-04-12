package Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Addition penjumlahan = new Addition();
        
        Reduction pengurangan = new Reduction();
        
        Multiplication perkalian = new Multiplication();
        
        Division pembagian = new Division();
        Scanner scanner = new Scanner(System.in);
        int pilihan, value1, value2 ;
        System.out.println("++++++++++++++++++++++++++++++ CALCULATOR ++++++++++++++++++++++++++++++");
        System.out.println("1. Open Calculator");
        System.out.println("99. Exit");
        System.out.println("Masukan pilihan Anda : ");
        pilihan = scanner.nextInt();
        if (pilihan==1) {
            System.out.println("++++++++++++++++++++++++++++++ CALCULATOR ++++++++++++++++++++++++++++++");
            System.out.println("Masukan Value 1 : ");
            value1 = scanner.nextInt();
            System.out.println("Masukan Value 2 : ");
            value2 = scanner.nextInt();

            System.out.println("++++++++++++++++++++++++++++++ CALCULATOR ++++++++++++++++++++++++++++++");
            System.out.println("Please enter Calculation Operation: ");
            System.out.println("1. Add Value ");
            System.out.println("2. Sub Value");
            System.out.println("3. Multiply value");
            System.out.println("4. Divide value");
            System.out.println("Pilihan Anda : ");
            pilihan = scanner.nextInt();
            System.out.println("++++++++++++++++++++++++++++++ CALCULATOR ++++++++++++++++++++++++++++++");
            if(pilihan==1){
                penjumlahan.input(value1, value2);
            } else if (pilihan == 2) {
                pengurangan.input(value1, value2);
            } else if (pilihan == 3) {
                perkalian.input(value1, value2);
            } else if (pilihan == 4){
                pembagian.input(value1, value2);
            }
        }
    }
}
