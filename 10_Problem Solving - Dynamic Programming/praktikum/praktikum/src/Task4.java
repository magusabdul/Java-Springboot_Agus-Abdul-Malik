import java.util.TreeMap;

public class Task4 {
    public static void main(String[] args) {
        System.out.println(integerToRoman5(4));
        System.out.println(integerToRoman5(9));
        System.out.println(integerToRoman5(23));
        System.out.println(integerToRoman5(2021));
        System.out.println(integerToRoman5(1646));
    }
    private static final TreeMap<Integer, String> treemap = new TreeMap<Integer, String>();
    static {
        treemap.put(1000, "M");
        treemap.put(900, "CM");
        treemap.put(500, "D");
        treemap.put(400, "CD");
        treemap.put(100, "C");
        treemap.put(90, "XC");
        treemap.put(50, "L");
        treemap.put(40, "XL");
        treemap.put(10, "X");
        treemap.put(9, "IX");
        treemap.put(5, "V");
        treemap.put(4, "IV");
        treemap.put(1, "I");

    }

    public static final String integerToRoman5(int number) {
        int l = treemap.floorKey(number);
        if (number == l) {
            return treemap.get(number);
        }
        return treemap.get(l) + integerToRoman5(number - l);
    }
}
