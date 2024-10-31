import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] menu = { "Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino",
                "Chocolate Ice" };
        String pencarian;
        System.out.print("Masukkan nama makanan yang ingin dicari : ");
        pencarian = input.nextLine();
        for (String makanan : menu) {
            if (makanan.equalsIgnoreCase(pencarian)) {
                System.out.println("Makanan tersedia");
                break;
            } else
                System.out.println("Makanan tidak tersesdia");
            break;
        }
    }
}
