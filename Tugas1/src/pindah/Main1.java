/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pindah;

import tugas1.*;

/**
 *
 * @author HP
 */
public class Main1 {
    public static void main(String[] args) {
        // TODO code application logic here
        Tumbuhan pisang = new Tumbuhan();
        pisang.setNama("Tumbuhan Pisang");
        pisang.setJenistulangdaun("sejajar");
        pisang.setJenisbatang("batang basah");
        pisang.setJenisakar("serabut");
        System.out.println("Nama "+pisang.getNama());
        System.out.println("Tumbuhan ini memiliki jenis tulang daun "+pisang.getJenistulangdaun());
        System.out.println("Jenis batangnya "+pisang.getJenisbatang());
        System.out.println("Akarnya termasuk akar "+pisang.getJenisakar());
        
//        String berkembangbiak = pisang.berkembangbiak();
//        System.out.println("Berkembangbiak dengan "+ berkembangbiak);
    }
}
