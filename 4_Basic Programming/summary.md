# 4 Basic Programming

## Resume
Dalam materi ini, mempelajari:
1. Type data
2. Variable
3. Operator

### Type data
adalah sebuah bentuk-bentuk struktur data
berikut contoh-contoh type data:
1. Integer
adalah dapat menyimpan bilangan bulat.
2. Decimal
adalah dapat menyimpan bilangan desimal atau pecahan.
3. Boolean
adalah bagian dari aljabar yang digunakan untuk membuat pernyataan benar/salah.
4. Char -> 'A','z'
adalah tipe data yang hanya bisa diisi dengan 1 karakter saja.
5. String -> "alterra", "id"
adalah tipe data yang digunakan untuk menyimpan barisan karakter.

### Variable
merupakan tempat yang memiliki nama yang diisi oleh data

variable declaration
tipe_data nama_variable = value
var nama_variable = value

contoh variable
int additionalNum;
long balance = 1_000_000;
int hex = 0xA123;
int bin = 0b1010;
var nama = "moryku";

conversion tipe data
int umur = 10;
long umurPanjang = umur;
byte umurPendek = (byte) umur;

other type variable
string nohp = "08111100"
char A = 'a';
float creditBalance;
double totalBalance;

primitive dan non primitve
primitive adalah hanya menunjukan data memiliki tipe apa
keuntungan cenderung lebihh ringan daripada non primitive
non primitive adalah menggunkaan sebuah kelas yang mewakili sebuah tipe data, sehingga untuk menggunakan tipe data bukan primitve kita harus membuat object kelas dari kelas yang menjad tipe data
keuntungan dapat digunakan menjadi OOP

Array
array memiliki index dan isi
index dimulai dari 0

contoh penggunaan array
char[] alterra = new char[]
('a','l','t','e','r','r','a');

char[] alterra = new char[7];
alterra[0] = 'a';
alterra[1] = 'l';
alterra[2] = 't';
alterra[3] = 'e';
alterra[4] = 'r';
alterra[5] = 'r';
alterra[6] = 'a';


### Operator
1. Assigment
2. arithmetic
3. Unary
4. Equality dan reltional
5. conditional


## Task
### 1. Vokal, Konsonan
Menghitung jumlah karakter yang berupa vokal, konsonan dan total karakter dari kalimat "Alterra Indonesia"

Input : Alterra Indonesia

Ootput : 

Jumlah Vokal : 8

Jumlah Konsonan : 8

Total Karakter : 16

OUTPUT :

![Task 1](https://github.com/magusabdul/Java-Springboot_Agus-Abdul-Malik/blob/master/4_Basic%20Programming/screenshots/task1.png)

### 2. X dan O
Program akan menerima satu variabel string, program tersebut akan menghasilkan output true jika jumlah karakter x sama dengan jumlah karakter o, 
dan false jika tidak

Contoh 1 :
Input : xoxoxo
Output : true

Contoh 2 :
Input : oxoxoxo
Output : false

Contoh 3 :
Input : oxo
Output : false

OUTPUT :

![Task 2](https://github.com/magusabdul/Java-Springboot_Agus-Abdul-Malik/blob/master/4_Basic%20Programming/screenshots/task2.png)

### 3. Faktor Bilangan 
Faktor suatu bilangan adalah suatu bilangan yang dapat habis membagi bilangan tersebut.
Tugas Anda adalah membuat sebuah program untuk mencetak faktor sebuah bilangan

Sample Test Cases

Input : 6

Ouptut : 
1
2
3
6

Input : 20 

Output : 
1
2
4
5
10
20

OUTPUT :

![Task 3](https://github.com/magusabdul/Java-Springboot_Agus-Abdul-Malik/blob/master/4_Basic%20Programming/screenshots/task3.png)

### 4. Bilangan Prima
Dalam matematika, bilangan prima adalah bilangan asli yang lebih besar dari angka 1, yang faktor pembaginya adalah 1 dan bilangan itu sendiri, 
2 dan 3 adalah bilangan prima, 4 bukan bilangan prima karena 4 bisa di bagi 2.
Kamu diminta untuk membuat fungsi untuk menentukan bahwa sebuah bilangan termasuk bilangan prima atau tidak.

Sample Test Cases

Input : 7

Output : Bilangan Prima

Input : 10 

Output : Bukan bilangan Prima

OUTPUT :

![Task 4](https://github.com/magusabdul/Java-Springboot_Agus-Abdul-Malik/blob/master/4_Basic%20Programming/screenshots/task4.png)

###  5. Palindrome
Kata palindrome adalah sebuah kata yang jika di balik tetap sama. Contoh 'katak' dibalik teteplah 'katak'.
Buatlah sebuah program untuk mendeteksi sebuah string merupakan palindrom atau tidak!

Sample Test Cases

Input : katak

Output : Palindrome

Input : mister

Output : Bukan palindrome

OUTPUT :

![Task 5](https://github.com/magusabdul/Java-Springboot_Agus-Abdul-Malik/blob/master/4_Basic%20Programming/screenshots/task5.png)

### 6. Exponentation
Given two integer x and n, while a function to compute x^n. We may assume that x and n are small and overflow doesn't happen.

Sample Test Cases 

Input : x = 2, n = 3

Output : 8

Input : x = 7, n = 2

Output : 49

OUTPUT :

![Task 6](https://github.com/magusabdul/Java-Springboot_Agus-Abdul-Malik/blob/master/4_Basic%20Programming/screenshots/task6.png)

### 7.  Play With Arterisk

Buatlah sebuah program untuk mencetak segitiga asterik seperti di bawah ini!

Sample Test Cases

Input : 5

OUTPUT :

![Task 7](https://github.com/magusabdul/Java-Springboot_Agus-Abdul-Malik/blob/master/4_Basic%20Programming/screenshots/task7.png)

### 8. Cetak Tabel Perkalian
Buat program yang memunculkan output seperti contoh di bawah. Input merupakan n bilangan 1 sampai 30.
Output merupakan tabel perkalian seperti yang dideskripsikan.

Sample Test Case

Input : 9

Output : 

1 2  3  4  5  6  7  8  9

2 2  6  8  10 11 12 16 18

3 6  9  12 15 18 21 24 27

4 8  12 16 28 24 28 32 36

5 10 15 20 25 30 35 40 45

6 12 18 24 30 36 42 48 54

7 14 21 28 35 42 49 56 63

8 16 24 32 40 48 56 64 72

9 18 27 36 45 54 63 72 81

OUTPUT :

![Task 8](https://github.com/magusabdul/Java-Springboot_Agus-Abdul-Malik/blob/master/4_Basic%20Programming/screenshots/task8.png)
