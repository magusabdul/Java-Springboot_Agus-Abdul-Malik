# 8 Recursive, Number Theory, Sorting, Searching

## Resume Materi
Dalam materi ini, mempelajari:
1. Recursive
2. Number theory
3. Searching dan Sorting

### Recursive
adalah situasi ketika membuat sebuah function yag ternyata pemanggilan function diri sendiri
jika terdaoat masalah yang ringan maka hasil akan di dapat lebih cepat
jiak banyak akan dibagi bagi menjadi bebebrapa bagian yang lebih kecil

alasan 
rekusif daoat membuat menyinkat solusi dan kode

strategi rekursif
solusi dasar - perhitunagn rumus dasar
menentukan bagaaimana solusi dar itu dapat di terapkan dengan baik agar dapat menjadi solusi dalam hal hal lainnya

contoh masalah factorial
```bash
public class Algorithm{
    static int factorial(int n){
        if(n == 1){
            return 1;
        } else {
            return n * factorial(n-1);
        }
    }
}
```

### Number theory
adalah cabang matematik yanga membahas terkait angka
contoh bilangan prima, kpk, fpb

contoh prima number
```bash
public class Algorithm {
    static boolean checkPrime(int number){
        if(number < 2>){
            return false;
        }
        int sqrtNumber = (int) Math.sqrt(number);
        for(int i = 2; i <= sqrtNumber; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
}
```

contoh FPB
mencari pembagi paling besar di dalam dua angka
```bash
public class Algorithm{
    static int gcd(int a, int b){
        if (b === 0){
            return a;
        }

        return gcd(b, a % b);
    }
}
```
contoh KPK
```bash
public class Algorithm{
    static int lcm(int a, int b){
        return a* (b/gcd(a,b));
    }
}
```


### Searching dan Sorting
1. Seaching
Proses yang bertujuan untuk menemukan sebuah data dari kumpulan data

ada beberapa macam metode
- Linier Seach - O(n)
```bash
public class Seaching {
    static int linierSeach(int[] elements, int x){
        for (int i=0; i<elements.length; i++){
            if(elements[i] == x){
                return i;
            }
        }
        return -1;
    }
}
```

- Builtins Search
nama sebuah seacrh yang terdapat pada bahasa java pada saat terinstal saat java diinstal
```bash
import java.util.Arrays;
public class Searching {
    static int builtIn(int[] elements, int x){
        return Arrays.binarySearch(elements, x);
    }
}
```

2. Sorting
Proses menyusun data sesuai urutannya, biasanya mengurutkan kepada sebuah kumpulan data, dapat mengurutkan angka, huruf atau yang lainnya

- Selection Sort  O(n^2)
membandingkan suatu nilai data terhadap data lainnya, jika akan mengurutkan data dari terkecil ke terbesa maka jika menenmukan angka terkecil maka data tersebut akan di tukar posisi nya.
```bash
public class Sorting {
    static int[] selectionSort(int[] elements){
        int n = elelemnts.length;
        for(int i=0; i<n; i++){
            int minimal=i;
            for(int j=i+1; j<n; j++>){
                if(elements[j]<elements[minimal]){
                    minimal=j;
                }
            }
            int tmp=elements[i];
            elements[i]=elements[minimal];
            elements[minimal=tmp];
        }
        return elements;
    }
}
```
- Counting Sort  O(n + k)
pada teknik ini akan dimulai dengan menghitung berapa kali data muncul dalam sebuah array kemudian akan mengisi data elemen sesuai dengan urutan yang terdapat pada array counter
```bash
publuc class Sorting {
    static int[] countingSort(int[] elemnts, int k){
        int[] count = new int[k + 1];
        for(int i=0; i<elements.lengthl i++){
            count[elements[i]]++;
        }
        int counter=0;
        for(int i=0; i<k+1; i++){
            fpr(int j=0; j<count[i]; j++){
                elements[counter] i;
                counter++;
            }
        }
        return elements;
    }
}
```
- Bulitins Sort in Java
sorting yang sudah terdapat pada java saat diinstall
```bash
import java.util.Arrays;

public class Sorting {
    static int[] builtinSort(int[] elements){
        Arrays.sort(elements);
        return elements;
    }
}
```

## Task

### 1. Prima ke X (Tanpa Recursive)

Dalam matematika, bilangan prima adalah bilangan asli yang lebih besar dari angka 1, yang faktor pembaginya adalah 1 dan bilangan itu sendiri. Angka 2 dan 3 adalah bilangan prima. Angka 4 bukan bilangan prima karena 4 bisa dibagi 2. Sepuluh deret bilangan prima yang pertama adalah 2, 3, 5, 7, 11, 13, 17, 19, 23 dan 29.

Buatlah sebuah fungsi bernama primeX yang menampilkan bilangan prima sesuai dengan deret urutannya.

Sample Test Cases

Input: 1

Output: 2

Input: 5

Output: 11

### 2. Fibonacci (Recursive)
Dalam matematika, bilangan Fibonacci adalah barisan yang didefinisikan secara rekursif sebagai berikut:

Penjelasan: barisan ini berawal dari 0 dan 1, kemudian angka berikutnya didapat dengan cara menambahkan kedua bilangan yang berurutan sebelumnya. Dengan aturan ini, maka barisan bilangan Fibonacci yang pertama adalah:

0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946...

Diberi nomor n, cetak Nomor Fibonacci ke-n.


### 3. Find Min and Max Number
Buatlah sebuah program untuk mencari bilangan minimum dan maksimum dari sebuah array, dan di problem ini kamu tidak boleh melakukan pengurutan terhadap array. Dan munculkan index dari bilangan minimum dan maksimum tersebut.

Sample Test Cases

Input: [5, 7, 4, -2, -1, 8]

Output: min: -2 index: 3 max: 8 index: 5

Input: [2, -5, -4, 22, 7, 7]

Output: min: min: -5 index: 1 max: 22 index: 3
