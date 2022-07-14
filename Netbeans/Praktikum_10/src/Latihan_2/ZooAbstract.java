package Latihan_2;

abstract class Binatang
{
    abstract void makan();
    abstract void tidur();
    void mati()
    {
        System.out.println("mati.............");
    }
}
class Harimau extends Binatang{
    void makan(){
        System.out.println("Harimau makan........");
    }
    void tidur(){
        System.out.println("Harimau tidur........");
    }
}
class Bebek extends Binatang{

    @Override
    void makan() {
        System.out.println("Bebek makan..........");
    }

    @Override
    void tidur() {
        System.out.println("Bebek tidur..........");
    }
    
}

public class ZooAbstract {
    static void test(Binatang a)
    {
        a.makan();
        a.tidur();
        a.mati();
    }
    
    public static void main(String[] args) {
        Harimau macan = new Harimau();
        Bebek donald = new Bebek();
        
        test(macan);
        test(donald);
    }
}
