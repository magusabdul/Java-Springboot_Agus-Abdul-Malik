public class BilanganPrima {
    public static void main(String[] args) {
        System.out.println(primeNumber(1000000007));  // true
        System.out.println(primeNumber(13));  // true
        System.out.println(primeNumber(17));  // true
        System.out.println(primeNumber(20));  // false
        System.out.println(primeNumber(35));  // false
        System.out.println(primeNumber(1500450271)); //true
    }

    public static boolean primeNumber(Integer number) {
        int cek=0;
        boolean result;
        int i = 2;
        while(number >= i){
            if(number%i==0){
                cek++;
            }
            i++;
        }
        System.out.println("");
        if(cek==1){
            result = true;
            System.out.println(number+" = Bilangan Prima");
        } else {
            result = false;
            System.out.println(number+" = Bukan Bilangan Prima");
        }
        return result;
    }
}

 