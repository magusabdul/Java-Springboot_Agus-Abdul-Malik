package Task1;

public class Flower {
    private String nama_bunga, warna_bunga;
    private int num_of_petal;

    public Flower(){

    }
    public Flower(String nama_bunga, String warna_bunga, int num_of_petal){
        this.nama_bunga = nama_bunga;
        this.warna_bunga = warna_bunga;
        this.num_of_petal = num_of_petal;        
    }
    public void setNama_bunga(String nama_bunga) {
        this.nama_bunga = nama_bunga;
    }
    public void setNum_of_petal(int num_of_petal) {
        this.num_of_petal = num_of_petal;
    }
    public void setWarna_bunga(String warna_bunga) {
        this.warna_bunga = warna_bunga;
    }
    public String getNama_bunga() {
        return nama_bunga;
    }
    public int getNum_of_petal() {
        return num_of_petal;
    }
    public String getWarna_bunga() {
        return warna_bunga;
    }
    public void show_identity() {
        System.out.println("saya Bunga dengan detail, Jenis: "+nama_bunga+", color: "+getWarna_bunga()+", num of petal: "+getNum_of_petal());
    }
}
