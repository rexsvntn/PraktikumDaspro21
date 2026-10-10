import java.util.Scanner;
public class StudiKasus121 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int hargaPerCup = 18000;
        int jumlahCup, uangBayar;
        int totalHarga, diskon, totalBayar;
        int kembalian, kurang;

        System.out.print("Masukkan jumlah cup : ");
        jumlahCup = sc.nextInt();
        System.out.print("Masukkan uang bayar : ");
        uangBayar = sc.nextInt();


        totalHarga = jumlahCup * hargaPerCup;
        diskon = 0;
        if (totalHarga >= 100000) {
            diskon = totalHarga * 10/100;
        }
        totalBayar = totalHarga - diskon;
        System.out.print("Total harga : " + totalHarga);
        System.out.print("\nDiskon : " + diskon);
        System.out.print("\nTotal bayar : " + totalBayar);

        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.print("\nKembalian : " + kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.print("\nUang tidak cukup, kurang Rp " + kurang);
        }
    }
}