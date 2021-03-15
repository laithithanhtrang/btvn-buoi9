public class Circle extends Shape implements Icircle {
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    @Override
    public double getArea() {
       return 3.14*radius*radius;
    }

    @Override
    public double getPerimeter() {
        return 2*3.14*radius;
    }

    @Override
    public double getDiameter() {
        return 2*radius;
    }
     public void displayCircle() {
        System.out.println("Hình tròn có bán kính là: " + radius + " đường kính là " + getDiameter() + " có chu vi là: "
        + getPerimeter() + " diện tích là: " + getArea());
     }

}
