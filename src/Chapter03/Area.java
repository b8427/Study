package Chapter03;

/**
 * Created by Boris on 18.06.2015.
 */
public class Area {
    public static void main(String[] args) {
        double pi;
        double area;
        double r;

        r=10.8;
        pi=3.141592654;
        area=pi*Math.pow(r,2);
        System.out.println("Площадь круга равна "+area);
    }
}
