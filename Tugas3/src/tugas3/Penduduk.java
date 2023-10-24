/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas3;

/**
 *
 * @author HP
 */
public class Penduduk {

private String suku;
private String asalDaerah = "bumi";

public String pulang() {
        return "pulang";
    }

    public String pulang(String waktu) {
        return "pulang " + waktu;
    }

    public String pulang(int waktu) {
        return "pulang " + "pada pukul " + String.valueOf(waktu);
    }

    public String pulang(double waktu) {
        return "pulang " + "pada pukul " + String.valueOf(waktu);
    }

    /**
     * @return the suku
     */
    public String getSuku() {
        return suku;
    }

    /**
     * @param suku the suku to set
     */
    public void setSuku(String suku) {
        this.suku = suku;
    }

    /**
     * @return the asalDaerah
     */
    public String getAsalDaerah() {
        return asalDaerah;
    }

    /**
     * @param asalDaerah the asalDaerah to set
     */
    public void setAsalDaerah(String asalDaerah) {
        this.asalDaerah = asalDaerah;
    }
    
}
