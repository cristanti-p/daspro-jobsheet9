import java.util.Scanner;

public class TugasPemesanankafe {
    public static void main(String[] args) {
        Scanner  util = new Scanner(System.in);

        System.out.print("Masukkan jumlah  pesanan: ");
        int jumlahPesanan = util.nextInt();
        util.nextLine();

        String[] namaPesanan = new String[jumlahPesanan];
        double[] hargaPesanan = new double[jumlahPesanan];

        for (int i = 0; i < jumlahPesanan; i++){
            System.out.print("Masukkan nama makanan/minuman ke-" + (i + 1) + "; ");
            namaPesanan[i] = util.nextLine();

            System.out.print("Masukkan harga " + namaPesanan[i] + ": ");
            hargaPesanan[i] = util.nextDouble();
            util.nextLine();
        }

        double totalBiaya = 0;

        for (double harga : hargaPesanan){
            totalBiaya += harga;
        }

        System.out.println("\nDaftar Pesanan");

        for (int i = 0; i < jumlahPesanan; i++){
            System.out.println(namaPesanan[i] + ": Rp " + hargaPesanan[i]);
        }

        System.out.println("Total Biaya: Rp " + totalBiaya);
    }
}
