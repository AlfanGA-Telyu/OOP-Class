package Kendaraan;

public abstract class Kendaraan {
    public String nama;
    public String produsen;
    public String harga;

    public void CaraPembelian() {
        System.out.println("Silahkan bayar sesuai dengan kendaraan yang anda beli");
    }

    public abstract void Membeli();

}
