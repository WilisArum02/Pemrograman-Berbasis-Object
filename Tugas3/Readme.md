# Multiple Inheritance
Penurunan class dimana sebuah class bisa memiliki lebih dari 1 parent class langsung

Menggunakan Apache Netbeans IDE 15

[![forthebadge made-with-ApacheNeatbeans](https://th.bing.com/th?id=OSAAS.67E3675844C1A9B6C86DF097C16A6D3B&w=80&h=80&c=1&o=6&pid=5.1)](https://netbeans.apache.org/)

## Method Overload dan Override
Method Overload menggunakan jumlah atau tipe parameter input yang berbeda pada method dengan nama sama dalam satu kelas. Method  Override mengimplementasikan method yang memiliki nama sama secara berbeda pada kelas turunan.


## Langkah Pengerjaan

![Tugas 3](https://github.com/WilisArum02/Pemrograman-Berbasis-Object/assets/148854173/58646125-e520-4cd4-a313-a116b75e36c9)

1.  Membuat kelas super dengan nama [Penduduk](https://github.com/WilisArum02/Pemrograman-Berbasis-Object/blob/main/Tugas3/src/tugas3/Penduduk.java) yang berisi atribut suku dan asalDaerah (override). Dan menambahkan satu method yaitu pulang (overload).
2.	Menambahkan set dan get pada atribut agar dapat di jalankan pada outputnya
3.	Membuat kelas turunan yaitu [PendudukKota](https://github.com/WilisArum02/Pemrograman-Berbasis-Object/blob/main/Tugas3/src/tugas3/PendudukKota.java) yang extends ke [Penduduk](https://github.com/WilisArum02/Pemrograman-Berbasis-Object/blob/main/Tugas3/src/tugas3/Penduduk.java) dan implements ke interface yang akan di buat yaitu [buruhPabrik](https://github.com/WilisArum02/Pemrograman-Berbasis-Object/blob/main/Tugas3/src/tugas3/buruhPabrik.java), [karyawan](https://github.com/WilisArum02/Pemrograman-Berbasis-Object/blob/main/Tugas3/src/tugas3/karyawan.java), [pengusaha](https://github.com/WilisArum02/Pemrograman-Berbasis-Object/blob/main/Tugas3/src/tugas3/pengusaha.java). Berisi method override dari kelas interface tersebut juga berisi super asalDaerah dari kelas [Penduduk](https://github.com/WilisArum02/Pemrograman-Berbasis-Object/blob/main/Tugas3/src/tugas3/Penduduk.java).
4.	Membuat java interface untuk [buruhPabrik](https://github.com/WilisArum02/Pemrograman-Berbasis-Object/blob/main/Tugas3/src/tugas3/buruhPabrik.java), [karyawan](https://github.com/WilisArum02/Pemrograman-Berbasis-Object/blob/main/Tugas3/src/tugas3/karyawan.java), [pengusaha](https://github.com/WilisArum02/Pemrograman-Berbasis-Object/blob/main/Tugas3/src/tugas3/pengusaha.java)
5.	Membuat kelas turunan lagi dari kelas [Penduduk](https://github.com/WilisArum02/Pemrograman-Berbasis-Object/blob/main/Tugas3/src/tugas3/Penduduk.java) yaitu [PendudukDesa](https://github.com/WilisArum02/Pemrograman-Berbasis-Object/blob/main/Tugas3/src/tugas3/PendudukDesa.java) yang extends ke [Penduduk](https://github.com/WilisArum02/Pemrograman-Berbasis-Object/blob/main/Tugas3/src/tugas3/Penduduk.java) dan implements ke interface yang akan di buat yaitu [peternak](https://github.com/WilisArum02/Pemrograman-Berbasis-Object/blob/main/Tugas3/src/tugas3/peternak.java), [petani](https://github.com/WilisArum02/Pemrograman-Berbasis-Object/blob/main/Tugas3/src/tugas3/petani.java), [nelayan](https://github.com/WilisArum02/Pemrograman-Berbasis-Object/blob/main/Tugas3/src/tugas3/nelayan.java). Berisi method override dari kelas interface tersebut juga berisi super asalDaerah dari kelas [Penduduk](https://github.com/WilisArum02/Pemrograman-Berbasis-Object/blob/main/Tugas3/src/tugas3/Penduduk.java).
6.	Membuat java interface untuk [peternak](https://github.com/WilisArum02/Pemrograman-Berbasis-Object/blob/main/Tugas3/src/tugas3/peternak.java), [petani](https://github.com/WilisArum02/Pemrograman-Berbasis-Object/blob/main/Tugas3/src/tugas3/petani.java), [nelayan](https://github.com/WilisArum02/Pemrograman-Berbasis-Object/blob/main/Tugas3/src/tugas3/nelayan.java)
7.	Membuat kelas untuk menjalankan program pada package yang berbeda yaitu kelas [Run](https://github.com/WilisArum02/Pemrograman-Berbasis-Object/blob/main/Tugas3/src/run/Run.java). Mengambil import dari kelas super dan turunannya yaitu penduduk, PendudukKota, PendudukDesa dari package yang berbeda
   
    import tugas3.PendudukKota;
  	
  	import tugas3.PendudukDesa;
  	
  	import tugas3.Penduduk;
   
9.	Run di main class [Run](https://github.com/WilisArum02/Pemrograman-Berbasis-Object/blob/main/Tugas3/src/run/Run.java)



