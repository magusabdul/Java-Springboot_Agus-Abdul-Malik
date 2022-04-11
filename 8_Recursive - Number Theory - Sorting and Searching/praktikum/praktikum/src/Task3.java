public class Task3 {
    public static void main(String[] args) {
        int[] input1 = {5, 7, 4, -2, -1, 8};
        int[] input2 = {2, -5, -4, 22, 7, 7};
        System.out.println("--------------------------------------------------------------");
        System.out.println("Array: {5, 7, 4, -2, -1, 8}");
        System.out.println("min: "+min(input1)+" index: "+indexMin(input1, min(input1)));
        System.out.println("max: "+max(input1)+" index: "+indexMax(input1, max(input1)));
        System.out.println("--------------------------------------------------------------");
        System.out.println("Array: {2, -5, -4, 22, 7, 7}");
        System.out.println("min: "+min(input2)+" index: "+indexMin(input2, min(input2)));
        System.out.println("max: "+max(input2)+" index: "+indexMax(input2, max(input2)));
        System.out.println("--------------------------------------------------------------");
    }
    public static int max(int [] array) {
        int max = 0;
        for(int i=0; i<array.length; i++ ) {
           if(array[i]>max) {
              max = array[i];
           }
        }
        return max;
    }
    public static int min(int [] array) {
        int min = array[0];
        for(int i=0; i<array.length; i++ ) {
           if(array[i]<min) {
              min = array[i];
           }
        }
        return min;
    }
    public static int indexMax(int [] array, int max) {
        for(int i=0; i<array.length; i++ ) {
           if(array[i] == max) {
              max = i;
           }
        }
        return max;
    }
    public static int indexMin(int [] array, int min) {
        for(int i=0; i<array.length; i++ ) {
           if(array[i] == min) {
              min = i;
           }
        }
        return min;
    }
}
