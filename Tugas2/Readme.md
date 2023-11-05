# Inheritance
Sebuah class dapat mewarisi properti dan method dari class lain yang lebih umum.
Interface class yaitu class [Hewan](https://github.com/WilisArum02/Pemrograman-Berbasis-Object/blob/main/Tugas2/src/tugas2/Hewan.java) dan lalu turunannya ada class [Vertebrata](https://github.com/WilisArum02/Pemrograman-Berbasis-Object/blob/main/Tugas2/src/tugas2/Vertebrata.java) dan [Invertebrata](https://github.com/WilisArum02/Pemrograman-Berbasis-Object/blob/main/Tugas2/src/tugas2/Invertebrata.java)
lalu turunannya adalah class [Mamalia](https://github.com/WilisArum02/Pemrograman-Berbasis-Object/blob/main/Tugas2/src/tugas2/Mamalia.java) dan [Antropoda](https://github.com/WilisArum02/Pemrograman-Berbasis-Object/blob/main/Tugas2/src/tugas2/Antropoda.java)
project ini akan di run pada [Utama](https://github.com/WilisArum02/Pemrograman-Berbasis-Object/blob/main/Tugas2/src/Run/Utama.java)

Menggunakan Apache Netbeans IDE 15

[![forthebadge made-with-ApacheNeatbeans](https://th.bing.com/th?id=OSAAS.67E3675844C1A9B6C86DF097C16A6D3B&w=80&h=80&c=1&o=6&pid=5.1)](https://netbeans.apache.org/)


## Langkah Pengerjaan
1. Membuat 5 kelas beserta kelas turunannya
   
   ![diagram (1)](https://github.com/WilisArum02/Pemrograman-Berbasis-Object/assets/148854173/40e10fe3-f03a-4dbb-9fcb-a7789ece4369)

2. Buat kelas [Hewan](https://github.com/WilisArum02/Pemrograman-Berbasis-Object/blob/main/Tugas2/src/tugas2/Hewan.java) dan masukkan attribute nama, klasifikasi, jenisMakanan, tempatHidup, tulang
3. Buat constructor dari jenisMakanan, tempatHidup, tulang
4. Buat get dan setnya
5. Buat kelas turunannya yaitu Class [Vertebrata](https://github.com/WilisArum02/Pemrograman-Berbasis-Object/blob/main/Tugas2/src/tugas2/Vertebrata.java) yang extends ke [Hewan](https://github.com/WilisArum02/Pemrograman-Berbasis-Object/blob/main/Tugas2/src/tugas2/Hewan.java) dengan constructur dibawah. Penambahan super yang merupakan turunan dari kelas atasnya yaitu kelas hewan yang sudah di constructor

   <img width="468" alt="Tugas2" src="https://github.com/WilisArum02/Pemrograman-Berbasis-Object/assets/148854173/6df0d102-6d40-4224-b00b-228a737b7d36">

6. Membuat get pada penutupTubuh dan alatPernapasan
7. Membuat class [Mamalia](https://github.com/WilisArum02/Pemrograman-Berbasis-Object/blob/main/Tugas2/src/tugas2/Mamalia.java) yang extends ke [Vertebrata](https://github.com/WilisArum02/Pemrograman-Berbasis-Object/blob/main/Tugas2/src/tugas2/Vertebrata.java) dengan constructor bentukGigi, penutupTubuh, jenisKelamin.
8. Buat getnya
9. Buat kelas turunan [Invertebrata](https://github.com/WilisArum02/Pemrograman-Berbasis-Object/blob/main/Tugas2/src/tugas2/Invertebrata.java) yang extend ke class [Hewan](https://github.com/WilisArum02/Pemrograman-Berbasis-Object/blob/main/Tugas2/src/tugas2/Hewan.java) dengan constructur dibawah. Penambahan super yang merupakan turunan dari kelas atasnya yaitu kelas hewan yang sudah di constructor

   <img width="468" alt="Tugas2 2" src="https://github.com/WilisArum02/Pemrograman-Berbasis-Object/assets/148854173/e9e06ab0-eb1f-4b9e-87b4-33d23d46eabd">

10. Membuat get pada jumlahKaki, berkembangBiak
11. Membuat class [Antropoda](https://github.com/WilisArum02/Pemrograman-Berbasis-Object/blob/main/Tugas2/src/tugas2/Antropoda.java) yang extends ke class [Invertebrata](https://github.com/WilisArum02/Pemrograman-Berbasis-Object/blob/main/Tugas2/src/tugas2/Invertebrata.java) dengan constructor jenisOrdo, sistemIndra, alatPernapasan2
12.	Membuat get dari jenisOrdo, sistemIndra, alatPernapasan
13.	Import dari kelas kelas yang sudah di buat karena akan membuat kelas main untuk di Run pada package yang berbeda
    import tugas2.Vertebrata;
   	import tugas2.Mamalia;
   	import tugas2.Invertebrata;
    import tugas2.Antropoda;
    import tugas2.Hewan;
14. Mengeluarkan set dan get yang sudah di constructor

    <img width="443" alt="tugas2 3" src="https://github.com/WilisArum02/Pemrograman-Berbasis-Object/assets/148854173/c7228aeb-433e-46ee-ab5e-3bcee5a88b22">

15. Run pada main class [Utama](https://github.com/WilisArum02/Pemrograman-Berbasis-Object/blob/main/Tugas2/src/Run/Utama.java)

    
