import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jmlPesanan, total = 0;
        System.out.print("Masukkan jumlah pesanan : ");
        jmlPesanan = input.nextInt();
        input.nextLine();
        String[] namaPesanan = new String[jmlPesanan];
        int[] hargaPesanan = new int[jmlPesanan];
        for (int i = 0; i < jmlPesanan; i++) {
            System.out.print("Masukkan nama pesanan ke-" + (i + 1) + " : ");
            namaPesanan[i] = input.nextLine();

            System.out.print("Masukkan harga pesanan ke-" + (i + 1) + " : ");
            hargaPesanan[i] = input.nextInt();
            input.nextLine();
            total += hargaPesanan[i];
        }
        System.out.println("Daftar pesanan: ");
        for (int i = 0; i < jmlPesanan; i++) {
            System.out.println((i + 1) + "." + namaPesanan[i] + " Rp" + hargaPesanan[i]);
        }
        System.out.println("Total biaya : " + total);
    }
}
