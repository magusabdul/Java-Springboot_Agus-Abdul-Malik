public class Task4 {
    public static void main(String[] args) {
        menemukanBilanganPrima(7);
        menemukanBilanganPrima(10);
    }
    private static void menemukanBilanganPrima(int input){
        int cek=0;
        for(int i = 2; i<=input; i++){
            if(input%i==0){
                cek++;
            }
        }
        if(cek==1){
            System.out.println(input+" = Bilangan Prima");
        } else {
            System.out.println(input+" = Bukan Bilangan Prima");
        }
    }
}
