import java.util.Arrays;

public class Task2 {
    public static void main(String[] args)
    {
        int[] arr = {123};
        int m = arr.length;
        int n = 4;
        System.out.println(countWays(arr, m, n));
    }
    static long countWays(int[] S, int m, int n)
    {
        long[] table = new long[n+1];
        Arrays.fill(table, 0);
        table[0] = 1;
        
        for (int i=0; i<m; i++)
            for (int j=S[i]; j<=n; j++)
                table[j] += table[j-S[i]];
  
        return table[n];
    }
}
