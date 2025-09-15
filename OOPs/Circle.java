package OOPs;

public class Circle {
    double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public void Area(){
        System.out.println("Area of Circle: " + 3.14*radius*radius);
    }

    public void Circumference(){
        System.out.println("Circumference of Circle: " + 2*3.14*radius);
    }

    public static void main(String[] args) {
        Circle c = new Circle(72.5);
        c.Area();
        c.Circumference();
    }
}
