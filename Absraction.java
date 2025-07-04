public class Absraction {
    public void getinterestOff(){
    }
}
class IcciBank extends Absraction{
    public void getinterestOff(){
        System.out.println("9%");
    }
}
class KarurVysa extends Absraction{
    public void getinterestOff(){
        System.out.println("10%");
    }
}
class Main4{
    public static void main(String[] args) {
        IcciBank icci=new IcciBank();
        icci.getinterestOff();
        KarurVysa karur=new KarurVysa();
        karur.getinterestOff();
    }
}
