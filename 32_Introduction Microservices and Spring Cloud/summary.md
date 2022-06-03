# 32 Introduction Microservices and Spring Cloud

## RESUME MATERI
1. Alasan kenapa microservices harus di pelajari
2. Database
3. Services

### Alasan kenapa microservices harus di pelajari
- kekinian
- ekosistem pendukung
- banyak digunakan di tech company
- sudah jadi pengetahuan wajib untuk senior engineer

arsitektur monolith
- single deployment unit
- dimana semua fitur dibuat dalam sebuah aplikasi besar

kelebihan arsitektur monolith
- mudah di develop
- mudah di deploy
- mudah di test
- mudah di scale

masalaah diarsitektur monolith
- mengintimidasi developer yang baru bergabung
- scaling development dengan banyak developer agak menyulitkan
- butuh kontrak panjang dengan teknologi yang digunakan(bahasa pemrograman, database dan lain)
- scaling pda bagian tertentu tidak bisa dilakukan
- running app monolith sangat berat

apa itu artsitektur microservices
- aplikasi-aplikasi kecil yang saling bekerja sama
- fokus mengerjakan satu pekerjaan dengan baik
- independent dapat di deploy dan diubah tanpa tergantung dengan aplikasi lain
- setiap komponen pada sistem dibuat dalam service
- komunkasi antar service biasanya melalui network-call

kelebihan arsitektur micoservices
- udah dimengerti karena raltive kecil ukuran service nya
- lebih mudah di develop dimaintain di test dan di deploy
- lebih mudah bergonta ganti teknologi
- muda di scale sesuai kebutuhan
- bisa dikerjakan dalam tim-tim kecil


masalah di arsitektur microservices
- distributed system
- komunikasi antar service yang rawan error
- testing interaksi anatar service lebih sulit


pembagian aplikasi microservice
- merchan
- product
- shipping


sebarapa kecil aplikasi microservices
- sisngle responbility
- sekecil mungkin sehingga bisa dimengerti oleh satu orang
- bisa dikerjakan sejumlah x developer


perbedaan 

monolith
- simplicity
- consistency
- easy to refactor

microservices
- partial deployment
- avibility
- multiple platform
- easy to scale

### Database

database perservice

decentralized database

kenapa harus database per service
- memastikan bahwa antarservice tidak ketegantungan 
- tiap service bisa menggunkan aplikasi database sesuai dengan kebutuhan
- service tidak perlu tahu kompleksitas internal database service lain

shared database

kapan harus shared database
- ketika melakukan transisi dari aplikasi monoloh ke microservices
- ketika bingung memecahkan data antar service
- ketika dikejar waktu sehingga tidak ada waktu untuk bikin API

kenapa butuh tahu nosql
- agar bisa disesuaikan dengan kebutuhan 
- bisa mencari alternatif cara mengolaj data
- mempercepat dalam proses penulisan atau pencarian

remote procedure invocation

komunkasi antar service
- ideal nya komunkasi dilakukan melalui RPI(remote procedure invocation) atau RPC (Remote procedure call)
- tidak direkomendasikan komunikasi dilakukan via database

contoh remote procedure invocation
- RESTful API(HTTP)
- gRPC
- Apache Thrift
- SOAP
- Java RMI
- Corba(Common Object Request roker Arcitecture)

keuntungan menggunakan RPI
- sedrhana dan muda
- biasanaya digunakan untuk komunikasi request - reply
- biasanaya digunakan untuk proses sync (yang butuh menunggu jawaban)

messaging

masalah komunikasi RPI
- proses lama(pada email service dan sms service)
- mengirim data yang sama berkalikali(pada finance service dan report service)
- membuat paralel process sangat rumit

komunikasi dengan cara messaging
- messaging bisaanya digubkan untuk komunikasi async 
- async artinya komunkasi dilakukan tanpa harus menunggu selesai di proses
- dalam async kadang tidak perlu peduli na;asan dari service yang dituju
- bisanaya komunkasi messaging membutuhkan message channel sebagai jembatan untuk mengirim dan menerima data
- direkomendasikan menggunakan aplikasi message broker untuk melakukan management message channel

contoh message broker
- redis(pubsubu)
- apache kafka
- rabbitmq
- nsq
- google pubsub
- amazon web service sqs

keuntungan menggunakan messaging
- proses lebih cepat karena tidak harus menunggu response
- service pengirim data tidak perlu peduli terhadapa penerima data

type of microservices
- stateless microservice
- persistance microservice
- aggregation microservice

stateless microservice
- biasanaya tidak memiki database
- digunakan untuk melakukan tugas sederhana
- biasa digunakan juga sebagai utility untuk microservice lain
- tidak bergantung dengan microservice lain

persistance microservice
- biasanya memiliki database
- bisa juga disebut sebagai master data microservice
- biasa digunakan untuk mengolah data di database(CRUD)

aggregation microservice
- tergantung dengan microservice lain
- biasa digunkaan sebagai pusat bussines logic aplikasi
- boleh memiliki database atau pun tidak
- tidak bisa berdisi sendiri

service orchestration
- cara aggregation microservices berkomunikasi dengan microservices lain, jika menggunakan remote procedure invocation maka dinammakanservice orchestration pattern
- dalam service orchestrartion pattern, aggregation microservices bertugas untuk mengatur alur bussiness logic system

keuntungan service orchestration
- mudah dibuat karena kode businss logic akan terpusat di aggreagtion microservices
- mudah dimenggerti karena kode bussiness logic akan terpusat di aggregation microservices

kekurangan services orchestration
- aggregation microservices terlalu ketergantungan dengan microservices lain
- aggregation microservices akan lebih lambat karena harus terkoneksi dengan microservices lain
- aggreagtion microservices akan lebih mudah error jika di microservces lain terdapat masalah
- jika perlu icroservices baru perlu dilakukan perubahan di aggeragtion microservices

### Services

services choreography
- dalam service choreography komukasi aggreagtion service dengn microservice lainnya mengggunakan messaging
- semua microservices dituntut untuk menjadi pintar tidak hanay diperintah oleh aggregation microservices

keuntungan services choreography
- aggregation microservices tidak tergantung dengan microservices lainnya
- aggregation microservices akan lebih cepat karena tidak perlu berkomunikasi dengan microservices lainya
- jika ada microservices baru, aggregation microservices tidak perlu melakukan perubahan lagi

kekurangan service choreography
- lebih sulit di debug ketika terjadi masalah
- business logic akan terdistribusi di semua microservices sehingga sulit untuk dimengerti secara keseluruhan

API gateway

masalah mengekspos microservices
- semuad service bisa diakses dari luar
- jika butuh autentikasi harus di implementasikan di semua service
- rawan terjadi kebocoran data

API Gateway
- api gateway adalah aplikasi yang bertugas sebagai gerbang dari luar ke dalam
- luar adalah akses dari internet dan dalah adalah aplikasi microservices
- api gateway bertugas sebagai proxy server ke semua aplikasi microservices
- aplikasi microservices hanay bisa diakses dari luar melalui API Gateway

Keuntungan API gateway
- lebih aman karena satu gerbang
- service tidak perlu mengimplementasikan proses autentikasi, cukup dilakukan di API gateway
- API Gateway juga bisa digunakan sebagi load balancer
- bisa digubakan sebagi rate limiter
- bisa digunakan sebagai pengaman sehingga error dari service tidak tereskpos

contoh api gateway
- nginx
- apache httpd
- kong
- netflix zuul
- spring cloud gateway

authentication dan authorization

authentication
- memvalidasi kredensal untuk memverfikasi pemilik identitas
- contoh proses authentication adalah proses login menggunakan username dan password, dan banyak kainnya

authorization
- authorization adalah proses yang dilakukan setelah proses authentication
- memvalidasi apakah pemilik identitas memiliki hak akses untuk mengakses resource yang diminta
- contoh proses authorization adalah access control list dan lain

auth service

integrasi dengan auth service

api gateway sebagai middlesware

teknologi pendukung
- secure cookie
- oouth
- json web token
- basic auth
- api key/secret key

permasalahan banyak jenis front end 
- tiap frontend punya mekanisme autentikasi berbeda
- kecepatan bandwith tiap frontend berbeda
- api yang dibutuhkan tiap frontend berbeda
- semua kebutuhan jenis front end harus diimplementasikan di satu API Gateway

backend for frontend
- backend for frontend adalah menyediakan backend khusus untuk frontend tertentu
- biasanaya satu backend akan melayani satu frontend secara specific
- makin banyak jenis frontend makin banyak backend yang dibuat

keuntungan backend for frontend
- pengembangan backend untuk tiap frontend bisa terisolasi satu sama lain
- logic untuk frontend tidak tercampur di saty backend

graphql: Alternative backend for frontend
- graphQL adalah query language untuk API
- GraphQL dapat digunakan untuk memanipulasi response API secara runtime
- Frontend bebas menentukan data apa saja yang ingin didapatkan
- backend hanya perlu menyediakan data lengkap dan frontend bisa dengan bebas menentukan data apa asaya yang diinginkan

keuntungan menggunakan graphQL
- butuh melakukan development graphQL server di backend
- butuh melakukan development graphQL client di frontend

CQRS(Command query Responsibility Segretation)
- CQRS adalah proses membedakan operasi command dan opersai query
- Operasi command adalah operasi mengubah data(Create, update, delete)
- Operasi commanda adlaah operasi mengabil data(Get, search)
- dalam CQRS biasanya service atau database dibedakan untuk kebutuhan command dan kebutuhan query

keuntungan CQRS
- bisa memilih database berbeda yang optimal untuk proses command dan query sehingga operasi command dan searcj bisa lebih cepat kerana database nya sudah disesuaikan dengan kebutuhan
- membedakan model untuk command dan query di aplikasi akan lebih mudah dibanding digabung di satu model yang sama untuk proses commadn dan query
- performa aplikasi akan lebih abik karena kita membedakan component untuk command dan query

keuntungan CQRS mengguankan mesaging
- aplikasi command dan query terpisah sehingga bisa dikerjakan oeleh tima yang berbeda secara paralel
- aplikasi command tidak perli pusong memikirkan struktur data aplikasi query, hanya cukup mengirimkan data nya ke mesage broker 
- scaling aplikasi bisa sesuai dengan kebutuhan, baik itu command atau query
- jika apliaksi query sedang stop aatau eror, daya dari apliaksi command akan tetap aman tersimpan di message broker
- mekanisme retry akan lebih mudah dilakukan jika melalui message broker

Server side discovery
- Membuat server khusu sebagai router atau load balancer ke service
- client hanya butuh terkoneksi ke router atau load balancer
- jika jumalh node service bertambah atau berkurang, router yang hanay perlu dirubah, client tidak perlu berubah

contoh router atau load balancer
- nginx
- apache httpd
- traefik

kekurangan server side discovery
- tiap service harus memiliki router atau load balancer
- agar tidak terjadi single point of failure, mka router atau load balancer harus di setup sebanayk 2 instance
- cost biaya akan lebih mahal karena 1 service harus menjalankan 2 router

Service Registry
- Service Registry adalah aplikasi yang digunakan sebagai tempat untuk menyimpan semua informasi yang berhubungan dengan lokasi service
- Semua service akan meregistrasikan alamat lokasi nya di Service Registry ketika pertama kali nyala
- Semua service akan laporan ke Service Registry jika akan berhenti beroperasi, sehingga Service Registry akan menghilangkan informasi service tersebut agar tidak mendapot traffic dari service yong bertanya

Contoh Aplikasi Service Registry
- Hashicorp Consul https:/www.consul.io/ 
- Netflix Eureka https:/github.com/Netflix/eureka 


Centralized configuration

Contoh Lokasi menyimpan Konfigurasi
- Database
- File
- Environment Variable

Centralized Configuration

- Centralized Configuration adalah pattern dimana kita menyimpan semua konfigurasi di sebuah aplikasi atau service
- Service yang butuh konfigurasi akan bertanya ke aplikasi tersebut unituk mendapatkan data konfigurasinya

Contoh Aplikasi Centralized Configuration
- Hashicorp Consul https:/www.consul.io/
- Hashicorp Vault https://www.vaultproject.io/
- Etcd https:/etcd.io/
- Zookeeper https:/zookeeper.apache.org/
- Doozerd https:/github.com/ho/doozerd

dan bahasan lainnya: 
- Strangler application
- third party integration
- webhook
- caching
- circuit breaker
- event sourcing
- saga pattern(distributed transaction)
- integration test
- end to end test
- consumer driven contract
- continous integration
- continous development
- health monitoring
- application metric
- log aggregation
- distributed tracing
- Reporting
- scaling microservices
- analytic
- a/b testing
- blue green development
- cloud computing
- infrastructure as code
- service mesh

## TASK
Objective
- Microservices design

### Problem 1 - Centralized and Decentralized Database

Buatlah rancangan dalam bentuk diagram yang menampilkan:
- sebuah arsitektur aplikas
- memiliki minimum 5 services
- terdapat services yang melakukan shared database
- terdapat services yang melakukan database per service

### Problem 2 - Services Communication
Dari rancangan microservices di atas:
1. Buatlah rancangan jika antar service berkomunikasi melalui RPC!
2. Buatlah rancangan jika antar service berkomunikasi melalui Messaging!
