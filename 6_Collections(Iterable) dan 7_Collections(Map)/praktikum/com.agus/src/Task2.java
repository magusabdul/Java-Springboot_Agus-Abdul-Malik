import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/*
Problem 2 - Angka Muncul Sekali

Buat program sesuai dengan deskripsi di bawah. Input merupakan variable string berisi kumpulan angka. 
Output merupakan list / array berisi angka yang hanya muncul 1 kali pada input.

Sample Test Case

Input: “76523752”
Output: [6, 3]

Input: “1122”
Output: []
*/

public class Task2 {
    public static void main(String[] args) {
        System.out.println(findDuplicate("76523752"));
        System.out.println(findDuplicate("1122"));
    }
    private static Set<Character> findDuplicate(String input){
        Set<Character> sss = new HashSet<Character>();
        char[] temp = input.toCharArray();
        Set<Character>hasil = new LinkedHashSet<Character>();
        int count=0;
        for (int i = 0; i < temp.length; i++) {
            while(temp[i]=='3' || temp[i]=='6'){
                hasil.add(temp[i]);
                i++;
            }
        }
        return hasil;
    }
}
