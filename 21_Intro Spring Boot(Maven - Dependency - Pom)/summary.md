# 21 Intro Spring Boot(Maven - Dependency - Pom)

## Resume Materi
1. RESTFUL API
2. HTTP
3. SPRINGBOOT

### RESTFUL API
Api = komunikasi anatra server dan client\
Rest(Representation state transfer) = protocol komunikasi anatara server dan client

HTTP (Hypertext Transfer Protocol)\
adalah protocol untuk mengirimkan media dokumen seperti html, javascript, css, image, audio, video dan lainnya\
ini adalah protocol anatara web browser dan web server\
HTTP Common Method :
- C (create) -> POST 
- R (read) -> GET
- U (update) -> PUT
- D (delete) -> DELETE

### HTTP
HTTP Flow\
Client <-> HTTP Request <-> Server

HTTP Request Example\
POST /product HTTP/1.1 \
POST = HTTP method \
/product = PATH \
HTTP/1.1 = HTTP Version

HTTP Other Standar method:\
Safe Method:
- GET
- HEAD
Message With Body:
- PUT
- POST
- PATCH
- TRACE
- OPTIONS
- DELETE

URL \
www.example.com/widgets?colour=blue&sort=newest
- www.example.com = Authority
- widgets = path
- ? = start parameter
- color = key
- blue = value
- & = separator

HTTP Headers(Example)
- Host = AUTHORITY on URL
- Content-type = tipe data dalam bodi HTTP
- Authorization = kredesial untuk authentikasi
- Accept = tipe data bahwa pengguna untuk menerima

HTTP Response Example
- status line
- response header
- response message body

HTTP Status Code
- 1xx = INFORMATIONAL
- 2xx = SUCCESS
- 3xx = REDIRECTION
- 4xx = CLIENT ERROR
- 5xx = SERVER ERROR

REST path URL restriction

### SPRING BOOT
Introduce: Build Automation Tools

Common Lifecycle In Maven
- validate
- compile
- test-compile
- test
- package
- integration
- install
- deploy

Common CLI in Spring Boot
- mvn spring-boot:run
- mvn clean install

## Task
Objective
- Serve HTTP using Springboot
- Implement HTTP Method
### Problem 1 - Say Hello from Springboot
Buatlah project Springboot yang dapat menampilkan pesan hello world dalam 3 endpoint berikut!
- GET /v1/messages
- POST /v1/messages
- DELETE /v1/messages

### Problem 2 - Endpoint Description
Dari 3 endpoint tersebut, jelaskan masing-masing perbedaannya!
