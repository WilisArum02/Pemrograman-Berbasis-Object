/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2;

/**
 *
 * @author HP
 */
public class Invertebrata extends Hewan {
    public Invertebrata(){
        super("lunak", "omnivora", "air");   
    }
        
    private int jumlahKaki;
    private String berkembangBiak;
    private String alatPernapasan;
    

    public Invertebrata (int jumlahKaki, String berkembangBiak){
        this.jumlahKaki = jumlahKaki;
        this.berkembangBiak = berkembangBiak;
    }
    

    /**
     * @return the jumlahKaki
     */
    public int getJumlahKaki() {
        return jumlahKaki;
    }

    /**
     * @return the berkembangBiak
     */
    public String getBerkembangBiak() {
        return berkembangBiak;
    }

    /**
     * @return the alatPernapasan
     */
    public String getAlatPernapasan() {
        return alatPernapasan;
    }
}
