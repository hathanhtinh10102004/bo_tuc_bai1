package bo_tuc_bai_3;

import java.util.Scanner;

public class bai_4 {
    public static void main(String[] args) {
        int size;
        int [] array = {};
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập độ dài của mảng :");
        size = sc.nextInt();
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("nhập giá trị :");
            int push = sc.nextInt();
            array[i] = push;
        }
        for (int i = 0; i < size; i++) {
            System.out.println(array[i] + "");
        }
        int max = 0;
        for (int num : array){
            if (num > max){
                max = num;
            }
        }
        System.out.println("phần tử lớn nhất của mảng :" + max);
    }
}
