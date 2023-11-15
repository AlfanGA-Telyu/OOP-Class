package Formulir;

public class FormulirDosen extends BaseFormulir {
    public String KodeDosen;

    @Override
    public void TataTertibAcara() {
        System.out.println("tata tertib acara untuk dosen dengan nama " + nama);
    }

    @Override
    public void Absensi() {
        System.out.println("Dosen dengan kode: " + KodeDosen + " , nama: " + nama);
    }


}
