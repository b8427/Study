package Chapter02;

/**
 * Created by Boris on 18.06.2015.
 */
public class Light {
    public static void main(String[] args) {
        int lightspeed;
        long distance;
        long seconds;
        long days;

        lightspeed=186000;
        days=1000;
        seconds=days*24*60*60;
        distance=seconds*lightspeed;
        System.out.println("За "+days+" дней свет пройдет "+distance+" миль");
    }
}
