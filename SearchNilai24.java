import java.util.Scanner;

public class SearchNilai24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int key, hasil = 0, jml;
        System.out.print("Masukkan banyaknya nilai yang akan di input: ");
        jml = input.nextInt();
        int[] arrNilai = new int[jml];
        for (int i = 0; i < arrNilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke- " + (i+1) + ": ");
            arrNilai[i] = input.nextInt();
        }
        System.out.print("Masukkan nilai mahasiswa yang ingin dicari: ");
        key = input.nextInt();
        for (int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                hasil = i;
                System.out.println();
                System.out.println("Nilai " + key + " Ketemu, merupakan nilai mahasiswa ke-" + (hasil+1));
                System.out.println();
                break;
            } else System.out.println("Nilai yang dicari tidak ditemukan"); break;
        }
    }

}
