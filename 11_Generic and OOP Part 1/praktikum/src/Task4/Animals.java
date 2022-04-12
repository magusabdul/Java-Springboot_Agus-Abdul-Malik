package Task4;

public class Animals {
    private String name, jenisMakanan, gigiBinatang;
    
    public Animals(){

    }

    public Animals(String name, String jenisMakanan, String gigiBinatang){
        this.name = name;
        this.jenisMakanan = jenisMakanan;
        this.gigiBinatang = gigiBinatang;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setJenisMakanan(String jenisMakanan) {
        this.jenisMakanan = jenisMakanan;
    }
    public String getJenisMakanan() {
        return jenisMakanan;
    }
    public void setGigiBinatang(String gigiBinatang) {
        this.gigiBinatang = gigiBinatang;
    }
    public String getGigiBinatang() {
        return gigiBinatang;
    }
    public void identity_myself() {
        System.out.println("Hi I'm Parent of All Animal, My Name is "+getName());
    }
}
