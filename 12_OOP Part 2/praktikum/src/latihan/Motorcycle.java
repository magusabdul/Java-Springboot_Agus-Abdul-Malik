package latihan;

public class Motorcycle implements Vehicle{

    /// Data abstraction dapat trus digunakan di class-class lain
    /// metode ini termasuk kedalam metofe Polimorpishm
    /// ini akan berguna sekali untuk nanti di spring boot untuk mengurangi penulisan kode berulang-ulang
    @Override
    public void forward() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void reverse() {
        // TODO Auto-generated method stub
        
    }
    /// Polimorpishm : dengan ini dapat membuat dua atau lebih nama properti yang sama
    public void reverse(int weight, int height) {
        System.out.println("Weight: "+weight + ", Height: "+height);
    }
    
}
