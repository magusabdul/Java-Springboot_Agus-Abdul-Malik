import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(primeX(1));
        System.out.println(primeX(5));
    }
    private static int primeX(int target){
        int bil, awal, akhir, output;
        awal = 2;
        akhir = 29;
        List<Integer> bilPrima = new ArrayList<>();
        for (int i=awal; i<=akhir; i++){
            bil=0;
            for (int j=1;j<=i;j++){
                if (i%j==0){
                    bil=bil+1;
                }
            }
            if (bil==2){
                bilPrima.add(i);
            }             
        }
        output = bilPrima.get(target-1);
        return output;
    }
}