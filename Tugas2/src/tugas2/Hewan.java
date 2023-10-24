/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas2;

/**
 *
 * @author HP
 */
public class Hewan {

    private String nama;
    private String klasifikasi;
    protected String jenisMakanan;
    protected String tempatHidup;
    protected String tulang;
    
    public Hewan() {
        this.tulang = " ";
        this.jenisMakanan = " ";
        this.tempatHidup = " ";
    }

    
    public Hewan(String tulang, String jenisMakanan, String tempatHidup) {
        this.tulang = tulang;
        this.jenisMakanan = jenisMakanan;
        this.tempatHidup = tempatHidup;
        
    }   

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the klasifikasi
     */
    public String getKlasifikasi() {
        return klasifikasi;
    }

    /**
     * @param klasifikasi the klasifikasi to set
     */
    public void setKlasifikasi(String klasifikasi) {
        this.klasifikasi = klasifikasi;
    }

    /**
     * @return the jenisMakanan
     */
    public String getJenisMakanan() {
        return jenisMakanan;
    }

    /**
     * @return the tempatHidup
     */
    public String getTempatHidup() {
        return tempatHidup;
    }

    /**
     * @return the tulang
     */
    public String getTulang() {
        return tulang;
    }
    
    
}
