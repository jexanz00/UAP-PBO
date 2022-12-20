package kasir_pbo;

import db.DBHelper;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class MakananModel {
    private final Connection CONN;

    public MakananModel() {
        this.CONN = DBHelper.getConnection();
    }
    public void addMakanan(Makanan mkn){
        String insert ="INSERT INTO makanan(id, nama_produk, daya_tahan, harga, jumlah, diskon) VALUES ("+mkn.getId()+",'"+mkn.getNama_produk()+"', "+mkn.getDaya_tahan()+","+mkn.getHarga()+","+mkn.getJumlah()+", "+mkn.getDiskon()+""
                + ")";
        
        try {
            if(CONN.createStatement().executeUpdate(insert)>0){
                System.out.println("berhasil memasukkan data"); 
            }else{
                System.out.println("Gagal memasukkan data");
            }
        } catch (SQLException ex) {
            Logger.getLogger(BarangModel.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Gagal memasukkan data");
        }
    }
    public void delMakanan(int bcd){
        String insert ="DELETE FROM makanan WHERE id="+bcd+"";
        
        try {
            if(CONN.createStatement().executeUpdate(insert)>0){
                System.out.println("berhasil menghapus data"); 
            }else{
                System.out.println("Gagal menghapus data");
            }
        } catch (SQLException ex) {
            Logger.getLogger(BarangModel.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Gagal menghapus data");
        }
    }
    
    public void upMakanan(Makanan mkn){
        String update = "UPDATE makanan SET id = "+mkn.getId()+", daya_tahan = "+mkn.getDaya_tahan()+", nama_produk = '"+mkn.getNama_produk()+"', harga = "+mkn.getHarga()+", jumlah = "+mkn.getJumlah()+", diskon = "+mkn.getDiskon()+" WHERE id = "+mkn.getId()+";";
        try {
            if(CONN.createStatement().executeUpdate(update)>0){
                System.out.println("berhasil memperbarui data");
            }else{
                System.out.println("Gagal memperbarui data");
            }     
        } catch (SQLException ex) {
            Logger.getLogger(BarangModel.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Gagal memperbarui data");
        }
    }
    
/*    public ArrayList<Barang> getBarang() {
        String query = "SELECT * FROM barang";
        ArrayList<Barang> brg = new ArrayList<Barang>();
        
        try {
            ResultSet rs = CONN.createStatement().executeQuery(query);
            while (rs.next()) {
               Barang temp = new Barang(rs.getString("barcode"));
                brg.add(temp);
            }
            System.out.println("berhasil mengambil data");
        } catch (SQLException ex) {
            Logger.getLogger(BarangModel.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Gagal mengambil data");
        }
        return brg;
   }*/
}
