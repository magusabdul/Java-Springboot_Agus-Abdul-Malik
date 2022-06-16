# 40 Kubernetes with Microservices

## Resume materi
1. Kubernetes
2. Konsep kubernetes
3. Bagian/Fitur Kubernetes

### Kubernetes
Outline:
- Definisi Kubernetes
- sejarah kubernetes
- penggunaan kubernetes
- konsep kubernetes
- deployment kubernetes
- service kubernetes
- deploy spring ke kubernetes

Kubernetes adalah sebuah platform untuk memanagemen seluruh kontainer dalam sebuah server

istilah nya Container orchestration

Sejarah Kubenetes

dimulai dengan era

Traditional deployment:
menggunakan server fisik, data center
```bash
App|App|App
Operting system
hardware
```

kemudian ada

Virtualized Deployment:
ini adalah server virtual atau sebuah komputer virtual yang digunakan atau disewakan sebagai server
```bash
App     |App    |App    |App
Bin/Library     |   Bin/Library
Operting system |   Operting system
virtual machine |   virtual machine
    Hypervisor
    Operating system
    hardware
```

dan akhirnya masuk ke perkembangan

Container deployment:
```bash
App         |App          |App
Bin/Library | Bin/Library | Bin/Library
container   | container   | container
    Container runtime
    Operating system
    hardware
```

kelebihan menggunakan kubernetes
- portability dan flexibilty
- multi-cloud capability
- increased developer productivity
- proven dan battle-tested


### Konsep kubernetes
- Kubernetes componets
- kubernetes API
- bekerja dengan objek kubernetes
- containers
- workloads
- services, load balancing, dan networking
- storage
- configuration
- security
- policies

### Bagian/Fitur Kubernetes

kubernetes nodes
sebuah mesin-mesin yang ada di server

kubernetes kontrol plane
sebuah kontroller dari nodes

kubernetes kontroller
sebuah kontroller yang ada di dalam system kubernetes

kubernetes pods
adalah sebuah container

kubernetes deployment adalah mendefinisikan struktur program, pods

kubernetes horizontal pod autoscaller
adalah untuk memaintenance resource yang ada di cluster kubernetes

kubernetes Api
akan dijalankan dengan perintah masukan di command line kemudian akan diterjemahkan oleh kubertenes

kubernetes ETCD
adalah sebuah database nya kubernetes dan bentuknya key value ada di dalam internal kubernetes

kubernetes CLI

kubernetes namespace
adalah sebuah pemisah antar aplikasi satu dengan lainnya, seperti rak-rak buku

## Task

### Deploy project Spring boot ke kubernetes cluster!
