import Formulir.FormulirDosen;
import Formulir.FormulirMahasiswa;

public class Main {
    public static void main(String[] args) {
        FormulirMahasiswa peserta_01 = new FormulirMahasiswa();
        peserta_01.nama = "Alfan";
        peserta_01.nim = "9999";
        // System.out.println("Nama Mahasiswa: " + peserta_01.nama);
        // System.out.println("Nama Mahasiswa: " + peserta_01.nim);
        peserta_01.CaraPembayaran();
        peserta_01.TataTertibAcara();

        System.out.println();

        FormulirDosen peserta_02 = new FormulirDosen();
        peserta_02.nama = "Alifio";
        peserta_02.KodeDosen = "12345";
        // System.out.println("Nama Dosen: " + peserta_02.nama);
        // System.out.println("Nama Kode Dosen : " + peserta_02.KodeDosen);
        peserta_02.CaraPembayaran();
        peserta_02.TataTertibAcara();
    }
}
