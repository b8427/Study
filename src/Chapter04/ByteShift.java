package Chapter04;

/**
 * Created by Boris on 27.06.2015.
 */
public class ByteShift {
    public static void main(String[] args) {
       // byte a = 64;
     //   byte b;
        int i;
     //   i = a << 2;
     //   b = (byte) (a << 2);
      //  System.out.println("Пepвoнaчaльнoe  значение  а:  " + a);
      //  System.out.println("i  and  b:  " + i + "  " + b);
       double x1 = 14.0;
        double x2 = 9.10;
        double x3 = x1-x2;
        System.out.println(x3);

        int a,b,c;
        a=24; b=60;c=1000;
        long micros=a*b*b*c*c;
        long millis = a*b*b*c;
        System.out.println(micros/millis);

    }

}
