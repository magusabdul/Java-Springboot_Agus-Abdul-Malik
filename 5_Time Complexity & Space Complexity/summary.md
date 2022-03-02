# 5 Time Complexity & Space Complexity

## Resume Materi
Dalam materi ini, mempelajari:
1. Time Complexity
2. Bentuk-bentuk/Perbandingan Time Complexity
3. Perbandingan Time complexity

### Time Complexity
adalah ukuran waktu operasi-operasi berjalan, berupa operasi arithmatika seperti penjumlahan, pengurangan, pembagian, dan perkalian.
dan juga bisa operasi lainnya seperti pemberian nilai, perbandingan dan lainnya.

Pada suatu kondisi perlu memperhatikan operasi yang dominan, jadi untuk mengambil atau mengukur time complexity bisa dengan menilai operasi yang paling dominan pada sutu operasi/kegiatan.
seperti dalam for/looping/perulangan.

### Bentuk-bentuk/Perbandingan Time Complexity
1. Constant time - O(1)
Biasanya time complexity yang constant tidak terdapat proses yang berulang.


2. Linear time - O(n) atau O(n + m)
Bisa dilakukan dari awal hingga sejumlah nilai n. jika nilai awal 0 dan perulangan 10, maka akan terjadi perulangan hingga 10.
yang dihitung dari awal hingga yang kemungkinan paling besar waktunya.


3. Logaritmic Time - O(log n)
terjadi perulangan yang berjalan selama nilai n dengan dicontohkan dengan while.

jika n - 2^x
maka log n = x

4. Quadrat Time - O(n^2)
1/2 * (n(n+1)) = 1/2 * n^2 + 1/2 * n

terdapat perulangan di dalam sebuah perulangan,
maka perulangan akan terjadi setiap ada perulangan, dengan itu proses perulangan akan semakin meningkat.


### Perbandingan Time complexity
![Perbandingan Time complexity](https://github.com/magusabdul/Java-Springboot_Agus-Abdul-Malik/blob/master/5_Time%20Complexity%20%26%20Space%20Complexity/screenshots/perbandingan-time-complexity.PNG)

Time Limit

- jika n <= 1.000.000 maka memakai time complexity O(n) atau O(n log n).
- jika n <= 10.000 maka memakai time complexity O(n^2).
- jika n <= 500 maka memakai time complexity O(n^3).

hal diatas dapat dijadikan acuan untuk menyelesaikan suatu tugas.

## Task

### 1. Problem 1 - Bilangan Prima
Dalam matematika, bilangan prima adalah bilangan asli yang lebih besar dari angka 1, yang faktor pembaginya adalah 1 dan bilangan 
itu sendiri. 2 dan 3 adalah bilangan prima. 4 bukan bilangan prima karena 4 bisa dibagi 2. Kamu diminta untuk membuat fungsi untuk 
menentukan bahwa sebuah bilangan termasuk bilangan prima atau tidak.

Buatlah solusi yang lebih optimal, dengan kompleksitas lebih cepat dari O(n) / O(n/2).

Sample Test Cases

Input: 1000000007
Output: Bilangan Prima

Input: 1500450271
Output: Bilangan Prima
***bash
public static void main(String[] args) {
   System.out.println(primeNumber(1000000007));
   System.out.println(primeNumber(13));
   System.out.println(primeNumber(17));
   System.out.println(primeNumber(20));
   System.out.println(primeNumber(35));
}

static boolean primeNumber(Integer number) {
  
}
***

OUTPUT: 

![Problem 1 - Bilangan Prima](https://github.com/magusabdul/Java-Springboot_Agus-Abdul-Malik/blob/master/5_Time%20Complexity%20%26%20Space%20Complexity/screenshots/task1.png)

### 2. Problem 2 - Fast Exponentiation
Given two integers x and n, write a function to compute x^n. We may assume that x and n are small and overflow doesn’t happen.

Create optimal solution with time complexity more fast that O(n). -> logarithmic
Sample Test Cases
Input : x = 2, n = 3
Output : 8

Input : x = 7, n = 2
Output : 49

***bash
public static void main(String[] args) {
   System.out.println(pow(2, 3));  // 8
   System.out.println(pow(5, 3));  // 125
   System.out.println(pow(10, 2)); // 100
   System.out.println(pow(2, 5)); // 32
   System.out.println(pow(7, 3));  // 343
}

static Integer pow(Integer x, Integer n) {
  
}
***

OUTPUT: 

![Problem 2 - Fast Exponentiation](https://github.com/magusabdul/Java-Springboot_Agus-Abdul-Malik/blob/master/5_Time%20Complexity%20%26%20Space%20Complexity/screenshots/task2.png)