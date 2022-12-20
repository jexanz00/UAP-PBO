package kasir_pbo;

import db.DBHelper;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class BarangModel {
    private final Connection CONN;

    public BarangModel() {
        this.CONN = DBHelper.getConnection();
    }
    public void addBarang(Barang brg){
        String insert ="INSERT INTO barang(barcode, expired, nama_produk, harga ,jumlah, diskon,kategori) VALUES ('"+brg.getBarcode()+"', '"+ brg.getExpired() + "','"+brg.getNama_produk()+"'," + brg.getHarga()+"," + brg.getJumlah()+"," + brg.getDiskon()+",'" + brg.getKtg()+"'"
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
    public void delBarang(String bcd){
        String insert ="DELETE FROM barang WHERE barcode='"+bcd+"'";
        
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
    
    public void upBarang(Barang brg){
        String update = "UPDATE barang SET barcode = '"+ brg.getBarcode() +"', expired = '"+ brg.getExpired() +"', nama_produk = '"+brg.getNama_produk()+"', harga = " + brg.getHarga()+", jumlah = " + brg.getJumlah()+", diskon = " + brg.getDiskon()+" WHERE barcode = '"+brg.getBarcode()+"';";
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
