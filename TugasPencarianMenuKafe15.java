import java.util.Scanner;

public class TugasPencarianMenuKafe15 {
    public static void main(String[] args) {
        Scanner utill = new Scanner(System.in);

        String[] menu = {
            "Nasi Goreng",
            "Mie Goreng",
            "Roti Bakar",
            "Kentang Goreng",
            "Teh Tarik",
            "Cappucino",
            "Chocolate ice"
        };

        System.out.print("Masukkan nama makanan/minuman yang ingin dicari: ");
        String cariMakanan = utill.nextLine();

        boolean ditemukan = false;
        for (int i = 0; i < menu.length; i++){
            if (menu[i].equalsIgnoreCase(cariMakanan)) {
                ditemukan = true;
                break;
            }
        }
        if (ditemukan) {
            System.out.println("Makanan/Minuman " + cariMakanan + " tersedia di menu.");
        } else {
            System.out.println("Makanan/Minuman " + cariMakanan + "tidak ditemukan di menu.");
        }
    }
}
