# 38 Compute Service

## Resume Materi
1. Integration
2. Delivery
3. Deployment

### 1. Integration
Continous Integration
adalah sebuah proses otomatis untuk menintegrasikan semua code yang berpotensi berbeda untuk dilakukan build dan testing

### 2. Delivery
Continous Delivery
adalah Proses penyebaran berkelanjutan melangkah lebih jauh daripada proses integrasi dan pengiriman.

Pipa penyebaran berkelanjutan secara otomatis menyebarkan setiap build yang telah diverifikasi.

Struktur Cycle Continous Delivery

Unit test -(Auto)> Platform test -(Auto)> deliver to staging -(Auto)> application acceptance tests -(Manual)> deploy to production -(Auto)> post deploy tests

### 3. Deployment
Continous Deployment
adalah Proses penyebaran berkelanjutan melangkah lebih jauh daripada proses integrasi dan pengiriman.

Pipa penyebaran berkelanjutan secara otomatis menyebarkan setiap build yang telah diverifikasi.

Struktur Cycle Continous Deployment

Unit test -(Auto)> Platform test -(Auto)> deliver to staging -(Auto)> application acceptance tests -(Auto)> deploy to production -(Auto)> post deploy tests

## Task

### Sebelum kita membuat project spring boot dengan beberapa fitur seperti data CRUD Tantangannya adalah menyebarkan proyek springboot Anda di mesin lokal ke cloud server publik untuk Layanan Web AWS