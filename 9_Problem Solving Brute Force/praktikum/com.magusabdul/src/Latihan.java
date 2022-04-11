/**
    Buatlah sebuah program untuk mencari sebuah nama dari daftar nama, 
    dengan 10 data. 
    Ketika nama yang di cari ketemu, outpukan nama tersebut, 
    ketika tidak ketemu maka outputkan data tidak ada.
 **/

public class Latihan {
    public static void main(String[] args) {
        String[] arr = { "contribute", "geeks", "ide", "practice"};
        String x = "geeks";
        int result = findName(arr, x);
 
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at "
                              + "index " + result);
    }
    private static int findName(String[] arr, String x){
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
 
            int res = x.compareTo(arr[m]);
 
            // Check if x is present at mid
            if (res == 0)
                return m;
 
            // If x greater, ignore left half
            if (res > 0)
                l = m + 1;
 
            // If x is smaller, ignore right half
            else
                r = m - 1;
        }
        return -1;
    }
}