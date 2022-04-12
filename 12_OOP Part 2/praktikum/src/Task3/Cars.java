package Task3;

public class Cars extends Vehicle{

    private int wheel_count;
    private String engine_type;
    public Cars(){}
    public Cars(String name, String withEngine, int wheel_count, String engine_type) {
        super(name, withEngine);
        this.wheel_count = wheel_count;
        this.engine_type = engine_type;
    }

    public int getWheel_count() {
        return wheel_count;
    }

    public void setWheel_count(int wheel_count) {
        this.wheel_count = wheel_count;
    }

    public String getEngine_type() {
        return engine_type;
    }
    
    public void setEngine_type(String engine_type) {
        this.engine_type = engine_type;
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
    public void setName(String name) {
        // TODO Auto-generated method stub
        super.setName(name);
    }

    @Override
    public void setWithEngine(String withEngine) {
        // TODO Auto-generated method stub
        super.setWithEngine(withEngine);
    }

    @Override
    public void identify_myself() {
        // TODO Auto-generated method stub
        super.identify_myself();
        System.out.println("Hi I'm Car, My Name is "+getName()+", My Engine Status is '"+getWithEngine()+"', I have "+getWheel_count()+" Wheel(s), My Engine Type - "+getEngine_type());
    }    
}
