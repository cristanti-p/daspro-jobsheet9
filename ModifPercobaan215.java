import java.util.Scanner;

public class ModifPercobaan215 {
    public static void main(String[] args) {
        Scanner util = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Mahasiswa: ");
        int jumlahMahasiswa  = util.nextInt();
        int[] nilaiMHS = new int[jumlahMahasiswa];
        double totalLulus = 0;
        double totalTidakLulus = 0;
        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;

        for (int i = 0; i < nilaiMHS.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMHS[i] = util.nextInt();
        }

        for (int i = 0; i < nilaiMHS.length; i++){
            if (nilaiMHS[i] > 70) {
                totalLulus += nilaiMHS[i];
                jumlahLulus++;
            } else {
                totalTidakLulus += nilaiMHS[i];
                jumlahTidakLulus++;
            }
        }
        
        double rata2Lulus = (jumlahLulus > 0) ? (totalLulus / jumlahLulus) : 0;
        double rata2TidakLulus = (jumlahTidakLulus > 0) ? (totalTidakLulus / jumlahTidakLulus) : 0;

        System.out.println("Rata-rata  nilai lulus = " + rata2Lulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rata2TidakLulus);
    }
}
