/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2;

/**
 *
 * @author HP
 */
public class Mamalia extends Vertebrata {
    
    protected String bentukGigi;
    protected String penutupTubuh;
    protected String jenisKelamin;
    
    public Mamalia(String bentukGigi, String penutupTubuh, String jenisKelamin) {
        this.bentukGigi = bentukGigi;
        this.penutupTubuh = penutupTubuh;
        this.jenisKelamin = jenisKelamin;
    }

    public Mamalia() {
        this.bentukGigi = " ";
        this.penutupTubuh = " ";
        this.jenisKelamin = " ";
    }


    /**
     * @return the jenisKelamin
     */
    public String getJenisKelamin() {
        return jenisKelamin;
    }

    /**
     * @return the jenisGigi
     */
    public String getBentukGigi() {
        return bentukGigi;
    }

    /**
     * @return the penutupTubuh
     */
    @Override
    public String getPenutupTubuh() {
        return penutupTubuh;
    }
       
}
