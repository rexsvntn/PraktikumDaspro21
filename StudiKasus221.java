import java.util.Scanner;
public class StudiKasus221 {}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
    System.out.print("Nama mahasiswa : ");
    String nama = sc.nextLine();
    System.out.print("Jenis Kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
    String jenis = sc.nextLine().toUpperCase();
    System.out.print("Jumlah dokumen (0-4) : ");
    int dokumen = sc.nextInt();

    if (jenis.equals("BELMAWA") || jenis.equals("BAKORMA") || jenis.equals("MANDIRI")) {
        System.out.print("Juara 1, 2, atau 3 ? (isi 0 jika bukan) : ");
        int juara = sc.nextInt();

        if (juara >= 1 && juara <= 3);
            if (dokumen == 4) {
                System.out.println("Dana penghargaan diberikan");
            } else {
                int kurang = 4 - dokumen;
                System.out.println("Data tidak lengkap (kurang " + kurang + " dokumen), dana penghargaan tidak diberikan");
            }
    } else {
        System.out.println("Tidak memperoleh dana penghargaan (hanya untuk juara 1/2/3)");
    }
}


    
