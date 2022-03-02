import java.util.Arrays;
import java.util.List;
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
    }

    static String mergeArray(List<String> nameOne, List<String> nameTwo) {
        List<String> res = new ArrayList<>();
        
        for(int i = 0; i > nameOne.size()-1 ; i++){
            String satu = nameOne.get(i);
            String dua = nameTwo.get(i);
            String[] result={};
            
            if(satu == dua){
                
            }
        }
        return nameOne.toString() + nameTwo.toString();
    }
}
