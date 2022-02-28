# 3 Introduction Algorithm

## Resume
Dalam materi ini, mempelajari:
1. Algoritma
2. Pseudo Code
3. Flowchart 

### Algoritma
Algoritma adalah prosedur komputasi yang didefinisikan dengan baik yang mengambil beberapa nilai sebagai input dan menghasilkan beberapa nilai sebagai output.

Contoh Algoritma :
1. check prime number
untuk mencari angka-angka bilangan prima
2. sorting
untuk mengurutkan berbagai data
4. searching
untuk melakukan pencarian data dalam struktur data untuk mendapatkan nilai tertentu yang di cari

Karakteristik Algoritma
1. memiliki sebuah batas(awalan akhiran)
2. intruksi terdefinisi dengan baik
3. efektif dan efisien

Algoritma dasar
1. Sequential
proses yang mengurut yang tidak mengacak
2. Branching
sebuah alur yang berdasar kondisi tertentu
3. Looping
konsep untuk melakukan intruksi secara berulang

### Pseudo Code
adalah deskripsi dalam bahasa sederhana yang digunakan untuk menuangkan ide algoritma

terdapat berbagai cara untuk menuangkan pseudo code dan ada yang mirip dengan bahasa manusia

contoh pseuod code
- menghitung luas segitiga
    1. input alas dan tinggi
    2. calculate luas = (alas * tinggi)/2
    3. print luas

### Flowchart
Flowchart adalah suatu bagan dengan simbol tertentu yang menggambarkan urutan dan hubungan antar proses secara mendetail

simbol flowchart
1. mulai/selesai

![mulai/selesai](https://github.com/magusabdul/Java-Springboot_Agus-Abdul-Malik/blob/master/3_Introduction%20Algorithm/screenshots/mulai-selesai.PNG)

2. proses/kalkulasi

![simbol proses/kalkulasi](https://github.com/magusabdul/Java-Springboot_Agus-Abdul-Malik/blob/master/3_Introduction%20Algorithm/screenshots/proses.PNG)

3. input/output

![simbol input/output](https://github.com/magusabdul/Java-Springboot_Agus-Abdul-Malik/blob/master/3_Introduction%20Algorithm/screenshots/input-output.PNG)

4. perkondisian

![simbol perkondisian](https://github.com/magusabdul/Java-Springboot_Agus-Abdul-Malik/blob/master/3_Introduction%20Algorithm/screenshots/kondisi.PNG)

5. looping

![simbol looping](https://github.com/magusabdul/Java-Springboot_Agus-Abdul-Malik/blob/master/3_Introduction%20Algorithm/screenshots/looping.PNG)


contoh flowchart
- Menghitung luas segitiga

![Flowchart Menghitung luas segitiga](https://github.com/magusabdul/Java-Springboot_Agus-Abdul-Malik/blob/master/3_Introduction%20Algorithm/screenshots/hitung-luas-segitiga.PNG)

merupakan proses yang sequential

- mencetak bilangan faktor

![Flowchart mencetak bilangan faktor](https://github.com/magusabdul/Java-Springboot_Agus-Abdul-Malik/blob/master/3_Introduction%20Algorithm/screenshots/cetak-bilangan-faktor.PNG)


## Task
### 1. Problem Bilangan Prima
Bilangan prima adalah bilangan asli yang lebih besar dari angka 1, uang faktor pembagiannya adalah 1, dan bilangan itu sendiri. 
2 dan 3 adalah bilangan prima. 4 bukan bilangan prima karena 4 habis di bagi 2. kamu diminta untuk membuat fungsi untuk menentukan 
bahwa sebuah bilangan termasuk bilangan prima atau tidak.

Buatlah flowchart untuk menentukan bilangan prima menggunakan

https://whimsical.com/ / https://files.digi46.id/index.php/login

Sample Test Cases
1. input : 3

Output : Bilangan Prima
![Input 3](https://github.com/magusabdul/Java-Springboot_Agus-Abdul-Malik/blob/master/3_Introduction%20Algorithm/screenshots/hitung-bilangan-prima-input3.PNG)

2. Input : 7

Output : Bilangan Prima
![Input 7](https://github.com/magusabdul/Java-Springboot_Agus-Abdul-Malik/blob/master/3_Introduction%20Algorithm/screenshots/hitung-bilangan-prima-input7.PNG)

3. Input : 10

Output : Bukan Bilangan Prima
![Input 10](https://github.com/magusabdul/Java-Springboot_Agus-Abdul-Malik/blob/master/3_Introduction%20Algorithm/screenshots/hitung-bilangan-prima-input10.PNG)

OUTPUT : 

![Bilangan Prima](https://github.com/magusabdul/Java-Springboot_Agus-Abdul-Malik/blob/master/3_Introduction%20Algorithm/screenshots/hitung-bilangan-prima.PNG)

### 2. Problem lampu dan tombol
Terdapat N tombol yang dinomori dari 1 hingga N dan sebuah lampu dalam keadaan mati. apabila tombol ke-i ditekan, keadaan lampu akan 
berubah (dari mati menjadi menyala, atau sebaliknya) jika N habis dibagi oleh i. apabila masing-masing tombol ditekan tepat sekali, 
bagaimana keadaan lampu pada akhirnya?

Masukan 
Sebuah baris berisi sebuah bilangan, yaitu N.

Sebuah baris berisi sebuah bilangan, yaitu N. format keluaran sebuah baris berisi:
"lampu mati", apabila keadaan akhir lampu adalah mati
"lampu menyala", apabila keadaan akhir lampu adalah menyala.

Buatlah flowchart untuk aloritma tersebut menggunakan

https://whimsical.com/ / https://files.digi46.id/index.php/login

contoh
1. input : 5

output : lampu mati

![Flowchart Lampu dan tombol input 5](https://github.com/magusabdul/Java-Springboot_Agus-Abdul-Malik/blob/master/3_Introduction%20Algorithm/screenshots/lampu-dan-tombol-input5.PNG)

2. input : 4

output : lampu menyala

![Flowchart Lampu dan tombol input 4](https://github.com/magusabdul/Java-Springboot_Agus-Abdul-Malik/blob/master/3_Introduction%20Algorithm/screenshots/lampu-dan-tombol-input4.PNG)


OUTPUT :

![Flowchart Lampu dan tombol](https://github.com/magusabdul/Java-Springboot_Agus-Abdul-Malik/blob/master/3_Introduction%20Algorithm/screenshots/lampu-dan-tombol.PNG)
