// input 1 <= n <= 100
// jika n ganjil maka print weird
// jika n genap dan 2 - 5 Not weird
// jika n genap dan 6 - 20 Weird
// jika n genap dan > 20 NOt weird

public class latihan{
    public static void main(String[] args) {
        
        int input = 22;

        if( input % 2 == 1 ){
            System.out.println("weird");

        }
        else if( input % 2 == 0 && input >= 2 && input <= 5){
            System.out.println("Not weird");

        }
        else if( input % 2 == 0 && input >= 6 && input <= 20){
            System.out.println("Weird");

        }
        else if( input % 2 == 0 && input >= 20){
            System.out.println("NOt Weird");

        }

    }
}