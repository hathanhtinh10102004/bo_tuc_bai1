package bo_tuc_bai_6;

public class bai_4 {
    public static void main(String[] args) {
        QuadraticEquation quadraticEquation = new QuadraticEquation(1,-3,2);
        if (quadraticEquation.getDelta() > 0 ) {
            System.out.println(" Phương trình có 2 nghiệm là : ");
            System.out.println("Nghiệm x1 :"+quadraticEquation.TruongHop1());
            System.out.println("Nghiệm x2 :"+quadraticEquation.TruongHop2());

        }else if (quadraticEquation.getDelta() == 0 ){
            System.out.println("Phương trình có 2 nghiệm kép là ");
            System.out.println("Nghiệm x1 và x2 :"+quadraticEquation.TruongHop());
        } else {
            System.out.println("Phương trình vô nghiệm ");
        }

    }
}
class QuadraticEquation {
    public int  a,b,c;
    public QuadraticEquation ( int a, int b , int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public double getDelta (){ return Math.pow(b,2) - 4 * a * c;}

    public double TruongHop (){
        return  - b / ( 2 * a );
    }
    public double TruongHop1 (){
        double dalte = getDelta();
        return  (-b + Math.pow(dalte,0.5)) / (2 *a);
    }
    public double TruongHop2 (){
        double dalte = getDelta();
        return  (-b - Math.pow(dalte,0.5)) / (2 *a);
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }
    public void setA(int a){
        this.a = a;
    }
    public void setB(int b){
        this.b = b;
    }
    public void setC(int c){
        this.c = c;
    }
}
