package bo_tuc_bai_2;

public record bai_9_2() {
    public static void main(String[] args) {
    bai_5();
    }
    private static void  bai_5(){
        String array [] = {"NN,DD,FF,SS,RR"};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
