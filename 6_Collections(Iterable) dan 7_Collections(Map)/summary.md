# 6_Collections(Iterable) dan 7_Collections(Map)

## Resume 6_Collections(Iterable)
Dalam materi ini, mempelajari:
1. Iterable
2. Collections
3. List, Set

### Iterable
Merupakan sekumpulan data atau struktur data yang dapat dilakukan iterasi atau perulangan kepadanya

Hirarki Iterable Java 

### Collections
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

OUTPUT : 

Jumlah Vokal : 8

![Jumlah Vokal]()

Jumlah Konsonan : 8

![Jumlah Konsonan]()

Total Karakter : 16

![Total Karakter]()
