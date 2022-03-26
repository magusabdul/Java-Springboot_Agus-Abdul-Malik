# 20 Intro RESTful API

## Resume Materi
1. Introduction RESTful API
2. REST (REpresentational State Transfer)
3. API TOOLS

### Introduction RESTful API
MENGAPA BACKEND ENGGINER PERLU MENGGUNAKAN/MEMPELAJARI RESTful API?\
Karena aplikasi saat ini harus dapat digunakan multiplatform, agar jika kita mempunyai banyak frontend maka dengan RESTful API dapat hanya mempunyai satu BACKEND untuk semua FRONTEND

Memahami konsep API\
Pembahasan REST\
Pembahasan JSON\
HTTP Response Code\
Open API\
Pengenalan Postman\
REST API DESAIGN\
Package net/http

Application Programming Interface(API)\
sebuah kumpulan dari function dan prosedur yang mengiiznkan mengakses sebuah fitur atau data pada sebuah Sistem operasi, aplikasi, atau sebuah servis

Banyak jenis API, tidak terbatas pada REST API saja, api sangat luas jenis jenis nya


Ilustrasi API

BAGAIMANA API BEKERJA\
CLIENT melakukan request kepada SERVER\
kemudian SERVER memberikan sebuah respon kepada CLIENT sesuai permintaan yang dapat dipenuhi atau tidak oleh SERVER

FrontEnd BackEnd Intergration
```bash
Android
IOS     <-> API (bussines logic) <-> Database
Desktop
Web
```
Frontend

Multiplatform Apps
- Android apps
- IOS apps
- Desktop
- Web

BackEnd

API untuk memporses\
akan ada request dari client\
setelah proses selesai maka akan di kembalikan apa yang diminta oleh client\
ada banyak library untuk melakukan add, update, read, delete

Database

dengan satu backend maka akan dapat digunakan oleh apk multiplatform


Service to Service\
dengan menggunakan API, Sebuah server dapat berkomunikasi atau berbagi layanan dengan server lain, seperti contoh di bawah:\
```bash
                        <-> BANK A
SEPULSA <-> MIDTRANS    <-> BANK B
                        <-> BANK C
```

### REST (REpresentational State Transfer)
Sekunpulan aturan untuk menbangun aplikasi terdistribusi

REST mempunyai banyak aturan untuk membuat apk terdistribusi

Use: HTTP protocol untuk berkomunikasi \
Endpoint : misal https://www.instagram.com/api/users

HTTP request Method:

- GET 
mengambil sebuah data
- POST
memasukan sebuah data
- PUT
edit/update data
- DELETE
menghapus data
- HEAD
- OPTION
- PATCH
- dan lainnya

Request & Response format:
- JSON
- XML
- SOAP

JSON (JavaScript Object Notation)\
json adalah sebuah format data yang digunakan untuk penyimpanan sebuah data
jika menlihat tentang konsep struktur data, mirip dengan struktur data map, yang menyimpan sebuah key dan value
ada key untuk mengakses data dan value untuk data yang disimpan

dapat menyimpan :
- int
- string
- boolean
- array
- object

HTTP Response Code\
untuk mengidentifikasi sebuah request status nya bagaimana saja\
berikut beberapa response code yang umum digunakan:
- 200 ok\
ketika request berhasil
- 201 created\
ketika request berhasil saat menambha data atau edit data
- 400 bad request\
terjadi kegagalan saat melakukan push
- 401 unauthorized\
mengakses resource yang kita tidak punya hak untuk mengakses resource tersebut
- 404 not found\
terjadi ketika respon data yang diminta tidak di temukan
- 405 method not allowed\
menggunakan method yang tidak sesuai dengan endpoint
- 500 internal server error\
terjadi saat terjadi kesalahn pada server

### API TOOLS
- KATALON
- APACHE JMETER
- POSTMAN
- SOAPUI

POSTMAN\
adalah http client yang bisa digunakan untuk testing sebuah website, postamn bisa melakukan testing, development dan dokumentasi dengan cepat

Download Postman di postman.com

Fitur dasar postman
- Collection/URL : bisa mendefinisikan sebuah endpoint yang akan direquest
- Method : 
- Result JSON : 

Best practice
- Gunakan kata Benda
- Gunakan kata jamak
- Gunakan resorce nesting yang tepat, sesuai relasi atau hirarki dari endpoint itu sendiri

Format Respon JSON\
contoh: 
```json
{
    "code" : 200,
    "message" : "Succes",
    "data" : {

    }
}
```

FILTERING, SORTING, PAGING, dan FIELD SELECTION\
FITERING: 
- GET /users?country=USA
- GET /users?creation_date=2019-11-11

SORTING:
- GET /users?sort=brithdate_date:asc
- GET /users?sort=brithdate_date:desc

PAGING: 
- GET /users?limit=100
- GET /users?offset=2

FIELD SELECTION:
- GET /users/123?fields=username,email(for one specific user)
- GET /users?fields=username,email(for a full list of user)

HANDLE TRAILING SLASHES GRACEFULLY
- POST:/cars  <->  POST:/cars/

VERSIONING
- https://us6.api.mallchimp.com/3.0/ (major + minor version indication)
- https://api.strip.com/v1/ (major version indication only)
- https://developer.github.com/v3/ (major version indication only)


OPEN API https://github.com/public-apis/public-apis&sa=D&source=editors&ust=1648179730495463&usg=AOvVaw1sH-6iZeuH2Qm4FP6ESKOH \
- Chronicling America : =http://chroniclingamerica.loc.gov/about/api/&sa=D&source=editors&ust=1648179730637262&usg=AOvVaw2JVXmsHqEmSXjEgV1mSPZp
- Currents : https://currentsapi.services/&sa=D&source=editors&ust=1648179730637464&usg=AOvVaw2BKGPDgCac--mV0k3zQf_G
- Feedbin : https://github.com/feedbin/feedbin-api&sa=D&source=editors&ust=1648179730637606&usg=AOvVaw37bJe3hLuaIq_SPogDp_x3
- Feedster : https://api.feedster.me/v1/docs/&sa=D&source=editors&ust=1648179730637750&usg=AOvVaw3M7KBsIV876YAfmf86m67h
- New York Times : https://developer.nytimes.com/&sa=D&source=editors&ust=1648179730637900&usg=AOvVaw09ZLLT33zKG7X9kIGW573x

## Task

### Problem 1- Postman
Submission Task Immersive:
- Export collection Postman dalam bentuk JSON.
- Tugas Part 1 (mengimplementasikan API melalui Postman) dikumpulkan melalui Github dalam satu tempat dengan tugas Part 2 - Static API CRUD User

Objective
- Request to the server using Postman
- Implement HTTP Method POST, DELETE, PUT)
- Using environment Postman

Problem

1. Buat satu collection, dan memanfaatkan fitur environment dan lakukan request terhadap api yang ada di API Documentation menggunakan Postman. Lakukan request terhadap 3 target api berikut!
    - Target API 1
        - https://newsapi.org/
        - Lakukan request terhadap API minimal 5 API

    - Target API 2
        - https://swap.dev
        - Lakukan request terhadap API minimal 5 API

    - Target API 3
        - API Documentation:\
        https://app.swaggerhub.com/apis docs/sepulsa/RentABook-API/1.0.0
        - API Server:\
        https://app.swaggerhub.com/apis-docs/sepulsa/RentABook-API/1.0.0 
        - Lakukan request terhadap API dengan mengimplementasikan 4 method GET, POST, PUT, DELETE.