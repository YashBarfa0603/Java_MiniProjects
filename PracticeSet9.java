class Cylinder{
    private int radius;
    private int height;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public double surfaceArea(){
        // instead of 3.14 we are using Maths.PI for accurate calculation
        return 2 * Math.PI * radius * radius + 2 * Math.PI * radius * height;
    }
    public double volume(){
        return Math.PI * radius * radius * height;
    }
}
// using Constructor
class Cylinder2{
    public int radius2;
    public int height2;

    public Cylinder2(int radius2 , int height2){
        this.radius2 = radius2;
        this.height2 = height2;
    }
}
 class Rectangle2{
    private int lenght;
    private int breadth;
    public Rectangle2(){
        this.lenght = 4;
        this.breadth = 5;
    }
    public Rectangle2(int lenght, int breadth){
        this.lenght = lenght;
        this.breadth = breadth;
    }
    public int getLenght(){
        return lenght;
     }
     public int getBreadth(){
        return breadth;
     }

 }
 class Sphere{
    private int radius;
    public int getRadius(){
        return radius;
    }
    public void setRadius(int radius){
        this.radius = radius;
    }
    public double surfaceArea(){
        return 4 * Math.PI * radius * radius;
    }
    public double volume(){
        return 1.33 * Math.PI * radius * radius * radius;
    }
 }
public class PracticeSet9 {
    public static void main(String[] args) {
        //1
        Cylinder myCylinder = new Cylinder();
        myCylinder.setHeight(24);
        int h = myCylinder.getHeight();
        myCylinder.setRadius(5);
        int r = myCylinder.getRadius();
        System.out.println(h);
        System.out.println(r);

        //2
        System.out.println(myCylinder.surfaceArea());
        System.out.println(myCylinder.volume());

        //3
        Cylinder2 cylinder2 = new Cylinder2(12,25);
        System.out.println(cylinder2.height2);
        System.out.println(cylinder2.radius2);

        //4
        Rectangle2 myRe = new Rectangle2(56, 69);
        System.out.println(myRe.getLenght());
        System.out.println(myRe.getBreadth());

        Rectangle2 myR = new Rectangle2();
        System.out.println(myR.getBreadth());
        System.out.println(myR.getLenght());

        //5
        Sphere sp = new Sphere();
        sp.setRadius(6);
        System.out.println(sp.surfaceArea());
        System.out.println(sp.volume());

    }
}
