//stack overflow
public class Errordemo{
    static void m1(){
        m2();
            System.out.println("m1 start");
            System.out.println(" I am M1");
            System.out.println(" m1 ends");
        }

    static void m2(){
        m1();
        System.out.println(" m2 ends");
    }

    public static void main(String[] args) {
        Errordemo ed=new Errordemo();
        ed.m1();
        ed.m2();
        

    }
}