# 30 Logging in Spring Boot

## RESUME MATERI 
1. Logging
2. Benefit jika menggunakan logging
3. Membuat Project dan menambahkan logging

### Logging

OUTLINE
- Logging Definition\
definisi atau apa itu logging
- Logging Benefit\
Keuntingan 
- Logging Tools\
alat yang digunakan
- Logging Library in java
- Java Spring Logging\
implementasi di java springboot
- Chalelleges

Logging\
salah satu teknik ketika defloy apk ke server untuk mengecek bug, error, dan lainnya. biasa disebut juga tracing.

proses dimana ketika ingin menyimpan sebuah proses aplikasi berjalan, bisa ada suscces, error dan lainnya

jika tidak menggunakan logging akan susah ketika ingin mengetahui error nya dmana dan kenapa

### Benefit jika menggunakan logging
keuntingan menggunakan logging
- Resource management\
mengatur jumlah penggunaan hardware yang digunakan
- Aplication trouble shoting\
ketika ada error, succes, bug akan dapat terlihat dan sangat penting untuk kemudahan pengembangan
- regulator compilance\
mengecek apakah ada isu
- bussines analyitics\
logging dapat di jadikan sebuah file untuk di analisis secara teknis, dapat di jadikan stack2 di database elastic
- marketing insights\
traking transaksi yang ada di dalam sebuah aplikasi yang dijalankan

Logginging Tools
- Retrace
- Graylog
- logentries
- spulnk logging
- logz.io

logging libaray di java
- Apache LOG47\
default nya konfigurasi logging di java springboot

ada isu masalah remote excute result, hacker dapat mengtake server via log

contoh output logging di project springboot

### Membuat Project dan menambahkan logging

Persiapan
- Dependencies SLF4j
- Configuration Logging Log4j
- Custom Logging

Dependencies

Configurations

Logging in Spring

Log Levels mulai dari low level
- Off = semua pesan dihentikan
- Fatal = red
- Error = red
- Warn = yellow
- Info = green
- Debug = green
- Trace = green
- All = menampilan pesan dari semua logger

Log Customizing\
logging dapat dicustomize dengan menkonfigurasi :
- logback-spring.xml
- logback.xml
- log4j.xml

## TASK 

### 1. Challenge
Membuat layanan CRUD pada Produk.
Sesuaikan output log di sini di bawah
![Console]()