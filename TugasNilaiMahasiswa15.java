import java.util.Scanner;

public class TugasNilaiMahasiswa15 {
    public static void main(String[] args) {
        Scanner util = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = util.nextInt();
        int[] nilaiMHS = new int[jumlahMahasiswa];
        int total = 0;
        int nilaiTertinggi = Integer.MIN_VALUE;
        int nilaiTerendah = Integer.MAX_VALUE;

        for (int i = 0; i < jumlahMahasiswa; i++){
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMHS[i] = util.nextInt();
            total += nilaiMHS[i];
            if (nilaiMHS[i] > nilaiTertinggi) {
                nilaiTertinggi = nilaiMHS[i];
            }
            if (nilaiMHS[i] < nilaiTerendah) {
                nilaiTerendah = nilaiMHS[i];
            }
        }

        double rataRata = (double) total / jumlahMahasiswa;

        System.out.println("\nNilai yang dimasukkan:");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Nilai mahasiswa  ke-" + (i + 1) + ": " + nilaiMHS[i]);
        }

        System.out.println("\nRata-rata nilai mahasiswa:  " + rataRata);
        System.out.println("Nilai tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai terendah: " + nilaiTerendah);
    }  
}
