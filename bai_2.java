package bo_tuc_bai_5;

import java.util.Scanner;

public class bai_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập phần tử của mảng: \n");
        int number [] = new int[10];

        for (int i = 0; i < number.length; i++) {
            System.out.println("phần tử trong mảng: " + i +" = ");
            number[i] = scanner.nextInt();
        }
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i] + " ");
        }
        sum(number);
        sum2(number);
        nhan(number);
    }
    //bai_2
    public static void sum(int[] number) {
        int tong = 0;
        for (int i = 0; i < number.length; i+=2) {
            tong += number[i];
        }
        System.out.println("tổng của 1 3 5 7 9 là: " + tong);
    }
    //bai_3
    public static void sum2(int[] number) {
        int tong = 0;
        for (int i = 0; i < number.length; i++) {
            tong += number[i];
        }
        System.out.println("tổng của 1 3 7 9 là: " + tong);
    }
    //bai_4
    public static void nhan(int[] number){
        int tich = 1;
        for (int i = 0; i < number.length; i++) {
            tich = number[2] * number[4] * number[9];
        }
        System.out.println("tích của 2 4 9 là: " + tich);
    }
}





