# 31 Spring Boot Actuator

## RESUME MATERI
1. Environment Development
2. SDLC (Software development life cycle)
3. spring actuator

### Java Spring Boot Actuator
Outline:
- Environment development
- Development stages
- testing stages
- production stages
- monitoring application on server
- spring actuator
- challenge

Environment Development
- delevopment\
mengembangkan sebuah fitur
- testing\
menguji fitur yang di kembangkan
- staging\
test sebelum ke production
- production\
user dapat menggunakan fitur yang telah dikembangkan

jangan pernah deploy fitur yang belum di testing  ke prodcution

6 proses development stages :
- planning\
merencakan
- analysis\
bagaimana berdampak pada user
- design\
biasanya tergabung dengan system analysisi
- coding/implementation\
menyusun rangkaian kode
- testing
- patching/maintenance\
menyelesaikan bug atau error


### SDLC (Software development life cycle)
- planning and analysis
- design 
- imlpementation/coding
- testing
- maintenance

testing stages
- unit testing/integration testing
- functional testing
- regression testing
- smoke testing
- user appetance testing

production stages\
biasanya menggunakan ci/cd untuk mengautomatiskan deploy production

production monitoring
- grafana
- elk

### spring actuator
Actuator adalah semacan tools dalam springboot.
untuk melihat services yang bekerja atau mati

spring actuator depedencies\
menambahkan depedencies spring actuator

kemudian masukan \
management.endpoint.shutdown.enable=true
management.endpoint.web.exposure.include=*

## TASK

### Challenge
sebelum membuat sebuah aplikasi menggunakan spring boot.
masukan spring actuator ke aplikasi untuk memonitoruing aplikasi ketika di deploy ke production environment
