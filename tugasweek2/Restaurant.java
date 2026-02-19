package tugasweek2;

public class Restaurant {
    //kamus data
    private String[] nama_makanan;
    private double[] harga_makanan;
    private int[] stok;
    private byte id = 0;

    public Restaurant() {
    nama_makanan = new String[10];
    harga_makanan = new double[10];
    stok = new int[10];
    }
    
    //getter
    public String getNamaMakanan(int id){
        return nama_makanan[id];
    }
    public double getHargaMakanan(int id){
        return harga_makanan[id];
    }
    public int getStok(int id){
        return stok[id];
    }
    public byte getJumlahMenu(){
        return id;
    }

    //setter
    public void setNamaMakanan(byte id, String nama){
        nama_makanan[id] = nama;
    }
    public void setHargaMakanan(byte id, double harga){
        harga_makanan[id] = harga;
    }
    public void setStok(byte id, int stokBaru){
        stok[id] = stokBaru;
    }

    //function
    public void tambahMenuMakanan(String nama, double harga, int stok) {
        if(stok < 0){
            System.out.println("Stok " + nama + " yang anda masukkan kurang dari 0!");
            
        } else{
            this.nama_makanan[id] = nama;
            this.harga_makanan[id] = harga;
            this.stok[id] = stok;

            id++;
        }
    
    }
    public void tampilMenuMakanan() {
    for (int i = 0; i < id; i++) {
    if (!isOutOfStock(i)) {
    System.out.println(
    nama_makanan[i] + "[" + stok[i] + "]" + "\tRp. " + harga_makanan[i]
    );
    } else{
        System.out.println(
            nama_makanan[i] + "[" + 0 + "]" + "\tRp. " + harga_makanan[i]
            );
    }
    }
    }
    public boolean isOutOfStock(int id) {
    if (stok[id] == 0) {
    return true;
    } else {
    return false;
    }
    }

    //pemesanan
    public void pemesananMenu(String nama, int jumlah){
        for (int i = 0; i < id; i++) {
            if (nama_makanan[i].equalsIgnoreCase(nama)) {
                if (stok[i] >= jumlah && jumlah > 0) {
                    stok[i] -= jumlah;
                    System.out.println("Pesanan anda berhasil, pesanan : " +nama + " "+ jumlah +" pcs");
                }else{
                    System.out.println("Maaf stok tidak mencukupi!");
                }
                return;
            }
        }
        System.out.println("Menu tidak ditemukan!");
    }
    
}

