public class Task1 {
    public static void main(String[] args) {
        String input = "Alterra Indonesia";
        int vokalCount = 0, konsonanCount = 0, totalChar=0;
        char huruf;
        System.out.println("Kalimat = " + input);
        for(int i = 0; i < input.length(); i++){
            huruf = Character.toLowerCase(input.charAt(i));
            if(huruf == 'a' || huruf == 'i' || huruf == 'u' || huruf == 'e' || huruf == 'o'){
                vokalCount++;
            }
            else {
                konsonanCount++;
            }
            totalChar = input.length()-1;
        }
        System.out.println("Jumlah Vokal = " + vokalCount);
        System.out.println("Jumlah Konsonan = " + konsonanCount);
        System.out.println("Jumlah Karakter = " + totalChar);
    }
}
