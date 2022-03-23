# 16 Introduction NoSQL and MongoDB

## Resume Materi
1. SEJARAH DATABASE
2. NoSQL DATABASE
3. TIPE/KATEGORI NoSQL

### SEJARAH DATABASE
Database management system
NoSQL DATABASE

Sejarah
1. Masa Database wars
2. Object Database chalengge
Mulai banyak database yang memiliki konsep object oriented pada penyimpanan data nya
3. Semi Structured
database yang datanya tidak memiliki struktur

Benefit Reltional database
- dirangcang untuk segala keperluan
- SQL memiliki standar yang jelas
- Memiliki banyak tool(administrasi, reporting, framework)

New Era, kebutuhan-kebutuhan baru dalam database
- Big data
- Distributed apps
- Social media

### NoSQL DATABASE
Not only SQL, penyimpanan data yang tidak memiliki relasi.

Not only SQL, DBMS yang menyediakan mekanisme yang lebih fleksible dibandingkan dengan model RDBMS(Sifat ACID).\
Fleksibel yang di maksud adalah menghindari:
- Effort pada sifat transaksi ACID
- Kompleksitas SQL
- Design schema di depan
- Transactions (ditangani oleh aplikasi)

Kelebihan NoSQL:
- schema less
- fast development
- support big size file
- support cluster

NoSQL baik di gunakan ketika:
- Membutuhkan skema fleksibel.
- ACID tidak diperlukan.
- Terdistribusi.
- Data logging.
- Data sementara.

Tidak direkomendasikan untuk:
- Data Finansial
- Data Transaksi
- Data penting dalam bisnis
- ACID sangat diperlukan

Kaidah CAP:
- Consistency\
Setiap proses baca mendapatkan data dari proses penulisan terakhir. sehingga melakukan pengambilan data yang di dapat yaotu yang terbaru.
- Avaibility\
Setiap request mendapatkan respon yang bukan error. response sukses.
- Partition\
DBMS tetap dapat beroperasi meskipun ada kesalahan jaringan.

Tidak ada DBMS yang dapat memiliki semua kaidah tersebut(tradeoff)

Schema-less
- traditional RDBMS
    - Tidak bisa menambah data yang tidak sesuai skema
    - Perlu menambahkan data NULL pada item yang tidak memiliki data
    - Memiliki tipe data yang strict/ketat
    - Tidak dapat menambah beberapa item data pada sebuah field
- NoSQL DBMS
    - Tidak memiliki skema ketika menambahkan data
    - Aplikasi menangani proses validasi tipe data
    - Mendukung proses aggregasi dokumen pada item


### TIPE/KATEGORI NoSQL
- Key/Value\
Contoh: redis
    - NoSQL ini tipe yang paling simpel\
    Pasangan Key dan Value
    - Hash Table\
    Setiap key adalah unik
    - Daiakses menggunakan key
    - Konsep in memory-DB
    - Use case: cache (tempat penyimpanan sementara)
- Column family\
Contoh: cassandra
    - Penyimpanan data per-kolom
    kelebihan untuk pencarian yang kompleks,
    - Use case: On-Line Analytical Processing(OLAP)
- Graph\
Contoh : neo4j
    - Memodelkan struktur relasi dari data\
    KONSEP:\
    Nodes: entity/data yang memiliki label
    Edges: garis yang menghubungkan antar node
    Properties: data pada nodes maupun edges
    - Use case: social network analysis
- Document based\
Contoh: mongoDB
    - Menyimpan informasi sebagai dokumen\
    KONSEP:
    Collections: kumpulan dokumen sejenis
    - Use case: Unstructured data: Logging\
    Contoh: Elastic Search, MongoDB\
    di RDBMS: Tables, Rows, Columns\
    di mongoDB: Collections, Documents, Fields
- Dan lainnya

## Task

### Database NoSQL (MongoDB)
Objektif
- Mampu untuk menggunakan Basic Operation MongoDB
- Mampu menggunakan agregasi di Mongo DB
Submit Your Answer:\
Introduction\
Pada tantangan kali ini kita akan mengimplementasikan basic operation pada MongoDB menggunakan perintah kurang lebih sama dengan perintah tugas relational db. Buat database digital_outlet!

Problem 1: Create, Read, Update and Delete
1. Create
    - Insert 5 operators pada table operators.
    - Insert 3 product type.
    - Insert 2 product dengan product type id-1, dan operators id = 3,
    - Insert 3 product dengan product type id-2, dan operators id-1
    - Insert 3 product dengan product type id- 3. dan operators id-4.
    - Insert product description pada setiap product.
    - Insert 3 payment methods.
    - Insert 5 user pada tabel user.
    - Insert 3 transaksi di masing-masing user (soal berlanjut ke soal 1)
    - Insert 3 product di masing-masing transaksi.
2. Read
    - Tampilkan nama user / pelanggan dengan gender Lad-laki/M
    - Tompilkan product dengan id-3,
    - Hitung jumlah user/pelanggan dengan status gonder Perempuan,
    - Tampilkan data pelanggan dengan urutan sesual nama abjad.
    - Tampilkan 5 data product.
3. Update
    - Ubah data product id 1 dengan nama 'product dummy.
    - Ubah qty-3 pada transaction detall dengan product id 1.
4. Delete
    - Delete data pada tabel product dengan id 1,
    - Delete pada pada tabel product dengan product type id 1.

![Gambar Relasi database](https://github.com/magusabdul/Java-Springboot_Agus-Abdul-Malik/blob/master/16_Introduction%20NoSQL%20and%20MongoDB/screenshots/database.PNG)
