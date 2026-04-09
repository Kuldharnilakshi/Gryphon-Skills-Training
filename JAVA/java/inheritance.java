public class inheritance {

    static class Father {
        void read() {
            System.out.println("Reading");
        }

        void act() {
            System.out.println("Acting");
        }
    }

    static class Son extends Father {
        // inherits methods
    }

    public static void main(String[] args) {

        Father amit = new Father();
        amit.read();

        Son ss = new Son();
        ss.read();
        ss.act();
    }
}
