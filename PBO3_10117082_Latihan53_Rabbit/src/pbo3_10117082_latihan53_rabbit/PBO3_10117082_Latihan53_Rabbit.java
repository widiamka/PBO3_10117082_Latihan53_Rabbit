/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117082_latihan53_rabbit;

/**
 *
 *   Nama : WIDIAMEGA K
* Kelas : IF3
* NIM   : 10117082
* Deskripsi Program : program ini berisi program untuk menampilkan karakter dari 
* kelinci dengan konsep inheritance
 */
public class PBO3_10117082_Latihan53_Rabbit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Rabbit rab = new Rabbit("Peter",false, "grass", 4, "grey" );
        System.out.println("Hello, His name is "+rab.getName());
        System.out.println(rab.getName()+" is Vegetarian? "+rab.isVegetarian());
        System.out.println(rab.getName()+" eats "+rab.getEats());
        System.out.println(rab.getName()+" has "+rab.getNoOfLegs()+" legs.");
        System.out.println(rab.getName()+" color is "+rab.getColor());

    }
    
}
