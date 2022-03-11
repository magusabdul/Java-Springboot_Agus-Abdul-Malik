# 6_Collections(Iterable) dan 7_Collections(Map)

## Resume 6_Collections(Iterable)
Dalam materi ini, mempelajari:
1. Iterable
2. Collections
3. List, Set, Deque

### Iterable
Merupakan sekumpulan data atau struktur data yang dapat dilakukan iterasi atau perulangan kepadanya

Hirarki Iterable Java 
![Hirarki Iterable Java](https://github.com/magusabdul/Java-Springboot_Agus-Abdul-Malik/blob/master/6_Collections(Iterable)%20dan%207_Collections(Map)/screenshots/hirarki-iterable-java.PNG)
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
non primitive adalah menggunkaan sebuah kelas yang mewakili sebuah tipe data, sehingga untuk menggunakan tipe data bukan primitve 
kita harus membuat object kelas dari kelas yang menjad tipe data
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

Operator
1. Assigment
2. Arithmetic
3. Unary
4. Equality dan reltional
5. conditional

### Set, List, Queue
1. Set
Set merupakan struktur data yang dapat menyimpan data namun tidak dapat menyimpan data duplikat

- HashSet
- TreeSet
- LinkedHashSet
- EnumSet

2. List 
- ArrayList
- LinkedList

3. Queue
- Deque
sebuah queue yang memiliki dua ujung
mempunyai set first atau set last dan juga get first getlast


## Resume 7_Collections(Map)
Dalam materi ini, mempelajari:
1. Method Map
2. Method Sorted Map
3. Method Navigable Map

### Method Map
Struktur data yanga da dijava untuk menyimpan data-data di dalamnya, datanay diindentifikasi dengan key dan isi nya yaitu value

1. HashMap
implemenmentasi struktur data map yang menggunakan hashtable

2. WeakHaskMap
implemenmentasi struktur data map yang menggunakan hashtable namun key dapat dihilangakan jika sudah tidak digunakan

3. IdentytyHashMap
tetap jika mempunyai referensi data di memori yang berbeda maka 
akan dianggap data yang berbeda

4. LinkedHashMap
secara internal ini menerapkan linkedlist dan hashtable sebagai struktur data dalam map

5. ImmutableMap
map dalam bentuk ini tidak dapat diubah atau ditambahkan

### Method Sorted Map
Map yang dapat diturunkan secara ascending maupun descending 

beberapa method sortedmap
- comparator()
- subMap(K, K)
- headMap(K)
- tailMap(K)
- firstKey()
- lastKey()

Contoh
```bash
public static void main(String[] args){
    SortedMap<String, Integer> bulan = new TreeMap<>();
    bulan.put("Januari", 1);
    bulan.put("Februari", 2);
    bulan.put("Agustus", 8);
    System.out.println(bulan);
}
```
Contoh with comparator
```bash
public static void main(String[] args){
    SortedMap<Person, Integer> persons = new TreeMap<>(new Comparator<Person>()(
        @override
        public int compare(Person o1, Person o2){
            return o2.getName().compareTo(o1.getName());
        }
    ));
    bulan.put(new Person("Moryku"), 1);
    bulan.put(new Person("Alterra"), 2);
    bulan.put(new Person("Academy"), 8);
    for(var key: persons.entrySet()){
        System.out.println(key.getKey().getName());
    }
    
}
```

### Method Navigable Map
masih termasuk sorted map, namun dengan method method lengkap

Contoh
Menampilkan key yang rendah dari key yang di inputkan
```bash
public static void main(String[] args){
    NavigableMap<String, Integer> bulan = new TreeMap<>();
    bulan.put("Januari", 1);
    bulan.put("Februari", 2);
    bulan.put("Agustus", 8);
    System.out.println(bulan.lowerKey("Februari"));
}
```

## Task Iterable & Map
### Problem 1 - Array Merge
Buatlah sebuah program menggabungkan 2 array yang diberikan, dan jangan sampai terdapat nama yang sama di data yang sudah tergabung tadi.
Sample Test Cases
Input: ['kazuya', 'jin', 'lee'], ['kazuya', 'feng']
Output: ['kazuya', 'jin', 'lee', 'feng']

Input: ['lee', 'jin'], ['kazuya', 'panda']
Output: ['lee', 'jin', 'kazuya', 'panda']

OUTPUT :

![Array Merge](https://github.com/magusabdul/Java-Springboot_Agus-Abdul-Malik/blob/master/6_Collections(Iterable)%20dan%207_Collections(Map)/screenshots/Task1.png)

### Problem 2 - Angka Muncul Sekali

Buat program sesuai dengan deskripsi di bawah. Input merupakan variable string berisi kumpulan angka. Output merupakan list / array berisi angka yang hanya muncul 1 kali pada input.

Sample Test Case

Input: “76523752”
Output: [6, 3]

Input: “1122”
Output: []


### Problem 3 - Pair with Target Sum
Given an array of sorted numbers and a target sum, find a pair in the array whose sum is equal to the given target.

Write a function to return the indices of the two numbers (i.e. the pair) such that they add up to the given target.

Challenges:
Solve with linear complexity O(n), not O(n^2) if you can!
Sample Test Cases
Input: [1, 2, 3, 4, 6], target=6
Output: [1, 3]
Explanation: The numbers at index 1 and 3 add up to 6: 2+4=6

Input: [2, 5, 9, 11], target=11
Output: [0, 2]
Explanation: The numbers at index 0 and 2 add up to 11: 2+9=11


### Problem 4 - Array Unique

Buatlah sebuah program ArrayUnique yang menerima 2 parameter berupa array angka. Output adalah program adalah satu array berupa kumpulan angka di array pertama tetapi tidak memiliki duplikasi di di array kedua.

Sample Test Case
input: [1, 2, 3, 4] dan [1, 3, 5, 10, 16]
output: [2, 4]

input: [3, 8] dan [2, 8]
Output: [3]


### Problem 5 - Remove Duplicates

Given an array of sorted numbers, remove all duplicates from it. You should not use any extra space; after removing the duplicates in-place return the length of the subarray that has no duplicate in it.

Sample Test Case
Input: [2, 3, 3, 3, 6, 9, 9]
Output: 4
Explanation: The first four elements after removing the duplicates will be [2, 3, 6, 9].

Sample Test Case
Input: [2, 2, 2, 11]
Output: 2
Explanation: The first two elements after removing the duplicates will be [2, 11]


### Problem 6 - Maximum Sum Subarray of Size K (Optional / Nilai Tambah)

Given an array of positive numbers and a positive number ‘k’, find the maximum sum of any contiguous subarray of size ‘k’.

Sample Test Case

Input: [2, 1, 5, 1, 3, 2], k=3
Output: 9

Explanation: Subarray with maximum sum is [5, 1, 3].

Sample Test Case
Input: [2, 3, 4, 1, 5], k=2 
Output: 7

Explanation: Subarray with maximum sum is [3, 4].
