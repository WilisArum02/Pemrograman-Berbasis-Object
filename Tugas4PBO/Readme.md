# JDBC
JDBC adalah singkatan dari Java Database Connectivity. JDBC adalah Java Database Connectivity untuk menghubungkan dan mengeksekusi query dengan database.

Menggunakan Apache Netbeans IDE 15 dan PostgreSQL pgAdmin 4

[![forthebadge made-with-ApacheNeatbeans](https://th.bing.com/th?id=OSAAS.67E3675844C1A9B6C86DF097C16A6D3B&w=80&h=80&c=1&o=6&pid=5.1)](https://netbeans.apache.org/) [![forthebadge made-with-PosgreSQL](https://th.bing.com/th?id=OSAAS.C27BAA7112B6F36A360DBBC4ACA18527&w=80&h=80&c=1&o=6&pid=5.1)]([https://netbeans.apache.org/](https://www.postgresql.org/)https://www.postgresql.org/)


## Langkah Pengerjaan
1. Sambungkan Netbeans dengan pgAdmin menggunakan jdbc, pastikan sudah terkoneksi

   <img width="285" alt="Tugas4" src="https://github.com/WilisArum02/Pemrograman-Berbasis-Object/assets/148854173/f8d3273a-817c-40d9-b1b5-b0ce541262ca">

2. Sambungkan Netbeans dengan pgAdmin menggunakan jdbc, pastikan sudah terkoneksi

   <img width="215" alt="tugas4 1" src="https://github.com/WilisArum02/Pemrograman-Berbasis-Object/assets/148854173/0b189dba-c736-4d25-b5e3-40d2e5e34c29">

3. Buat kelas [Insertinto](https://github.com/WilisArum02/Pemrograman-Berbasis-Object/blob/main/Tugas4PBO/src/tugas4pbo/InsertInto.java) dengan memasukkan data ke table dosen yang berisi kolom nidn, nama, Alamat, jenis_kelamin.
4. Kemudian kita tampilkan datanya dengan [SELECT](https://github.com/WilisArum02/Pemrograman-Berbasis-Object/blob/main/Tugas4PBO/src/tugas4pbo/Select.java)
5. [UPDATE](https://github.com/WilisArum02/Pemrograman-Berbasis-Object/blob/main/Tugas4PBO/src/tugas4pbo/Update.java) Alamat Lamongan dari nidn 12678 dimana nidn merupakan primary key

   <img width="354" alt="tugas4 2" src="https://github.com/WilisArum02/Pemrograman-Berbasis-Object/assets/148854173/084b9bf7-051c-4627-b4e1-20957e56c388">

   menjadi

   <img width="415" alt="tugas4 3" src="https://github.com/WilisArum02/Pemrograman-Berbasis-Object/assets/148854173/4ca642ba-5c85-465c-aa78-90c29655ae19">

7. [DELETE](https://github.com/WilisArum02/Pemrograman-Berbasis-Object/blob/main/Tugas4PBO/src/tugas4pbo/Delete.java) record dengan nidn 12345 dimana nidn merupakan primary key
    Lalu kita [select](https://github.com/WilisArum02/Pemrograman-Berbasis-Object/blob/main/Tugas4PBO/src/tugas4pbo/Select.java) untuk membuktikan recor dengan nidn 12345 sudah terhapus.
   

