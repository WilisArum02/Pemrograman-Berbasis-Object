/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package run;
import tugas3.PendudukKota;
import tugas3.PendudukDesa;
import tugas3.Penduduk;
/**
 *
 * @author HP
 */
public class Run {

    public static void main(String[] args) {
        PendudukKota Albert = new PendudukKota();
        System.out.println("Albert tinggal di " + Albert.getAsalDaerah());
        System.out.println("Albert " + Albert.pulang("sewaktu-waktu"));
        Albert.pengusaha();
        System.out.println("                                   ");
        System.out.println("                                   ");
        PendudukKota Grita = new PendudukKota();
        System.out.println("Grita tinggal di " + Grita.getAsalDaerah());
        System.out.println("Grita " + Grita.pulang(4));
        Grita.karyawan();
        System.out.println("                                   ");
        System.out.println("                                   ");
        PendudukKota Coki = new PendudukKota();
        System.out.println("Coki tinggal di " + Coki.getAsalDaerah());
        System.out.println("Coki " + Coki.pulang(4.15));
        Coki.buruhPabrik();
        System.out.println("                                   ");
        System.out.println("                                   ");
        PendudukDesa Agus = new PendudukDesa();
        System.out.println("Agus tinggal di " + Agus.getAsalDaerah());
        System.out.println("Agus " + Agus.pulang("sewaktu-waktu"));
        Agus.peternak();
        System.out.println("                                   ");
        System.out.println("                                   ");
        PendudukDesa Supri = new PendudukDesa();
        System.out.println("Supri tinggal di " + Supri.getAsalDaerah());
        System.out.println("Jika Supri berangkat pagi maka " + Supri.pulang("siang pukul 2"));
        System.out.println("Jika Supri berangkat sore maka " + Supri.pulang("malam dini hari"));
        Supri.nelayan();
        System.out.println("                                   ");
        System.out.println("                                   ");
        PendudukDesa Ipah = new PendudukDesa();
        System.out.println("Ipah tinggal di " + Ipah.getAsalDaerah());
        System.out.println("Ipah " + Ipah.pulang("siang"));
        Ipah.petani();

    }
}

