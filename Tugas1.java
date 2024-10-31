import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jmlNilai, total = 0, ratarata, tertinggi = 0, terendah = 100;
        System.out.print("Masukkan jumlah nilai yang akan diinput : ");
        jmlNilai = input.nextInt();
        int [] nilaiMhs = new int[jmlNilai];
        for (int i = 0; i < jmlNilai; i++) {
            System.out.print("Masukkan Nilai Mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = input.nextInt();
            total += nilaiMhs[i];
        }
        for (int nilai : nilaiMhs) {
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
        }
        ratarata = total/nilaiMhs.length;
        System.out.println("Rata rata nilai mahasiswa : "+ratarata);
        System.out.println("Nilai tertinggi : " + tertinggi);
        System.out.println("Nilai Terendah : " + terendah);
    }
}
