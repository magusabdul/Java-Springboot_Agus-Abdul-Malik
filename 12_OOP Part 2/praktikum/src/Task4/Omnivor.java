package Task4;

public class Omnivor extends Animals{

    public Omnivor(){
        
    }
    public Omnivor(String name, String jenisMakanan, String gigiBinatang) {
        super(name, jenisMakanan, gigiBinatang);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String getGigiBinatang() {
        // TODO Auto-generated method stub
        return "Tajam dan tumpul";
    }

    @Override
    public String getJenisMakanan() {
        // TODO Auto-generated method stub
        return "Semua";
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
        System.out.println("Hi I'm Omnivor, My Name is "+getName()+", My Food is '"+getJenisMakanan()+"', I have "+getGigiBinatang()+" teeth");
    }
}
