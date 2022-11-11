class Kendaraan {
    double hargaDasar =  1000000;
    public void tampilkanHarga()
    {
        System.out.println("Harga kendaraan adalah Rp. " + hargaDasar);
    }
}

class RodaDua extends Kendaraan {
    double NaikHargaKe = 0.20;// 0.2 kali
    void hargaAkhir()
    {
        hargaDasar = hargaDasar + (hargaDasar * NaikHargaKe);
        System.out.println("Setelah di modifikasi, harga sepeda menjadi Rp. " + hargaDasar);
    }
}

class RodaEmpat extends Kendaraan {
    double NaikHargaKe = 8; // 1 kali
    void hargaAkhir()
    {
        hargaDasar = hargaDasar + (hargaDasar * NaikHargaKe);
        System.out.println("Setelah di modifikasi, harga mobil menjadi Rp. " + hargaDasar);
    }
}

public class JavaInheritance {
    public static void main(String[] args)
    {
        //membuat objek kendaraan roda dua
        RodaDua sepeda = new RodaDua();
        //membuat objek kendaraan roda empat
        RodaEmpat mobil = new RodaEmpat();

        sepeda.tampilkanHarga();
        sepeda.hargaAkhir();

        mobil.tampilkanHarga();
        mobil.hargaAkhir();
    }
}