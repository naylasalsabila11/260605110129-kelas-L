public class ZakatMal {
    public static void main(String[] args) {
        // Array penghasilan 
        int[] penghasilan = {
            5000000,
            4500000,
            6000000,
            5500000,
            7000000
        };

        // Array pengeluaran
        int[] pengeluaran = {
            4000000,
            5000000,
            4500000,
            5500000,
            5000000
        };

        // Menghitung total penghasilan
        int totalPenghasilan = 0;

        for (int i = 0; i < penghasilan.length; i++) {
            totalPenghasilan += penghasilan[i];
        }

        // Menghitung total pengeluaran
        int totalPengeluaran = 0;

        for (int i = 0; i < pengeluaran.length; i++) {
            totalPengeluaran += pengeluaran[i];
        }

        // Menghitung surplus
        int surplus = totalPenghasilan - totalPengeluaran;

        // Nisab sesuai tampilan contoh
        int nisab = 212500000;

        String kategori;
        double zakat;

        // Percabangan menentukan kategori dan zakat
        if (surplus >= nisab) {
            kategori = "MUZAKKI";
            zakat = surplus * 0.025;
        } else {
            kategori = "MUATAHIK (MISKIN)";
            zakat = 0;
        }

        // Output
        System.out.println("Total Penghasilan : " + totalPenghasilan);
        System.out.println("Total Pengeluaran : " + totalPengeluaran);
        System.out.println("Surplus           : " + surplus);
        System.out.println("Nisab             : " + nisab);
        System.out.println("Kategori          : " + kategori);
        System.out.println("Zakat             : " + (int) zakat);
    }
}

   