public class errorbubbling {
    static void m1(){
        m2();
    }

    static void m2(){
        m3();
    }

    static void m3(){
        try {
        int a=50;
        int b=0;
        int c=a/b;
        System.err.println("This is ans"+ c);
        } catch (Exception e) {
            System.out.println(e);
        }       
    }

    public static void main(String[] args) {
        m1();

}
}
