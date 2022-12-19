/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kasir_uap;


public class Makanan extends Produk {
    private int id;
    private int daya_tahan;
    
    public Makanan(int id) {
        this.id = id;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDaya_tahan() {
        return daya_tahan;
    }

    public void setDaya_tahan(int daya_tahan) {
        this.daya_tahan = daya_tahan;
    }
    
}