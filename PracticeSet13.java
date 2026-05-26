class Speak extends Thread{
    public void run(){
        while (true){
            System.out.println("Good Morning!!!");
        }
    }
}
class Speak2 extends Thread{
    public void run(){
        while (true){
            System.out.println("Welcome!!1");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class PracticeSet13 {
    public static void main(String[] args) {

        Speak s = new Speak();
        Speak2 s2 = new Speak2();
        s.setPriority(6);
        s2.setPriority(4);
        System.out.println(s.getPriority());
        System.out.println(s2.getPriority());
        System.out.println(Thread.currentThread().getState());
//        s.start();
//        s2.start();
    }
}
