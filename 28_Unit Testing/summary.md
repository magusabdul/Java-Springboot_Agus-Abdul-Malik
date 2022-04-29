# 28 UNIT TESTING

## RESUME MATERI
1. Jenis Testing
2. Prisip testing (FIRST)
3. Apa struktur yang baik untuk tes unit?

### Jenis Testing
Ada banyak metode testing diantara nya diurutkan dari paling susah ke semakin murah:
1. Manual testing
2. UI Tests
3. System Tests
4. Integration Tests
Biasanya dibuat oleh developer, tidak wajib namun bisa lebih baik
5. Unit Tests
paling murah, paling cepet dan paling simpel

Apa itu Unit Test?
Sebuah testing yang dilakukan pada komponen yang paling terkecil

komponen terkecil di java misal : kelas

satu file test untuk satu kelas

Unit test berfungsi sebagai validasi apakah sebuah komponen dari yang terkecil dapat berjalan sesuai ekspektasi developer


Perbedaan Integration test dan Unit test

integration test
akan memenggil api dan menerima response
database nyala restful nyala, dan sebagai nya juga menyala, jadi sebenarbenarnya

unit test
akan menguji setiap komponen terkecil di aplikasi agar diketahui kekurangan dan kelebihan nya


Unit test Concern
- Fungsi harus benar dan komplit
- harus memikirkan error handling, 
- menyesuaikan input value/parameter dengen benar
- output harus benar
- algorithma dan performa uji harus dengan benar dan baik dan cepat

Manfaat Unit Test
- Kode berkualitas
- mudah menemukan bug/error
- pengembangan yang cepat
- desain yang mudah
- harganya murah


### Prisip testing (FIRST):
1. Fast
    - Tes unit adalah potongan kecil kode yang melakukan satu, spesifik
    tugas.
    - Karena tes unit kecil, dan tidak seperti tes integrasi, unit
    tes tidak berkomunikasi melalui jaringan dan tidak melakukan operasi basis data.
    - Karena pengujian unit tidak berkomunikasi dengan server jarak jauh atau database, mereka berjalan sangat cepat.
    - Karena pengujian unit cepat, gunakan ini untuk menguji semua percabangan basis kode.
2. Isolated/Independent
    - Tes unit harus independen satu sama lain.
    - Satu unit tes tidak boleh bergantung pada hasil yang dihasilkan dengan tes unit lain. Faktanya, sebagian besar waktu, unit test adalah
    berjalan dalam urutan acak.
    - Kode yang Anda uji atau sistem yang sedang diuji harus juga diisolasi dari ketergantungannya.
    - Karena urutan independen acak, kami juga dapat menjalankan mereka secara paralel untuk meningkatkan kecepatan tes
3. Repeatable (Dapat diulang)
    - Unit tes harus dapat diulang dan jika dijalankan beberapa kali harus menghasilkan hasil yang sama. Jika tes unit dijalankan pada komputer yang berbeda itu juga harus menghasilkan hasil yang sama.
    - Inilah mengapa mengapa tes unit dibuat independen dari lingkungan dan dari unit test lainnya.
    - Hati-hati dengan fungsionalitas terkait Tanggal / Waktu
4. Self-Validating
    - Untuk mengetahui apakah tes unit telah lulus atau tidak, pengembang harus tidak melakukan pemeriksaan manual tambahan setelah tes selesai
    - Tambahkan asersi sebanyak mungkin
    - Verifikasi argumen yang dipanggil ke dependensi, jangan hanya periksa apakah itu dipanggil atau tidak dipanggil
5. Thorough
    - Kita harus mempertimbangkan jalan bahagia serta skenario negatif.
    - Buat beberapa unit test untuk menguji fungsi yang menerima perbedaan parameter input, yang valid dan tidak valid
    - Tulis nama metode yang mendokumentasikan diri atau deskripsi skenario
    - Jika Anda berlatih TDD, tepat waktu berarti tes tulis sebelumnya menulis kode
    - Tetapi sebagian besar waktu itu tidak praktis, alih-alih menulis tes sebelumnya mengirimkan PR untuk kode baru
    - Tambahkan tes ke kode lama sesegera mungkin, jangan abaikan penulisan
    tes setelahnya

### Apa struktur yang baik untuk tes unit?
3A = Arrange, Act, Assert. juga disebut sebagai Given, when, then.
- Arrange: Semua data harus disediakan untuk pengujian saat Anda akan menjalankan tes dan seharusnya tidak bergantung pada lingkungan Anda menjalankan tes
- Act: Panggil metode aktual yang sedang diuji
- Assert: Pada titik tertentu, tes unit seharusnya hanya menegaskan satu hasil logis, beberapa pernyataan fisik dapat menjadi bagian dari ini pernyataan fisik, selama mereka semua bertindak dalam keadaan yang sama obyek.

Mocking Object
Mocking berarti membuat versi palsu dari eksternal atau internal
layanan yang dapat berdiri di untuk yang nyata.
Mocking di java Anda dapat menggunakan Mockito.

Cukup tambahkan @Mock ke objek Anda.
Dan jangan lupa MockitoAnnotations.initMocks(this);
Atau Anda dapat menggunakan @ExtendWith(MockitoExtension.class)

Memberikan hasil perilaku ke Objek Mock
```java
# Void
doNothing().when(mockObject).method();
# Return
when(mockObject.method()).thenReturn(expectedResult);
# Throw
when(mockObject.method().thenAnswer( invocation -> { throw new
Exception("fail msg"); }
```

Mocking @Autowired\
Dapat menggunakan @InjectMocks di kelas yang menggunakan objek Autowired.

Spring Controller Testing
Lebih baik memeriksa semua fungsi (termasuk json
body, url path) dari @RestController atau @Controller menggunakan
MockMvc.
Secara default, ketika Anda menggunakan MockMvc yang Anda butuhkan
SpringBootApplication. Tapi juga dapat menggunakan MockMvc
tanpa SpringBootApplication menggunakan StandAlone.

Spring Test
```xml
<dependency>
    <groupld>org.springframework.boot</groupld>
    <artifactld>spring-boot-starter-test</artifactid>
    <scope>test</scope>
</dependency>
```

Easy Random
```xml
<dependency>
    <groupld>org.jeasy</groupld>
    <artifactld>easy-random-core</artifactld>
    <version>4.0.0</version>
</dependency>
```
Gson
```xml
<dependency>
    <groupld>com.google.code.gson</groupld>
    <artifactid>gson</artifactld>
    <version>2.8.5</version>
</dependency>
```

Cara Mendapatkan Cakupan Kode
- Setup JaCoCo di pom.xml
- Run mvn clean test
- Cek di folder /target/site/jacoco/index.html

## TASK
Objective
- Implemenet unit testing in Springboot using JUnit
### Problem - Bussiness Logic Layer Testing
Dari praktikum pada materi springboot SQL/NoSQL, lakukan unit test pada bagian service!\
Minimun 3 test case!