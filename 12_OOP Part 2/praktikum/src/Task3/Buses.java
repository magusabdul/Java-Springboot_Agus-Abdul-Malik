package Task3;

public class Buses extends Vehicle{

    private int wheel_count;
    private String privateBus;
    public Buses(){};
    public Buses(String name, String withEngine, int wheel_count, String privateBus) {
        super(name, withEngine);
        this.wheel_count = wheel_count;
        this.privateBus = privateBus;
        //TODO Auto-generated constructor stub
    }
    public int getWheel_count() {
        return wheel_count;
    }
    public void setWheel_count(int wheel_count) {
        this.wheel_count = wheel_count;
    }
    public String getPrivateBus() {
        return privateBus;
    }
    public void setPrivateBus(String privateBus) {
        this.privateBus = privateBus;
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
        System.out.println("H1 I'm Bus ["+getPrivateBus()+"], My Name is "+getName()+", My Engine Status is '"+getWithEngine()+"', I have "+getWheel_count()+" Wheel(s)");
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
