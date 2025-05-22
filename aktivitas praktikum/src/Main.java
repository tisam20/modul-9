class Animal {
    public void suara() {
        System.out.println("Cetak suara");
    }

    public void makan(String lauk) {
        System.out.println("Hewan makan " + lauk);
    }
}

class Dog extends Animal {
    @Override
    public void suara() {
        System.out.println("GUK GUK GUK");
    }

    public void makan(String lauk, String minuman) {
        System.out.println("Hewan makan " + lauk + " dan minum " + minuman );
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.suara();

        Animal d = new Dog();
        d.suara();
        d.makan("Ayam goreng"); //method dari parent
        
        Dog anjing = new Dog();
        anjing.makan("Tulang", "Air"); //method milik class dog sendiri 
    }
}