public class Main {
    public static void main(String[] args) {
        Kendaraan motor1 = new Kendaraan("Vario");
        Kendaraan mobil1 = new Kendaraan("Taft");

        Kendaraan motor2 = new Motor("f1zr");
        Kendaraan mobil2 = new Mobil("Mercedes");

        Kendaraan[] list = new Kendaraan[4];
        list[0] = motor1;
        list[1] = mobil1;
        list[2] = motor2;
        list[3] = mobil2;

        list[0].display();
        list[1].display();
        list[2].display();
        list[3].display();
    }
}
