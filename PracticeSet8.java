class Employee{
    // property
    int salary;
    String name;
    public int getSalary(){   //method
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
       name = n;
    }
}
class cellphone{
    public void ring(){
        System.out.println("Ringing...........");
    }
    public void vibrate(){
        System.out.println("Vibrating.......");
    }
    public void callFriend(){
        System.out.println("Calling Aastha");
    }
}
class Square{
    int side;
    public int area(){
        return side*side;
    }
     public int perimeter(){
        return 4*side;
     }
}
class Repeat{
    public void repeatThree(int times) {
        int i;
        for (i = 1; i < times; i++) {
            System.out.print(4 + "  ");
        }
        System.out.println();
        return;
    }
}
class Rockstar{
    public void hit(){
        System.out.println("Hittingg!!!!!!!!!!!");
    }
    public void run(){
        System.out.println("Running!!!!!!!!!!!!!!");
    }
    public void fire(){
        System.out.println("Firring!!!!!!!!!!");
    }
}
class Rectangle{
    int height;
    int breadth;
    public int area(){
        return breadth * height;
    }
    public int perimeter(){
        return 2 * (height + breadth);
    }
}
class Circle{
    float radius;
    public double area(){
        return 3.14 * radius * radius;
    }
    public double perimeter(){
        return 2 * 3.14 * radius;
    }
}
public class PracticeSet8 {

    public static void main(String[] args) {
     //1
        Employee Yash = new Employee();
        Yash.setName("Yashieeee");
        Yash.salary = 455;
        System.out.println(Yash.getName());
        System.out.println(Yash.getSalary());

        //2
        cellphone iphone = new cellphone();
        iphone.ring();
        iphone.callFriend();
        iphone.vibrate();

        //3
        Square sq = new Square();
        sq.side = 6;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());

        // repeat
        Repeat re = new Repeat();
        re.repeatThree(9);

        //5
        Rockstar rr = new Rockstar();
        rr.hit();
        rr.fire();
        rr.run();

        //4
        Rectangle rc = new Rectangle();
        rc.breadth = 69;
        rc.height = 96;
        System.out.println(rc.area());
        System.out.println(rc.perimeter());

        //6
        Circle cr = new Circle();
        cr.radius = 69;
        System.out.println(cr.area());
        System.out.println(cr.perimeter());
    }
}
