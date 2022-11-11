class CompileTime {
    //methode keliling dengan single argumen
    static int keliling(int a){
        return 4 * a;
    }
    //methode keliling dengan dua argumen (methode overloading)
    static int keliling(int l, int b){
        return 2 * (l + b);
    }
}

public class polymorphismStatic {
    public static void main(String[] args){
        //memanggil metode perimeter dengan satu argumen
        System.out.println("Sisi persegi adalah : 4\nKeliling Persegi adalah : " + CompileTime.keliling(4) + "\n");
        //memanggil metode perimeter dengan dua argumen
        System.out.println("Sisi persegi panjang adalah : 10, 13\nKeliling persegi panjang adalah : " + CompileTime.keliling(10, 13));
    }
}