# 34 Introduction Apache Kafka

## RESUME MATERI
1. Introduction Apache Kafka
2. Kafka Broker, Topic, dan Partition
3. Kafka Offset, Consumer & Consumer Goods, dan Retention Policy

### Introduction Apache Kafka

Apache Kafka adalah sebuah publish-subscribe messaging system.

Messagging system adalah system yang bisa digunakan untuk mengirimkan message antar proses, aplikasi dan server.

Pada dasarnya kafka adalah message broker yang bertujuan untuk mengirimkan pesan dari sebuah producer yang akan diterima oleh sebuah consumer. Di dalam kafka, setiap pesan yang masuk hanya akan ditambahkan saja (append only). Tidak akan dilakukan pengubahan terhadap data yang sebelumnya. Hal inilah yang menyebabkan proses messaging yang ada dalam kafka di-claim sangat cepat.

pesan masuk akan ditambahkan pada bagian belakang,
pesan yang dikirim akan diambil dari bagian depan

- Producer: aplikasi yang mengirimkan pesan
- Consumer: aplikasi yang menerima pesan
- Message: adalah informasi yang dikirim dari producer ke consumer melalui apache kafka
- Connection: adalah sebuah hubungkan koneksi TCP diantara aplikasi dan kafka broker
- Topic: kategori tempat pesan di simpan dan dikirimkan
- Topic partition: topic dalam kafka akan dibagi menjadi bberapa partisi, yang akan dibagi oleh beberapa broker
- Replicas: backup dari partisi, replicas tidak pernah menulis atau membaca data, digunakan untuk mencegah kehilangan data
- Consumer Group: beberapa consumer yang data mengikuti sebuah topic
- Offset: identitas unik dalam sebuah partisi, digunakan untuk menandai topic dalam sebuah partisi
- Node: sebuah komputer yang ada di dalam kafka klaster
- Cluster: kumpulan dari node

### Kafka Broker, Topic, dan Partition
Kafka Broker

Kafka Broker simplenya adalah sebuah kafka server dan Kafka cluster adalah sebuah kumpulan dari beberapa kafka server/broker.

Dalam sebuah cluster, akan ada server yang menjadi leader dan follower. Semua pesan akan masuk lewat leader dan didistribusikan ke dalam melalui sebuah leader. lika leader down, maka salah satu follower akan diangkat menjadi leader secara otomatis oleh kafka dengan menggunakan algoritmi tertentu

Kafka Topic

Topik adalah kategori pesan yang ada di dalam kafka. Producer akan mengirim pesan ke sebuah topik tertentu, dan Consumer akan membaca pesan yang dikirim ke sebuah topik.

Kafka Partition

Di dalam kafka, pesan disimpan dalam sebuah partisi dari sebuah topik. Pesan yang masuk ke dalam kafka broker akan dipotong menjadi beberapa bagian. Banyaknya partisi bisa diatur saat pembuatan sebuah topik. Pembagian file ini akan berguna saat melakukan clustering.

Gampangnya, jika sebuah pesan masuk kedalam kafka dalam sebuah topik dengan ukuran 1gb, pesan tersebut akan dibagi kedalam n buah partisi. Artinya topik tersebut akan memiliki n buah tempat penyimpanan berbeda yang menyimpan pesan yang berbeda-beda pula. jika sebuah topik memiliki 10 buah partisi, maka message akan dibagi dan disimpan ke dalam to tempat yang berbeda. Pembagian message kedalam partisinya akan dilakukan secara round robin jika tidak ditentukan key nya saat mengirimkan message ke broker, lika kita mengirimkan key nya, maka message tersebut akan masuk ke dalam partisi dengan key yang sudah ditentukan.

Data yang masuk ke dalam sebuah partisi sudah dijamin akan sekuensial sesuai dengan proses masuknya ke dalam sebuah partisi. Lalu pesan tersebut akan dicopy ke node follower lain sesuai dengan jumlah follower. Hal ini dapat diatur menggunakan option replication factor. Options ini yang akan menentukan mau seberapa banyak partisi dalam sebuah topik direplika(dicopy dan didistribusikan ke tempat lain). Dalam hal ini akan didistribusikan ke node follower.

jika kita set 3, maka akan ada 3 data yang sama yang sudah didistribusikan ke tempat lain oleh si kafka. Hal ini akan berguna untuk clustering dan berguna jika sebuah node down, maka pesan akan diambil dari node lain. Hal yang harus diperhatikan adalah jumlah replica akan berbanding lurus dengan size topik, karena message akan dicopy sebanyak jumlah partisi.

### Kafka Offset, Consumer & Consumer Goods, dan Retention Policy
Kafka Offset

Offset merupakan sebuah unique identifier sebuah sebuah record dalam sebuah partisi. Penanda tersebut biasanya digunakan oleh consumer untuk menandakan sudah sampai mana record di partisi tersebut sudah dibaca oleh sebuah consumer terakhir kali. Data2 seperti ini biasanya disimpan di dalam zookeper.

Jadi jika sebuah consumer mati, maka consumer tidak lagi melakukan konsume ulang semua pesan dari awal, tetapi akan melakukan pengecekan ke zookeeper sudah sampai mana pesan di-consume oleh consumer tersebut sebelum down. Tetapi untuk urutan consumsi offset ini dapat diatur menggunakan option auto-offset-reset

Kafka Consumer & Consumer Goods

Consumers adalah aplikasi atau proses atau apapun yang membaca pesan dari kafka broker. Sebuah consumer akan bisa mengidentifikasi pesan mana yang dibutuhkan lewat sebuah topik Consumer akan mendaftarkan diri ke dalam sebuah topik, maka jika sebuah pesan dikirimkan ke dalam topik tersebut, consumer akan mendapatkan pesan yang sudah dikirimkan sebelumnya.

Consumer dapat bergabung dalam sebuah consumer group. Sebuah consumer adalah kumpulan dari beberapa consumer yang melakukan subscribe terhadap sebuah topik. Setiap consumer akan menerima pesan dari subset yang berbeda dalam sebuah topik. Sederhanya, setiap consumer akan mendapatkan pesan yang berbeda beda. Jadi pesan yang dikirimkan oleh message broker akan diterima oleh persis 1 consumer saja. Kafka menjamin bahwa pesan akan hanya dibaca oleh single consumer dalam sebuah grup.

Jumlah partisi akan berdampak terhadap jumlah maksimum paralel consumer karena jumlah kita tidak bisa punya consumer yang lebih banyak dari jumlah partisi.

Consumer group a dan b. Jika Pesan Po dikirimkan ke consumer, maka pesan tersebut akan dikirimkan ke consumer group A dan consumer group B. Hal ini akan menjamin bahwa pesan akan diterima oleh hanya 1 consumer dari grup A dan hanya 1 consumer dari group B.


Kafka Retention Policy

Di kafka, kita tidak melakukan deletion terhadap message yang ada di dalam broker. Tapi kita melakukan pembatasan terhadap siklus hidup si message atau disebut sebagai retention policy. 

Secara default, sebuah pesan akan hidup selama 7 hari, setelah 7 hari pesan tersebut akan dihapus dari broker. Kita bisa melakukan pengaturan retention policy menggunakan 2 hal, yaitu waktu dan ukuran partisi. lika sebuah message sudah melewati policy yang sudah ditentukan, maka message yang lama akan dihapus.

## TASK
Objective
- Kafka implementation

### Problem 1 - Kafka Messaging
Jalankan server Kafka dan kirimkan pesan menggunakan Kafka Publisher!

Ambillah pesan tersebut menggunakan Kafka Consumer!

### Problem 2 - Kafka Topics
Simulasikan Problem 1 dengan menambah topic baru!
Minimum 3 topics.
