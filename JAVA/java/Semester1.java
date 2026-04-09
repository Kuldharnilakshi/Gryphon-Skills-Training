abstract class Exams {

    void viva() {
        System.out.println("Viva is important");
    }

    abstract void written();
}

public class Semester1 extends Exams {
    void written() {
        System.out.println("Written exam is important");
    }
    
    public static void main(String[] args) {
        Exams sem1 = new Semester1();
        sem1.viva();
        sem1.written();
    }
}
