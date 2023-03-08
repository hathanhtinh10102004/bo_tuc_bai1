package bo_tuc_bai_6;

import java.util.Scanner;

public class bai_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập chiều rộng:");
        double width = scanner.nextDouble();
        System.out.print("nhập chiều dài:");
        double height = scanner.nextDouble();
        number rectangle = new number(width, height);
        System.out.println("hình chữ nhật "+ rectangle.display());
        System.out.println("chu vi hình chữ nhật: "+ rectangle.getPerimeter());
        System.out.println("diện tính hình chủ nhật: "+ rectangle.getArea());
    }
}
class number {
    double width, height;

    public number() {
    }

    public number(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    public String display() {
        return "number{" + "width=" + width + ", height=" + height + "}";
    }
}
