package Task3;

public class Bikes extends Vehicle{

    private int wheel_count;
    public Bikes(){}
    public Bikes(String name, String withEngine, int wheel_count) {
        super(name, withEngine);
        this.wheel_count = wheel_count;
        //TODO Auto-generated constructor stub
    }
    public void setWheel_count(int wheel_count) {
        this.wheel_count = wheel_count;
    }
    public int getWheel_count() {
        return wheel_count;
    }
    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return super.getName();
    }
    @Override
    public String getWithEngine() {
        // TODO Auto-generated method stub
        return super.getWithEngine();
    }
    @Override
    public void identify_myself() {
        // TODO Auto-generated method stub
        super.identify_myself();
        System.out.println("Hi I'm Bike, My Name is "+getName()+", My Engine Status is '"+getWithEngine()+"', I have "+getWheel_count()+" Wheel(s)");
    }
    @Override
    public void setName(String name) {
        // TODO Auto-generated method stub
        super.setName(name);
    }
    @Override
    public void setWithEngine(String withEngine) {
        // TODO Auto-generated method stub
        super.setWithEngine(withEngine);
    }
    
}
