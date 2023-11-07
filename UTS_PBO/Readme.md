# Persistence
Persistence coding adalah istilah yang digunakan untuk menggambarkan cara data disimpan dan diambil dari database dalam aplikasi. Dalam pemrograman, persistence mengacu pada kemampuan aplikasi untuk menyimpan data ke dalam database dan mengambilnya kembali saat diperlukan. Dalam Java, Java Persistence API (JPA) adalah spesifikasi yang digunakan untuk mengimplementasikan persistence coding. JPA memungkinkan pengembang untuk menggunakan objek Java untuk memanipulasi data dalam database relasional

## Code Menggunakan Persistence (Tugas Pertemuan 9)
Pada code terlampir menggunakan database buku dimana [guibuku](https://github.com/WilisArum02/Pemrograman-Berbasis-Object/blob/main/UTS_PBO/src/uts_pbo/guibuku.java) sebagai mainnya.

Persistence pada button simpan

        // awal persistence
        EntityManager entityManager = Persistence.createEntityManagerFactory("UTS_PBOPU").createEntityManager();
        entityManager.getTransaction().begin();
        Buku b = new Buku();
        b.setIsbn(isbn);
        if (b != null) {
            b.setJudulBuku(judul_buku);
            b.setTahunTerbit(tahun_terbit);
            b.setPenerbit(penerbit);
            entityManager.persist(b);
            entityManager.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Data berhasil disimpan.");
        } else {
            JOptionPane.showMessageDialog(null, "Data gagal disimpan.");
        }

        // akhir persistence


Persistence pada Button Update

        // awal persistence
        EntityManager entityManager = Persistence.createEntityManagerFactory("UTS_PBOPU").createEntityManager();
        entityManager.getTransaction().begin();
        Buku b = entityManager.find(Buku.class, isbn);

        if (b != null) {
                b.setJudulBuku(judul_buku);
                b.setTahunTerbit(tahun_terbit);
                b.setPenerbit(penerbit);
                entityManager.getTransaction().commit();
                JOptionPane.showMessageDialog(null, "Data berhasil diedit.");
            } else {
                JOptionPane.showMessageDialog(null, "data dengan ISBN " + isbn + " gagal diedit.");
            }
            // akhir persistence

Persistence pada button Delete

        //awal persistence
        EntityManager entityManager = Persistence.createEntityManagerFactory("UTS_PBOPU").createEntityManager();
        entityManager.getTransaction().begin();
        Buku b = entityManager.find(Buku.class, isbn);
        if (b != null) {
            entityManager.remove(b);
            entityManager.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Data berhasil dihapus.");
        } else {
            JOptionPane.showMessageDialog(null, "Data dengan ISBN " + isbn + " gagal dihapus.");
        }
        // akhir persistence

Persistence pada buttom cetak

        InputStream reportTemplate = Buku.class.getResourceAsStream("reportBuku.jrxml");
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("UTS_PBOPU");
        EntityManager em = emf.createEntityManager();
        List<Buku> data = em.createQuery("SELECT b FROM Buku b", Buku.class).getResultList();
        JasperReport jasperReport;
        try {
            jasperReport = JasperCompileManager.compileReport(reportTemplate);
            Map<String, Object> parameters = null;
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, new JRBeanCollectionDataSource(data));
            JasperViewer.viewReport(jasperPrint, false);
            } catch (JRException ex) {
            ex.printStackTrace();
        } finally {

            em.close();
            emf.close();
        }



## Menambahkan Upload File dari Device CSV (Tugas Pertemuan 10)
1.	Menambahkan button upload file yang dapat langsung meng-insert data dari file yang dipilih dari computer pengguna
2.	Pada source codenya menggunakan CSV, JFileChooser dan persistence 

        JFileChooser filechooser = new JFileChooser();

        int i = filechooser.showOpenDialog(null);
        if (i == JFileChooser.APPROVE_OPTION) {
            EntityManager entityManager = Persistence.createEntityManagerFactory("UTS_PBOPU").createEntityManager();
            entityManager.getTransaction().begin();

            File f = filechooser.getSelectedFile();
            String filepath = f.getPath();
            String fi = f.getName();
            //Parsing CSV Data
            System.out.print(filepath);
            DefaultTableModel csv_data = new DefaultTableModel();

            try {

                InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(filepath));
                org.apache.commons.csv.CSVParser csvParser = CSVFormat.DEFAULT.parse(inputStreamReader);
                for (CSVRecord csvRecord : csvParser) {

                    Buku b = new Buku();
                    b.setIsbn(csvRecord.get(0));
                    b.setJudulBuku(csvRecord.get(1));
                    b.setTahunTerbit(csvRecord.get(2));
                    b.setPenerbit(csvRecord.get(3));
                    entityManager.persist(b);

                }

            } catch (Exception ex) {
                System.out.println("Error in Parsing CSV File");
            }
            entityManager.getTransaction().commit();

        }


3.	Jika di run akan muncul seperti dibawah

   <img width="468" alt="tugas10" src="https://github.com/WilisArum02/Pemrograman-Berbasis-Object/assets/148854173/713e8d37-7da4-470d-af4d-8e42d56fe523">


  Lalu pilih tombol “Upload File”, pilih file yang akan di masukkan ke dalamnya

 <img width="335" alt="tugas10 2" src="https://github.com/WilisArum02/Pemrograman-Berbasis-Object/assets/148854173/1b05e6d2-140a-4fd8-b737-63e0702d854f">

  Lalu akan otomatis masuk pada table

  <img width="468" alt="tugas10 3" src="https://github.com/WilisArum02/Pemrograman-Berbasis-Object/assets/148854173/6630e25c-c686-4cd8-9812-0725182276be">

 
## Credit
> Wilis Arum Karunia'2022
> Sistem Informasi UINSA




