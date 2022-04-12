package Task1;

public class Fish {
    private String jenisIkan, makanan;

    public Fish(){

    }
    public Fish(String jenisIkan, String makanan){
        this.jenisIkan = jenisIkan;
        this.makanan = makanan;
    }
    public void setJenisIkan(String jenisIkan) {
        this.jenisIkan = jenisIkan;
    }
    public void setMakanan(String makanan) {
        this.makanan = makanan;
    }
    public String getJenisIkan() {
        return jenisIkan;
    }
    public String getMakanan() {
        return makanan;
    }
    public void show_identity() {
        System.out.println("saya Ikan dengan detail, Jenis: "+getJenisIkan()+", makanan: "+getMakanan());
    }
}
