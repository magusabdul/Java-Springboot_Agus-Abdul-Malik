# 11 Generic and OOP part 1

## Resume Materi
1. Object Oriented Programming (OOP)
2. OOP Fundamental Concept
3. Inheritance dan Polymorpishm

### Object Oriented Programming (OOP)
pemrograman yang memiliki ideologi bahwa berbagai hal di lihat sebagai object\
Properties/atribut\
secara visual mempunyai apa aja\
Behavior\
object dapat mempunyai fungsi apa atau dapat melakukan apa aja

### OOP Fundamental Concept
1. Ecapsulation
proses object di bungkus dalam sebuah modifier
    - class
        object yang kelas nya belum terlihat\
        class penamaan nya dimulai dengan CamelCase
    ```bash
    public class Dog {
        private String name;
        private String color;
    }
    ```


    - object 
    class yang sudah terlihat atau terbuat
    membuat sebuah object yaitu dengan 'new'

    - Atribute type
        - Public 
        dapat diakses darimana saja

        - Protected
        hanya buku buku tertentu yang dimiliki atau yang hanya dapat di gunakan beberapa

        - Private
        hanya beberapa yang dapat di gunakan untuk yang mempunyai hak atau di ruang lingkup sendiri

    - Method dan functions
    biasanya digunakan dalam setter getter

2. Data Abstraction
    object yang umum\
    punya method dan class yang umum dapat digunakan semua object atau class lain\
    menggunakan implement : menurunkan semua atrbut
3. Inheritance 
4. Polymorpishm

### Inheritance dan Polymorpishm
- Inheritance
    menurunkan sifat/method/fungsi\
    menggunakan extend : menurunkan satu atau semua atribut\
    overriding

- Polymorpishm
    peningkatan dari inherintance, dapat method yang sama atau penamaan sama namun atribut nya dapat beda2\
    overloading

## Task

### Challenge 1 - Encapsulation
Challenges OOP\
Definisikan beberapa class sebebas-bebasnya terkait jenis binatang tumbuhan / kendaraan, misalnya Cat, Fish, Flower, Car, dan lainnya. Gunakan konsep encapsulation (public, protected, private) sesuai dengan contoh analogi di dunia nyata\
Add some properties\
Tambahkan variable instance dan method di setiap class yang kamu buat. Misalnya fur_color, num_of_leg, show_identity Kemudian buat code yang membuktikan konsep encapsulation kamu berjalan sesuai harapan. Misalnya apakah instance dari class Frog dapat meng-akses variable public, protected dan private tersebut? atau coba panggil method dari class tersebut apakah menghasilkan return sesuai yang kamu inginkan?\
Buatlah Class Sebagai Berikut:

1. Cat
Tambahkan properties & method dibawah pada Class Cat fur_color property untuk menunjukkan warna bulu num_of_leg property untuk menunjukkan jumlah kaki show_identity method untuk menampilkan detail Object\
dengan contoh output sebagai berikut:
    ```bash
    Saya Kucing dengan detail, Warna Bulu: Hitam dengan jumlah kaki : 4 
    Saya Kucing dengan detail, Warna Bulu: Putih dengan jumlah kaki: 3 
    Saya Kucing dengan detail, Warna Bulu: Hitam Putih dengan jumlah kaki : 4 
    Saya Kucing dengan detail, Warna Bulu: Poleng poleng dengan jumlah kaki: 3
    Saya Kucing dengan detail, Warna Bulu: bintik bintik dengan jumlah kaki : 4
    ```

2. Fish
Tambahkan properties & method dibawah pada Class Fish type property untuk menunjukkan jenis ikan feed property untuk menunjukkan makanan dari ikan tersebut show_identity method untuk menampilkan detail Object\
dengan contoh output sebagai berikut:
    ```bash
    saya Ikan dengan detail, Jenis: paus, makanan: plankton
    saya Ikan dengan detail, Jenis: cupang, makanan: cacing
    saya Ikan dengan detail, Jenis: arwana, makanan: jangkrik
    saya Ikan dengan detail, Jenis: sapu-sapu, makanan: pelet
    ```

3. Flower
Tambahkan properties & method dibawah pada Class Flower\
nama property untuk menunjukkan nama bunga color property untuk menunjukkan warna bunga num_of_petal property untuk menunjukkan jumlah petal. show_identity method untuk menampilkan detail Object dengan contoh output sebagai berikut:
    ```bash
    saya Bunga dengan detail, Jenis: bangkai, color: merah, num of petal: 12 
    saya Bunga dengan detail, Jenis: anggrek, color: putih, num of petal: 8 
    saya Bunga dengan detail, Jenis: mawar, color: merah, num of petal: 3 
    saya Bunga dengan detail, Jenis: melati, color: kuning, num of petal: 5
    ```

4. Car
Tambahkan properties & method dibawah pada Class Car type: property untuk menunjukkan tipe mobil(contoh: sedan, truk) color: property untuk menunjukkan warna mobil num_of_tire: property untuk menunjukkan jumlah roda show_identity: method untuk menampilkan detail Object\ 
dengan contoh output sebagai berikut:
    ```bash
    saya mobil dengan detail, Type: sedan, color: merah, num of tire: 4
    saya mobil dengan detail, Type: truk, color: hijau, num of tire: 6 
    saya mobil dengan detail, Type: tronton, color: coklat, num of tire: 12 
    saya mobil dengan detail, Type: angkot, color: kuning, num of tire: 4
    ```

### Challenge 2- Data Abstraction
Buatlah sebuah aplikasi calculator sederhana dengan fungsi penjumlahan, pembagian, pengurangan dan perkalian. Manfaatkan fungsi input() pada java untuk memasukkan 2 angka yang ingin anda operasikan dan 1 angka berupa pilihan operasi. Cetak hasil operasi pada akhir bagian.\
Sebelum melakukan operasi, memunculkan menu pilihan untuk membuka calculator atau menutup calculator. misalnya kita memilih 1, maka akan masuk menu memasukkan Value 1 dan Value 2.\
Selanjutnya, misalnya kita memasukkan\
value 1 = 5,\
value 2 = 3,\
value 3 = 1 (untuk operasi penjumlahan)

Maka akan mencetak:\
Hasil 8

Lihat demo berikut!
    ```bash
    ++++++++++++ CALCULATOR ++++++++++++
    99: Exit
    1: Open Calculator Masukkan pilihan anda:

    ++++++++++++ CALCULATOR ++++++++++++
    Masukkan Value 1 : 5
    Masukkan Value 2 : 3

    ++++++++++++ CALCULATOR ++++++++++++
    Please Enter Calculation Operation:
    1. Add Value
    2. Sub Value
    3. Multiply Value
    4. Divide Value

    ++++++++++++ CALCULATOR ++++++++++++
    Pilihan Anda : 1

    ++++++++++++ CALCULATOR ++++++++++++
    Pilihan Anda : 1
    Hasil : 8
    ```

### Challenge 3 - Inheritance & Polymorphism (Vehicles)
Vehicles -> Bikes\
Vehicles -> Cars\
Vehicles -> Buses

Bikes -> Pedal Bikes\
Bikes -> Motor Bikes

Cars -> Sport Cars\
Cars -> Pickup Cars

Buses -> Sport Cars\
Buses -> Pickup Cars

VEHICLES TREE\
Detail nya sebagai berikut :
1. Class Vehicle adalah Parent dan semua class yang ada
Class Vehicle Memiliki Beberapa property yang penting
    - name untuk nama Object
    - with engine untuk flag object tersebut memiliki mesin atau tidak
2. Class Bikes Cars dan Buses adalah child dari Parent Vehicles pergunakan reserved word super untuk inisialisasi object yg dibentuk
3. Keistimewaan class Bikes\
Class Bikes Memik Property tambahan sbb
    - wheel_count untuk jumtan roda yang dimiliki
4. Keistimewaan class Cars\
Class Cars Memiliki Property tambahan sbb
    - wheel_count untuk jumlah roda yang dimitiks
    - engine_type untuk tipe mesin yang dipakai di object bersangkutan
5. Keistimewaan class Buses\
Class Bikes Memilki Property tambahan sbb:
    - wheel_count untuk jumtah oda yang diratio
    - private bus - untuk flag object tersebut adalah bus private atau bus public
6. Di Setiap Class Bikes, Cars dan Buses, masing2 nya memiliki method identify_myself yang merupakan override dari method yang ada di Class Vehicle, untuk menampilkan output seperti yang tampil pada gambar dibawah\
Silahkan Membuat Class Sesuai dengan Tree Diatas dan mendapatkan output sebagai berikut:\
Silahkan di analisa dan buat Class Type Coding nya di Java
    ```bash
    Hi I'm Bike, My Name is Pedal Bikes, My Engine Status is 'no engine', I have 2 Wheel(s)
    Hi I'm Bike, My Name is Motor Bikes, My Engine Status is 'with engine', I have 2 Wheel(s) I
    Hi I'm Car, My Name is Sport Cars, My Engine Status is 'with engine', I have 4 Wheel(s), My Engine Type - Vs
    H1 I'm Car, My Name is Pickup Cars, My Engine Status is 'with engine', I have 4 Wheel(s), My Engine Type - Solar
    H1 I'm Bus [Public Bus], My Name is Trans Jakarta, My Engine Status is 'with engine', I have 4 Wheel(s)
    Hi I'm Bus [Private engine], My Name is School Bus, My Engine Status is 'with engine', I have 4 Wheel(s)
    ```


### Challenge 4 - Inheritance & Polymorpishm (Animals)
Animals -> Herbivor\
Animals -> Carnivor\
Animals -> Omnivor

Herbivor    -> Horse\
            -> Goat

CarniVor    -> Tiger\
            -> Lion

Omnivor     -> Chiken\
            -> Duck

Detail nya sebagai berikut :

1. Class Animal adalah Parent dari semua class yang ada Class Animal Memiliki Beberapa property yang penting
    - Nama dari binatang
    - Jenis makanan
    - Gigi binatang
2. Class Herbivor, Carnivor, dan Omnivor adalah child dari class Animal, pergunakan reserve word Super()
3. Class Herbivor memiliki property penting:
    - Jenis makanan binatang tersebut harus tumbuhan
    - Jenis gigi binatang tersebut harus tumpul
4. Class Carnivor memiliki property penting
    - Jenis makanan binatang tersebut harus daging
    - Jenis gigi binatang tersebut harus tajam

5. Di Setiap Herbivor, Carnivor, dan Omnivor, masing2 nya memiliki method identify_myself yang merupakan override dari method yang ada di Class Animal, untuk menampilkan output seperti yang tampil pada gambar dibawah
    ```bash
    Hi I'm Parent of All Animal, My Name is Binatang
    Hi I'm Herbivor, My Name is Kambing, My Food is 'tumbuhan', I have tumpul teeth 
    Hi I'm Carnivor, My Name is Singa, My Food is 'daging', I have tajam teeth
    Hi I'm Omnivor, My Name is Ayam, My Food is 'semua', I have tajam dan tumpul teeth
    ```

### Challenge 5 - Tebak Kandang
OOP CONCEPT
1. Encapsulation
2. Data Abstraction
3. Inheritance & Polymorphism

What To Do:\
Please Make Board Game named "Tebak Kandang" !

Description\
Tebak Kandang merupakan game untuk menebak isi dari kumpulan kandang.
```bash
============================
        Tebak Kandang
============================
1. Jumlah Kandang 
99. Exit
============================
Pilih menu: 1
```
Pertama-tama kita memilih menu untuk menentukan berapa jumlah kandang
```bash
Masukkan jumlah kandang:3
|||
|1|
|||
|||
|2|
|||
|||
|3|
|||
Pilih kandang yang ingin dibuka:
```
Kondisi awal semua kandang akan tertutup. Lalu kita akan menebak kandang nomor berapa berisi hewan apa.
```bash
Masukkan jumlah kandang:3
|||
|1|
|||
|||
|2|
|||
|||
|3|
|||
Pilih kandang yang ingin dibuka:1 
----------PILIHAN----------
K: Kambing
Z: Zebra
B: Bebek
Masukkan tebakan:
```
Apabila tebakan benar maka kandang akan terbuka dan menampilkan isi hewan
```bash
PERCOBAAN BUKA:
|||
|B|
|||
|||
|2|
|||
|||
|3|
|||
Tebakan Benar!
|||
|B|
|||
|||
|2|
|||
|||
|3|
|||
Pilih kandang yang akan dibuka:
```
Sedangkan apabila tebakan salah, maka kandang akan menutup kembali
```bash
PERCOBAAN BUKA:
|||
|B|
|||
|||
|2|
|||
|||
|3|
|||
Tebakan Salah
|||
|1|
|||
|||
|2|
|||
|||
|3|
|||
Pilih kandang yang akan dibuka:
```
Permainan akan berakhir apabila kita sudah menebak dengan benar isi dari semua kandang
```bash
PERCOBAAN BUKA:
|||
|B|
|||
|||
|2|
|||
|||
|3|
|||
Tebakan Benar!
|||
|1|
|||
|||
|2|
|||
|||
|3|
|||
Pilih kandang yang akan dibuka:

Selamat! anda menebak semua kandang
```
CLUE\
Buatlah code dengan mengikuti beberapa petunjuk berikut :\
Kandang OBJECT\
Buatlah Object Kandang untuk membuat kandang dengan contoh tampilan:
```bash
|||
|Z|
|||
```
- Object kandang memiliki method untuk membuat kandang, dan membuka kandang
Gunakan Konsep OOP yang sudah di ajarkan untuk membuat semua cell sebagai sebuah Object, ada 3 tipe Kandang Object yang harus dibuat:
1. Kandang Kambing, adalah:
    - Tampilan untuk isi dari kandang ini adalah "K" dengan warna biru
2. Kandang Bebek, adalah:
    - Tampilan untuk isi dari kandang ini adalah "B" dengan warna kuning
3. Kandang Zebra, adalah:
    - Tampilan untukandang ini adalah Z dengan warna merah

BOARD OBJECT\
Board object adalah object yang digunakan untuk papan permainan, beberapa hal yang perlu diperhatikan untuk membuat object Board:
1. Memiliki method untuk menampilkan menu
2. Memiliki method untuk menampilkan kumpulan kandang.
3. Memiliki method untuk me-random isi dari kumpulan kandang
4. Memiliki method memilih kandang yang ingin kita buka untuk ditebak isinya

Petunjuk Warna\
Gunakan warna hijau untuk pesan sukses(tebakan benar dan permainan selesai)\
Gunakan warna kuning untuk pesan peringatan(tebakan salah)\
Gunakan warna biru untuk nama permainan di bagian menu awal
