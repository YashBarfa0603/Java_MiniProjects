class Rectangle3{
    public int lenght;
    public int breadth;

    Rectangle3(int l, int b){
        this.lenght = l;
        this.breadth = b;
    }
    public int area(){
        return this.lenght * this.breadth ;
    }
}
class Cuboid extends Rectangle3{
    public int height;
    Cuboid(int l , int b, int h){
        super(l,b);
        this.height = h;
    }
    public int volume (){
        return this.height * this.lenght * this.breadth ;
    }

}

class Circle2{
    public int radius;

    Circle2(int r){
        System.out.println("I am cicle parameterized constructor");
        this.radius = r;
    }
    public double area(){
        return Math.PI * this.radius * this.radius;
    }
}
class Cylinder3 extends Circle2{
    public int height;
    Cylinder3 (int r , int h){
        super(r);
        System.out.println("I am Cylinder3 parameterized constructor");
        this.height = h;
    }
    public double volume(){
        return Math.PI * this.radius * this.radius* this.height;
    }
}

public class PracticeSet10 {
    public static void main(String[] args) {

        Circle2 occ = new Circle2(5);
        System.out.println(occ.area());

       Cylinder3 obj = new Cylinder3(5,2);
        System.out.println(obj.volume());


    }
}
