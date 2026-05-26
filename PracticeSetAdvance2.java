class MyDeprecated{
    @Deprecated
    void meth1() {
        System.out.println("I am Method 1");
    }
}
interface MyInt1{
    void display();
}
public class PracticeSetAdvance2 {
    public static void main(String[] args) {
        MyDeprecated deprecated = new MyDeprecated();

        deprecated.meth1();
        MyInt1 i  = () -> System.out.println("I am display");


    }
}
