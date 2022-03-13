package latihan;

public class Dog {
    /// Mengapa private? untuk atribut nya agar dimiliki oleh object ini
    private String name;
    private String color;

// construktor adalah sebuah method yang dapat menyimpan nilai pertama sebuah object ketika di inisasi
    public Dog(String name, String color){ 
        this.name = name;
        this.color = color;
    }
    // membuat/mengisi behavior nya
    public void sound(){
        System.out.println("Dooog dog");
    }
    public void eat(){
        System.out.println("Makan!");
    }

// membuat sebuah getter setter 
    public String setName(String name){
        return this.name = name;
    }
    public String getName(){
        return name;
    }
    public String setColor(String color){
        return this.color = color;
    }
    public String getColor(){
        return color;
    }
}