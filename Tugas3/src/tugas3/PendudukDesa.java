/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas3;

/**
 *
 * @author HP
 */
public class PendudukDesa extends Penduduk implements peternak, petani, nelayan {
    
    @Override
    public void peternak() {
        System.out.println("Ia bekerja sebagai peternak");
    }

    ;
    @Override
    public void petani() {
        System.out.println("Ia bekerja sebagai petani");
    }

    ;
   @Override
    public void nelayan() {
        System.out.println("Ia bekerja sebagai nelayan");
    }

    ;
    public void setAsalDaerah() {
        super.setAsalDaerah("daerah pedesaan");
    }

    public PendudukDesa() {
        this.setAsalDaerah();
    }
    
}
