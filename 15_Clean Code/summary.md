# 15 Clean Code

## Resume Materi
1. PENGENALAN CLEAN CODE
2. 9 KARAKTERISTIK CLEAN CODE
3. PRINSIP CLEAN CODE

### PENGENALAN CLEAN CODE
Clean Code adalah sebuah cara membuat kode yang berstandar internasional\
Penginisialan nama variabel di bawah membingungkan
```java
class UpdateController {
    int i = 5; 
    String nm = "John Doe";
    String e = "johndoe@gmail.com";
}
```

Apa itu clean code\
Clean Code adalah istilah untuk kode yang mudah dibaca, difahami dan diubah oleh programmer.\
Ketika bekerja dengan sebuah code sebenarnya kita tidak perlu membuat kode yang baik, tapi sebaiknya kode mudah di baca di fahami dan diubah oleh orang lain dan kita sendiri (Brandon Gregory).\
Programmer yang baik, ketika menulis code harus memikirkan agar kode mudah dibaca di fahami dan diubah (Martin Fowler).

Ilustrasi clean code\
jika semakin banyak celaan maka code yang dibuat buruk, dan sebaliknya jika sedikit bahkan tidak ada celaan maka code yang dibuat itu baik.

Kenapa clean code
- Work Collaboration\
kita membutuhkan kerjasama atau kolaborasi dengan rekan kerja atau orang lain, maka membutuhkan clean code
- Feature Development\
Jika code kita baik maka fature yang kita kembangkan akan lebih berkualitas dan dapat berkembang kembali
- Faster Development\
Karena clean code maka proses pengembangan kita dapat mudah berjalan dan terus berkembang pesat


### 9 KARAKTERISTIK CLEAN CODE
1. Mudah di fahami\
penamaan varibel harus mudah di fahami, penamaan variabel harus mewakili/mencerminkan fungsi nya
2. Mudah dieja dan dicari\
ketika memberikan penamaan pada variabel harus mudah dieja dan mudah dicari sesuai dengan fungsi nya
3. Singkat namun mendeskripsikan konteks\
sebaiknya penamaan varibel tidak terlalu panjang
4. Konsisten\
sebaiknya ketika memberi nama kepada variabel kita harus konsisten
5. Hindari Penambahan konteks yang tidak perlu
6. Gunakan komentar seperlu nya saja
7. Good Function\
pastikan parameter yang tidak terlalu panjang, jika memang dibutuhkan banyak parameter, kita ubah parameter tersebut menjadi object agar mudah dibaca\
ketika mendefinisikan variabel, hindari akses global variabel, sebisa mungkin gunakan local variabel, karena jika ada lokal variabel yang mempunyai nama yang sama maka akan merusak struktur data\
ketika mendefinisikan function, maka gunakan komentar karena akan sangat membantu untuk memahami tugas function tersebut
8. Gunakan konvensi untuk referensi menulis code\
Example "Style Guide" : airbnb, google, dan lainnya. untuk sebuah project
9. Formatting
    - Lebar baris code 80 - 120 Karakter.
    - Satu class 300 - 500 baris.
    - Baris code yang berhubungan saling berdekatan.
    - Dekatkan fungsi dengan pemanggilnya.
    - Deklarasi variabel berdekatan dengan penggunanya.
    - Perhatikan indentasi.
    - Menggunakan prettier atau formatter.


### PRINSIP CLEAN CODE
1. KISS (Keep It So Simple)\
Hindari membuat fungsi yang dibuat untuk melakukan A, sekaligus memodifikasi B, mengecek fungsi C, dst.\
Tips untuk selalu KISS
    - Fungsi atau class harus kecil.
    - Fungsi dibuat untuk melakukan satu tugas saja.
    - Jangan gunakan terlalu banyak argumen pada fungsi.
    - Harus diperhatikan untuk mencapai kondisi yang seimbang, kecil dan jumlahnya minimal
2. DRY (Don't Repeat Yourself)\
Duplikasi code terjadi karena sering copy paste. Untuk menghindari duplikasi code, buatlah fungsi yang dapat digunakan secar berulang-ulang.
3. Refactoring\
Refactoring adalah proses rektrukturisasi kode yang dibuat, dengan cara mengubah struktur internal tanpa mengubah perilaku eksternal. Prinsip KISS dan DRY bisa dicapai dengan cara refactor.\
Teknik Refactoring:
    - Membuat Sebuah akstraksi.
    - Memecah kode dengan fungsi/class.
    - Perbaiki penamaan dan lokasi kode.
    - Deteksi kode yang memiliki duplikasi.


## Task

###
