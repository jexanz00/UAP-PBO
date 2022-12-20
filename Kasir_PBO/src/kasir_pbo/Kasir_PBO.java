/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kasir_pbo;

/**
 *
 * @author Jalu Juanda
 */
public class Kasir_PBO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        BarangModel brg = new BarangModel();
        Barang brg = new Barang("SMP1208735", "-----", "I5-12300F", 2840000, 3, 50, "Komputer");
        BarangModel bm = new BarangModel();
        bm.delBarang("SMP1208735");
        
//        ArrayList<Barang> listBarang = brg.getBarang();
        
/*        for(int i = 0; 1 < listBarang.size(); i++) {
            System.out.println("Barcode : " + listBarang.get(i).getBarcode());
        }*/
//Barang("SMP1208735", "-----", "I5-12300F", 2840000, 3, 50, "Komputer")
//Makanan mkn = new Makanan(1, "Lele Rebus", "7868", 15000, 100, 10);
    }  
}
