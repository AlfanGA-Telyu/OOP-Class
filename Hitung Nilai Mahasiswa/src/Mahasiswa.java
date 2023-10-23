public class Mahasiswa {
    String nama;
    String nim;
    int tubes;
    int quiz;
    int tugas;
    int uts;
    int uas;

    public Mahasiswa(String nama, String nim, int tubes, int quiz, int tugas, int uts, int uas) {
        this.nama = nama;
        this.nim = nim;
        this.tubes = tubes;
        this.quiz = quiz;
        this.tugas = tugas;
        this.uts = uts;
        this.uas = uas;
    }

    public String getNama() {
        return nama;
    }

    public String getNIM() {
        return nim;
    }

    public int getTubes() {
        return tubes;
    }

    public int getQuiz() {
        return quiz;
    }

    public int getTugas() {
        return tugas;
    }

    public int getUTS() {
        return uts;
    }

    public int getUAS() {
        return uas;
    }
}
