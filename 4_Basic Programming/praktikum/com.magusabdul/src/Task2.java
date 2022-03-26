public class Task2 {
    public static void main(String[] args) {
        membandingkanChar("xoxoxo");
        membandingkanChar("oxoxoxo");
        membandingkanChar("oxo");
    }
    public static void membandingkanChar(String input){
        boolean output;
        char huruf;
        int x = 0, o = 0;
        for(int i = 0; i<input.length(); i++){
            huruf = Character.toLowerCase(input.charAt(i));
            if(huruf == 'x'){
                x++;
            } else {
                o++;
            }
        }
        if(!(output = x == o)){
            output = false;
        }
        System.out.println(input+" = "+ output);
    }
}
