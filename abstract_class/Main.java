import java.util.Scanner;

import Kendaraan.Mobil;
import Kendaraan.Motor;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Mobil mobil1 = new Mobil("Pajero", "Mitsubishi", "500.000.000", "SUV");
        Motor motor1 = new Motor("Vario", "Honda", "30.000.000", "150cc");

        // menu
        System.out.println("====================");
        System.out.print("Jenis kendaraan apa yang ingin anda beli ? : ");
        String input1 = scanner.nextLine();
        if (input1.equals("mobil")) {
            System.out.println("anda akan membeli mobil " + mobil1.nama + " dengan harga " + mobil1.harga);
            mobil1.CaraPembelian();
            System.out.print("apakah anda yakin ? (y/n) : ");
            String input2 = scanner.nextLine();
            if (input2.equals("y")) {
                System.out.println();
                mobil1.Membeli();
                mobil1.CheckMerkMobil();
                System.out.println("=====[Terimakasih Telah Membeli]=====");
            } else if (input2.equals("n")) {
                System.exit(0);
            }

        } else if (input1.equals("motor")) {
            System.out.println("anda akan membeli motor " + motor1.nama + " dengan harga " + motor1.harga);
            motor1.CaraPembelian();
            System.out.print("apakah anda yakin ? (y/n) : ");
            String input2 = scanner.nextLine();
            if (input2.equals("y")) {
                System.out.println();
                motor1.Membeli();
                motor1.CheckKapasitasMotor();
                System.out.println("=====[Terimakasih Telah Membeli]=====");
            } else if (input2.equals("n")) {
                System.exit(0);
            }

        } else {
            System.out.println("Kendaraan tidak ada");
            System.exit(0);

        }

        scanner.close();
    }
}
