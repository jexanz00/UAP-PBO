/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kasir_pbo;


public class Makanan extends Produk {
    private int id;
    private String daya_tahan;
    
    public Makanan(int id, String nama_produk, String daya_tahan, double harga, int jumlah, double diskon) {
        super (nama_produk, harga, jumlah, diskon);
        this.id = id;
        this.daya_tahan = daya_tahan;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDaya_tahan() {
        return daya_tahan;
    }

    public void setDaya_tahan(String daya_tahan) {
        this.daya_tahan = daya_tahan;
    }
    
}