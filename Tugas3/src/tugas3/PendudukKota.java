/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas3;

/**
 *
 * @author HP
 */
public class PendudukKota extends Penduduk implements buruhPabrik, karyawan, pengusaha {
    
    @Override
    public void buruhPabrik() {
        System.out.println("Ia bekerja sebagai buruh pabrik");
    }

    ;
    @Override
    public void karyawan() {
        System.out.println("Ia bekerja sebagai karyawan");
    }

    ;
   @Override
    public void pengusaha() {
        System.out.println("Ia bekerja sebagai pengusaha");
    }

    ;
    public void setAsalDaerah() {
        super.setAsalDaerah("daerah perkotaan");
    }

    public PendudukKota() {
        this.setAsalDaerah();
    }
}
