package bo_tuc_bai_6;

public class bai_2 {
    public static void main(String[] args) {
        Circle circle = new Circle(2," đỏ ");
        System.out.println("Bán kính hình tròn " + circle.getRadius());
        System.out.println("Diện tích hình tròn "+ circle.Acreage());
        System.out.println("Màu của hình tròn : "+ circle.getColor());

    }
}
class Circle {
    double radius;
    String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;

    }

    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return color;
    }

    public double Acreage() {
        return Math.PI * radius * radius;
    }
}
