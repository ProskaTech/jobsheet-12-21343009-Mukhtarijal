abstract class Orang {
    public String namaAyah = "Randi Proska";
    abstract void makan();
    public void minum(){
        System.out.println("Minum air teh dan kopi");
    }
}

class AnakUmur1Tahun extends Orang{
    public void namaAyahku(){
        System.out.println("Nama ayahku adalah "+namaAyah);
    }
    @Override
    public void makan(){
        System.out.println("Anak umur 1 tahun makan ASI");
    }

    @Override
    public void minum(){
        System.out.println("Anak umur 1 tahun minum ASI");
    }
}

class manusia{
    public static void main(String[] args){
        //object induk tidak bisa di buat disini

        //buat object anak umur 1 tahun baru
        AnakUmur1Tahun a1 = new AnakUmur1Tahun();

        //panggil method anak umur 1 tahun
        a1.makan();
        a1.minum();
        a1.namaAyahku();
        System.out.println();
    }
}