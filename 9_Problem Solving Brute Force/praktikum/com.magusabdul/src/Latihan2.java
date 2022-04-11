import java.util.List;

/**
Diketahui sebuah array {4, 8, 3, 1, 7, 5, 9}. 
Buatlah program untuk mencari nilai min dan max 
dari data tersebut
output:
min : 1
max: 9

**/

public class Latihan2 {
    public static void main(String[] args) {
        List<Integer> numList = List.of(4, 8, 3, 1, 7, 5, 9);
        MinMax(numList);
    }

    private static void MinMax(List<Integer> list){
       int min = list.get(0);
       int max = list.get(0);
       for(Integer num : list){
           if(min > num) min = num;
           if(max < num) max = num;
       }

       System.out.println("Min = "+min);
       System.out.println("Max = "+ max);
    }
}
