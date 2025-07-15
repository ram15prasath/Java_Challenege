public class KeyWords {
    public static void main(String[] args) {
        Grandmother obj1=new Grandmother();
        obj1.prints('F',80);
        Granddaugter obj2=new Granddaugter();
        obj2.prints();
    }


}
class Grandmother{
    char gender;
    int age;

    void prints(char g,int a){
        this.gender=g;
        this.age=a;
    }

}
class Granddaugter extends Grandmother{
     void prints(){
        System.out.println(super.gender);
        System.out.println(super.age=20);

    }

}