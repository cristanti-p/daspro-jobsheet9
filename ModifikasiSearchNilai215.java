import java.util.Scanner;

public class ModifikasiSearchNilai215 {
    public static void main(String[] args) {
        Scanner util = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai yang akan diinput: ");
        int jumlahElemen = util.nextInt();

        int[] arrNilai = new int[jumlahElemen];

        for (int i = 0; i < jumlahElemen; i++){
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            arrNilai[i] = util.nextInt();
        }
        System.out.print("Masukkan nilai yang ingin dicari: ");
        int key = util.nextInt();
        int hasil = -1;

        for (int i = 0; i < arrNilai.length; i++){
            if (key == arrNilai[i]) {
                hasil = i;
                break;
            }
        }
        if (hasil != -1) {
            System.out.println("Nilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + (hasil + 1));
        } else {
            System.out.println("Nilai " + key + " Nilai yangn dicari tidak ditemukan");
        }
    }
}
