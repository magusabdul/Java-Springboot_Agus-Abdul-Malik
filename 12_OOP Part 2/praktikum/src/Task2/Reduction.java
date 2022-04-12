package Task2;

public class Reduction implements Calculator {

    private int value1, value2;
    @Override
    public void input(int value1, int value2) {
        // TODO Auto-generated method stub
        this.value1 = value1;
        this.value2 = value2;
        System.out.println("Hasil : "+reduction());
    }
    public void setValue1(int value1) {
        this.value1 = value1;
    }
    public int getValue1() {
        return value1;
    }
    public void setValue2(int value2) {
        this.value2 = value2;
    }
    public int getValue2() {
        return value2;
    }
    public int reduction(){
        return value1 - value2;
    }
}
