package Task4;

public class Carnivor extends Animals{

    public Carnivor(){

    }
    public Carnivor(String name, String jenisMakanan, String gigiBinatang) {
        super(name, jenisMakanan, gigiBinatang);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String getGigiBinatang() {
        // TODO Auto-generated method stub
        return "Tajam";
    }

    @Override
    public String getJenisMakanan() {
        // TODO Auto-generated method stub
        return "Daging";
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return super.getName();
    }

    @Override
    public void setName(String name) {
        // TODO Auto-generated method stub
        super.setName(name);
    }

    @Override
    public void identity_myself() {
        // TODO Auto-generated method stub
        System.out.println("Hi I'm Carnivor, My Name is "+getName()+", My Food is '"+getJenisMakanan()+"', I have "+getGigiBinatang()+" teeth");
    }    
}
