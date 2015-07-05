package Chapter05;

/**
 * Created by Boris on 05.07.2015.
 */
public class Break {
    public static void main(String[] args) {
        boolean t = true;
        first:
        {
            second:
            {
                third:
                {
                    System.out.println("Предшествует оператору break");
                    if(t) break second;
                }
                System.out.println("сюда не попали");
            }
            System.out.println("вышли из second и попали в first" );
        }

    }
}
