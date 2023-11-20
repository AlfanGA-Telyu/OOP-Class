package Kendaraan;

public class Mobil extends Kendaraan {
    public String jenismobil;

    @Override
    public void Membeli() {
        System.out.println("Kamu telah membeli kendaraan " + nama + " dengan harga " + harga);
    }

    public void CheckMerkMobil() {
        System.out.println("Jenis mobil ini adalah: " + jenismobil);
    }

    // pembuatan overriding
    @Override
    public void CaraPembelian() {
        super.CaraPembelian();
        System.out.println("Anda memilih kendaraan jenis mobil");
    }

    public Mobil(String nama, String produsen, String harga, String jenismobil) {
        this.nama = nama;
        this.produsen = produsen;
        this.harga = harga;
        this.jenismobil = jenismobil;

    }

}
