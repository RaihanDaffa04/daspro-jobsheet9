import java.util.Scanner;

public class ArrayRataNilai24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jmlMhs;
        double lulus = 0, tdklulus = 0, rataratalulus = 0, rataratatdklulus = 0, totallulus = 0, totaltdklulus = 0;
        double total = 0;
        double rata2;
        System.out.print("Masukan jumlah mahasiswa : ");
        jmlMhs = input.nextInt();
        int[] nilaiMhs = new int[jmlMhs];
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = input.nextInt();
        }
        for (int nilai : nilaiMhs) {
            if (nilai > 70) {
                totallulus += nilai;
                lulus++;
            } else if (nilai > 0 && nilai <= 70) {
                totaltdklulus += nilai; tdklulus++;
            }
        }
        rataratatdklulus = totaltdklulus/tdklulus;
        rataratalulus = totallulus/lulus;
        System.out.println("Rata rata nilai lulus : "+rataratalulus);
        System.out.println("Rata rata nilai tidak lulus : "+rataratatdklulus);
    }
}
