# 14 Join - Union - Agregasi - Subquery - Function (DBMS)

## Resume Materi
1. JOIN, UNION, AGREGASI
2. SUBQUERY
3. FUNCTION

### JOIN, UNION, AGREGASI
JOIN\
adalah sebuah query untuk menggabungkan data tabel 1 ka tabel lain
minimal 2 tabel dan dapat menggabungkan 2 buah tabel atau lebih banyak tabel
Sebuah Klausa untuk mengkombinasikan record dari dua atau lebih tabel

Join standar SQL ANSI\
ada 3 join yang biasa di gunakan
1. inner join\
irisan dari 2 buah tabel atau lebih\
inner join akan mengembalikan baris-baris dari dua tabel atau lebih yang memenuhi syarat
```sql
SELECT t.message FROM users u
INNER JOIN tweets t
ON u id = t. user_id;
```

2. left join
Left join akan mengembalikan seluruh baris dari tabel di sebelah kiri yang dikenai kondisi ON dan hanya baris dari tabel disebelah kanan yang memenuhi kondisi join
```sql
SELECT u.username, t.message
FROM users u
LEFT JOIN tweets t
ON u.id = t.user_id;
```

3. right join
Right join akan mengembalikan semua baris dari tabel sebelah kana yang di kenai kondisi ON dengan data dari tabel sebelah kiri yang memenuhi kondisi join. Teknik ini merupakan kebalikan dari left join.
```sql
SELECT u.username, t.message
FROM users u
RIGHT JOIN tweets t
ON u.id = t.user_id;
```

UNION\
Adan hal yang perlu diperhatikan dari union adalah jumlah field yang dikeluarkan/dipanggil harus sama
```sql
SELECT username. fullname
FROM users WHERE id=1
UNION
SELECT username.fullname
FROM users WHERE id=2;
```

AGGREGATE
Fungsi agregasi
adalah fungsi dimana nilai beberapa baris dikelompokan bersama untuk membentuk nilai ringkasan tunggal

Fungsi Agregasi SQL
1. MIN
fungsi dimna nilai beberapa baris dikelompokan bersama untuk membentuk nilai ringkasan tunggal\
Tampilkan id terkecil dari tabel users
```sql
SELECT MIN(id) AS id FROM users
```

2. MAX
Digunakan untuk mendapatkan nilai maximum atau nilai terbesar dari sebuah data record di tabel\
Tampilkan nilai id terbesar dari tabel users
```sql
SELECT MAX(id) FROM users
```

3. SUM
Digunakan untuk mendapatkan jumlah total nilai dari sebuha data atau record di tabel\
Tampilkan jumlah total favourite_count dari tabel tweets dengan user_id 1
```sql
SELECT SUM(favourite_count)
FROM tweets WHERE user_id=1
```

4. AVG
Digunakan untuk mencari nilai rata-rata(averange) dari sebuah data atau record di tabel\
Tampilkan nilai rata-rata favourite_count dari tabel tweets dengan user_id 1
```sql
SELECT AVG(favourite_count)
FROM tweets WHERE user_id=1
```

5. COUNT
Digunakan untuk mencari jumlah dari sebuah data atau record di tabel\
Tampilkan jumlah data dari tabel tweets dengan user_id 1
```sql
SELECT COUNT(1) FROM tweets
WHERE user_id=1
```

6. HAVING
Digunakan untuk menyeleksi data berdasarkan kriteria tertentu, dimana kriteria berupa fungsi aggregat\
Tampilkan data dari tabel tweets dengan jumlah total favourite_count per user lebih dari 2
```sql
SELECT user_id FROM tweets
GROUP BY user_id
HAVING SUM(favourite_count)>2
```

### SUBQUERY
Subquery atau inner query atau Nested query adalah
query di dalam query SQL lain

Sebuah Subquery digunakan untuk mengembalikan data yang akan digunakan dalam query utama sebagai syarat untuk lebih membatasi data yang akan diambil

SUBQUERY dapat digunakan dengan SELECT, INSERT, UPDATE, dan DELETE statements bersama dengan operator seperti:\
=, <, >, >=, <=, IN, BETWEEN, dan lainnya

PERATURAN
- Harus tertutup dalam tanda kurung
- Sebuh subquery hanya dapat memiliki satu kolom pada klausa SELECT, kecuali beberapa kolom yang di query utama untuk subquery untuk membandingkan kolom yang dipilih
- Subqueries yang kembali lebih dari satu baris hanya dapat digunkan dengan beberapa value operator, seperti operator IN
- Daftar SELECT tidak bisa menyertakan referensi ke nilai-nilai yang mengevaluasi ke BLOB, ARRAY, CLOB atau NCLOB.
- Sebuah subquery tidak dapat segera tertutup dalam fungsi set

CONTOH
Tampilkan data tabel users yang user_id nya ada pada tabel tweets
```sql
SELECT * FROM USERS WHERE id IN
(SELECT user_id FROM
tweets GROUP BY user_id);
```
Tampilkan data tabel users yang jumlah total favourite_count per user lebih dari 5 pada tabel tweets
```sql
SELECT * FROM USERS WHERE id
IN (SELECT user_id FROM tweets GROUP BY user_id
HAVING SUM(favourite_count)>5);
```

### FUNCTION
sebuah kumpulan statement yang akan mengembalikan sebuah nilai balik pada pemanggilnya

CONTOH
Function untuk mengembalikan jumlah data dari tweets per user
```sql
DELIMITER $$
CREATE FUNCTION sf_count_tweet_peruser
(user_id_p int) RETURN INT DETERMINISTIC
BEGIN
DECLARE total INT;
SELECT COUNT(*) INTO total FROM tweets
WHERE user_id = user_id_p AND
type='tweets';
RETURN total;
END$$
DELIMITER;
```

DELIMITER\
memberi tahu kepada mysql soal delimiter yang digunakan, secara default menggunkan ; jadi bila da tanda ; mysql akan mengartikan akhir dari statement, pada contoh di atas delimiter yang di gunakan $$ jadi akhir statement nya adalah $$

CREATE FUNCTION\
adalah header untuk membuat function

RETURN\
adalah untuk menentukan tipe data yang di return-kan oleh function

DETERMINISTIC/NOT DETEMINISTIC\
adalah untuk menentukan yang bisa menggunakan function ini adalah user pembuatnya saja(deterministic) atau siapa saja (noto deterministic)

BEGIN END\
adalah body dari function, jadi semua SQL nya di tulis di sini
```sql
select
sf_count_tweet_peruser(2);
``` 
*akan menampilkan jumlah tweets user id 2

CONTOH\
Buat Trigger Function untuk delete data yang berhubungan dengan table users yang sedang di delete datanya
```sql
DELIMITER $$
CREATE TRIGGER delete_all_data_user
BEFORE DELETE ON users FOR EACH ROW
BEGIN
-- declare variables
DECLARE v_user_id INT;
SET v_user_id=OLD.id;
-- trigger code
DELETE FROM tweets WHERE user_id=v_user_id;
DELETE FROM user_followers WHERE
user_id=v_user_id;
END$$
```
CREATE TRIGGER\
adalah header untuk membuat trigger function

DECLARE\
adalah syntax untuk mendeclare kan sesuatu hal/variabel

OLD\ 
adalah variabel yang menyimpan nilai dari dalam data yang sedang berinteraksi/dipanggil

NEW\
adalah variabel yang menyimpan nilai dari data yang baru masuk/sedang di input

BEGIN END\
adalah body dari function jadi semua SQL nya di tulis di sini


## Task

### Database Relational
Dari Tugas sebelumnya terkait dengan DML dalam Database Relational selanjutnya kerjakan tugas berikut!
![Database Relational](https://github.com/magusabdul/Java-Springboot_Agus-Abdul-Malik/blob/master/14_Join%20-%20Union%20-%20Agregasi%20-%20Subquery%20-%20Function%20(DBMS)/screenshots/1.PNG)

Problem

1. Insert
    - Insert 5 operators pada table operators.
    - Insert 3 product type.
    - Insert 2 product dengan product type id = 1, dan operators id - 3.
    - Insert 3 product dengan product type id - 2. dan operators id-1
    - Insert 3 product dengan product type id = 3, dan operators id - 4
    - Insert product description pada setiap product.
    - Insert 3 payment methods.
    - Insert 5 user pada tabel user
    - Insert 3 transaksi di masing-masing user. (soal berlanjut ke soal 1))
    - Insert 3 product di masing-masing transaksi

2. Select
    - Tampilkan nama user / pelanggan dengan gender Laki-laki/M.
    - Tampilkan product dengan id-3.
    - Tampilkan data pelanggan yang created at dalam rango 7 hari kebelakang dan mempunyai nama mengandung kata'a
    - Hitung jumlah user / pelanggan dengan status gender Perempuan.
    - Tampilkan data pelanggan dengan urutan sesuai nama abjad
    - Tampilkan 5 data pada data product

3. Update
    - Ubah data product id 1 dengan nama 'product dummy
    - Update qty-3 pada transaction detail dengan product id 1

4. Delete
    - Delete data pada tabel product dengan ld 1.
    - Delete pada pada tabel product dengan product type id 1.

### Join, Union, Sub-query, Function
1. Gabungkan data transaksi darluser ld 1 dan user id 2.
2. Tampilkan jumlah harga transaksi user id 1
3. Tampikan total transaksi dengan product type 2.
4. Tampilkan semua field table product dan field name table product type yang saling berhubungan
5. Tamplkan semus held table transaction held name table product dan field name table user
6. Buat function setelah data transaksi dihapus maka transaction detail terhapus juga dengan transaction id yang dimaksud
7. Buat function setelah data transaksi detail dihapus maka data total_qty terupdate berdasarkan qty data transaction id yang dihapus.
8. Tampilkan data products yang tidak pernah ada di tabel transaction details dengan sub-query
