# 2 Version Control and Branch Management(Git)

## Resume
Dalam materi ini, mempelajari:
1. VCS(version Control System)
2. Git
3. Github

### VCS
Versioning Merupakan pelacakan dan/atau mengatur versi dari source code program.
Untuk melacak sebuah perubahan dapat dengan berbagai alat, yaitu: Version Control System(VCS), Source Code Manager(SCM), Revision Control System(RCS).
Sejarah VCS
- Single user
    1. pada tahun 1972 hanya dapat digunakan di unix dengan system SCCS
    2. pada tahun 1982 dapat cross platform dan hanya untuk teks dengan system RCS

- Centralized
    1. CVS - 1986 File focus
    2. Perforce - 1995
    3. Subversion - 2000 - track directory structure
    4. Microsoft Team Foundation Server - 2005

- Distributed
    1. Git - 2005
    2. Mercurial - 2005
    3. Bazaar - 2005


### Git
Salah satu version control system populer yang digunakan para developer untuk mengembangkan software secara bersama-bersama

Git dibuat terdistribusi bukan tersentralisasi
Git DIBUAT OLEH
Linus Torvalds (2005) - Linux Kernel
https://github.com/torvalds/linux

Dengan adanya git, setiap developer dapat berinteraksi/berkolaborasi dengan developer lain untuk mengembangkan aplikasi dengan baik.
Git dapat digunakan di server maupun di lokal, jadi ketika server tidak dapat diakses atau sedang tidak ada jaringan, developer dapat tetap mengembangakan aplikasi.

### Github
Github adalah sebuah server git publik yang dapat digunakan oleh developer secara gratis maupun berbayar.
dalam github terdapat beberapa perintah atau fitur-fitur yang dapat digunakan seperti : GIT INIT, CLONE, CONFIG, STAGING AREA,  STATUS, ADD, COMMIT, DIFF, STASH, LOG, CHECKOUT, RESET, PUSH, FETCH, PULL, BRANCHING, MERGE, PULL REQUEST, dan masih banyak lagi.


## Task
### 1. Buat sebuah repository di github
OUTPUT : 
![Buat Repository](https://github.com/magusabdul/Java-Springboot_Agus-Abdul-Malik/blob/master/2_Version%20Control%20and%20Branch%20Management%20(Git)/screenshots/Membuat-repository.jpeg)

### 2. Implementasikan penggunaan branching yang terdiri dari master, development, featureA, dan featureB
OUTPUT : 
- Branch Master
![Branch Master](https://github.com/magusabdul/Java-Springboot_Agus-Abdul-Malik/blob/master/2_Version%20Control%20and%20Branch%20Management%20(Git)/screenshots/Branch-master.png)

- Branch Development
![Branch Development](https://github.com/magusabdul/Java-Springboot_Agus-Abdul-Malik/blob/master/2_Version%20Control%20and%20Branch%20Management%20(Git)/screenshots/Branch-development.png)

- Branch featureA
![Branch featureA](https://github.com/magusabdul/Java-Springboot_Agus-Abdul-Malik/blob/master/2_Version%20Control%20and%20Branch%20Management%20(Git)/screenshots/Branch-featureA.png)

- Branch featureB
![Branch featureB](https://github.com/magusabdul/Java-Springboot_Agus-Abdul-Malik/blob/master/2_Version%20Control%20and%20Branch%20Management%20(Git)/screenshots/Branch-featureB.png)

![All Branch](https://github.com/magusabdul/Java-Springboot_Agus-Abdul-Malik/blob/master/2_Version%20Control%20and%20Branch%20Management%20(Git)/screenshots/git-all-branch.png)
### 3. Implementasikan Git untuk push, pull, stash, merge
- Git Push
![Git Push](https://github.com/magusabdul/Java-Springboot_Agus-Abdul-Malik/blob/master/2_Version%20Control%20and%20Branch%20Management%20(Git)/screenshots/Git-push.png)

- Git Pull
![Git Pull](https://github.com/magusabdul/Java-Springboot_Agus-Abdul-Malik/blob/master/2_Version%20Control%20and%20Branch%20Management%20(Git)/screenshots/Git-pull.png)

- Git Stash
![Git Stash](https://github.com/magusabdul/Java-Springboot_Agus-Abdul-Malik/blob/master/2_Version%20Control%20and%20Branch%20Management%20(Git)/screenshots/Git-stash.png)
Git Stash apply
![Git Stash apply](https://github.com/magusabdul/Java-Springboot_Agus-Abdul-Malik/blob/master/2_Version%20Control%20and%20Branch%20Management%20(Git)/screenshots/Git-stash-apply.png)
Git stash fixing C D
![Git stash fixing C D](https://github.com/magusabdul/Java-Springboot_Agus-Abdul-Malik/blob/master/2_Version%20Control%20and%20Branch%20Management%20(Git)/screenshots/Git-stash-apply-working-tree.png)

- Git Merge
Git Merge FastForward
![Git Merge FastForward](https://github.com/magusabdul/Java-Springboot_Agus-Abdul-Malik/blob/master/2_Version%20Control%20and%20Branch%20Management%20(Git)/screenshots/Git-Merge-fastforward.png)
Git Merge No Fast Forward
![Git Merge No Fast Forward](https://github.com/magusabdul/Java-Springboot_Agus-Abdul-Malik/blob/master/2_Version%20Control%20and%20Branch%20Management%20(Git)/screenshots/Git-merge-no-fast%20forward.png)

### 4. Implementasikan sebuah penanganan conflict di branch development ketika setelah merge dari branch featureA lalu merge dari branch featureB (Conflict bisa terjadi jika kedua branch mengerjakan di file dan line code yang sama.
OUTPUT : 
Git Merge FastForward
![Git Merge FastForward](https://github.com/magusabdul/Java-Springboot_Agus-Abdul-Malik/blob/master/2_Version%20Control%20and%20Branch%20Management%20(Git)/screenshots/Git-Merge-fastforward.png)
Git Merge No Fast Forward
![Git Merge No Fast Forward](https://github.com/magusabdul/Java-Springboot_Agus-Abdul-Malik/blob/master/2_Version%20Control%20and%20Branch%20Management%20(Git)/screenshots/Git-merge-no-fast%20forward.png)
Git Stash
![Git Stash](https://github.com/magusabdul/Java-Springboot_Agus-Abdul-Malik/blob/master/2_Version%20Control%20and%20Branch%20Management%20(Git)/screenshots/Git-stash.png)
Git Stash apply
![Git Stash apply](https://github.com/magusabdul/Java-Springboot_Agus-Abdul-Malik/blob/master/2_Version%20Control%20and%20Branch%20Management%20(Git)/screenshots/Git-stash-apply.png)
Git stash fixing C D
![Git stash fixing C D](https://github.com/magusabdul/Java-Springboot_Agus-Abdul-Malik/blob/master/2_Version%20Control%20and%20Branch%20Management%20(Git)/screenshots/Git-stash-apply-working-tree.png)


### 5. Gunakan merge no fast forword
OUTPUT : 
![Git Merge No Fast Forward](https://github.com/magusabdul/Java-Springboot_Agus-Abdul-Malik/blob/master/2_Version%20Control%20and%20Branch%20Management%20(Git)/screenshots/Git-merge-no-fast%20forward.png)
