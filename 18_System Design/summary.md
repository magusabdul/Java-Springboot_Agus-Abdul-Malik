# 18 System Design

## Resume Materi
1. INTRODUCTION SYSTEM DESIGN
2. Job/Work Queue, Load Balancing, Monolithic dan Microservices, SQL dan NoSQL
3. Caching dan Indexing

### SYSTEM DESIGN
- Diagram Design
- Charasteristic of Distributed Systems
- Horizontal Scaling vs Vertical Scalling
- Job/Work Queue
- Load Balancing
- Monolithic vs Microservices
- SQL vs NoSQL
- Caching
- Database Indexing
- Database Replication

Diagram\
Sebuah simbol yang mempresentasikan informasi yang akan di sampaikan

Diagram Design Tools
- Smartdraw
- Lucidchart
- Whimsical
- draw.io
- Visio

Jenis-Jenis System Desaign paling sering digunakan
- Flowchart\
repereseantasi sebuah proses/alur, Proses Decision Terminator\
Contoh 1: https://www.google.com/url?q=https://www.lucidchart.com/pages/templates/flowchart&sa=D&source=editors&ust=1648115615445554&usg=AOvVaw2a7qlvGovwCVsSUzluZsN9 \
Contoh 2: https://www.google.com/url?q=https://whimsical.com/M9XPnqZyKXNSX3iBypQN6Z&sa=D&source=editors&ust=1648115615445856&usg=AOvVaw0zseQBzSxuw5C9nFDSmmzr
- Use case\
Sebuah ringkasan dari sistem ada apa saja dan cara interaksi nya \
Contoh 1: https://www.google.com/url?q=https://www.lucidchart.com/pages/uml-use-case-diagram&sa=D&source=editors&ust=1648115615575614&usg=AOvVaw30D41PUCTILlxE9Xmjff4s \
Contoh 2: https://www.google.com/url?q=https://www.lucidchart.com/invitations/accept/2ea6733f-7917-425a-9782-0882d2183e34&sa=D&source=editors&ust=1648115615576100&usg=AOvVaw3oT8apVloeUkg1B5SqWOGl \
Include adalah langkah sebelumnya harus dilakukan terlebih dahulu
Extends adalah sebuah opsi, memberikan pilihan kepada user untuk melalui langkah proses suatu aplikasi
- ERD (Entity Relationship Diagram)\
Sebuah sistem untuk mendesain entity atau tabel di dalam database relasional\
salah satu cara untuk mendesain suatu sistem aplikasi yang mempunyai database yang berbasis relasional\
Contoh: https://www.google.com/url?q=https://www.lucidchart.com/pages/er-diagrams%23section_0&sa=D&source=editors&ust=1648115615523124&usg=AOvVaw2Te4MyEsP7XBzjKyJZ0r9O \
ada jenis hubungan:
    - Zero or one
    - Many
    - One
    - One(and only one)
    - Zero or many
    - one or many

- HLA (High Level Arvhitecture)\
Sebuah gambaran garis besar paling tinggi dalam mendesain suatu sistem. dalam teknologi nya, bahasa pemrograman\
Contoh 1: https://www.google.com/url?q=https://www.lucidchart.com/invitations/accept/8a3e0ac8-2009-459f-820a-5de2fc106b22&sa=D&source=editors&ust=1648115615444312&usg=AOvVaw2mYPRVDi1dQIEpu6A78Wg0 \
Contoh 2: https://www.google.com/url?q=https://app.lucidchart.com/lucidchart/2f5c038d-bdd8-47be-835c-2faea34e3ffb/edit?shared%3Dtrue%26page%3D.Q4MUjXso07N%23&sa=D&source=editors&ust=1648115615444744&usg=AOvVaw0bJ8CSJ9eE-NSDWI7SOoBE 


Horizontal Scaling vs Vertical Scalling\
System Desaign Basics
- Bagian terkecil dari arsitektur yang dapat digunakan
- Ketika sudah menjadi aplikasi besar bagaimana pengembangan nya
- Bagaimana mengoptimasi atau mengoptimalkan sebuah sistem yang telah ada

Karakteristik Distributed system
- Scalability\
cara agar sistem dapat berjalan\
Scaling\
Menambah kekuatan/ukuran sistem
    - Vertical Scaling yaitu mengincrease kekuatan sistem, misal dari 20 transaksi menjadi 30 transaksi\
    - Horizontal Scaling yaitu mengincrease kekuatan sistem dengan cara menduplikasi ability yang ada, misal dari 30 transaksi menjadi 60 transaksi
- Reliability\ 
Sebuah kehandalan sistem, jangan sampai sistem gagal dalam melakukan transaksi
- Avaibility\
adalah ketersediaan sistem untuk melayani client, semua resource yang diinginkan harus tersedia untuk client yang berhak
- Efficiency\
adalah cara agar sebuah sistem jangan terlalu lama melakukan transaksi
- Serviceability or Manageability\
jangan sampai sebuah sistem tidak dapat di kembangakan atau di maintenance jika terdapat kekurangan atau bug


### Job/Work Queue, Load Balancing, Monolithic dan Microservices, SQL dan NoSQL
Job/Work Queue\
Dalam perangkat lunak sistem, antrian pekerjaan (kadang-kadang antrian batch), adalah struktur data yang dikelola oleh perangkat lunak penjadwal kerja yang berisi pekerjaan untuk dijalankan.
Pengguna mengirimkan program mereka yang ingin mereka jalankan, "pekerjaan", ke antrian untuk pemrosesan batch. Perangkat lunak penjadwal mempertahankan antrian sebagai kumpulan pekerjaan yang tersedia untuk dijalankan.\
Beberapa antrean batch dapat digunakan oleh penjadwal untuk membedakan jenis pekerjaan tergantung pada parameter seperti:
- prioritas pekerjaan
- perkiraan waktu eksekusi
- persyaratan sumber daya

Penggunaan antrean batch memberikan manfaat berikut:
- berbagi sumber daya komputer di antara banyak pengguna
- waktu-shift pemrosesan pekerjaan ke ketika komputer kurang sibuk
- menghindari idling sumber daya komputasi tanpa pengawasan manusia menit demi menit
- memungkinkan pemanfaatan sumber daya komputasi yang mahal sepanjang waktu

Setiap proses yang datang ke CPU harus menunggu dalam antrian.\
Work Queue adalah kerangka kerja untuk membangun aplikasi terdistribusi besar yang menjangkau ribuan mesin yang diambil dari cluster, cloud, dan grid. Aplikasi Antrian Kerja ditulis dengan Python, Perl, atau C menggunakan API sederhana yang memungkinkan pengguna untuk menentukan tugas, mengirimkannya ke antrian, dan menunggu selesai. Tugas dijalankan oleh proses pekerja umum yang dapat berjalan pada mesin apa pun yang tersedia. Setiap pekerja menelepon ke rumah untuk proses manajer, mengatur transfer data, dan melaksanakan tugas. Berbagai macam fitur penjadwalan dan manajemen sumber daya disediakan untuk memungkinkan penggunaan efisien armada besar server multicore. Sistem ini menangani berbagai kegagalan, memungkinkan aplikasi yang dapat diskalakan secara dinamis dan kuat.\
Work Queue telah digunakan untuk menulis aplikasi yang menskalakan dari beberapa workstation hingga puluhan ribu core yang berjalan pada superkomputer. Contohnya termasuk sistem alur kerja Parsl, kerangka analisis Coffea, mesin alur kerja Makeflow, SHADHO, Lobster, NanoReactors, ForceBalance, Accelerated Weighted Ensemble, perakit genom SAND, dan All-Pairs dan Wavefront Abstraksi. Kerangka kerja ini mudah digunakan, dan telah digunakan untuk mengajar kursus dalam komputasi paralel, komputasi awan, komputasi terdistribusi, dan cyberinfrastructure di University of Notre Dame, University of Arizona, University of Wisconsin, dan banyak lokasi lainnya.

Load Balancing
Sebuah sistem untuk mengatur space atau ukuran traffic sebuah server untuk menyesuaikan dengan akses user ke sebuah server
- Diantara user dan web server(dapat menggunakan API)
- Antara web Server dan internal platform, seperti aplikasi serverm atau cache server
- antara internal flatform layer dan database

Monolithic dan Microservices
Monolithic\
adalah suatu sistem yang mempunyai banyak service atau depedency yang disimpan di satu server\
biasanya tidak bertransaksi atau bekerja secara besar/luas

Microservices
Sebuah server atau services yang di pecah-pecah menjadi bagian-bagian fungsi yang lebih spesifik komunikasi nya berjalan dengan REST 

SQL dan NoSQL\
SQL dan NoSQL (Relasional databases dan non relasional databases).
- Relational database adalah structude dan mempunyai skema yang saling berelasi atau berhubungan
- Non-relational database adalah database yang tidak berstruktur dan mempunyai skema yang bebas/dinamis

Benefit Relational DB
- Dirancang untuk segala keperluan
- SQL Memiliki standar yang jelas
- Memiliki banyak tool(administrasi, reporting, framework)

Prinsip Relational DB
- Atomicity\
transaksi terjadi semua atau tidak sama sekali
- Consistency\
data tertulis merupakan data valid yang ditentukan berdasarkan aturan tertentu
- Isolation\
pada saat terjadi request yang bersamaan(concurrent), memastikan bahwa transakis dieksekusi seperti dijalankan secara sekuensial
- Durability\
jaminan bahwa transaksi yang telah tersimpan, tetap tersimpan.

### CACHING DAN INDEXING
sebuah penyimpanan data sementara\
digunakan agar jika data yang di butuhkan sama dengan yang telah ada di cache, maka akan lebih cepat proses nya.\
cache akan disimpan di RAM\
cache dapat di simpan di aplikasi

Database Replication\
Redudancy dan Replication\
Replication adalah database yang di replikasi dan dengan database replikasi lain itu saling berkaitan/berhubungan, ketika data pada data di salah satu database ada yang berubah, maka di database lainnya akan berubah.\
hal ini akan mendukung sifat distributed yaitu reability. database replikasi juga digunakan sebagai tempat backup database jika suatu hari terjadi hal yang tidak diinginkan.

Contoh: \
ada Primary server dan Secondary server(Failover) \
ada Active Data dan Mirrored Data(DataReplication)

Database Indexing\
Fitur indexing seolah2 malkukan semacan index, hal ini akan mempermudah proses mendapatkan data

Complexity(Big O Notation)

Indexing
Referensi: https://www.google.com/url?q=https://www.geeksforgeeks.org/indexing-in-databases-set-1/&sa=D&source=editors&ust=1648147403260937&usg=AOvVaw3qCOj4Skr3TGWmVm3rWRn8
Pengindeksan adalah cara untuk mengoptimalkan kinerja database dengan meminimalkan jumlah akses disk yang diperlukan saat kueri diproses. Ini adalah teknik struktur data yang digunakan untuk dengan cepat menemukan dan mengakses data dalam database.\
Indeks dibuat menggunakan beberapa kolom database.
- Kolom pertama adalah kunci Pencarian yang berisi salinan kunci utama atau kunci kandidat tabel. Nilai-nilai ini disimpan dalam urutan yang diurutkan sehingga data yang sesuai dapat diakses dengan cepat.\
- Catatan: Data mungkin atau mungkin tidak disimpan dalam urutan yang diurutkan.
- Kolom kedua adalah Referensi Data atau Pointer yang berisi satu set pointer memegang alamat blok disk di mana nilai kunci tertentu dapat ditemukan.

Pengindeksan memiliki berbagai atribut:
- Jenis Akses: Ini mengacu pada jenis akses seperti pencarian berbasis nilai, akses rentang, dll.
- Waktu Akses: Ini mengacu pada waktu yang dibutuhkan untuk menemukan elemen data tertentu atau kumpulan elemen.
- Waktu Penyisipan: Ini mengacu pada waktu yang dibutuhkan untuk menemukan ruang yang sesuai dan memasukkan data baru.
- Waktu Penghapusan: Waktu yang dibutuhkan untuk menemukan item dan menghapusnya serta memperbarui struktur indeks.
- Space Overhead: Ini mengacu pada ruang tambahan yang dibutuhkan oleh indeks.

Secara umum, ada dua jenis mekanisme organisasi file yang diikuti oleh metode pengindeksan untuk menyimpan data:
1. Sequential File Organization atau Ordered Index File: Dalam hal ini, indeks didasarkan pada urutan nilai yang diurutkan. Ini umumnya cepat dan jenis mekanisme penyimpanan yang lebih tradisional. Organisasi file Yang Dipesan atau Berurutan ini mungkin menyimpan data dalam format yang padat atau jarang:
    - Indeks Padat:
        - Untuk setiap nilai kunci pencarian dalam file data, ada catatan indeks.
        - Catatan ini berisi kunci pencarian dan juga referensi ke catatan data pertama dengan nilai kunci pencarian tersebut.
    - Indeks Jarang:
        - Catatan indeks hanya muncul untuk beberapa item dalam file data. Setiap item menunjuk ke blok seperti yang ditunjukkan.
        - Untuk menemukan catatan, kami menemukan catatan indeks dengan nilai kunci pencarian terbesar kurang dari atau sama dengan nilai kunci pencarian yang kami cari.
        - Kita mulai pada catatan yang ditunjukkan oleh catatan indeks, dan melanjutkan bersama dengan pointer dalam file (yaitu, secara berurutan) sampai kita menemukan catatan yang diinginkan.
2. Organisasi File Hash: Indeks didasarkan pada nilai yang didistribusikan secara seragam di berbagai bucket. Bucket tempat nilai ditetapkan ditentukan oleh fungsi yang disebut fungsi hash.\
Pada dasarnya ada tiga metode pengindeksan:
    - Pengindeksan Terkelompok
    - Pengindeksan Non-Cluster atau Sekunder
    - Pengindeksan Multilevel

Indexing\
Berkerumun Ketika lebih dari dua catatan disimpan dalam file yang sama jenis penyimpanan ini dikenal sebagai pengindeksan kluster. Dengan menggunakan pengindeksan cluster kita dapat mengurangi biaya pencarian alasan menjadi beberapa catatan yang terkait dengan hal yang sama disimpan di satu tempat dan juga memberikan sering bergabung lebih dari dua tabel (catatan).\
Indeks pengelompokan ditentukan pada file data yang dipesan. File data dipesan pada bidang non-kunci. Dalam beberapa kasus, indeks dibuat pada kolom kunci non-primer yang mungkin tidak unik untuk setiap rekaman. Dalam kasus seperti itu, untuk mengidentifikasi catatan lebih cepat, kami akan mengelompokkan dua atau lebih kolom bersama-sama untuk mendapatkan nilai unik dan membuat indeks darinya. Metode ini dikenal sebagai indeks pengelompokan. Pada dasarnya, catatan dengan karakteristik serupa dikelompokkan bersama dan indeks dibuat untuk kelompok-kelompok ini.\
Misalnya, siswa yang belajar di setiap semester dikelompokkan bersama. Yaitu 1st Mahasiswa semester, 2nd mahasiswa semester, 3rd mahasiswa semester dll. dikelompokkan.\
Indeks terkelompok diurutkan sesuai dengan nama depan (Kunci pencarian)\
Pengindeksan Primer:\
Ini adalah jenis Pengindeksan Terkelompok di mana data diurutkan sesuai dengan kunci pencarian dan kunci utama tabel database digunakan untuk membuat indeks. Ini adalah format default pengindeksan di mana ia menginduksi organisasi file berurutan. Karena kunci utama unik dan disimpan dengan cara yang diurutkan, kinerja operasi pencarian cukup efisien.

Non-clustered atau Secondary Indexing\
Indeks non-clustered hanya memberi tahu kita di mana data berada, yaitu memberi kita daftar pointer virtual atau referensi ke lokasi di mana data sebenarnya disimpan. Data tidak disimpan secara fisik dalam urutan indeks. Sebaliknya, data hadir dalam node daun. Misalnya. halaman isi sebuah buku. Setiap entri memberi kita nomor halaman atau lokasi informasi yang disimpan. Data aktual di sini (informasi pada setiap halaman buku) tidak diatur tetapi kami memiliki referensi (halaman konten) yang dipesan ke tempat titik data sebenarnya berada. Kita hanya dapat memiliki pemesanan padat dalam indeks non-clustered karena pemesanan jarang tidak mungkin karena data tidak diatur secara fisik sesuai.\
Ini membutuhkan lebih banyak waktu dibandingkan dengan indeks berkerumun karena beberapa jumlah pekerjaan tambahan dilakukan untuk mengekstrak data dengan mengikuti penunjuk lebih lanjut. Dalam kasus indeks berkerumun, data langsung ada di depan indeks.

Indexing Multilevel \
Dengan pertumbuhan ukuran database, indeks juga tumbuh. Karena indeks disimpan dalam memori utama, indeks satu tingkat mungkin menjadi ukuran yang terlalu besar untuk disimpan dengan beberapa akses disk. Pengindeksan bertingkat memisahkan blok utama menjadi berbagai blok yang lebih kecil sehingga hal yang sama dapat disimpan dalam satu blok. Blok luar dibagi menjadi blok dalam yang pada gilirannya menunjuk ke blok data. Ini dapat dengan mudah disimpan dalam memori utama dengan overhead yang lebih sedikit.

Referensi Database Indexing: https://www.google.com/url?q=https://www.w3schools.com/sql/sql_create_index.asp&sa=D&source=editors&ust=1648147402942845&usg=AOvVaw12SyzLZ19xGSWpnSvAKikR 

## Task
System Design\
Objective
- Mampu menerapkan konsep system design

Challenge
### Problem 1 - Diagram
Akan dikembangkan sistem yang dapat digunakan untuk mencatat pengeluaran seseorang dalam jangka waktu harian.
1. Buatlah design ERD dari diagram diatas!
2. Gambarkan use case diagram dari sistem tersebut!

### Problem 2 - Query (Optional - Nilai Tambah)
Terdapat sebuah Query dalam format SQL
```sql
SELECT * FROM users;
```
Dengan tujuan yang sama, tuliskan dalam bentuk perintah:
1. Redis
2. Neo4J
3. Cassandra

