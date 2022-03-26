public class Task5 {
    public static void main(String[] args) {
        palindrome("katak");
        palindrome("mister");
    }
    private static void palindrome(String input){
        String output = "";
        int panjangString = input.length();
        for(int i = (panjangString - 1); i>=0; --i){
            output = output + input.charAt(i);
        }

        if(input.toLowerCase().equals(output.toLowerCase())){
            System.out.println(input + " : Palindrome");
        } else {
            System.out.println(input + " : Bukan Palindrome");
        }

    }
}
