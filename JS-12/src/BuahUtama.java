class EncapsulationBuah {
    //Data members of class EncapsulationBuah
    private String namaBuah;
    private String hargaBuah;
    private String warnaBuah;
    //declaration of constructor
    public EncapsulationBuah(String namaBuah, String hargaBuah, String warnaBuah)
    {
        this.namaBuah = namaBuah;
        this.hargaBuah = hargaBuah;
        this.warnaBuah = warnaBuah;
    }
    //declaring setter for all fields
    public void setName(String namBuah){
        this.namaBuah = namBuah;
    }
    public void setPrice(String hargaBuah){
        this.hargaBuah = hargaBuah;
    }
    public void setColor(String warnaBuah){
        this.warnaBuah = warnaBuah;
    }
    //Declaring Getter for all fields
    public String getName() {
        return namaBuah;
    }
    public String getPrice() {
        return hargaBuah;
    }
    public String getColor() {
        return warnaBuah;
    }
}

public class BuahUtama{
    public static void main(String[] args){
        //Menggunakan constructor untuk menginisialisasi
        EncapsulationBuah Apel = new EncapsulationBuah("Apel", "Rp.3000", "Merah");
        //Menggunkan getter ke nilai
        System.out.println("Nama Buah: " + Apel.getName()+"\nHarga: " + Apel.getPrice()+"\nWarna: " + Apel.getColor());
        //update harga dan warna menggunkan setter
        Apel.setColor("Hijau");
        Apel.setPrice("Rp.7000");
        System.out.println("\nInformasi terkait Apel setelah di update");
        //Menggunakan getter untuk mendapatkan nilai
        System.out.println("Nama Buah: " + Apel.getName()+"\nHarga: " + Apel.getPrice()+"\nWarna: " + Apel.getColor());
    }
}

