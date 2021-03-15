
public class Rectangle extends Shape implements IRectangle {
    protected double length;
    protected double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return (length + width) * 2;
    }

    @Override
    public double getDiagonal() {
        return Math.sqrt(length * length + width * width);
    }

    public void displayRectangle() {
        System.out.println("Hình chữ nhật có chiều dài là: " + length + " chiều rộng là: " + width + " đường chéo là" + getDiagonal()+ " có chu vi là: "
                + getPerimeter() + " và diện tích là: " + getArea());
    }
}
