/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Run;
import tugas2.Vertebrata;
import tugas2.Mamalia;
import tugas2.Invertebrata;
import tugas2.Antropoda;
/**
 *
 * @author HP
 */
public class Utama {

    public static void main(String[] args) {
        // TODO code application logic here
        Mamalia sapi = new Mamalia();
        sapi.setNama("sapi");

        Antropoda gurita = new Antropoda();
        gurita.setNama("gurita");

        Vertebrata ikan = new Vertebrata("sisik", "insang");
        ikan.setNama("ikan");

        Invertebrata semut = new Invertebrata(6, "bertelur");
        semut.setNama("semut");

        Mamalia harimau = new Mamalia("gigi taring", "berambut", "jantan");
        harimau.setNama("harimau");

        Antropoda lebah = new Antropoda("hymenoptera", "antena", "trakea");
        lebah.setNama("lebah");

        System.out.println("Nama saya " + sapi.getNama()
                + "\nTulang saya " + sapi.getTulang()
                + "\nSaya makan " + sapi.getJenisMakanan()
                + "\nSaya hidup di " + sapi.getTempatHidup());
        System.out.println("-------------------------------------");
        System.out.println("Nama saya " + gurita.getNama()
                + "\nTulang saya " + gurita.getTulang()
                + "\nSaya termasuk " + gurita.getJenisMakanan()
                + "\nSaya hidup di " + gurita.getTempatHidup());
        System.out.println("-------------------------------------");
        System.out.println("Nama saya " + ikan.getNama()
                + "\nTubuh saya tertutup oleh " + ikan.getPenutupTubuh()
                + "\nSaya bernafas menggunakan " + ikan.getAlatPernapasan());
        System.out.println("-------------------------------------");
        System.out.println("Nama saya " + semut.getNama()
                + "\nJumlah kaki saya " + semut.getJumlahKaki()
                + "\nSaya berkembangbiak dengan " + semut.getBerkembangBiak());
        System.out.println("-------------------------------------");
        System.out.println("Nama saya " + harimau.getNama()
                + "\nGigi saya berbentuk " + harimau.getBentukGigi()
                + "\nTubuh saya tertutup oleh " + harimau.getPenutupTubuh()
                + "\nSaya berjenis kelamin " + harimau.getJenisKelamin());
        System.out.println("-------------------------------------");
        System.out.println("Nama saya " + lebah.getNama()
                + "\nSaya termasuk ke dalam ordo " + lebah.getJenisOrdo()
                + "\nSaya mempunyai " + lebah.getSistemIndra()
                + "\nSaya bernapas menggunakan " + lebah.getAlatPernapasan2());

    }

}
