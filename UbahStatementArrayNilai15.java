import java.util.Scanner;
/**
 * UbahStatementArrayNilai15
 */
public class UbahStatementArrayNilai15 {

    public static void main(String[] args) {
        Scanner util = new Scanner(System.in);
        int[] nilaiAkhir = new int[10];

        for (int i = 0; i < 10; i++){
            System.out.print("Masukkan nilai akhir ke-"+i+" : ");
            nilaiAkhir[i] = util.nextInt();
        }

        System.out.println("Mahasiswa yang lulus:");
        for (int i = 0; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir[i] > 70) {
                System.out.println("Mahasiswa ke-" + (i + 1) + " lulus!");
            } else {
                System.out.println("Mahasiswa ke-" + (i + 1) + " Tiduk lulus!");
            }
        }         
    }
}
