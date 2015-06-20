package Chapter02;

/**
 * Created by Boris on 20.06.2015.
 */
public class LifeTime {
    public static void main(String[] args) {
        int x;
        for(x=0;x<3;x++){
            int y=-1;
            System.out.println("y равно:"+y);
            y=100;
            System.out.println("теперь y равно:"+y);
        }
    }
}
