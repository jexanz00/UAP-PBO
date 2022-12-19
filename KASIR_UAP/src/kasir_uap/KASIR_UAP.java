/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kasir_uap;
import db.DBHelper;
/**
 *
 * @author Jalu Juanda
 */
public class KASIR_UAP {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Barang brg = new Barang("jaya111", "2022-10", "shampoo", 30000, 300, 1000, "alat mandi");
        BarangModel bm = new BarangModel();
        bm.deleteBarang("jaya111");
    }
    
}
