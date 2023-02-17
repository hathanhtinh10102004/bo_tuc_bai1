package bo_tuc_hoc_tap;

public class bai_1 {
    public static void main(String[] args) {
      int number = 10;
        for (int i = 0; i <= number; i++) {
            if (i%2 == 1){
                if (i == 3 || i == 7){
                    continue;
                }
                System.out.println(i);
            }
        }
    }
}
