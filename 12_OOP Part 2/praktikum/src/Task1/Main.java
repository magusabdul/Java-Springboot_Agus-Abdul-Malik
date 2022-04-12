package Task1;

public class Main {
    public static void main(String[] args) {

        System.out.println("====================================== Kucing ======================================");
        Cat cat = new Cat();
        cat.setFur_color("Hitam");
        cat.setNum_of_leg(4);
        cat.show_identity();
        
        cat.show_identity("Putih", 3);

        Cat cat2 = new Cat("Hitam Putih", 4);
        cat2.show_identity();

        cat2.setFur_color("Poleng poleng");
        cat2.setNum_of_leg(3);
        cat2.show_identity();
        
        cat2.show_identity("Bintik bintik", 4);

        System.out.println("====================================== Ikan ======================================");
        Fish fish = new Fish();
        fish.setJenisIkan("paus");
        fish.setMakanan("plankton");
        fish.show_identity();

        fish.setJenisIkan("cupang");
        fish.setMakanan("cacing");
        System.out.println("saya Ikan dengan detail, Jenis: "+fish.getJenisIkan()+", makanan: "+fish.getMakanan());

        Fish fish2 = new Fish("arwana", "jangkrik");
        fish2.show_identity();

        fish2.setJenisIkan("sapu-sapu");
        fish2.setMakanan("pelet");
        fish2.show_identity();
        
        System.out.println("====================================== Bunga ======================================");
        Flower flower = new Flower();
        flower.setNama_bunga("bangkai");
        flower.setWarna_bunga("merah");
        flower.setNum_of_petal(12);
        flower.show_identity();

        Flower flower2 = new Flower("anggrek", "putih", 8);
        flower2.show_identity();

        Flower flower3 = new Flower("mawar", "merah", 3);
        flower3.show_identity();

        flower3.setNama_bunga("melati");
        flower3.setWarna_bunga("melati");
        flower3.setNum_of_petal(5);
        flower3.show_identity();
        
        System.out.println("====================================== Mobil ======================================");
        Car car = new Car("sedan", "merah", 4);
        car.show_identity();
        
        Car car2 = new Car("truk", "hijau", 6);
        car2.show_identity();
        
        Car car3 = new Car("tronton", "coklat", 12);
        car3.show_identity();
        
        Car car4 = new Car("angkot", "kuning", 4);
        car4.show_identity();
    }
}
