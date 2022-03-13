package latihan;

public class Car implements Vehicle{
    /// akan otomatis terbuat atribut atau properti dari Data Abstraction yang di implementasikan nya
    @Override
    public void forward() {
        // TODO Auto-generated method stub
        /// dapat menambahkan isi method yang dar Data Abstraction yang di implementasikan nya
        System.out.println("50 km/h");
    }

    @Override
    public void reverse() {
        // TODO Auto-generated method stub
        /// dapat menambahkan isi method yang dar Data Abstraction yang di implementasikan nya
        System.out.println("10 km/h");
    }
    
}
