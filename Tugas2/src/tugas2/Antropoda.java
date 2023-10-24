/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2;

/**
 *
 * @author HP
 */
public class Antropoda extends Invertebrata {
    
    protected String jenisOrdo;
    protected String sistemIndra;
    protected String alatPernapasan2;
    
    public Antropoda(String jenisOrdo, String sistemIndra, String alatPernapasan2) {
        this.jenisOrdo = jenisOrdo;
        this.sistemIndra = sistemIndra;
        this.alatPernapasan2 = alatPernapasan2;
    }
    
    public Antropoda() {
        this.jenisOrdo = " ";
        this.sistemIndra = " ";
        this.alatPernapasan2 = " ";
    }

    /**
     * @return the jenisOrdo
     */
    public String getJenisOrdo() {
        return jenisOrdo;
    }

    /**
     * @return the antena
     */
    public String getSistemIndra() {
        return sistemIndra;
    }

    /**
     * @return the alatPernapasan
     */
    public String getAlatPernapasan2() {
        return alatPernapasan2;
    }
}
