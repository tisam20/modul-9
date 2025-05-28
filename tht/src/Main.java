class Transportasi {
    private String nama;
    private int jumlahKursi;
    private String tujuan;

    public Transportasi(String nama, int jumlahKursi, String tujuan) {
        this.nama = nama;
        this.jumlahKursi = jumlahKursi;
        this.tujuan = tujuan;
    }

    public String getNama() {
        return nama;
    }

    public int getJumlahKursi() {
        return jumlahKursi;
    }

    public String getTujuan() {
        return tujuan;
    }

    public double hitungHargaTiket() {
        return 100000.0;
    }
}

class Bus extends Transportasi {
    public Bus(String nama, int jumlahKursi, String tujuan) {
        super(nama, jumlahKursi, tujuan);
    }

    @Override
    public double hitungHargaTiket() {
        return super.hitungHargaTiket() * 1.10;
    }

    public double hitungHargaTiket(String kelasLayanan) {
        double harga = hitungHargaTiket();
        if (kelasLayanan.equalsIgnoreCase("bisnis")) {
            harga *= 1.25;
        } else if (kelasLayanan.equalsIgnoreCase("vip")) {
            harga *= 1.5;
        }
        return harga;
    }
}

class Kereta extends Transportasi {
    public Kereta(String nama, int jumlahKursi, String tujuan) {
        super(nama, jumlahKursi, tujuan);
    }

    @Override
    public double hitungHargaTiket() {
        return super.hitungHargaTiket() * 1.20;
    }

    public double hitungHargaTiket(String kelasLayanan) {
        double harga = hitungHargaTiket();
        if (kelasLayanan.equalsIgnoreCase("bisnis")) {
            harga *= 1.25;
        } else if (kelasLayanan.equalsIgnoreCase("vip")) {
            harga *= 1.5;
        }
        return harga;
    }
}

class Pesawat extends Transportasi {
    public Pesawat(String nama, int jumlahKursi, String tujuan) {
        super(nama, jumlahKursi, tujuan);
    }

    @Override
    public double hitungHargaTiket() {
        return super.hitungHargaTiket() * 1.50;
    }

    public double hitungHargaTiket(String kelasLayanan) {
        double harga = hitungHargaTiket();
        if (kelasLayanan.equalsIgnoreCase("bisnis")) {
            harga *= 1.25;
        } else if (kelasLayanan.equalsIgnoreCase("vip")) {
            harga *= 1.5;
        }
        return harga;
    }
}

public class Main {
    public static void main(String[] args) {
        Transportasi[] daftarTransportasi = new Transportasi[3];

        daftarTransportasi[0] = new Bus("Bus Pariwisata", 40, "Bandung");
        daftarTransportasi[1] = new Kereta("Kereta Gajayana", 100, "Surabaya");
        daftarTransportasi[2] = new Pesawat("Garuda Indonesia", 150, "Medan");

        for (Transportasi t : daftarTransportasi) {
            System.out.println(t.getClass().getSimpleName() + " ke " + t.getTujuan() +
                " - Harga tiket (default): " + t.hitungHargaTiket());

            if (t instanceof Bus) {
                System.out.println("Harga tiket (Bisnis): " + ((Bus)t).hitungHargaTiket("Bisnis"));
            } else if (t instanceof Kereta) {
                System.out.println("Harga tiket (VIP): " + ((Kereta)t).hitungHargaTiket("VIP"));
            } else if (t instanceof Pesawat) {
                System.out.println("Harga tiket (Ekonomi): " + ((Pesawat)t).hitungHargaTiket("Ekonomi"));
            }

            System.out.println();
        }
    }
}
