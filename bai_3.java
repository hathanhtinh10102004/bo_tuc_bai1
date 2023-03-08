package bo_tuc_bai_6;

public class bai_3 {
    public static void main(String[] args) {
        Temperature temperature = new Temperature(25);
        System.out.println("Độ F là : " +temperature.Convert_C_F());
        System.out.println("Độ Kenvin là : " +temperature.Convert_C_Kenvin());

    }
}
class Temperature {
    double Convert ;

    public Temperature (double Convert){
        this.Convert=Convert;
    }
    public double Convert_C_F(){ double fahrenheit  = (9.0 / 5 ) * Convert + 32 ; return  fahrenheit;}
    public double Convert_C_Kenvin (){double Kenvin = Convert + 273.15 ; return Kenvin; }

}