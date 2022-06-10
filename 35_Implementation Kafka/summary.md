# 35 Implementation Kafka

## RESUME MATERI
1. Microservices
2. Messaging system
3. Kafka

### Microservices

OUTLINE:
- Microservices
- Microservices Architecture
- Communication Between Application
- REST API Communication
- Messaging Communication
- RPC Communication
- Apache Kafka
- Spring Boot Kafka Integration

Microservices
- Agility
- Flexible Scalling
- Easy Deployment
- Technological Fredom
- Reusable Code
- Resilence

Microservices Architecture
- Containerization
- Isolated
- Scallable
- Easy Maintenance
- API Gateway

Microservices communication services
- REST API communication
- Messaging Communication
- RPC Communiaction

### Messaging system
seperti punya pihak ketiga
ada beberapa
- KAfka
- Nats
- RabbitMQ
- NSQ
- ActiveMQ
- MQTT

 
### Kafka

Kelebihan Kafka
- Real-time data processing
- Application activity tracking
- Logging and/or monitoring system


pertama download kafka 
kafka broker dan kafka zookeper

extrack file download

jalankan kafka server
jalankan zookeeper server

masukan depency kafka ke pom.xml

kemudian setup kafka config

membuat kafka producer

membuat kafka consumer

membuat kafka topic

LANGKAH 1: DAPATKAN KAFKA
Unduh rilis Kafka terbaru dan ekstrak:

```bash
$ tar -xzf kafka_2.13-3.2.0.tgz
$ cd kafka_2.13-3.2.0
```

LANGKAH 2: MULAI LINGKUNGAN KAFKA
CATATAN: Lingkungan lokal Anda harus menginstal Java 8+.

Jalankan perintah berikut untuk memulai semua layanan dalam urutan yang benar:

```bash
$ bin/zookeeper-server-start.sh config/zookeeper.properties
```

Buka sesi terminal lain dan jalankan:
```bash
$ bin/kafka-server-start.sh config/server.properties
```

Setelah semua layanan berhasil diluncurkan, Anda akan memiliki lingkungan Kafka dasar yang berjalan dan siap digunakan.

LANGKAH 3: BUAT TOPIK UNTUK MENYIMPAN ACARA ANDA

Kafka adalah platform streaming acara terdistribusi yang memungkinkan Anda membaca, menulis, menyimpan, dan memproses peristiwa (juga disebut catatan atau pesan dalam dokumentasi) di banyak mesin.

Contoh peristiwa adalah transaksi pembayaran, pembaruan geolokasi dari ponsel, pesanan pengiriman, pengukuran sensor dari perangkat IoT atau peralatan medis, dan banyak lagi. Acara-acara ini diselenggarakan dan disimpan dalam topik. Sangat disederhanakan, topik mirip dengan folder dalam sistem file, dan peristiwanya adalah file di folder itu.

Jadi sebelum Anda dapat menulis acara pertama Anda, Anda harus membuat topik. Buka sesi terminal lain dan jalankan:

```bash
$ bin/kafka-topics.sh --create --topic quickstart-events --bootstrap-server localhost:9092
```

Semua alat baris perintah Kafka memiliki opsi tambahan: jalankan perintah tanpa argumen apa pun untuk menampilkan informasi penggunaan. Misalnya, ini juga dapat menunjukkan kepada Anda detail seperti jumlah partisi dari topik baru: 
kafka-topics.sh

```bash
$ bin/kafka-topics.sh --describe --topic quickstart-events --bootstrap-server localhost:9092
Topic:quickstart-events  PartitionCount:1    ReplicationFactor:1 Configs:
    Topic: quickstart-events Partition: 0    Leader: 0   Replicas: 0 Isr: 0
```

LANGKAH 4: TULIS BEBERAPA PERISTIWA KE DALAM TOPIK

Klien Kafka berkomunikasi dengan broker Kafka melalui jaringan untuk menulis (atau membaca) acara. Setelah diterima, broker akan menyimpan acara dengan cara yang tahan lama dan toleran terhadap kesalahan selama yang Anda butuhkan — bahkan selamanya.

Jalankan klien produser konsol untuk menulis beberapa acara ke dalam topik Anda. Secara default, setiap baris yang Anda masukkan akan menghasilkan acara terpisah yang ditulis ke topik.

```bash
$ bin/kafka-console-producer.sh --topic quickstart-events --bootstrap-server localhost:9092
This is my first event
This is my second event
```
Anda dapat menghentikan klien produsen kapan saja. Ctrl-C

LANGKAH 5: BACA ACARA

Buka sesi terminal lain dan jalankan klien konsumen konsol untuk membaca peristiwa yang baru saja Anda buat:

```bash
$ bin/kafka-console-consumer.sh --topic quickstart-events --from-beginning --bootstrap-server localhost:9092
This is my first event
This is my second event
```
Anda dapat menghentikan klien konsumen kapan saja.Ctrl-C

Jangan ragu untuk bereksperimen: misalnya, beralih kembali ke terminal produsen Anda (langkah sebelumnya) untuk menulis acara tambahan, dan lihat bagaimana acara segera muncul di terminal konsumen Anda.

Karena acara disimpan di Kafka, mereka dapat dibaca sebanyak mungkin dan oleh konsumen sebanyak yang Anda inginkan. Anda dapat dengan mudah memverifikasi ini dengan membuka sesi terminal lain dan menjalankan kembali perintah sebelumnya lagi.

LANGKAH 6: IMPOR/EKSPOR DATA ANDA SEBAGAI ALIRAN PERISTIWA DENGAN KAFKA CONNECT

Anda mungkin memiliki banyak data dalam sistem yang ada seperti basis data relasional atau sistem perpesanan tradisional, bersama dengan banyak aplikasi yang sudah menggunakan sistem ini. Kafka Connect memungkinkan Anda untuk terus menyerap data dari sistem eksternal ke Kafka, dan sebaliknya. Ini adalah alat yang dapat diperluas yang menjalankan konektor, yang mengimplementasikan logika khusus untuk berinteraksi dengan sistem eksternal. Dengan demikian sangat mudah untuk mengintegrasikan sistem yang ada dengan Kafka. Untuk membuat proses ini lebih mudah, ada ratusan konektor yang tersedia.

Dalam mulai cepat ini kita akan melihat cara menjalankan Kafka Connect dengan konektor sederhana yang mengimpor data dari file ke topik Kafka dan mengekspor data dari topik Kafka ke file.

Pertama, pastikan untuk menambahkan ke properti dalam konfigurasi pekerja Connect. Untuk tujuan mulai cepat ini, kita akan menggunakan jalur relatif dan menganggap paket konektor sebagai jar uber, yang berfungsi ketika perintah mulai cepat dijalankan dari direktori instalasi. Namun, perlu dicatat bahwa untuk penyebaran produksi menggunakan jalur absolut selalu lebih disukai. Lihat plugin.path untuk penjelasan terperinci tentang cara mengatur konfigurasi ini. connect-file-3.2.0.jarplugin.path

Edit file, tambahkan atau ubah properti konfigurasi cocok dengan yang berikut ini, dan simpan file: config/connect-standalone.propertiesplugin.path

```bash
> echo "plugin.path=lib/connect-file-3.2.0.jar"
```

Kemudian, mulailah dengan membuat beberapa data benih untuk diuji dengan:

```bash
> echo -e "foo\nbar" > test.txt
Atau di Windows:
> echo foo> test.txt
> echo bar>> test.txt
```

Selanjutnya, kita akan memulai dua konektor yang berjalan dalam mode mandiri, yang berarti mereka berjalan dalam satu proses khusus lokal. Kami menyediakan tiga file konfigurasi sebagai parameter. Yang pertama selalu konfigurasi untuk proses Kafka Connect, yang berisi konfigurasi umum seperti broker Kafka untuk terhubung dan format serialisasi untuk data. File konfigurasi yang tersisa masing-masing menentukan konektor yang akan dibuat. File-file ini mencakup nama konektor unik, kelas konektor untuk instantiate, dan konfigurasi lain yang diperlukan oleh konektor.

```bash
> bin/connect-standalone.sh config/connect-standalone.properties config/connect-file-source.properties config/connect-file-sink.properties
```

File konfigurasi sampel ini, disertakan dengan Kafka, menggunakan konfigurasi kluster lokal default yang Anda mulai sebelumnya dan membuat dua konektor: yang pertama adalah konektor sumber yang membaca baris dari file input dan menghasilkan masing-masing ke topik Kafka dan yang kedua adalah konektor sink yang membaca pesan dari topik Kafka dan menghasilkan masing-masing sebagai baris dalam file output.

Selama startup, Anda akan melihat sejumlah pesan log, termasuk beberapa yang menunjukkan bahwa konektor sedang dibuat secara instan. Setelah proses Kafka Connect dimulai, konektor sumber harus mulai membaca baris dari dan memproduksinya ke topik , dan konektor sink harus mulai membaca pesan dari topik dan menulisnya ke file . Kami dapat memverifikasi data yang telah dikirimkan melalui seluruh alur dengan memeriksa konten file output: test.txtconnect-testconnect-testtest.sink.txt

```bash
> more test.sink.txt
foo
bar
```

Perhatikan bahwa data sedang disimpan dalam topik Kafka , sehingga kita juga dapat menjalankan konsumen konsol untuk melihat data dalam topik (atau menggunakan kode konsumen khusus untuk memprosesnya): connect-test

```bash
> bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic connect-test --from-beginning
{"schema":{"type":"string","optional":false},"payload":"foo"}
{"schema":{"type":"string","optional":false},"payload":"bar"}
...
```

Konektor terus memproses data, sehingga kita dapat menambahkan data ke file dan melihatnya bergerak melalui alur:

```bash
> echo Another line>> test.txt
```

Anda akan melihat baris muncul di output konsumen konsol dan di file sink.

LANGKAH 7: PROSES ACARA ANDA DENGAN KAFKA STREAMS

Setelah data Anda disimpan di Kafka sebagai peristiwa, Anda dapat memproses data dengan pustaka klien Kafka Streams untuk Java/Scala. Ini memungkinkan Anda untuk menerapkan aplikasi real-time dan layanan mikro yang sangat penting, di mana data input dan/atau output disimpan dalam topik Kafka. Kafka Streams menggabungkan kesederhanaan menulis dan menyebarkan aplikasi Java dan Scala standar di sisi klien dengan manfaat teknologi cluster sisi server Kafka untuk membuat aplikasi ini sangat skalabel, elastis, toleran terhadap kesalahan, dan terdistribusi. Pustaka ini mendukung pemrosesan yang tepat sekali, operasi dan agregasi stateful, windowing, join, pemrosesan berdasarkan waktu peristiwa, dan banyak lagi.

Untuk memberi Anda rasa pertama, inilah cara seseorang menerapkan algoritme populer:WordCount

```java
KStream<String, String> textLines = builder.stream("quickstart-events");

KTable<String, Long> wordCounts = textLines
            .flatMapValues(line -> Arrays.asList(line.toLowerCase().split(" ")))
            .groupBy((keyIgnored, word) -> word)
            .count();

wordCounts.toStream().to("output-topic", Produced.with(Serdes.String(), Serdes.Long()));
```

Demo Kafka Streams dan tutorial pengembangan aplikasi menunjukkan cara membuat kode dan menjalankan aplikasi streaming seperti itu dari awal hingga akhir.

LANGKAH 8: HENTIKAN LINGKUNGAN KAFKA
Sekarang setelah Anda mencapai akhir mulai cepat, jangan ragu untuk meruntuhkan lingkungan Kafka — atau terus bermain-main.

Hentikan klien produsen dan konsumen dengan , jika Anda belum melakukannya. Ctrl-C
Hentikan broker Kafka dengan . Ctrl-C
Terakhir, hentikan server ZooKeeper dengan . Ctrl-C
Jika Anda juga ingin menghapus data apa pun dari lingkungan Kafka lokal Anda termasuk peristiwa apa pun yang telah Anda buat di sepanjang jalan, jalankan perintah:
```bash
$ rm -rf /tmp/kafka-logs /tmp/zookeeper
```

## TASK
### 1. SPRING KAFKA
Kami memiliki tiga layanan di server seperti katalog produk, pengguna, dan pesanan.
Katalog produk memiliki data seperti daftar produk.
Pengguna memiliki data daftar data pengguna.

Pesanan layanan membutuhkan data dari katalog dan pengguna saat pesanan dibuat.
Selesaikan masalah ini menggunakan Spring Kafka.