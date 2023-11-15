package Formulir;

public abstract class BaseFormulir {
    public String nama;
    public String jenis_kelamin;
    public String no_hp;
    public String alamat;

    public void CaraPembayaran() {
        System.out.println("Cara Bayar");
    }

    public abstract void TataTertibAcara();

    public abstract void Absensi();

}
