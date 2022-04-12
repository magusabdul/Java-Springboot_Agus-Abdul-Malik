package Task4;

public class Main {
    public static void main(String[] args) {
        Animals animals = new Animals();
        animals.setName("Binatang");
        animals.identity_myself();

        Herbivor herbivor = new Herbivor();
        herbivor.setName("Kambing");
        herbivor.identity_myself();

        Carnivor carnivor = new Carnivor();
        carnivor.setName("Singa");
        carnivor.identity_myself();

        Omnivor omnivor = new Omnivor();
        omnivor.setName("Ayam");
        omnivor.identity_myself();

    }
}
