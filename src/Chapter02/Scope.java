package Chapter02;

/**
 * Created by Boris on 20.06.2015.
 */
public class Scope {
    public static void main(String[] args) {
        int x = 10;
        if (x == 10) {
            int y = 20;
            System.out.println("x и y:" + x + " " + y);
            x = x * 2;
        }
        System.out.println("x равно "+x);
    }
}
