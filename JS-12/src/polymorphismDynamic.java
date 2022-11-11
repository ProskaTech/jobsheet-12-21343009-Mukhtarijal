class Bank {
    float sukuBunga(){
        return 0;
    }
}
class BRI extends Bank {
    //overriding sukuBunga methode
    float sukuBunga(){
        return 10.6f;
    }
}

class BNI extends Bank {
    //overriding sukuBunga methode
    float sukuBunga(){
        return 10.6f;
    }
}

class Mandiri extends Bank{
    //overriding sukuBunga methode
    float sukuBunga(){
        return 9.4f;
    }
}

class polymorphismDynamic {
    public static void main(String[] args){
        //creating variable of bank class
        Bank B;
        B = new BRI();
        System.out.println("Tingkat suku bunga BRI adalah : " + B.sukuBunga());
        B = new BNI();
        System.out.println("Tingkat suku bunga BRI adalah : " + B.sukuBunga());
        B = new Mandiri();
        System.out.println("Tingkat suku bunga BRI adalah : " + B.sukuBunga());
    }
}