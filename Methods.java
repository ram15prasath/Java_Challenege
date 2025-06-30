public class Methods {
     public static void main(String[] args) {
        add();
        System.out.println(sub(10,6));
    }
    // Void method with no parameters
    public static void add(){
        int a=10;
        int b=15;
        int c=a+b;
        System.out.println(c);
    }
    //Non Void Method with Return type
    public static int sub(int d,int e){
        int f=d-e;
        return f;
    }
}
