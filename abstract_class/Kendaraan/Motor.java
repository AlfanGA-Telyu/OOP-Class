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

    public Motor(String nama, String produsen, String harga, String kapasitasmotor) {
        this.nama = nama;
        this.produsen = produsen;
        this.harga = harga;
        this.kapasitasmotor = kapasitasmotor;

    }

}
