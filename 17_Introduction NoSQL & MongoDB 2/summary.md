# 17 Introduction NoSQL & MongoDB 2

## Resume Materi
1. BASIC OPERATION MONGODB
2. INSERT, FIND-1, UPDATE, REMOVE, FIND-2
3. ADVANCED QUERY, ARRAY, AGGREGATION

### BASIC OPERATION MONGODB
Beberapa Istilah :
- Instalasi
- Administrasi
- Collection
- Insert
- Find-1
- Update
- Remove, Find-2

INSTALASI\
Download mongoDB\
https://www.google.com/url?q=https://www.mongodb.com/download-center/&sa=D&source=editors&ust=1648051538287402&usg=AOvVaw28uDGal5bXsOzhiX-jbXvW

Instal di LINUX
1. Cara Instal di UBUNTU
```
sudo apt install mongodb
```
2. Cara pastikan server sudah berfungsi
sudo netstat -plaNt --numeric-port | grep 27017
3. Cara menyalakan dan mematikan server
sudo service mongodb status|stop|start
4. Cara memulai mongo client(mongo shell)
mongo

GUI-MONGODB COMPASS
https://www.google.com/url?q=https://www.mongodb.com/download-center/compass&sa=D&source=editors&ust=1648051538653323&usg=AOvVaw2eVx1bfVTdA8-I8bPgjghc 

Dokumentasi-versi 3.6.x
https://www.google.com/url?q=https://docs.mongodb.com/v3.6/tutorial/&sa=D&source=editors&ust=1648051538653598&usg=AOvVaw3446nNR4jGPAHpNJ0V1Poq 

Referensi
https://www.google.com/url?q=https://docs.mongodb.com/v3.6/reference/&sa=D&source=editors&ust=1648051538653787&usg=AOvVaw0v-hbUm4YRkSw_7GP5o0K7 

ADMINISTRASI
1. Help
help
2. Setup password root
https://www.google.com/url?q=https://docs.mongodb.com/manual/tutorial/enable-authentication/%23create-the-user-administrator&sa=D&source=editors&ust=1648051538533582&usg=AOvVaw2P3psbGKnQ3xfWQFKzhGn2 
3. Ubah konfigurasi
sudo nano /etc/mongodb.conf
4. Setup user baru
https://www.google.com/url?q=https://docs.mongodb.com/manual/tutorial/enable-authentication/%23create-additional-users-as-needed-for-your-deployment&sa=D&source=editors&ust=1648051538533897&usg=AOvVaw1Py6zi2HQOWMz7cx0iBSZq 
5. Login menggunakan user baru

Collection
1. Cara membuat db
use test
2. Cara membuat collection(optional)
db.createCollection('mentees')
3. Referensi
    - https://www.google.com/url?q=https://docs.mongodb.com/v3.6/reference/method/db.createCollection/&sa=D&source=editors&ust=1648051538678562&usg=AOvVaw0n2-sZKrCqDuIyLuiVJi-R 
    - https://www.google.com/url?q=https://docs.mongodb.com/v3.6/reference/method/db.createCollection/&sa=D&source=editors&ust=1648051538678924&usg=AOvVaw1gWKbnR1l451plliFKAasx 

### INSERT, FIND-1, UPDATE, REMOVE, FIND-2
INSERT
1. Single Insert
    - Input
    db.mentees.insert((firstName:"Abdullah",
    lastName:"Habib", gender:"male"))
    - Output
    WriteResult({"nInserted : 1"})
2. Bulk Insert(Multiple Insert)
db.mentees.insert([
    (firstName:"Afif", lastName:"Haydan", gender:"male"),
    (firstName:"Ahmad", lastName:"Yusqie", gender:"male"),
])
3. Referensi
https://www.google.com/url?q=https://docs.mongodb.com/v3.6/reference/method/db.collection.insert/&sa=D&source=editors&ust=1648051538740348&usg=AOvVaw0o_zOHMsNiHJF02rQIYNFu 
4. Single Insert
    - Input
    db.mentees.insert({_id: 1, lastName:"Habib", gender:"male"})
    - Output
    WriteResult({"nInserted : 1})

FIND-1
1. Query pada mongoDB: menggunakan find
db.mentees.find()
db.mentees.find().pretty()
2. Referensi
https://www.google.com/url?q=https://docs.mongodb.com/v3.6/reference/method/db.collection.find/&sa=D&source=editors&ust=1648051538693360&usg=AOvVaw0b8nqkrnXK8cmEh2d2h1j6 

UPDATE
1. Update Dokumen
db.mentees.update({firstName:"Ahmad"}, {firstName:"Ahmad", lastName:"Y Mafaza", gender:"male"})
2. $set
db.mentees.update({firstName:"Ahmad"}, {$set:{lastName:"Y Mafaza", age:17}})
3. $inc
db.mentees.update({firstName:"Ahmad"}, {$inc:{age:1}})
4. $unset
db.mentees.update({firstName:"Ahmad"}, {$unset:{age:""}})
5. $rename
db.mentees.update({firstName:"Ahmad"}, {$rename:{gender:"sex"}})
6. Upsert(Update or Insert)
    - Update\
    db.mentees.update({firstName:"Danny"}, {firstName:"Danny", lastName:"Hidayat", gender:"male"});
    - Insert\
    db.mentees.update({firstName:"Danny"}, {firstName:"Danny", lastName:"Hidayat", gender:"male"}, {upsert:true});
7. Referensi
https://www.google.com/url?q=https://docs.mongodb.com/v3.6/reference/method/db.collection.update/&sa=D&source=editors&ust=1648051538783309&usg=AOvVaw1RLYO4cd7I-sds2WFH_J8p 
https://www.google.com/url?q=https://docs.mongodb.com/v3.6/reference/operator/update/&sa=D&source=editors&ust=1648051538783697&usg=AOvVaw0HdHaArQbjVuZfarKaWZHj 

REMOVE
1. Hapus dokumen
db.mentees.remove({firstName:"Abdullah});
2. Hapus 1 dokumen
db.mentees.remove({firstName:"Abdullah}, {justOne: true});
3. Referensi
https://www.google.com/url?q=https://docs.mongodb.com/v3.6/reference/method/db.collection.remove/&sa=D&source=editors&ust=1648051538773968&usg=AOvVaw3vMk7CYqTXefjLGS9ztz6y 

FIND-2
1. Find dengan parameter
db.mentees.find({firstName:"Abdullah"});
2. Find dokumen dalam dokumen
    - db.mentees.update({firstName:"Abdullah"}, {$set: { address: {street: "Tidar", city: "Malang"}}});
    - db.mentees.find({"address.city":"Malang"});
3. Tampilkan field spesifik
    - db.mentees.find({firstName:"Abdullah"}, {firstName: 1});
    - db.mentees.find({firstName:"Abdullah"}, {firstName: 1, _id: 0});
4. Sorting
    - db.mentees.find().sort({firstName: 1}); // 1: ASC
    - db.mentees.find().sort({firstName: 1}); // -1: DESC
5. Limit
db.mentees.find().limit(2);
6. Count
    - db.mentees.count();
    - db.mentees.find({gender: "male"}).count();
7. Referensi
https://www.google.com/url?q=https://docs.mongodb.com/v3.6/reference/method/db.collection.find/&sa=D&source=editors&ust=1648051538770886&usg=AOvVaw0Cyr8bRNIMImdBTUhfnuNx 

### ADVANCED QUERY, ARRAY, AGGREGATION
- Export Import/Dump Restore
    - Export
    - Import
    - Dump
    - Restore
    - Referensi\
    https://www.google.com/url?q=https://docs.mongodb.com/v3.6/reference/program/&sa=D&source=editors&ust=1648051538716359&usg=AOvVaw0AlDFdCQtEX7aH0VD-JkKT 
- Advanced Query
    - Comparison\
    Referensi https://www.google.com/url?q=https://docs.mongodb.com/v3.6/reference/operator/query-comparison&sa=D&source=editors&ust=1648051538736870&usg=AOvVaw3MW-eabn8ssBChnBP46vjX 
    - Logical\
    Referensi https://www.google.com/url?q=https://docs.mongodb.com/v3.6/reference/operator/query-comparison&sa=D&source=editors&ust=1648051538685988&usg=AOvVaw1OBJwQt9GQ0QJ3TzODGRLj 
    - Evaluator\
    Referensi https://www.google.com/url?q=https://docs.mongodb.com/v3.6/reference/operator/query-comparison&sa=D&source=editors&ust=1648051538444724&usg=AOvVaw3g-KGKhurzYWlEj_gUjNmw 
- Array/Embedded Document
    - Find\
    Referensi https://www.google.com/url?q=https://docs.mongodb.com/v3.6/reference/operator/query-array/&sa=D&source=editors&ust=1648051538472299&usg=AOvVaw37O5HRhtBm74ptvYkwxgEp https://www.google.com/url?q=https://docs.mongodb.com/v3.6/reference/operator/query-array/&sa=D&source=editors&ust=1648051538472753&usg=AOvVaw3y8qDFG0Ro1heypVewiVhl    
    - Update\
    Referensi https://www.google.com/url?q=https://docs.mongodb.com/v3.6/reference/operator/update-array/&sa=D&source=editors&ust=1648051538679956&usg=AOvVaw0U0n0DkT0TSjCKGyHwIBqm 
- Aggregation Framework
    - Rangkaian dari transformasi dokumen(pipeline)\
    Referensi https://www.google.com/url?q=https://docs.mongodb.com/v3.6/reference/operator/aggregation-pipeline/&sa=D&source=editors&ust=1648051538699744&usg=AOvVaw3LydfOMUaHc_LZCHaIv3hM 
    - $lookup: join\
    Referensi https://www.google.com/url?q=https://docs.mongodb.com/v3.6/reference/operator/aggregation/lookup/&sa=D&source=editors&ust=1648051538674855&usg=AOvVaw2xIUy-LJ2_y4-UOQcet0uv 
    - $match, query\
    Referensi https://www.google.com/url?q=https://docs.mongodb.com/v3.6/reference/operator/aggregation/match/&sa=D&source=editors&ust=1648051538490971&usg=AOvVaw1QbNEIVIaiLdgs2dZl0x3e 
    - $project: reshape\
    Referensi https://www.google.com/url?q=https://docs.mongodb.com/v3.6/reference/operator/aggregation/project/&sa=D&source=editors&ust=1648051538670586&usg=AOvVaw22m8hkmPVndLzCWL3pwLqo
    - $project: $cond\
    Referensi https://www.google.com/url?q=https://docs.mongodb.com/manual/reference/operator/aggregation/cond/%23example&sa=D&source=editors&ust=1648051538508146&usg=AOvVaw0avANl-GOF1g5Xx50FCFpU 
    - $group: summarize\
    Referensi https://www.google.com/url?q=https://docs.mongodb.com/v3.6/reference/operator/aggregation/group/&sa=D&source=editors&ust=1648051538713131&usg=AOvVaw3u7eVsxVhdBixrHoGgHOa4 https://www.google.com/url?q=https://docs.mongodb.com/v3.6/reference/operator/aggregation/group/&sa=D&source=editors&ust=1648051538713496&usg=AOvVaw01IA4u5jKyQlZp7-wQsXlv 
    - $unwind: expand\
    Referensi https://www.google.com/url?q=https://docs.mongodb.com/v3.6/reference/operator/aggregation/unwind/&sa=D&source=editors&ust=1648051538668597&usg=AOvVaw3KHyu1MxDzqiSHe7yJmDHa 
    - $sort
    - $limit
    - $skip

## Task

### Database: Aggregation MongoDB
Objektif
- Mampu menggunakan agregasi di Mongo DB

Submit Your Answer:

Introduction\
Pada tantangan kali ini kita akan melanjutkan dari tugas No SQL sebelumnya

Problem 2: Aggregation MongoDB

Books
```
{_id:l, title: "Wawasan Pancasila", author ID: 1, publisher 10: 1, price:
71200, stata: (page: 324, weight: 300, publishedät new Date(2018-10-01-1),
category: ["social", "politics"]}
{_id: 2, taties "Mata Air Keteladanan", authorID: 1, publisher10: 2, prices
106250, stats: (page: 672, weight: 650), publishedAt: new
Date("2017-09-01), category: ["social", "politica"]}
{_id: 3, title: "Revolusi Pancasila", authorID 1, publisherID: 1. price:
54400. stats (page: 220, weight 5001, publishedAt new Date("2015-05-01"),
category: ["social" "politics"]}
{_id: 4. title: "Self Driving", authorID: 2, publisherID: 1. price: $2650,
atata (page: 286. weight: 300, publishedAt new Date("2016-05-01),
category: ["self-development"]}
```

Authors
```
{_id:1, firstName: "Yudi", lastName: "Latif"}
{_id: 2, firstName: "Rhenald", lastName: "Kasali"}
```

Publishers
```
{_id: 1, publisherName: "Expose"}
{_id: 2, publisherName: "Mizan"}
```
