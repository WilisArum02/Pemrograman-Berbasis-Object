/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;

//import tugas4.Circle;
//import tugas4.Shape;
//import tugas4.Triangle;

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args) {
        // membuat objek dari class Triangle
        Shape segitiga = new Triangle(1, 4);

        // membuat objek dari class Circle
        Shape lingkaran = new Circle(5);
        
        
        System.out.println("Luas Segitiga: " + segitiga.getArea());
        System.out.println("Luas Lingkaran: " + lingkaran.getArea());
    }
}
