# 19 Configuration Management and CLI

## Resume Materi
1. Command Line Interface (CLI)
2. Popular Command
3. Contoh-contoh Penggunaan

### Command Line Interface (CLI)
Mengapa Memilih CLI:
1. Granular Control
bebas memerintahkan proses apapun
2. Faster
dapat dimuat lebih cepat dan mengerjakan task lebih cepat
3. Proses dengan jumlah besar
4. Kemampuan otomasi task
dapat memprogram otomatis sebuah tugas atau kebutuhan
5. Mudah Mengecek koneksi

Shell = CLI for OS' Software\
jenis cli di berbagai system operasi
- UNIX shell
- Command Prompt(MSDOS)

Other app CLI\
jenis cli di berbagai bahasa pemrograman
- Python REPK
- MySQL CLI Client
- Mongo Shell
- redis-cli
- etc

dalam sebuah cli dapat membuat program sendiri

nama simbol: 
- me -> your username
- linuxbox -> your hostname
- '~' -> your current path(home)
- '$' -> Shell for normal user\
akses nya terbatas
- '#' -> Shell for root user\
akses nya bebas

ZSH\
bash biasa namun mempunyai fitur-fitur tambahan

BASH

### Popular Command
Command Directory
- pwd\
untuk track posisi directory
- ls\
menampilkan isi directory
- mkdir\
membuat sebuah folder
- cd\
berpindah ke sebuah folder lain
- rm\
menghapus 
- cp\
menyalin 
- mv\
memindahkan 
- ln\
link dapat menyesuaikan dengan folder yang dibuat

Command file
- create; touch\
untuk membuat sebuah file baru
- view; head, cat, tail, less\
untuk melihat isi file
- editor; vim, nano\

- permission; chown, chmod

- Different; diff

Command Network
- ping
- ssh
- netstat
- nmap
- ip addr(ifconfig)
- wget
- curl
- telnet
- netcat

Command Utility
- man
- env
- echo
- date
- which
- watch
- sudo
- history
- grep
- locate

### Contoh-contoh Penggunaan
jika kamu tahu sistem yang baik kamu dapat memikirkan bahwa (Linus Torvalds)

Contoh praktek
```bash
drwxrwxrwx0 6 fransiska wheel 6 Feb 8 06:58 access_directory
drwxrwxrwx0 = izin akses
6 = jumlah file
fransiska = pemilik (user)
wheel = pemilik (grup)
6 = ukuran
Feb 8 06:58 = tanggal dibuat
access_directory = File/Directory Name
```
```bash
drwxrwxrwx
d = file type :
- indictaes regular file
d indicates directory

rwx 
read, write execute : Dapat execute akses olehuser pemilik dalam suatu file

rwx 
read, write execute : Dapat execute akses oleh pemilik grup dalam suatu file

rwx
read, write, execute : Dapat execute akses oleh users laindalam suatu file
```

```bash
drwxrwxrwx
Binary rwx = 111, rwx = 111, rwx = 111
Decimal rwx = 7, rwx = 7, rwx = 7
```

SHELL SCRIPT
Shell adalah program yang menjembatani antara user dan kernel
Shell Script adalah bahasa pemrograman yang di kompilasi di dengan dasar shell commands
contoh:
```bash
echo #!/bin/sh > my-script.sh
echo : perintah untuh menampilkan
#!/bin/sh : isi yang akan di tampilkan
> : perintah untuk menulis ke file
my-script.sh : nama file
```
Cara menjalankan nya
contoh: 
```bash
./my-script.sh
./ : perintah untuk menjalankan file bash jika berada dalam 1 folder aktif
my-script.sh : nama file yang akan di jalankan
```

## Task CLI

### Problem 1 - Install oh-my-zsh
Follow the instructions on this !
LINK: https://dev.to/mskian/install-z-shell-oh-my-zsh-on-ubuntu-1804-lts-4cm4 
LINK: https://dev.to/vsalbuq/how-to-install-oh-my-zsh-on-windows-10-home-edition-49g2 

### Problem 2 - Create Automation Script
Follow the instructions on this 
LINK: https://gist.github.com/tegarimansyah/e91f335753ab2c7fb12815779677e914 !

### Problem 3 - Codecademy Basic Command Line (Optional)
Follow the instructions on this
LINK: https://www.codecademy.com/learn/learn-the-command-line !

