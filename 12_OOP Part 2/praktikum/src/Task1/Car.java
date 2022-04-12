package Task1;

public class Car {
    private String car_type, color;
    private int num_of_tire;

    public Car(){}
    public Car(String car_type, String color, int num_of_tire){
        this.car_type = car_type;
        this.color = color;
        this.num_of_tire = num_of_tire;
    }
    public void setCar_type(String car_type) {
        this.car_type = car_type;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setNum_of_tire(int num_of_tire) {
        this.num_of_tire = num_of_tire;
    }
    public String getCar_type() {
        return car_type;
    }
    public String getColor() {
        return color;
    }
    public int getNum_of_tire() {
        return num_of_tire;
    }
    public void show_identity() {
        System.out.println("saya mobil dengan detail, Type: "+getCar_type()+", color: "+getColor()+", num of tire: "+getNum_of_tire());
    }
}
