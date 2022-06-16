# 39 CI/CD with Microservices

## Resume Materi
1. CI/CD
2. Manual deployment dan Automatic Deployment
3. CI/CD tools

### CI/CD
Outline:
- Continous Integration dan Continous Deployment
- Manual Deployment
- Automatic Deployment
- Platform on CI/CD
- Github Actions
- Actions for spring boot
- challenges

CI/CD 
adalah tahapan ketika ingin mengautomasi sebuah code untuk dideploy

Proses sebelum masuk ke server

Continous integration => Continous delivery => Continous Deployment

build->test->merge => automatically release to repository => automatically deploy to production

Kelebihan CI/CD
- mempercepat proses perubahan fitur baru
- dapat langsung masuk ke server production
- mudah untuk diadaptasi
- kode dan operasi berkualitas tinggi

### Manual deployment dan Automatic Deployment
sebelum ada CI/CD para developer melakukan deploy secara manual dengan menggunakan commandline

Automatic Deployment
ini adalah kebalikan dari manual deployment yang berarti developer dapat dengan mudah mendeploy suatu code atau program yang telah dia kembangkan. proses yang dilakukan pada manual deployment dilakukan menggunakan tools pembantu, seperti jenkins

kelebihan automatic deployment
- menggurangi errors atau bug yang masuk ke server
- menghemat waktu
- konsisten dan berulang

### CI/CD tools
- jenkins
- Github actions
- CircleCi
- travis CI
- Argo

Github Actions
- buat folder .github/workflows
- tambahkan workflows seperti deployment.yaml
- commit dan push ke repository
- kemudian di repository klik actions

## Task

### Deploy ke cloud AWS
Sebelum kita membuat project spring boot dengan beberapa fitur seperti data CRUD.
Tantangannya adalah mendeploy proyek spring boot Anda di mesin lokal ke cloud server publik untuk Layanan Web AWS