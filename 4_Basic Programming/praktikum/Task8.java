public class Task8 {
    public static void main(String[] args) {
        cetakTabelPerkalian(9);
    }
    private static void cetakTabelPerkalian(int input){
        String tabel = "";
        for (int i = 1; i <= input; i++) {
            
            for (int j = 1; j <= 9; j++) {
                //menampilkan angka dan pengaturan
                if (i * j < 10) {
                    tabel += " " + i * j;
                } else {
                    tabel += " " + i * j;

                }
            }
            tabel += "\n";
        }
        //menampilkan hasilnya
        System.out.println(tabel);
    }
}
