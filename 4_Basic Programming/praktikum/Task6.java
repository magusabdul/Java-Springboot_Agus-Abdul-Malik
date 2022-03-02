/*
Diberikan dua integer x dan n, sedangkan fungsi untuk menghitung x^n. Kita mungkin berasumsi bahwa x dan n kecil dan luapan tidak terjadi.‎

    Sample Test Cases 
    Input : x = 2, n = 3 
    Output : 8

    Input : x = 7, n = 2 
    Output : 49
*/
public class Task6 {
    public static void main(String[] args) {
        exponenation(2, 3);
        exponenation(7, 2);
    }
    private static void exponenation(int x, int n) {
        int result=1;
		if(n!=0){
            for(int i=1;i<=n;i++)
            {
                result*=x;
            }
        }
        System.out.println("Exponen dari x dan n adalah " + result);
	}
}
