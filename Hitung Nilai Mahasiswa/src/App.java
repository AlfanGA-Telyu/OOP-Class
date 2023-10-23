import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan NIM: ");
        String nim = scanner.nextLine();
        System.out.print("Masukkan nilai tubes: ");
        int tubes = scanner.nextInt();
        System.out.print("Masukkan nilai quiz: ");
        int quiz = scanner.nextInt();
        System.out.print("Masukkan nilai tugas: ");
        int tugas = scanner.nextInt();
        System.out.print("Masukkan nilai UTS: ");
        int UTS = scanner.nextInt();
        System.out.print("Masukkan nilai UAS: ");
        int UAS = scanner.nextInt();
        Mahasiswa mahasiswa1 = new Mahasiswa(nama, nim, tubes, quiz, tugas, UTS, UAS);

        double hasil = (30 * mahasiswa1.getTubes() / 100) + (10 * mahasiswa1.getQuiz() / 100)
                + (10 * mahasiswa1.getTugas() / 100) + (25 * mahasiswa1.getUTS() / 100)
                + (25 * mahasiswa1.getUAS() / 100);

        System.out.println("");
        System.out.println("Nama: " + mahasiswa1.getNama());
        System.out.println("NIM: " + mahasiswa1.getNIM());
        System.out.println("");
        System.out.println("Nilai  Matakuliah Pemograman Berorientasi Objek: " + hasil);
    }
}
