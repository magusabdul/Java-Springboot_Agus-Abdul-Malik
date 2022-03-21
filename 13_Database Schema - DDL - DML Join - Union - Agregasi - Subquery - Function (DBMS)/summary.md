# 13 Database Schema - DDL - DML Join - Union - Agregasi - Subquery - Function (DBMS)

## Resume Materi
1. Introduction Database
2. Relationship Database
3. Jenis Perintah SQL

### 1. Introduction Database
Database adalah sekumpulan data yang terorganisir

Model data

Entity Relationship Diagram

Diagram di desain database sebelum menpraktekannya
Entity Relationship Diagram (ERD) adalah suatu diagram yang digunakan untuk merancang desain suatu basis data. Diagram ini dibuat untuk menggambarkan hubungan atau relasi antar entitas atau objek beserta dengan atributnya yang terdapat dalam sebuah basis data.

Structured Query Language(SQL)
Bahasa pemrograman khusus yang di hunakan untuk manajemen RDBMS, biasanya dibentuk tabel tabel\
ada juga yang di namakan NoSQL

### 2. Relationship Database
1. One to One
satu ke satu, contoh satu user hanya memiliki 1 foto profil

2. One to Many
satu ke banyak, contoh satu user bisa memiliki banyak tweets

3. Many to Many
banyak ke banyak, contoh satu user dapat memiliki banyak follower dan satu user dapat mem follow banyak user

Relational Databse Management Systems (RDBMS)
Software yang menggunakan Relational Database Model sebagai dasarnya, contoh MySQL

### 3. Jenis Perintah SQL
1. Data Definition Language(DDL)\
    DDL Statement:
    ```bash
    CREATE DATABASE database_name;

    USE database_name;

    CREATE TABLE ...

    DROP TABLE ...

    RENAME TABLE ...
    ```

    CREATE TABLE WITH IS SCHEMA:
    ```bash
    CREATE TABLE table_name(
        column1 data_type PRIMARY KEY,
        column2 data_type FOREIGN KEY,
        ...
        column data_type,
        PRIMARY KEY(one or more columns)
    );
    ```

    MODIFY TABLE SCHEMA:
    ```bash
    ALTER TABLE table_name

    ADD COLUMN column_name
    data_type;
    ```
    TIPE DATA MySQL
    - Num
    - Huruf
    - Date

2. Data Manipulation Language(DML)
Perintah yang digunakan untuk memanipulasi data dalam tabel dari suatu database\
    STATEMENT OPERATION:
    - INSERT\
    Input data ke table user
    ```bash
    INSERT INTO USERS
    (username,fullname,status,gender,email,password,location)
    VALUES ('hadialdo','Nurhadi Aldo',1,'m','hadialdo@tronjaltronjol.com','123456','Jawa Timur')
    ```
    - SELECT\
    Menampilkan semua data pada tabel user
    ```bash
    SELECT * FROM USERS
    ```
    Menampilkan username dan fullname pada table user yang id nya 1
    ```bash
    SELECT username.fullname
    FROM USERS WHERE id=1
    ```
    Menampilkan username dan fullname dari tabel user yang usernamenya tidak kosong
    ```bash
    SELECT username,fullname
    FROM users WHERE fullname IS NOT NULL 
    ```
    - UPDATE\
    Ubah data fullname ke tabel user dengan id 1
    ```bash
    UPDATE users SET
    fullname='Nurhadi Aldo Tronjal Tronjol'
    WHERE id = 1
    ```
    - DELETE\
    Hapus data pada tabel user dengan id 1
    ```bash
    DELETE FROM users
    WHERE id = 1
    ```
    DML Statement:
    - LIKE/BETWEEN\
        Tampilkan data user_id dan message table tweets yang message mengandung huruf H didepan\
        ```bash
        SELECT user_id, type, message, parent_id
        FROM tweets WHERE message LIKE 'H%'
        ```
        Tampilkan data user_id dan message table tweets yang user_id antara 1 dan 3
        ```bash
        SELECT user_id,type, message, parent_id
        FROM tweets WHERE user_id BETWEEN 1 AND 3
        ```

    - AND/OR\
        Tampilkan data user_id dan message table tweets yang message mengandung huruf H didepan atau user_id antara 1 dan 3
        ```bash
        SELECT user_id,type,mesage,parent_id
        FROM tweets WHERE message LIKE 'H%'
        OR user_id BETWEEN 1 AND 3
        ```
        Tampilkan data user_id dan message table tweets yang message mengandung huruf H didepan dan user_id antara 1 dan 3
        ```bash
        SELECT user_id,type,mesage,parent_id
        FROM tweets WHERE message LIKE 'H%'
        AND user_id BETWEEN 1 AND 3
        ```

    - ORDER BY\
        Tampilkan data user_id dan message table tweets yang message mengandung huruf H didepan atau user_id antara 1 dan 3 diurutkan berdasarkan id tweets berurutan dari terbesar ke terkecil
        ```bash
        SELECT id,user_id,type,message,parent_id
        FROM tweets
        WHERE message LIKE 'H%' OR user_id
        BETWEEN 1 AND 2 ORDER BY id DESC
        ```

    - LIMIT
        Tampilkan data user_id dan message table tweets yang message mengandung huruf H didepan atau user_id antara 1 dan 3 diurutkan berdasarkan id tweets berurutan dari terbesar ke terkecil di batasi 2 data
        ```bash
        SELECT user_id,type,message,parent_id
        FROM TWEETS
        WHERE message LIKE 'H%' AND user_id
        BETWEEN 1 AND 3 ORDER BY id DESC
        LIMIT 2
        ```

3. Data Control Language(DCL)


## Task

### PART 1 -SCHEMA DATABASE
Learning Competencies

- Mengerti bentuk-bentuk relasi skema database dasar
- Mampu memodelkan relasi skema dasar
- Mampu mengimplementasikan 1-to-1, 1-to-many, many-to-many

Summary

Setelah mempelajari cara mendesain database, kita akan mencoba untuk memodelkan skema dan relasinya berdasarkan kasus di dunia nyata. Kita akan mencoba menganalisa suatu kasus dan menentukan skema serta relasi yang dibutuhkan.\
Releases\
Release 0: Implement the Schema (Digital Outlet Pulsa)
1. Sistem dapat menyimpan data mengenai detail item product, yaitu : product, product_type, product_description, operator, payment methods
2. Sistem juga harus menyimpan data mengenai pelanggan yang akan membeli product tsb diantaranya : nama, alamat, tanggal lahir, status_user, gender, created_at, updated_at
3. Sistem dapat mencatat transaksi pembelian dari pelanggan.
4. Sistem dapat mencatat detail transaksi pembelian dari pelanggan.
5. Gunakan draw.io atau lucidchart untuk membuat ERD.

### PART 2 - Data Definition Language
Learning Competencies
- Mampu untuk menggunakan statement SQL DDL
- Mampu menggunakan MySQL di Terminal untuk query data

Summary:

Silakan mempelajari terlebih dahulu lebih lanjut mengenai SQL dan MySQL. Sekarang kamu akan mengimplementasikan schema yang kamu buat menjadi tabel di MySQL, memasukkan data ke tabel dan melakukan pengambilan data pada tabel-tabel yang ada.

Releases:
1. Create database alta_online_shop.
2. Dari schema Olshop yang telah kamu kerjakan di, Implementasikanlah menjadi table pada MySQL.
    - Create table user
    - Create table product, product type, operators, product description, payment method.
    - Create table transaction, transaction detail.
3. Create tabel kurir dengan field id, name, created_at, updated_at.
4. Tambahkan ongkos_dasar column di tabel kurir.
5. Rename tabel kurir menjadi shipping.
6. Hapus / Drop tabel shipping karena ternyata tidak dibutuhkan,
7. Silahkan menambahkan entity baru dengan relation 1-to-1, 1-to-many, many-to-many.
    Seperti:
    - 1 to 1: payment method description.
    - 1-to-many: user dengan alamat.
    - many-to-many: user dengan payment method menjadi user_payment_method_detail