import java.util.Scanner;

public class Persandian {

    // membuat kamus karakter
    public static String[][] karakter = {
            {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"},
            {"k", "l", "m", "n", "o", "p", "q", "r", "s", "t"},
            {"u", "v", "w", "x", "y", "z", " "}
    };

    // persiapkan variabel masukan dan keluaran
    public static String masukan, keluaran = "";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // menyediakan interface utk user memasukkan kalimat
        System.out.print("Input Sandi: ");
        masukan = scanner.nextLine();

        // looping sebanyak karakter yang diinput, cari di dalam kamus karakter
        for (int i = 0; i < masukan.length(); i++) {
            keluaran += cari(masukan.charAt(i));
        }

        // tampilkan keluarannya
        System.out.println("Output: " + keluaran);
    }

    private static String cari(char c) {
        // loop baris dan kolom sebanyak karakter (a -> j = 10)
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                // jika karakter masukan dari user sama dengan karakter maka kembalikan indeks karakternya
                if (String.valueOf(c).equalsIgnoreCase(karakter[i][j])) {
                    return i + "" + j;
                }
            }
        }
        return null;
    }
}
