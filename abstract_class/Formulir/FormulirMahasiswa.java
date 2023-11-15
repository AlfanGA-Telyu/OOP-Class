package Formulir;

public class FormulirMahasiswa extends BaseFormulir {
    public String nim;
    public String kelas;
    public String semester;

    @Override
    public void TataTertibAcara() {
        System.out.println("Tata tertib acara untuk mahasiswa dengan nama " + nama);
    }

    @Override
    public void Absensi() {
        System.out.println("Mahasiswa dengan nim: " + nim + "");  
    }

    
}
