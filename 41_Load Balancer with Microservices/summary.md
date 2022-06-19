# 41 Load Balancer with Microservices

## Resume materi
1. Web server
2. NGINX
3. Load balancing

### Web server
Outline:
- Web server
- Reverse proxy
- Load balancing
- Nginx Load balancer
- Ingress Load balancer

Membuat web server menjadi load balancer

menerima request
mengarahkan aplikasi 

web server adalah
- sebuah program yang menerima request dari web
- memproses file-file html, css, javascript

Kelebihan menggunakan web server
- Interactions
- Configurations
- Flexibility
- Download Capabilities
- Sharing resources

Web server platform
- apache
- nginx
- tomcat
- netty

### NGINX
sangat very costumable
- open source
- reverse proxying
- caching
- load balancing
- media streaming

Reverse proxying adalah cara membelokan koneksi dari port satu ke port lain

kelebihan nginx reverse proxy
- load balancing
- increased security
- better performance
- easy logging dan auditing
- encrypted connection

### Load balancing

Load balancing membelok belokan akses 

metode load balancing
- round-robin
- least-connected
- ip-hash

Ingress Load balancing


## Task

### Challenge
- Siapkan Nginx di mesin lokal Anda
- Reverse Proxy aplikasi Anda ke port 80
- Pastikan berjalan seperti yang diharapkan