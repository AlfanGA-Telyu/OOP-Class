package Kendaraan;

public class Motor extends Kendaraan {
    public String kapasitasmotor;

    @Override
    public void Membeli() {
        System.out.println("Kamu telah membeli kendaraan " + nama + " dengan harga " + harga);
    }

    public void CheckKapasitasMotor() {
        System.out.println("Kapasitas motor ini adalah: " + kapasitasmotor);
    }

    public void Cicil(String harga, String bulan) {
        System.out.println(
                "Kamu dapat menyicil motor ini dengan harga " + harga + " dan lama waktu cicilan yaitu: " + bulan);
    }

    // pembuatan overloading
    public void Cicil(String harga, String bulan, String nama) {
        System.out.println("Kamu dapat menyicil motor ini dengan harga " + harga +
                " dan lama waktu cicilan yaitu: " + bulan + " untuk motor dengan nama: " + nama);

    }

    // pembuatan overriding
    @Override
    public void CaraPembelian() {
        super.CaraPembelian();
        System.out.println("Anda memilih kendaraan jenis motor");
    }

    public Motor(String nama, String produsen, String harga, String kapasitasmotor) {
        this.nama = nama;
        this.produsen = produsen;
        this.harga = harga;
        this.kapasitasmotor = kapasitasmotor;

    }

}