import java.util.Scanner;

// Konversi suhu

// 1. Reamure -> Celcius
// 2. C -> Fahrenheit
// 3. C -> R


public class latihan2 {
    public static void main(String[] args) {
        Scanner numberIn = new Scanner(System.in);
        
        System.out.println("Pilih jenis konversi: ");
        System.out.println("1. Reamure -> Celcius");
        System.out.println("2. Celcius -> Fahrenheit");
        System.out.println("3. Celcius -> Reamure");
        String jenis = numberIn.next();
        System.out.print("Masukan nilai suhu yang akan di konversi: ");
        int nilai = numberIn.nextInt();
        switch (jenis) {
            case "1":
                int C = (5/4) * nilai;
                System.out.println("Reamure -> Celcius = "+C+"C");
                break;
            case "2":
                int F = (9/5) * nilai + 32 ;
                System.out.println("Celcius -> Fahrenheit = "+F+"F");
            break;
            case "3":
                int R = (4/5) * nilai ;
                System.out.println("Celcius -> Reamure = "+R+"R");
            break;      
            default:
                break;
        }
        numberIn.close();

    }
}
