package Chapter04;

/**
 * Created by Boris on 27.06.2015.
 */
public class ByteShift {
    public static void main(String[] args) {
        byte a = 64;
        byte b;
        int i;
        i = a << 2;
        b = (byte) (a << 2);
        System.out.println("Пepвoнaчaльнoe  значение  а:  " + a);
        System.out.println("i  and  b:  " + i + "  " + b);

    }

}
