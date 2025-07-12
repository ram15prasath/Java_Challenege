interface Lions{
    abstract void lion();
}
interface Tigers{
    abstract void tiger();
}
public class Interfacesamplae implements Lions,Tigers {
    @Override
    public void lion() {
        System.out.println("Male lion");
    }

    @Override
    public void tiger() {
        System.out.println("Female Tiger");
    }

    public static void main(String[] args) {
        Interfacesamplae obj5 =new Interfacesamplae();
        obj5.lion();
        obj5.tiger();
    }

}
