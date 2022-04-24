# 24 JPA (Spring Database SQL)

## RESUME MATERI
1. Spring datasource menggunakan JPA SQL
2. Spring Data JPA
3. PostgreSQL Driver

### Spring datasource menggunakan JPA SQL
spring initializr
start.spring.io 
adalah sebuah tools untuk membuat sebuah project spirng baru

Depedency 

Spring web
sebagai web server pada project spring

Spring Data JPA
untuk membantu melakukan manipulasi data

PostgreSQL Driver
berguna untuk menghubungkan spring data jpa ke database postegresql

Lombok
untuk membantu mengbangun kode dasar, misal: agar tidak menulis seluruh setter getter  pada kelas tersebut


akan terdapat 

konfigurasi postgresql
```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/springsql
spring.datasource.username=magusabdul
spring.datasource.password=1945

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```



## TASK

### 1. Buatlah sebuah project yang dapat melakukan CRUD
lengkap yang memuat REST API Endpoint, Repository, dan Service!

### 2. Tambahkan sebuah CRUD lagi dalam project tersebut!


