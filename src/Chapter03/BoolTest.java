package Chapter03;

/**
 * Created by Boris on 27.06.2015.
 */
public class BoolTest {
    public static void main(String[] args) {
        boolean b;
        b = false;
        System.out.println(" b  равно " + b);
        b = true;
        System.out.println(" b  равно " + b);

        if (b) System.out.println(" Этoт  код  выполняется.");
        b = false;
        if (b) System.out.println("Этoт  код  не  выполняется.");

        System.out.println(" 10  >  9  равно " + (10 > 9));
    }
}
