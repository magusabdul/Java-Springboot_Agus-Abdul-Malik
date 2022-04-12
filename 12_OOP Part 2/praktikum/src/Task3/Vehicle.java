package Task3;

public class Vehicle {
    private String name, withEngine;
    public Vehicle(){
        
    }
    public Vehicle(String name, String withEngine){
        this.name = name;
        this.withEngine = withEngine;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setWithEngine(String withEngine) {
        this.withEngine = withEngine;
    }
    public String getWithEngine(){
        return withEngine;
    }

    public void identify_myself() {}
}