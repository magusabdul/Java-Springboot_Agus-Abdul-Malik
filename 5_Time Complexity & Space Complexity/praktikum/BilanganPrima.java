public class BilanganPrima {
    public static void main(String[] args) {
        System.out.println(primeNumber(1000000007));
        System.out.println(primeNumber(13));
        System.out.println(primeNumber(17));
        System.out.println(primeNumber(20));
        System.out.println(primeNumber(35));
    }

    public static boolean primeNumber(Integer number) {
        if (number <= 1) return false;
        if(number % 2 ==0) return false;
        for (int i = 3; i <= number; i++) return true;
        return true;
    }

}

 