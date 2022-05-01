# 29 Integration Test

## RESUME MATERI
1. Sejarah
2. Tipe Software testing
3. Praktik

### Sejarah
Outline 
- Software Testing\
pengertian dan kelibhan kekurangan
- Type Software Testing\
type-type
- Software Testing Important
- Unit test or Integration test
- Spring Unit test
- Sping Integration test
- challenge

Bagaimana implementasi dalam spring tentang integration testing

Pengujian Perangkat Lunak adalah metode untuk memeriksa apakah produk perangkat lunak yang sebenarnya sesuai harapan persyaratan dan untuk memastikan bahwa produk perangkat lunak bebas Cacat. Melibatkan pelaksanaan perangkat lunak/komponen sistem menggunakan alat manual atau otomatis untuk mengevaluasi satu atau lebih properti bunga. Tujuan dari pengujian perangkat lunak adalah untuk mengidentifikasi kesalahan, celah atau hilang persyaratan berbeda dengan yang sebenarnya Persyaratan.

Pengujian penting karena bug perangkat lunak bisa jadi mahal atau bahkan berbahaya. Bug perangkat lunak berpotensi menyebabkan kerugian moneter dan manusia, dan sejarah penuh dengan itu contoh.

Pada April 2015, terminal Bloomberg di London jatuh karena kesalahan perangkat lunak mempengaruhi lebih dari 300.000 pedagang di pasar keuangan. Itu memaksa pemerintah untuk menunda penjualan utang 3 miliar pound. Mobil Nissan menarik lebih dari 1 juta mobil dari pasar karena kegagalan perangkat lunak pada detektor sensor airbag. Telah dilaporkan dua kecelakaan karena ini kegagalan perangkat lunak. Starbucks terpaksa menutup sekitar 60 persen dari toko di AS dan Kanada karena kegagalan perangkat lunak di sistem POS-nya. Pada satu titik, toko menyajikan kopi gratis karena mereka tidak dapat memproses transaksi. cara salah satu melihat kesehatan sebuah aplikasi 
software testing adalah cara bagaimana untuk menguji aplikasi yang dibuat, kenapa penting? karena aplikasi jika tidak diuji maka akan banyak bug yang tidak diketahuii salah satu tahapan krusial dalam development.

### Tipe Software testing
Software testing types secara garis besar ada 3:
- Functional testing
- Non-functional testing
- Maintenance testing

Functional testing
- Unit testing
- Integration testing
- Smoke
- UAT(User Account Testing)
- Localization
- Globalization
- Interoperability

Non-Functional testing
- Performance
- Endurance
- Load
- Volume
- Scalability
- Usability

Maintenance
- Regression
- Maintenance

Functional testing

Pengujian fungsional adalah prosesnya melalui mana QA menentukan apakah a bagian dari perangkat lunak bertindak dalam sesuai dengan yang telah ditentukan Persyaratan. Ini menggunakan kotak hitam teknik pengujian, di mana penguji tidak memiliki pengetahuan tentang logika sistem internal. Fungsional pengujian hanya berkaitan dengan memvalidasi jika suatu sistem berfungsi sebagai disengaja.

Non-functional testing

PENGUJIAN NON-FUNGSIONAL didefinisikan sebagai jenis pengujian Perangkat Lunak untuk diperiksa aspek non-fungsional (kinerja, kegunaan,keandalan, dll) dari perangkat lunak aplikasi. Ini dirancang untuk menguji kesiapan sistem sesuai parameter nonfungsional yang tidak pernah ditangani oleh pengujian fungsional.

Maintenance testing

Dalam pengujian perangkat lunak, ada lebih banyak dari 100 jenis pengujian dan ini pengujian pemeliharaan adalah salah satunya. Sebagai penguji, kami melakukan pengujian perangkat lunak selama tahap pra-rilis. Kami juga melakukan pengujian pada perangkat lunak setelah itu dilepaskan. Pertunjukan pengujian setelah dirilis diketahui sebagai pengujian pemeliharaan.

Unit Testing

PENGUJIAN UNIT adalah jenis perangkat lunak pengujian di mana unit individu atau komponen perangkat lunak yang diuji. Tujuannya adalah untuk memvalidasi bahwa setiap unit kode perangkat lunak berfungsi sebagai mengharapkan. Pengujian Unit dilakukan selama pengembangan (fase pengkodean) dari sebuah aplikasi oleh pengembang, Unit Pengujian mengisolasi bagian kode dan memverifikasi kebenarannya, Sebuah unit mungkin sebuah fungsi individu, metode, prosedur, modul, atau objek.

Integration testing

PENGUJIAN INTEGRASI didefinisikan sebagai jenis pengujian di mana modul perangkat lunak terintegrasi secara logis dan diuji sebagai kelompok. Sebuah proyek perangkat lunak yang khas terdiri dari: dari beberapa modul perangkat lunak, dikodekan oleh programmer yang berbeda. Tujuan dari tingkat pengujian ini adalah untuk mengekspos cacat pada interaksi antara perangkat lunak ini modul ketika mereka terintegrasi

### Praktik

Spring Unit testing preparation
- depedencies
- spring project

Depedencies
Berikut contoh dependensi untuk menjalankan unit tes atau tes integrasi di spring boot. Kami membutuhkan Database H2 untuk database sampel untuk pengujian pemanfaatan data tiruan.

Contoh Unit test

Kami juga membutuhkan jUnit dan mockito untuk menegaskan dan mengejek data atau logika. Anda dapat menemukannya di mynrepository.com Berikut contoh pengujian unit pada boot pegas.\
@RunWith anotasi untuk menyuntikkan pegas kelas kelas pelari ke kelas pengujian.\
@MockBean penjelasan untuk menyuntikkan layanan lapisan sebagai layanan tiruan


Contoh unit test

Berikut contoh kasus uji pada pengujian kelas
pada springboot. Kita bisa menggunakan harapan dari beberapa Kasus cobaan,

Akan dikembalikan HTTPStatus.OK dari status http dan kembalikan respons sebagai JSON respon dan harapan lebih, Anda dapat menemukan harapan mockito


Contoh integration test

Berikut contoh untuk tes integrasi di spring boot.
@RunWith anotasi akan disuntikkan pengujian kelas dengan kelas pelari pegas.

@SpringBootTest penjelasan akan menyuntikkan pengujian kelas ke aplikasi konteks.

@AutoConfigureMockMvc penjelasan akan menyuntikkan pengujian kelas dengan otomatis konfigurasikan tiruan mvc Setelah itu, Anda dapat menulis test case di atasnya

Contoh integration test

Berikut contoh kasus uji pada tes integrasi di boot musim semi. Kami memiliki beberapa harapan di atasnya

seperti mengembalikan objek yang didirikan. Kita bisa menambahkan yang lain harapan di atasnya seperti dikembalikan tali atau apapun.



## TASK

### Challenge

Setelah membuat aplikasi CRUD pada pertemuan sebelumnya, berikan masing masing endpoint yang sudah dibuat cover dengan integration test dan unit test nya
