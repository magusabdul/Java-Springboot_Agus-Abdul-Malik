public class Task7 {
    public static void main(String[] args) {
        playWithAsterisk(5);
    }
    private static void playWithAsterisk(int input){        
        for (int i=1;i<=input;i++){
            //Membuat spasi
            for(int j=input-1;j>=i;j--){
                System.out.print(" ");
            }
            //Membuat bintang
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            for (int l=1;l<=i-1;l++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
