# Gui
Graphical user interface (GUI) adalah sistem komponen visual interaktif untuk software komputer. GUI menampilkan objek yang menyampaikan informasi dan mewakili tindakan yang dapat diambil oleh pengguna. Objek-objek tersebut berubah warna, ukuran, atau visibilitas saat pengguna melakukan interaksi seperti mengkliknya.

Menggunakan Apache Netbeans IDE 15 dan PostgreSQL pgAdmin 4

[![forthebadge made-with-ApacheNeatbeans](https://th.bing.com/th?id=OSAAS.67E3675844C1A9B6C86DF097C16A6D3B&w=80&h=80&c=1&o=6&pid=5.1)](https://netbeans.apache.org/) [![forthebadge made-with-PosgreSQL](https://th.bing.com/th?id=OSAAS.C27BAA7112B6F36A360DBBC4ACA18527&w=80&h=80&c=1&o=6&pid=5.1)]([https://netbeans.apache.org/](https://www.postgresql.org/)https://www.postgresql.org/)



## Membuat Gui yang terhubung dengan database (Tugas Pertemuan 5)

1.	Membuat new file dan pilih JFrame Form beri nama [Gui](https://github.com/WilisArum02/Pemrograman-Berbasis-Object/blob/main/LatihanGuiPBO56/src/latihanguipbo5dan6/Gui.java)
2.	Lalu mulai mendesign seperti pada gambar dibawah pada menu design. Untuk tabel databasenya menggunakan scrollpane agar dapat discroll 

    <img width="468" alt="tugas5" src="https://github.com/WilisArum02/Pemrograman-Berbasis-Object/assets/148854173/660e300e-4c59-4fa1-b726-03745fdc1e7d">


3.	Pada source codenya otomatis mengisi sesuai dengan apa yang kita design. Tambahkan import.

    import java.sql.Connection;
  	
    import java.sql.DriverManager;

    import java.sql.PreparedStatement;

    import java.sql.ResultSet;

    import java.sql.SQLException;

    import java.sql.Statement;
    
    import java.util.ArrayList;
    
    import java.util.logging.Level;
    
    import java.util.logging.Logger;
    
    import javax.swing.JOptionPane;
    
    import javax.swing.table.DefaultTableModel;

5.	Untuk menyambungkan dengan databasenya, maka buat kelas baru [Dosen](https://github.com/WilisArum02/Pemrograman-Berbasis-Object/blob/main/LatihanGuiPBO56/src/latihanguipbo5dan6/Dosen.java) dan masukkan source codenya dan buat set dan getnya sambungkan juga drive dan librariesnya juga
7.	Masukkan query untuk insert, update dan delete yang berhubungan dengan buttonnya. Menggunakan preparedStatement

  	Insert/masukkan data
  	
  	"INSERT INTO dosen (nidn, nama, alamat, gender) VALUES(?, ?, ?, ?)"

    Update/perbarui data

  	"UPDATE dosen SET nama=?, alamat=?, gender=?, WHERE nidn=?"

    DELETE/hapus data

  	"DELETE FROM dosen WHERE nidn=?"
   
9.	Lalu panggil set dan getnya
10.	Sambungkan pada drivernya

      Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Dosen", "postgres", "*******");

   	  tampil(conn);

12.	Aktifkan button/tombolnya

    BUTTON INSERT
    
    <img width="468" alt="tugas5 1" src="https://github.com/WilisArum02/Pemrograman-Berbasis-Object/assets/148854173/46d7ac6f-48b1-4247-961f-fbc5b3021a38">

    BUTTON DELETE
 
    <img width="468" alt="tugas 5 2" src="https://github.com/WilisArum02/Pemrograman-Berbasis-Object/assets/148854173/5264e764-5700-474d-aaf9-8fc84570ec88">

    BUTTON UPDATE

    <img width="468" alt="tugas 5 3" src="https://github.com/WilisArum02/Pemrograman-Berbasis-Object/assets/148854173/22d7f5a6-230d-4e07-8203-c7d17e196d77">

   
13.	Output

    <img width="468" alt="tugas5 4" src="https://github.com/WilisArum02/Pemrograman-Berbasis-Object/assets/148854173/632e7dc0-95eb-4147-bb7e-9601239fa848">



# Jasper Report
Jasper Report adalah sebuah Tools Open Source Java Reporting untuk membuat report dengan target hasil (output) : PDF, Microsoft Excell, XML, CSV, RTF, ODT.


## Langkah Pengerjaan (Tugas Pertemuan 6)
1.	Dari gui yang kita buat tambahkan button cetak untuk mencetak data(report)
2.	Pada sourchnya tambahkan code dibawah
  
    try {
  	
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Dosen", "postgres", "123");

            String jrxmlFile = new String("src/latihanguipbo5dan6/reportDosen.jrxml");

  	        JasperReport jr = JasperCompileManager.compileReport(jrxmlFile);

  	        JasperPrint jp = JasperFillManager.fillReport(jr, null, conn);

  	        JasperViewer.viewReport(jp, false);

  	    } catch (JRException ex) {

  	        Logger.getLogger(Gui.class.getName()).log(Level.SEVERE, null, ex);

  	     } catch (SQLException ex) {

  	        Logger.getLogger(Gui.class.getName()).log(Level.SEVERE, null, ex);

  	      }

4.	Buat [report wizard](https://github.com/WilisArum02/Pemrograman-Berbasis-Object/blob/main/LatihanGuiPBO56/src/latihanguipbo5dan6/reportDosen.jrxml)
5.	Lalu pilih blank yang akan di gunakan disini saya memilih yang blank biasa A4
6.	Beri nama file
7.	Pilih database JDBC connection
8.	Masukkan Query

    SELECT*FROM dosen
  	
10.	Otomatis kolom akan muncul dan pindahkan ke sisi blank kanan
11.	Lalu pada menu designer, design sesuai dengan yang akan di tampilkan pada saat mencetak nanti

    Example:

    <img width="468" alt="tugas6" src="https://github.com/WilisArum02/Pemrograman-Berbasis-Object/assets/148854173/83adf5d7-b472-46ef-8cc4-8a9df9b4e77b">

13.	Tambahkan libraries(download sendiri)

    <img width="197" alt="tugas6 1" src="https://github.com/WilisArum02/Pemrograman-Berbasis-Object/assets/148854173/e715255f-3e9c-4d34-b523-a16793c24deb">

14.	Lalu tambahkan import pada source gui

    import net.sf.jasperreports.engine.JRException;

   	import net.sf.jasperreports.engine.JasperCompileManager;

   	import net.sf.jasperreports.engine.JasperFillManager;

   	import net.sf.jasperreports.engine.JasperPrint;

   	import net.sf.jasperreports.engine.JasperReport;

   	import net.sf.jasperreports.view.JasperViewer;

16.	Run gui dan tekan button cetak, lalu akan otomatis masuk pada report yang sudah dibuat.
 
