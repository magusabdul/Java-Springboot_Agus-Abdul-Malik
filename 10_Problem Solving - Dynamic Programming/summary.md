# 10 Dynamic Programming

## Resume Materi
Dalam materi ini, mempelajari:
1. pengertian Dynamic Programming
2. Karakteristik dynamic programming
3. method dynamic programming

### Pengertian Dynamic Programming
Sebuah algoritma teknik untuk menyelesaikan sebuah problem secara optimal, dengan cara memecahkan problem ke dalam proble-problem yang lebih mudah di kerjakan, tapi dengan mementingkan fakta optimal
‎Pecahkan masalah menjadi subproblems dan temukan substruktur optimal. ‎
‎Temukan subproblems yang tumpang tindih, dan gunakan array atau tabel hash untuk solusi cache ke subproblems yang tumpang tindih‎
‎Gunakan solusi cache untuk menghemat kompleksitas waktu algoritma‎

### Karakteristik dynamic programming
1. Overlapping Subprolems
Adalah ketika mencari solusi, sub problem akan di panggil beberapa kali
contoh dengan menggunakan tree
2. Optimal Substructure property
setiap sub problem harus menggunakan problem itu sendiri, harus optimal dari setiap fungsi nya, 

### Method dynamic programming
1. Top down memoization
memecahkan masalah dengan rekusifly
akan terus mencari solusi sampai ke sub problem terkecil, jika sudah selesai maka akan di simpan ke temporary
jadi hanya mengambil dari data yang sudah di simpan tdi
akan mencari nilai paling besar kemudian ke terkecil

2. Bottom-up With Tabulation
merupakan opposite dari topdown dan menghindari dari rekursif, jadi pada saat bottom up akan menyelesaikan dari yang terkecil dahulu
setiap problem akan mencari nilai terkecil dahulu


## Task

### 1. Problem 1 - Fibonacci Number Top-down
Write a function to calculate the nth Fibonacci number.

Fibonacci numbers are a series of numbers in which each number is the sum of the two 
preceding numbers. First few Fibonacci numbers are: 0, 1, 1, 2, 3, 5, 8, …

Sample Test Cases

Input: 5

Output: 5

### 2. Problem 2 - Fibonacci Number Bottom-up
Write a function to calculate the nth Fibonacci number.

Fibonacci numbers are a series of numbers in which each number is the sum of the two 
preceding numbers. First few Fibonacci numbers are: 0, 1, 1, 2, 3, 5, 8, …

Sample Test Cases

Input: 5

Output: 5

### 3. Problem 3 - Frog
There are N stones, numbered 1, 2, … , N. For each i (1 <= i <= N), the height of Stone i is hi.
There is a frog who is initially on Stone 1. He will repeat the following action some number of times to reach stone N:
If the frog is currently on Stone i, jump to Stone i + 1 or Stone i + 2. Here, a cost of 
| hi - hj | is incurred, where j is stone to land on.
Find the minimum possible total cost incurred before the frog reaches Stone N.

Constrain:
All values in input are integers.

2 <= N <= 10^5

1 <= hi <= 10^4

Input: [10, 30, 40, 20]

Output: 30

If follow the path 1 -> 2 -> 4, the total cost incurred would be | 10 - 30 | + | 30 - 20 | = 30.

Input: [30, 10, 60, 10, 60, 50]

Output: 40

If follow the path 1 -> 3 -> 5 -> 6, the total cost incurred would be | 30 - 60 | + | 60 - 60 | + | 60 - 50 | = 40

// 30 -> 10 -> 10 -> 50 = 60 | 30 -> 60 -> 60 -> 50 = 40

### 4. Problem 4 - Roman Numerals

Tulis program Java untuk mengkonversi dari 
angka normal ke Angka Romawi!

Input: 4

Output: IV

Input: 9

Output: IX

Input: 23

Output: XXIII

Input: 2021

Output: MMXXI

Input: 1646

Output: MDCXLVI
