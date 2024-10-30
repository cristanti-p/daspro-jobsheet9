import java.util.Scanner;

public class ArrayRataNilai15 {
    public static void main(String[] args) {
        Scanner util = new Scanner(System.in);

        int[] nilaiMHS= new int[10];
        double total = 0;
        double rata2;

        for (int i = 0; i < nilaiMHS.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMHS[i] = util.nextInt();
        }
        for (int i = 0; i < nilaiMHS.length; i++){
            total += nilaiMHS[i];
        }

      rata2 = total/nilaiMHS.length;
      System.out.println("Rata-rata milai = "+rata2);  
    }
}
