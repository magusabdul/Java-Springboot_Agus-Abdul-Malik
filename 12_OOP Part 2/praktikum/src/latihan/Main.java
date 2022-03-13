package latihan;

public class Main {
    public static void main(String[] args) throws Exception {
        Dog dog = new Dog("Sam", "Green"); // menginisiasi sebuah object

        // Memanggil sebuah object
        System.out.println(dog.getName());
        System.out.println(dog.getColor());

        // Memanggil properti dari object
        dog.sound();
        dog.eat();


        // Menginisiasi object child dari Dog.java || INHERITANCE
        ChildDog childDog = new ChildDog("Julia", "Brown");
        /// Memanggil nilai sebuah object yang telah di inheritance
        System.out.println(childDog.getName());
        System.out.println(childDog.getColor());

        // Memanggil properti dari object yang telah di inheritance
        childDog.sound();
        childDog.eat();

        Motorcycle motorcycle = new Motorcycle();
        motorcycle.forward();
        motorcycle.reverse();
        motorcycle.reverse(1,2);
    }
}