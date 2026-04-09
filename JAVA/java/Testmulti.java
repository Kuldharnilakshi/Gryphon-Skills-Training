public class Testmulti {

    public class MyThread extends Thread{
        @Override
    public void run(){
        for(int i=0;i<6;i++){
            System.out.println("Number "+i);
            try {
                sleep(1000);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread "+Thread.currentThread().getName()+" is running");
        }
    }
}

    public static void mains(String[] args){
        Testmulti test = new Testmulti();
        MyThread t1 = test.new MyThread();
        MyThread t2 = test.new MyThread();
        t1.start();
    }
}

