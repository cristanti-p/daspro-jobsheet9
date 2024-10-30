import java.util.Scanner;

public class ModifikasiArrayNilai15 {
    public static void main(String[] args) {
        Scanner util = new Scanner(System.in);
        int[] nilaiAkhir = new int[10];

        for (int i = 0; i < nilaiAkhir.length; i++){
            System.out.print("Masukkan nilai akhir ke-"+i+" : ");
            nilaiAkhir[i] = util.nextInt();
        }
        
        for (int i = 0; i < 10; i++){
            System.out.println("Nilai Akhir ke-"+i+" adalah "+nilaiAkhir[i]);
        }
    }
}
