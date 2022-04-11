import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.ArrayList;

/* 
Problem 1 - Array Merge
Buatlah sebuah program menggabungkan 2 array yang diberikan, dan jangan sampai terdapat nama yang sama di data yang sudah tergabung tadi.
Sample Test Cases
Input: ['kazuya', 'jin', 'lee'], ['kazuya', 'feng']
Output: ['kazuya', 'jin', 'lee', 'feng']

Input: ['lee', 'jin'], ['kazuya', 'panda']
Output: ['lee', 'jin', 'kazuya', 'panda']
*/

public class Task1 {
    public static void main(String[] args) {
        List<String> nameOne = new ArrayList<>(Arrays.asList("kazuya", "jin", "lee"));
        List<String> nameTwo = new ArrayList<>(Arrays.asList("kazuya", "feng"));
        System.out.println(mergeArray(nameOne, nameTwo));
        List<String> nameThree = new ArrayList<>(Arrays.asList("lee", "jin"));
        List<String> nameFour = new ArrayList<>(Arrays.asList("kazuya", "panda"));
        System.out.println(mergeArray(nameThree, nameFour));
    }

    static String mergeArray(List<String> nameOne, List<String> nameTwo) {
        Set<String>res = new LinkedHashSet<String>();
        res.addAll(nameOne);
        res.addAll(nameTwo);
        
        return res.toString();
    }
}
