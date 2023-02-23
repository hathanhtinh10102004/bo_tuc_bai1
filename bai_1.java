package bo_tuc_bai_3;

import java.util.Scanner;

public class bai_1 {
    public static void main(String[] args) {
        int size;
        int [] array = {};
        Scanner sc = new Scanner(System.in); //khởi tạo 1 đối tượng
            System.out.println("nhập độ dài của mảng :");
            size = sc.nextInt();
            array=new int[size];
            for (int i = 0; i<array.length; i++){
                System.out.println(" nhập giá trị :");
               int data = sc.nextInt();
               array[i] = data;
            }

        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
//        for (int a:array
//             ) {
//            System.out.println(a);
//        }
//        Bài 2 :
        int sum =0;
        for (int b:array
             ) {
            sum +=b;
        }

        System.out.println("tổng của các phần tử trong mảng là :" + sum);
    }
}
