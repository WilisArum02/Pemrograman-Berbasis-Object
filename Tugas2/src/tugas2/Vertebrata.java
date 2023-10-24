package tugas2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class Vertebrata extends Hewan {
    public Vertebrata(){
        super("keras", "rumput", "darat");   
    }
     
    
    protected String penutupTubuh;
    protected String alatPernapasan;
    

    public Vertebrata (String penutupTubuh, String alatPernapasan){
        this.penutupTubuh = penutupTubuh;
        this.alatPernapasan = alatPernapasan;
}
    

    /**
     * @return the penutupTubuh
     */
    public String getPenutupTubuh() {
        return penutupTubuh;
    }

    /**
     * @return the alatPernapasan
     */
    public String getAlatPernapasan() {
        return alatPernapasan;
    }

}
