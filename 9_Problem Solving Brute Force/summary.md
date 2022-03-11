# 9 Problem Solving Brute Force

## Resume Materi
Dalam materi ini, mempelajari:
1. Brute Force
2. Divide And Conquer(D&C)
3. Greedy

### Brute Force
Problem solving paradigm yaitu cara menyelesaikan sebuah masalah dengan beberapa prinsip
setiap menyelesaikan jenis dapat di selesaikan dengan jenis yang sesuai atau algoritma optimal dalam penyelesaian masalaah
setia jenis juga mempunyai ciri ciri.

Brute Force/ Complete Search
cara menyelesaikan dengan melakukan pengecekan terhadap semua data

Problem solving ini kurang baik digunakan pada data yang banyak yang pengecekannya searah
cocok digunakan untuk penyelesaian masalah yang paling cepat di banding yang lain

‎Algoritma brute force‎‎ menghitung jarak antara setiap set titik yang 
berbeda‎‎ dan mengembalikan indeks titik yang jaraknya paling kecil. 
Brute force memecahkan masalah ini dengan kompleksitas waktu [O (n2)] 
di mana n adalah jumlah poin. Di bawah pseudo-code menggunakan algoritma 
brute force untuk menemukan titik terdekat.‎

contoh 
mencari bilangan max dan min
findMaxMin([10,7,3,5,8,2,9])

maka di cek semua data dimulai dari index ke 0 sampai n atau index terakhir
jika ditemukan nilai yang lebih kecil dari data sebeulmnya maka akan di tukar


### Divide And Conquer(D&C)
- Divide : membagi masalah yang besar menjadi masalah yang lebih kecil
- Conquer : ketika masalah sudah cukup kecil untuk diselesaikan, maka langsung selesaikan
- Combine : jika dibutuhkan maka perlu menggabungkan solusi dari masalah-masalah yang lebih kecil menjadi solusi untuk masalah yang besar

memecah kelompok data besar menjadi kecil, biasanya diubah menjadi dua bagian, jika masih besar maka di bagi lagi 2, sampai data yang yang sedikit
untuk memecah data nya dapat menggunakan brute force dan binarysearch

‎Bagi dan Taklukkan Contoh Algoritma dalam Bahasa Java dengan 
Merge Sort Divide and conquer adalah algoritma untuk memecahkan 
masalah‎‎ dengan langkah-langkah berikut Bagilah secara rekursif 
masalah menjadi subproblems yang tidak tumpang tindih sampai ini 
menjadi cukup sederhana untuk diselesaikan secara langsung‎

Algoritma Binary Search
```bash
procedure Binary Seacrh(h, X)
    hasil <- 0
    kiri <- 1
    kanan <- N
    while ((kiri <= kanan)^(hasil = 0)) do
        tengah <- (kiri+kanan) div 2
        if (X < h[tengah]) then
            kanan <- tengah - 1
        else if (X > h[tengah]) then
            kiri <- tengah + 1
        else 
            hasil <- tengah
        end if
    end while
    if (hasil = 0) then
        print "berihadiah lain
    else 
        print hasil
    end if 
end procedure
```
kemudian cari tengah nya dan di bagi dua diambil bagian yang lebih kecil, kemudian di bagi dua lagi

misalkan kita ingin mencari angka 3 dari suatu array[1,1,3,5,5,6,7]
1. mulai dengan menginisiasi variabel kiri dan kanan pada kedua ujung array
2. Temukan indeks tengah yaitu nilai tengah dari kiri dan kanan, kemudian lakukan perbandingan nilai tengah dengah nilai yang akan di cari
3. karena 5 > 3 maka geser kanan menjadi tengah-1
4. temukan lagi indeks tengah yaitu nilai tengah dari kiri dan kanan dan bandingkan nilainya dengan nilai yang dicari
5. karena 1 < 3 maka geser kiri menjadi tengah + 1
6. temukan lagi indeks tengah yaitu nilai tengah dari kiri dan kanan dan bandingkan nilainya dengan nilai yang dicari. ternyata nilai pada indeks tengah adalah 3

### Greedy
algoritma untuk menyelesaikan msalah dengan mencari nilai optimal, ada global optimal dan lokal optimal
‎Metode Greedy adalah salah satu strategi seperti Membagi dan menaklukkan 
digunakan untuk memecahkan masalah. Metode ini digunakan untuk memecahkan 
masalah optimasi. Masalah optimasi adalah masalah yang menuntut hasil 
maksimum atau minimum. Mari kita pahami melalui beberapa istilah. 
Metode Serakah adalah pendekatan yang paling sederhana dan mudah.‎

lokal optimal 

biasanya digunakan untuk bentuk dapat graph, map, graphql

ada banyak cara untuk greedy

bisa di minus atau variabel ditambah2kan


## Task

### 1. Problem 1 - Simple Equations

We have three different integers, x, y and z, which satisfy the following three relations:

x + y + z = A

xyz = B

x^2 + y^2 + z^2 = C

You are asked to write a program that solves for x, y and z for given values of A, B and C. (1 ≤ A, B, C ≤ 10000).

Sample Test Cases

Input: 1 2 3

Output: No solution.

Input: 6 6 14

Output: 1 2 3

### 2. Problem 2 - Money Change

Terdapat sebuah tempat untuk melakukan penukaran uang menjadi pecahan yang kecil. Pecahan uang tersebut diantaranya : 1, 10, 20, 50, 100, 200, 500, 1000, 2000, 5000, 10000. Buatlah sebuah program untuk menggerate hasil penukaran uang, dan hasil penukaran harus memenuhi hasil paling optimal dengan jumlah yang minimum! Pecahan yang ada memiliki jumlah yang tidak terbatas.

Sample Test Case

Input: 123

Output: [100 20 1 1 1]

Input: 432

Output: [200 200 20 10 1 1]

### 3. Problem 3 - Dragon of Loowater

There are n dragon heads and m knights (1 ≤ n, m ≤ 20000). Each dragon head has a diameter and each knight has a height. A dragon head with diameter D can be chopped off by a knight with height H if D ≤ H. A knight can only chop off one dragon head. Given a list of diameters of the dragon heads and a list of heights of the knights, is it possible to chop off all the dragon heads? If yes, what is the minimum total height of the knights used to chop off the dragons’ heads?

Sample Test Cases

Input : [5, 4], [7, 8, 4]
Output : 11

Input : [5, 10], [5]
Output : ‘knight fall’

Input : [7, 2], [4, 3, 1, 2]
Output : ‘knight fall’

Input : [7, 2], [2, 1, 8, 5]

Output : 10

### 4. Problem 4 - Binary Search Algorithm

In a binary search we use the information that all the elements are sorted. Let’s try to solve the task in which we ask for the position of a value x in a sorted array. Let’s see how the number of candidates is reduced, for example for the value x = 31.


For every step of the algorithm we should remember the beginning and the end of the remaining slice of the array (respectively, variables beg and end). The middle element of the
slice can easily be calculated as mid = [(beg+end)/2].

Input: [1, 1, 3, 5, 5, 6, 7], x = 3

Output: 2

Input: [12, 15, 15, 19, 24, 31, 53, 59, 60], x = 100

Output: -1

