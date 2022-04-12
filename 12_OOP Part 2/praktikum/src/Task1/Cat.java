package Task1;

public class Cat {
    private String fur_color;
    private int num_of_leg;

    public Cat(){

    }

    public Cat(String fur_color, int num_of_leg){
        this.fur_color = fur_color;
        this.num_of_leg = num_of_leg;
    }

    public void show_identity() {
        System.out.println("Saya Kucing dengan detail, Warna Bulu: "+getFur_color()+" dengan jumlah kaki : "+getNum_of_leg());
    }

    public void show_identity(String fur_color, int num_of_leg) {
        this.fur_color = fur_color;
        this.num_of_leg = num_of_leg;
        System.out.println("Saya Kucing dengan detail, Warna Bulu: "+getFur_color()+" dengan jumlah kaki : "+getNum_of_leg());
    }

    public void setFur_color(String fur_color) {
        this.fur_color = fur_color;
    }
    public void setNum_of_leg(int num_of_leg) {
        this.num_of_leg = num_of_leg;
    }
    public String getFur_color() {
        return fur_color;
    }
    public int getNum_of_leg() {
        return num_of_leg;
    }
}
